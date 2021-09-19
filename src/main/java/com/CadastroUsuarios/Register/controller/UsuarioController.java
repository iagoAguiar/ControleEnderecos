package com.CadastroUsuarios.Register.controller;

import com.CadastroUsuarios.Register.dto.UsuarioDTO;
import com.CadastroUsuarios.Register.form.UsuarioForm;
import com.CadastroUsuarios.Register.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@Controller
@RestController
@RequestMapping("/usuarios")
@Api(value = "Usuario",  tags = { "Usuario" })
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    @ApiOperation(value = "Retonar todos os Usuarios",
            notes = "Este endpoint retorna todos os usuarios cadastrados")
    public List<UsuarioDTO> lista(){
        return usuarioService.lista();
    }


    @PostMapping
    @Transactional
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Cadastrar Usuarios",
            notes = "Este endpoint Cadastra usuarios, recebendo: Nome, CPF, Email, Data Nascimento, CEP")
    public ResponseEntity<UsuarioDTO> cadastrar(@RequestBody @Valid UsuarioForm usuarioForm, UriComponentsBuilder uriBuilder) {
        return usuarioService.cadastrar(usuarioForm , uriBuilder);
    }



}
