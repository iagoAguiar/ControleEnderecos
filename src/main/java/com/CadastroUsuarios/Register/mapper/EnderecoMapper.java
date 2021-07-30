package com.CadastroUsuarios.Register.mapper;

import com.CadastroUsuarios.Register.dto.EnderecoDTO;
import com.CadastroUsuarios.Register.entidades.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EnderecoMapper {

    EnderecoMapper INSTANCE = Mappers.getMapper(EnderecoMapper.class);

    Endereco toModel(EnderecoDTO dto);

    EnderecoDTO toDTO(Endereco endereco);

}