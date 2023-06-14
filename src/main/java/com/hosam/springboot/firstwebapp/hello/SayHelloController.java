package com.hosam.springboot.firstwebapp.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class SayHelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello What are you learning today?";
    }


    @GetMapping("say-hello-html")
    public String helloHtml(){
        StringBuffer buffer =new StringBuffer();
         buffer.append("<html>");
         buffer.append("<head>");
         buffer.append("<title> My first Html  Page-Changed     </title>");
         buffer.append("</head>");
         buffer.append("<body>");
         buffer.append("My first Html  Page with body-Changed");
         buffer.append("</body>");
         buffer.append("</html>");

        return buffer.toString();
    }
    @RequestMapping("say-hello-jsp")
    public String hellojsp(){
        return "sayHello";
    }


}
