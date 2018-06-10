package com.lakala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "this is just a test";
    }

    @RequestMapping("/index.html")
    public ModelAndView theleaf(){
        return new ModelAndView("index");
    }

    public static void main(String[] args){
        System.out.println("dingo");
    }
}
