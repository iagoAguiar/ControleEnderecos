package com.CadastroUsuarios.Register.service;

import com.CadastroUsuarios.Register.dto.UsuarioDTO;
import com.CadastroUsuarios.Register.entidades.Usuario;
import com.CadastroUsuarios.Register.mapper.UsuarioMapper;
import com.CadastroUsuarios.Register.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    private final UsuarioMapper usuarioMapper = UsuarioMapper.INSTANCE;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<UsuarioDTO> lista(){
        List<Usuario> usuario = usuarioRepository.findAll();
        return usuario.stream().map(usuarioMapper::toDTO).collect(Collectors.toList());
    }
}
