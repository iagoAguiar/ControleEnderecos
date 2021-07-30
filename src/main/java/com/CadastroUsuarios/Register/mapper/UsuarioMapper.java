package com.CadastroUsuarios.Register.mapper;

import com.CadastroUsuarios.Register.dto.UsuarioDTO;
import com.CadastroUsuarios.Register.entidades.Usuario;
import com.CadastroUsuarios.Register.form.UsuarioForm;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    Usuario toModel(UsuarioDTO dto);

    UsuarioDTO toDTO(Usuario usuario);

    UsuarioDTO toModel(UsuarioForm usuarioForm);

}