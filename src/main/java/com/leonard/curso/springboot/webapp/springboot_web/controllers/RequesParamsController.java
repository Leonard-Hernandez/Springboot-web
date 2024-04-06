package com.leonard.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leonard.curso.springboot.webapp.springboot_web.models.ParamDto;

@RestController
@RequestMapping("/api/params")
public class RequesParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "no se recibio nungun dato") String message){
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

}
