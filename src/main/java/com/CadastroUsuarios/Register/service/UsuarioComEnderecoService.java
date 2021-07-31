package com.CadastroUsuarios.Register.service;


import com.CadastroUsuarios.Register.dto.UsuarioEnderecoDTO;
import com.CadastroUsuarios.Register.entidades.Usuario;
import com.CadastroUsuarios.Register.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class UsuarioComEnderecoService {

    UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioComEnderecoService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public ResponseEntity<UsuarioEnderecoDTO> enderecosDoUsuario(@PathVariable Long id){
        Optional<Usuario> usuarioOpptional = usuarioRepository.findById(id);

        if(usuarioOpptional.isPresent()) {
            UsuarioEnderecoDTO usuarioDTO = new UsuarioEnderecoDTO(usuarioOpptional.get());
            return ResponseEntity.ok(usuarioDTO);

        }else {
            return ResponseEntity.notFound().build();
        }
    }

}
