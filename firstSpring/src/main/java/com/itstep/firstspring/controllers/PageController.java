package com.itstep.firstspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/") // Маршрут, по которому будет отвечать данный метод контроллера
    public String index(){
        return "pages/index";
    }

    @GetMapping("/about") // Маршрут, по которому будет отвечать данный метод контроллера
    public String about(){
        return "pages/about";
    }

    @GetMapping("/post") // Маршрут, по которому будет отвечать данный метод контроллера
    public String post(){
        return "pages/post";
    }

    @GetMapping("/contact") // Маршрут, по которому будет отвечать данный метод контроллера
    public String contact(){
        return "pages/contact";
    }
}
