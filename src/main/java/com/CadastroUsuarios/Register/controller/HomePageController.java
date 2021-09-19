package com.CadastroUsuarios.Register.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Api(value = "HomePage",  tags = { "HomePage" })
public class HomePageController {
    @GetMapping
    @ApiOperation(value = "Retonar uma mensagem estática de Home Page",
            notes = "Este endpoint retorna uma mensagem estática de Home Page")
    public String getHomePage(){
        return "Bem vindo(a) a página inicial!!";
    }
}
