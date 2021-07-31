package com.CadastroUsuarios.Register.dto;


import com.CadastroUsuarios.Register.entidades.Endereco;
import com.CadastroUsuarios.Register.entidades.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioEnderecoDTO {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String data;
    private String CEP;
    private List<Endereco> endereco;


    public UsuarioEnderecoDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.cpf = usuario.getCpf();
        this.data = usuario.getDataNascimento();
        this.email = usuario.getEmail();
        this.endereco = usuario.getEndereco();
        this.CEP = usuario.getCEP();
    }

    //sets e getters



    public Long getId() {
        return id;
    }
    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDataNascimento() {
        return data;
    }
    public void setDataNascimento(String data) {
        this.data = data;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }


}