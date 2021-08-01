package com.CadastroUsuarios.Register.service;


import com.CadastroUsuarios.Register.dto.EnderecoDTO;
import com.CadastroUsuarios.Register.entidades.Endereco;
import com.CadastroUsuarios.Register.form.EnderecoForm;
import com.CadastroUsuarios.Register.mapper.EnderecoMapper;
import com.CadastroUsuarios.Register.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnderecoService {


    private EnderecoRepository enderecoRepository;

    private final EnderecoMapper enderecoMapper = EnderecoMapper.INSTANCE;

    @Autowired
    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public List<EnderecoDTO> lista(){
        List<Endereco> endereco = enderecoRepository.findAll();
        return endereco.stream().map(enderecoMapper::toDTO).collect(Collectors.toList());
    }



    //Método antigo de cadastro
    @Deprecated
    public ResponseEntity<EnderecoDTO> cadastrar(EnderecoForm enderecoForm , UriComponentsBuilder uriBuilder){

        Endereco endereco = enderecoForm.converter(enderecoRepository);
        enderecoRepository.save(endereco);

        URI uri = uriBuilder.path("/endereco/{id}").buildAndExpand(endereco.getId()).toUri();

        return ResponseEntity.created(uri).body(new EnderecoDTO(endereco));

    }

}