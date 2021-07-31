package com.CadastroUsuarios.Register.controller;

import com.CadastroUsuarios.Register.dto.UsuarioEnderecoDTO;
import com.CadastroUsuarios.Register.service.UsuarioComEnderecoService;
import com.CadastroUsuarios.Register.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/usuario")
public class UsuarioComEnderecoController {

    UsuarioComEnderecoService usuarioComEnderecoService;

    @Autowired
    public UsuarioComEnderecoController(UsuarioComEnderecoService usuarioComEnderecoService) {
        this.usuarioComEnderecoService = usuarioComEnderecoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioEnderecoDTO> enderecosDoUsuario(@PathVariable Long id){
        return usuarioComEnderecoService.enderecosDoUsuario(id);
    }
}
