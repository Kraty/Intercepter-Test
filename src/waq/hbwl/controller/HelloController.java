package waq.hbwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    /*
     *页面跳转
     * */
    @RequestMapping(value = "/hello")
    public String hello() {

        System.out.println("hello");
        return "success";

    }

}
