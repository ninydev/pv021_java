package com.itstep.firstspring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController

@Controller
public class HomeController
{
    private int count = 0;

    @GetMapping("/err") // Маршрут, по которому будет отвечать данный метод контроллера
    public String home1(){
        return "home";
    }


    @GetMapping("/") // Маршрут, по которому будет отвечать данный метод контроллера
    public String home(
            Model model // Модель представления данных, которую мне нужно наполнить
            // это аналог ViewData ViewBug из asp....
    )
    {
        count++;

        // Передача аналогична подходу asp
        model.addAttribute("count", count);

        int [] arr = {3,2,1};
        model.addAttribute("arr", arr);

        // return VIEW - имя представления!!!!
        // return "<p>This page opens: " + count + "</p>";
        return "home";
    }
}
