package com.CadastroUsuarios.Register.mapper;

import com.CadastroUsuarios.Register.dto.EnderecoDTO;
import com.CadastroUsuarios.Register.dto.EnderecoPeloCepDTO;
import com.CadastroUsuarios.Register.entidades.Endereco;
import com.CadastroUsuarios.Register.form.EnderecoForm;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EnderecoMapper {

    EnderecoMapper INSTANCE = Mappers.getMapper(EnderecoMapper.class);

    Endereco toModel(EnderecoDTO dto);

    @Mapping(source ="logradouro", target = "nome")
    @Mapping(source ="localidade", target = "cidade")
    Endereco toModel(EnderecoPeloCepDTO dto);


    EnderecoDTO toDTO(Endereco endereco);

    EnderecoDTO toModel(EnderecoForm enderecoForm);



}