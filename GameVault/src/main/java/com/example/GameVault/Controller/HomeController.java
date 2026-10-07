package com.example.GameVault.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String fragmentsHome(){
        return "fragments-demo";
    }


    @GetMapping("/fragments-demo")
    public String fragments(){
        return "fragments-demo";
    }

    @GetMapping("/juegos")
    public String juegos(){
        return "juegos";
    }

    @GetMapping("/juegos/nuevo")
    public String formulario(){
        return "formulario";
    }
}
