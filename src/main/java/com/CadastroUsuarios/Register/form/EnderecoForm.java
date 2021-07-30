package com.CadastroUsuarios.Register.form;

import com.CadastroUsuarios.Register.entidades.Endereco;
import com.CadastroUsuarios.Register.repository.EnderecoRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EnderecoForm {
    private Long id;
    @NotNull
    @NotEmpty
    private String nome;

    private int numero;
    @NotNull @NotEmpty
    private String complemento;
    @NotNull @NotEmpty
    private String bairro;
    @NotNull @NotEmpty
    private String cidade;
    @NotNull @NotEmpty
    private String CEP;

    public EnderecoForm() {
    }

    public EnderecoForm(Long id, String nome, int numero, String complemento, String bairro, String cidade, String CEP) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CEP = CEP;
    }

    public Long getId() {
        return id;
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
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String cEP) {
        CEP = cEP;
    }


    public Endereco converter(EnderecoRepository enderecoRepository) {
        return new Endereco(nome,numero,complemento,bairro,cidade, CEP);
    }


}