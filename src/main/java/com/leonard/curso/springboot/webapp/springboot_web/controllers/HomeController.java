package com.leonard.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String home(){

        //el forward mantiene la url de la peticion y no pierde los parametros
        //return "forward:/details";

        //el redirect redirecciona la url de la peticion
        return "redirect:/details";
    }

}
