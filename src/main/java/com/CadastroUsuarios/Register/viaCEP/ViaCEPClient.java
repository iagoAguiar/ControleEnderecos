package com.CadastroUsuarios.Register.viaCEP;

import com.CadastroUsuarios.Register.dto.EnderecoPeloCepDTO;
import com.CadastroUsuarios.Register.entidades.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="https://viacep.com.br/ws/", name = "viacep")
public interface ViaCEPClient {


    @GetMapping("{cep}/json")
    EnderecoPeloCepDTO buscaEnderecoPor(@PathVariable("cep") String cep);
}
