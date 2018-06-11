package com.lakala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "this is just a test";
    }

    @RequestMapping("/index.html")
    public ModelAndView theleaf(){
        return new ModelAndView("index");
    }

    @RequestMapping("/bluePrint")
    public ModelAndView bluePrint(){
        return new ModelAndView("bluePrint");
    }

    public static void main(String[] args){
        System.out.println("dingo");
    }
}
