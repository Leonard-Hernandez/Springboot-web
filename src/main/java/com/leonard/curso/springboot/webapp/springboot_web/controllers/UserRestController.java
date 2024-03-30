package com.leonard.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonard.curso.springboot.webapp.springboot_web.models.User;
import com.leonard.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public  UserDto details(){
        UserDto userDto  = new UserDto();
        User user = new User("Leonard", "Hernandez");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        
 
        return userDto;
    }    
  


}
