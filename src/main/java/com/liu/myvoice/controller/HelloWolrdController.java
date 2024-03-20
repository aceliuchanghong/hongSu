package com.liu.myvoice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWolrdController {
    @GetMapping( "example")
    public String example(){
        return "index";
    }
    @GetMapping("/data")
    public ResponseEntity<String> getData() {
        String data = "Hello, World!";
        return ResponseEntity.ok(data);
    }
    @GetMapping( "case_introduction")
    public String example1(){
        return "case_introduction";
    }

    @GetMapping( "company_introduction")
    public String example2(){
        return "company_introduction";
    }

    @GetMapping( "contact_Us")
    public String example3(){
        return "contact_Us";
    }

    @GetMapping( "news_information")
    public String example4(){
        return "news_information";
    }

    @GetMapping( "product_introduction")
    public String example5(){
        return "product_introduction";
    }

}
/*
* <li><a href="/contact_Us?s=hello">联系我们</a></li>
* 这里将参数 s 设置为 hello。当用户点击这个链接时，浏览器会将查询字符串发送到后台，后台可以通过接收到的查询字符串来获取参数值，例如在控制器中可以使用 @RequestParam 注解来接收
* @GetMapping("contact_Us")
public String example3(@RequestParam("s") String s) {
    // 处理接收到的参数 s
    return "contact_Us";
}
* 这里使用 @RequestParam("s") 将参数 s 与 HTTP 请求中的参数对应起来，将参数的值传递给方法的参数 s。注意，在上面的代码中 s 参数的值应该是通过前端传递过来的，由框架解析后传递给方法的。
* */
