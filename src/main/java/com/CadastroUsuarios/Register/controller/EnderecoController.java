package com.CadastroUsuarios.Register.controller;


import com.CadastroUsuarios.Register.dto.EnderecoDTO;
import com.CadastroUsuarios.Register.dto.EnderecoPeloCepDTO;
import com.CadastroUsuarios.Register.entidades.Endereco;
import com.CadastroUsuarios.Register.form.EnderecoForm;

import com.CadastroUsuarios.Register.service.EnderecoService;
import com.CadastroUsuarios.Register.service.ViaCepService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "Endereco",  tags = { "Endereco" })
public class EnderecoController {

    EnderecoService enderecoService;

    ViaCepService viaCepService;



    @Autowired
    public EnderecoController(EnderecoService enderecoService, ViaCepService viaCepService ) {
        this.enderecoService = enderecoService;
        this.viaCepService = viaCepService;
    }

    @GetMapping
    @ApiOperation(value = "Retonar todos os Endereços",
            notes = "Este endpoint retorna todos os endereços cadastrados")
    public List<EnderecoDTO> lista(){
        return enderecoService.lista();
    }

    @PostMapping
    @Transactional
    @ApiOperation(value = "Retonar todos os Endereços",
            notes = "Este endpoint retorna todos os endereços cadastrados")
    public ResponseEntity<EnderecoDTO> cadastrar(@RequestBody @Valid EnderecoPeloCepDTO enderecoPeloCepDTO,
                                                 UriComponentsBuilder uriBuilder){
        return viaCepService.cadastrarPorCep(enderecoPeloCepDTO,uriBuilder);
    }
}




