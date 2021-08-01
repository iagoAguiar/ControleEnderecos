package com.CadastroUsuarios.Register.service;

import com.CadastroUsuarios.Register.dto.EnderecoDTO;
import com.CadastroUsuarios.Register.dto.EnderecoPeloCepDTO;
import com.CadastroUsuarios.Register.entidades.Endereco;
import com.CadastroUsuarios.Register.mapper.EnderecoMapper;
import com.CadastroUsuarios.Register.mapper.UsuarioMapper;
import com.CadastroUsuarios.Register.repository.EnderecoRepository;
import com.CadastroUsuarios.Register.viaCEP.ViaCEPClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class ViaCepService {

    ViaCEPClient viaCEPClient;

    private EnderecoRepository enderecoRepository;

    private final EnderecoMapper enderecoMapper = EnderecoMapper.INSTANCE;


    @Autowired
    public ViaCepService(ViaCEPClient viaCEPClient, EnderecoRepository enderecoRepository) {
        this.viaCEPClient = viaCEPClient;
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco buscaEnderecoPor(EnderecoPeloCepDTO enderecoPeloCepDTO){
        EnderecoPeloCepDTO enderecoCompletoDTO =  viaCEPClient.buscaEnderecoPor(enderecoPeloCepDTO.getCEP());

        return enderecoMapper.toModel(enderecoCompletoDTO);
    }

    public ResponseEntity<EnderecoDTO> cadastrarPorCep(EnderecoPeloCepDTO enderecoPeloCepDTO, UriComponentsBuilder uriBuilder){
            Endereco endereco = buscaEnderecoPor(enderecoPeloCepDTO);
            endereco.setNumero(enderecoPeloCepDTO.getNumero());
            endereco.setComplemento(enderecoPeloCepDTO.getComplemento());

            enderecoRepository.save(endereco);

            URI uri = uriBuilder.path("/endereco/{id}").buildAndExpand(endereco.getId()).toUri();

            return ResponseEntity.created(uri).body(new EnderecoDTO(endereco));


    }
}
