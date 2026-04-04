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
        ".wrap{text-align:center;padding:40px;max-width:920px;width:100%;}" +
        ".badge{display:inline-block;background:#0e7c7b;color:#fff;padding:6px 20px;border-radius:20px;font-size:12px;font-weight:700;letter-spacing:2px;margin-bottom:28px;}" +
        "h1{font-size:54px;font-weight:800;color:#e6f1ff;line-height:1.2;margin-bottom:14px;}" +
        "h1 span{color:#00b4d8;}" +
        ".sub{font-size:16px;color:#8892b0;margin-bottom:44px;}" +
        ".cards{display:flex;justify-content:center;gap:18px;flex-wrap:wrap;margin-bottom:44px;}" +
        ".card{background:#112240;border:1px solid #233554;border-radius:12px;padding:22px 26px;min-width:160px;cursor:default;transition:transform .2s,border-color .2s;}" +
        ".card:hover{transform:translateY(-8px);border-color:#00b4d8;}" +
        ".icon{font-size:30px;margin-bottom:8px;}" +
        ".ct{font-size:11px;color:#8892b0;text-transform:uppercase;letter-spacing:1px;margin-bottom:6px;}" +
        ".cv{font-size:17px;font-weight:700;color:#00b4d8;}" +
        ".pipe{display:flex;justify-content:center;align-items:center;gap:8px;flex-wrap:wrap;margin-bottom:44px;}" +
        ".stage{background:#112240;border:1px solid #233554;border-radius:8px;padding:9px 16px;font-size:13px;font-weight:600;}" +
        ".arr{color:#00b4d8;font-size:16px;}" +
        ".status{display:inline-flex;align-items:center;gap:10px;background:#0d2137;border:1px solid #10b981;border-radius:8px;padding:12px 30px;font-size:15px;color:#10b981;font-weight:600;margin-bottom:40px;}" +
        ".dot{width:10px;height:10px;background:#10b981;border-radius:50%;animation:pulse 1.5s infinite;}" +
        "@keyframes pulse{0%,100%{opacity:1}50%{opacity:0.3}}" +
        ".foot{font-size:13px;color:#495670;margin-top:8px;}" +
        ".tags{display:flex;justify-content:center;gap:10px;flex-wrap:wrap;margin-top:14px;}" +
        ".tag{background:#1d3461;color:#8892b0;padding:4px 14px;border-radius:20px;font-size:11px;}" +
        "</style></head><body>" +
        "<div class='wrap'>" +
        "<div class='badge'>✦ ADVANCED CI/CD PROJECT</div>" +
        "<h1>Java Spring Boot<br>on <span>Kubernetes</span></h1>" +
        "<p class='sub'>Deployed via Jenkins Master-Agent → Amazon ECR → Helm Chart → kubeadm K8s Cluster</p>" +
        "<div class='cards'>" +
        "<div class='card'><div class='icon'>⚙</div><div class='ct'>Build Tool</div><div class='cv'>Maven 3.8</div></div>" +
        "<div class='card'><div class='icon'>🐳</div><div class='ct'>Container</div><div class='cv'>Docker 28</div></div>" +
        "<div class='card'><div class='icon'>☸</div><div class='ct'>Orchestration</div><div class='cv'>Kubernetes</div></div>" +
        "<div class='card'><div class='icon'>🚀</div><div class='ct'>Deployment</div><div class='cv'>Helm Chart</div></div>" +
        "<div class='card'><div class='icon'>☁</div><div class='ct'>Registry</div><div class='cv'>Amazon ECR</div></div>" +
        "</div>" +
        "<div class='pipe'>" +
        "<div class='stage'>📥 Checkout</div><div class='arr'>→</div>" +
        "<div class='stage'>⚙ Maven Build</div><div class='arr'>→</div>" +
        "<div class='stage'>🐳 Docker Build</div><div class='arr'>→</div>" +
        "<div class='stage'>☁ Push ECR</div><div class='arr'>→</div>" +
        "<div class='stage'>🚀 Helm Deploy</div>" +
        "</div>" +
        "<div class='status'><div class='dot'></div>Application Running on Kubernetes — 2 Pods Active</div>" +
        "<div class='foot'>" +
        "<p>Java 17 &nbsp;•&nbsp; Spring Boot 3.2 &nbsp;•&nbsp; kubeadm &nbsp;•&nbsp; AWS ap-south-1</p>" +
        "<div class='tags'>" +
        "<span class='tag'>JENKINS</span><span class='tag'>SPRING BOOT</span>" +
        "<span class='tag'>ECR</span><span class='tag'>HELM</span>" +
        "<span class='tag'>KUBEADM</span><span class='tag'>EC2</span>" +
        "</div></div></div></body></html>";
        return ResponseEntity.ok()
            .contentType(MediaType.TEXT_HTML)
            .body(html);
    }
}
