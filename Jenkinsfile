pipeline {
    agent { label 'Jenkins-Agent' }
    environment {
        AWS_ACCOUNT_ID  = "164801376743"
        AWS_REGION      = "ap-south-1"
        IMAGE_REPO_NAME = "java-spring-app"
        IMAGE_TAG       = "latest"
        REPOSITORY_URI  = "${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com/${IMAGE_REPO_NAME}"
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/pulyalanavyasri/giit.git'
            }
        }
        stage('Maven Build') {
            steps {
                sh "mvn clean package -DskipTests"
            }
        }
        stage('Docker Build & Tag') {
            steps {
                script {
                    sh "docker build -t ${IMAGE_REPO_NAME} ."
                    sh "docker tag ${IMAGE_REPO_NAME}:${IMAGE_TAG} ${REPOSITORY_URI}:${IMAGE_TAG}"
                }
            }
        }
        stage('Push to ECR') {
            steps {
                script {
                    sh "aws ecr get-login-password --region ${AWS_REGION} | docker login --username AWS --password-stdin ${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com"
                    sh "docker push ${REPOSITORY_URI}:${IMAGE_TAG}"
                }
            }
        }
        stage('Deploy to K8s via Helm') {
            steps {
                script {
                    sh """
                        kubectl delete secret ecr-secret --ignore-not-found
                        kubectl create secret docker-registry ecr-secret \
                          --docker-server=${REPOSITORY_URI} \
                          --docker-username=AWS \
                          --docker-password=\$(aws ecr get-login-password --region ${AWS_REGION})
                        helm upgrade --install java-app /home/ubuntu/java-app \
                          --kubeconfig /home/ubuntu/.kube/config
                    """
                }
            }
        }
    }
    post {
        success { echo "SUCCESS: App deployed to Kubernetes!" }
        failure { echo "FAILURE: Something went wrong." }
    }
}
