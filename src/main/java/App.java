package com.pulyalanavyasri.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "<!DOCTYPE html>" +
        "<html lang='en'>" +
        "<head>" +
        "<meta charset='UTF-8'>" +
        "<meta name='viewport' content='width=device-width, initial-scale=1.0'>" +
        "<title>Java Spring Boot on Kubernetes</title>" +
        "<style>" +
        "* { margin: 0; padding: 0; box-sizing: border-box; }" +
        "body { font-family: 'Segoe UI', sans-serif; background: #0a192f; color: #ccd6f6; min-height: 100vh; display: flex; align-items: center; justify-content: center; }" +
        ".container { text-align: center; padding: 40px; max-width: 900px; width: 100%; }" +
        ".badge { display: inline-block; background: #0e7c7b; color: white; padding: 6px 18px; border-radius: 20px; font-size: 13px; font-weight: bold; letter-spacing: 1px; margin-bottom: 24px; }" +
        "h1 { font-size: 52px; font-weight: 800; color: #e6f1ff; margin-bottom: 12px; }" +
        "h1 span { color: #00b4d8; }" +
        ".subtitle { font-size: 18px; color: #8892b0; margin-bottom: 48px; }" +
        ".cards { display: flex; justify-content: center; gap: 20px; flex-wrap: wrap; margin-bottom: 48px; }" +
        ".card { background: #112240; border: 1px solid #233554; border-radius: 12px; padding: 24px 28px; min-width: 180px; transition: transform 0.2s; }" +
        ".card:hover { transform: translateY(-6px); border-color: #00b4d8; }" +
        ".card-icon { font-size: 32px; margin-bottom: 10px; }" +
        ".card-title { font-size: 13px; color: #8892b0; margin-bottom: 6px; letter-spacing: 1px; text-transform: uppercase; }" +
        ".card-value { font-size: 18px; font-weight: 700; color: #00b4d8; }" +
        ".pipeline { display: flex; justify-content: center; align-items: center; gap: 8px; flex-wrap: wrap; margin-bottom: 48px; }" +
        ".stage { background: #112240; border: 1px solid #233554; border-radius: 8px; padding: 10px 18px; font-size: 13px; font-weight: 600; color: #ccd6f6; }" +
        ".arrow { color: #00b4d8; font-size: 18px; }" +
        ".status { display: inline-flex; align-items: center; gap: 10px; background: #0d2137; border: 1px solid #10b981; border-radius: 8px; padding: 12px 28px; font-size: 15px; color: #10b981; font-weight: 600; }" +
        ".dot { width: 10px; height: 10px; background: #10b981; border-radius: 50%; animation: pulse 1.5s infinite; }" +
        "@keyframes pulse { 0%,100%{opacity:1} 50%{opacity:0.3} }" +
        ".footer { margin-top: 48px; font-size: 13px; color: #495670; }" +
        ".tags { display: flex; justify-content: center; gap: 10px; flex-wrap: wrap; margin-top: 16px; }" +
        ".tag { background: #1d3461; color: #8892b0; padding: 4px 14px; border-radius: 20px; font-size: 12px; }" +
        "</style>" +
        "</head>" +
        "<body>" +
        "<div class='container'>" +
        "<div class='badge'>✦ ADVANCED CI/CD PROJECT</div>" +
        "<h1>Java Spring Boot<br>on <span>Kubernetes</span></h1>" +
        "<p class='subtitle'>Deployed via Jenkins Master-Agent Pipeline → Amazon ECR → Helm Chart</p>" +
        "<div class='cards'>" +
        "<div class='card'><div class='card-icon'>⚙</div><div class='card-title'>Build Tool</div><div class='card-value'>Maven 3.8</div></div>" +
        "<div class='card'><div class='card-icon'>🐳</div><div class='card-title'>Container</div><div class='card-value'>Docker 28</div></div>" +
        "<div class='card'><div class='card-icon'>☸</div><div class='card-title'>Orchestration</div><div class='card-value'>Kubernetes</div></div>" +
        "<div class='card'><div class='card-icon'>🚀</div><div class='card-title'>Deployment</div><div class='card-value'>Helm Chart</div></div>" +
        "<div class='card'><div class='card-icon'>☁</div><div class='card-title'>Registry</div><div class='card-value'>Amazon ECR</div></div>" +
        "</div>" +
        "<div class='pipeline'>" +
        "<div class='stage'>📥 Checkout</div><div class='arrow'>→</div>" +
        "<div class='stage'>⚙ Maven Build</div><div class='arrow'>→</div>" +
        "<div class='stage'>🐳 Docker Build</div><div class='arrow'>→</div>" +
        "<div class='stage'>☁ Push to ECR</div><div class='arrow'>→</div>" +
        "<div class='stage'>🚀 Helm Deploy</div>" +
        "</div>" +
        "<div class='status'><div class='dot'></div> Application Running on Kubernetes — 2 Pods Active</div>" +
        "<div class='footer'>" +
        "<p>Java 17 • Spring Boot 3.2 • kubeadm • AWS ap-south-1</p>" +
        "<div class='tags'>" +
        "<span class='tag'>JENKINS</span><span class='tag'>SPRING BOOT</span><span class='tag'>ECR</span><span class='tag'>HELM</span><span class='tag'>KUBEADM</span><span class='tag'>EC2</span>" +
        "</div>" +
        "</div>" +
        "</div>" +
        "</body></html>";
    }
}
