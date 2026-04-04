package com.pulyalanavyasri.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> hello() {
        String html = "<!DOCTYPE html><html lang='en'><head><meta charset='UTF-8'>" +
        "<title>Java Spring Boot on Kubernetes</title>" +
        "<style>" +
        "*{margin:0;padding:0;box-sizing:border-box;}" +
        "body{font-family:'Segoe UI',sans-serif;background:#0a192f;color:#ccd6f6;min-height:100vh;display:flex;align-items:center;justify-content:center;}" +
        ".wrap{text-align:center;padding:40px;max-width:980px;width:100%;}" +
        ".badge{display:inline-block;background:#0e7c7b;color:#fff;padding:6px 20px;border-radius:20px;font-size:12px;font-weight:700;letter-spacing:2px;margin-bottom:28px;}" +
        "h1{font-size:54px;font-weight:800;color:#e6f1ff;line-height:1.2;margin-bottom:14px;}" +
        "h1 span{color:#00b4d8;}" +
        ".sub{font-size:16px;color:#8892b0;margin-bottom:44px;}" +

        // Cards
        ".cards{display:flex;justify-content:center;gap:18px;flex-wrap:wrap;margin-bottom:44px;}" +
        "a.card{background:#112240;border:1px solid #233554;border-radius:12px;padding:22px 26px;min-width:160px;cursor:pointer;transition:transform .2s,border-color .2s,box-shadow .2s;text-decoration:none;color:inherit;display:block;}" +
        "a.card:hover{transform:translateY(-10px);border-color:#00b4d8;box-shadow:0 10px 35px rgba(0,180,216,0.2);}" +
        ".icon{font-size:30px;margin-bottom:8px;}" +
        ".ct{font-size:11px;color:#8892b0;text-transform:uppercase;letter-spacing:1px;margin-bottom:6px;}" +
        ".cv{font-size:17px;font-weight:700;color:#00b4d8;}" +
        ".click-hint{font-size:10px;color:#495670;margin-top:8px;transition:color .2s;}" +
        "a.card:hover .click-hint{color:#00b4d8;}" +

        // Pipeline
        ".pipe{display:flex;justify-content:center;align-items:center;gap:8px;flex-wrap:wrap;margin-bottom:44px;}" +
        ".stage{background:#112240;border:1px solid #233554;border-radius:8px;padding:9px 16px;font-size:13px;font-weight:600;transition:border-color .2s;}" +
        ".stage:hover{border-color:#00b4d8;}" +
        ".arr{color:#00b4d8;font-size:16px;}" +

        // Status bar
        "a.status-link{text-decoration:none;display:inline-block;margin-bottom:40px;}" +
        ".status{display:inline-flex;align-items:center;gap:10px;background:#0d2137;border:1px solid #10b981;border-radius:8px;padding:14px 32px;font-size:15px;color:#10b981;font-weight:600;transition:background .2s,box-shadow .2s;cursor:pointer;}" +
        ".status:hover{background:#0a2a1a;box-shadow:0 0 20px rgba(16,185,129,0.3);}" +
        ".dot{width:10px;height:10px;background:#10b981;border-radius:50%;animation:pulse 1.5s infinite;}" +
        "@keyframes pulse{0%,100%{opacity:1}50%{opacity:0.3}}" +
        ".status-hint{font-size:11px;color:#10b981;opacity:0.7;margin-left:8px;}" +

        // Footer
        ".foot{font-size:13px;color:#495670;margin-top:8px;}" +
        ".tags{display:flex;justify-content:center;gap:10px;flex-wrap:wrap;margin-top:14px;}" +
        ".tag{background:#1d3461;color:#8892b0;padding:4px 14px;border-radius:20px;font-size:11px;}" +

        // Tooltip
        ".tooltip{position:relative;}" +
        ".tooltip:hover::after{content:attr(data-tip);position:absolute;bottom:110%;left:50%;transform:translateX(-50%);background:#233554;color:#ccd6f6;padding:5px 12px;border-radius:6px;font-size:11px;white-space:nowrap;z-index:10;}" +

        "</style></head><body>" +
        "<div class='wrap'>" +

        // Badge + Title
        "<div class='badge'>✦ ADVANCED CI/CD PROJECT</div>" +
        "<h1>Java Spring Boot<br>on <span>Kubernetes</span></h1>" +
        "<p class='sub'>Deployed via Jenkins Master-Agent → Amazon ECR → Helm Chart → kubeadm K8s Cluster</p>" +

        // Cards
        "<div class='cards'>" +

        "<a class='card tooltip' href='https://maven.apache.org/' target='_blank' data-tip='Apache Maven Official Site'>" +
        "<div class='icon'>⚙</div><div class='ct'>Build Tool</div><div class='cv'>Maven 3.8</div>" +
        "<div class='click-hint'>↗ Visit Maven Docs</div></a>" +

        "<a class='card tooltip' href='https://hub.docker.com/' target='_blank' data-tip='Docker Hub Registry'>" +
        "<div class='icon'>🐳</div><div class='ct'>Container</div><div class='cv'>Docker 28</div>" +
        "<div class='click-hint'>↗ Visit Docker Hub</div></a>" +

        "<a class='card tooltip' href='https://kubernetes.io/docs/home/' target='_blank' data-tip='Kubernetes Official Docs'>" +
        "<div class='icon'>☸</div><div class='ct'>Orchestration</div><div class='cv'>Kubernetes</div>" +
        "<div class='click-hint'>↗ Visit K8s Docs</div></a>" +

        "<a class='card tooltip' href='https://helm.sh/docs/' target='_blank' data-tip='Helm Chart Docs'>" +
        "<div class='icon'>🚀</div><div class='ct'>Deployment</div><div class='cv'>Helm Chart</div>" +
        "<div class='click-hint'>↗ Visit Helm Docs</div></a>" +

        "<a class='card tooltip' href='https://aws.amazon.com/ecr/' target='_blank' data-tip='Amazon ECR Registry'>" +
        "<div class='icon'>☁</div><div class='ct'>Registry</div><div class='cv'>Amazon ECR</div>" +
        "<div class='click-hint'>↗ Visit AWS ECR</div></a>" +

        "<a class='card tooltip' href='http://13.200.253.140:8080' target='_blank' data-tip='Live Jenkins Dashboard'>" +
        "<div class='icon'>🔧</div><div class='ct'>CI/CD</div><div class='cv'>Jenkins</div>" +
        "<div class='click-hint'>↗ Open Jenkins Live</div></a>" +

        "</div>" +

        // Pipeline stages
        "<div class='pipe'>" +
        "<div class='stage'>📥 Checkout</div><div class='arr'>→</div>" +
        "<div class='stage'>⚙ Maven Build</div><div class='arr'>→</div>" +
        "<div class='stage'>🐳 Docker Build</div><div class='arr'>→</div>" +
        "<div class='stage'>☁ Push ECR</div><div class='arr'>→</div>" +
        "<div class='stage'>🚀 Helm Deploy</div>" +
        "</div>" +

        // Status bar — clicks to Jenkins Agent page
        "<a href='http://13.200.253.140:8080/computer/' target='_blank' class='status-link'>" +
        "<div class='status'>" +
        "<div class='dot'></div>" +
        "Application Running on Kubernetes — 2 Pods Active" +
        "<span class='status-hint'>↗ View Jenkins Agent</span>" +
        "</div></a>" +

        // Footer
        "<div class='foot'>" +
        "<p>Java 17 &nbsp;•&nbsp; Spring Boot 3.2 &nbsp;•&nbsp; kubeadm &nbsp;•&nbsp; AWS ap-south-1</p>" +
        "<div class='tags'>" +
        "<span class='tag'>JENKINS</span>" +
        "<span class='tag'>SPRING BOOT</span>" +
        "<span class='tag'>ECR</span>" +
        "<span class='tag'>HELM</span>" +
        "<span class='tag'>KUBEADM</span>" +
        "<span class='tag'>EC2</span>" +
        "</div></div></div></body></html>";

        return ResponseEntity.ok()
            .contentType(MediaType.TEXT_HTML)
            .body(html);
    }
}
