package com.CadastroUsuarios.Register.service;

import com.CadastroUsuarios.Register.dto.UsuarioDTO;
import com.CadastroUsuarios.Register.entidades.Usuario;
import com.CadastroUsuarios.Register.form.UsuarioForm;
import com.CadastroUsuarios.Register.mapper.UsuarioMapper;
import com.CadastroUsuarios.Register.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
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


    //GET
    public List<UsuarioDTO> lista(){
        List<Usuario> usuario = usuarioRepository.findAll();
        return usuario.stream().map(usuarioMapper::toDTO).collect(Collectors.toList());
    }


    //POST

    public UsuarioDTO cadastrar(UsuarioForm usuarioForm){
        Usuario usuario = usuarioForm.converter(usuarioRepository);
        usuarioRepository.save(usuario);
        return new UsuarioDTO(usuario);
    }

    public ResponseEntity<UsuarioDTO> cadastrar(UsuarioForm usuarioForm, UriComponentsBuilder uriBuilder) {
        Usuario usuario = usuarioForm.converter(usuarioRepository);
        usuarioRepository.save(usuario);

        URI uri = uriBuilder.path("/usuario/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(new UsuarioDTO(usuario));
    }





}
