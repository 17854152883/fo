package cn.hacklike.fo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/go/")
public class PageController {

    @RequestMapping("index")
    private String goIndex(){
        return "index";
    }

    @RequestMapping("addDmSaying")
    private String goAddDmSaying(){
        return "addDmSaying";
    }

    @RequestMapping("login")
    private String goLogin(){
        return "login";
    }

}
