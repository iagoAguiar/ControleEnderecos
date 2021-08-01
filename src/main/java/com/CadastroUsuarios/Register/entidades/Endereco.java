package com.CadastroUsuarios.Register.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Nome não pode ser vazio")
    private String nome;

    private int numero;

    @NotNull(message = "Complemento não pode ser vazio")
    private String complemento;

    @NotNull(message = "Bairro não pode ser vazia")
    private String bairro;

    @NotNull(message = "Cidade não pode ser vazia")
    private String cidade;

    @NotNull(message = "CEP não pode ser vazia")
    private String CEP;

    //Construtor vazio, com parâmetros e os getters e setters


    public Endereco() {
        super();
    }







    public Endereco(@NotNull(message = "Nome não pode ser vazio") String nome, int numero,
                    @NotNull(message = "Complemento não pode ser vazio") String complemento,
                    @NotNull(message = "Bairro não pode ser vazia") String bairro,
                    @NotNull(message = "Cidade não pode ser vazia") String cidade,
                    @NotNull(message = "CEP não pode ser vazia") String cEP) {
        super();
        this.nome = nome;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        CEP = cEP;
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

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return numero == endereco.numero && Objects.equals(id, endereco.id) && Objects.equals(nome, endereco.nome) && Objects.equals(complemento, endereco.complemento) && Objects.equals(bairro, endereco.bairro) && Objects.equals(cidade, endereco.cidade) && Objects.equals(CEP, endereco.CEP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, numero, complemento, bairro, cidade, CEP);
    }
}
