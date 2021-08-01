package com.CadastroUsuarios.Register.service;

import com.CadastroUsuarios.Register.entidades.Endereco;
import org.springframework.web.client.RestTemplate;

public class ViaCepClient {
    public Endereco buscaEnderecoPor(String cep){
        RestTemplate template = new RestTemplate();
        return template.getForObject("https://viacep.com.br/ws/{cep}/json",Endereco.class, cep);
    }
}
