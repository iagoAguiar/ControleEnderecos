package com.CadastroUsuarios.Register.controller;


import com.CadastroUsuarios.Register.dto.EnderecoDTO;
import com.CadastroUsuarios.Register.form.EnderecoForm;
import com.CadastroUsuarios.Register.repository.EnderecoRepository;
import com.CadastroUsuarios.Register.service.EnderecoService;
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

    private EnderecoRepository enderecoRepository;

    @Autowired
    public EnderecoController(EnderecoService enderecoService, EnderecoRepository enderecoRepository) {
        this.enderecoService = enderecoService;
        this.enderecoRepository = enderecoRepository;
    }

    @GetMapping
    public List<EnderecoDTO> lista(){
        return enderecoService.lista();
    }


    @PostMapping
    @Transactional
    public ResponseEntity<EnderecoDTO> cadastrar(@RequestBody @Valid EnderecoForm enderecoForm, UriComponentsBuilder uriBuilder) {
        return enderecoService.cadastrar(enderecoForm, uriBuilder);
    }



}