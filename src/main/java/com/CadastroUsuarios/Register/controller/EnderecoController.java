package com.CadastroUsuarios.Register.controller;


import com.CadastroUsuarios.Register.dto.EnderecoDTO;
import com.CadastroUsuarios.Register.dto.EnderecoPeloCepDTO;
import com.CadastroUsuarios.Register.entidades.Endereco;
import com.CadastroUsuarios.Register.form.EnderecoForm;

import com.CadastroUsuarios.Register.service.EnderecoService;
import com.CadastroUsuarios.Register.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@Controller
@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    EnderecoService enderecoService;

    ViaCepService viaCepService;



    @Autowired
    public EnderecoController(EnderecoService enderecoService, ViaCepService viaCepService ) {
        this.enderecoService = enderecoService;
        this.viaCepService = viaCepService;
    }

    @GetMapping
    public List<EnderecoDTO> lista(){
        return enderecoService.lista();
    }

/*
    Método antigo de cadastro

    @PostMapping
    @Transactional
    public ResponseEntity<EnderecoDTO> cadastrar(@RequestBody @Valid EnderecoForm enderecoForm, UriComponentsBuilder uriBuilder) {
        return enderecoService.cadastrar(enderecoForm, uriBuilder);
    }

*/

    @PostMapping
    @Transactional
    public ResponseEntity<EnderecoDTO> cadastrar(@RequestBody @Valid EnderecoPeloCepDTO enderecoPeloCepDTO,
                                                 UriComponentsBuilder uriBuilder){
        return viaCepService.cadastrarPorCep(enderecoPeloCepDTO,uriBuilder);
    }
}




