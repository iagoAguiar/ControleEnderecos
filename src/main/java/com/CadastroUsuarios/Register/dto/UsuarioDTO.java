package com.CadastroUsuarios.Register.dto;

import com.CadastroUsuarios.Register.entidades.Usuario;

public class UsuarioDTO {


    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String data;
    private String CEP;


    //Construtor vazio, com parâmetros e os getters e setters





    public UsuarioDTO() {
    }

    public UsuarioDTO(Long id, String nome, String cpf, String email, String data, String CEP) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.data = data;
        this.CEP = CEP;
    }

    public UsuarioDTO(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.cpf = usuario.getCpf();
		this.data = usuario.getDataNascimento();
		this.email = usuario.getEmail();
		this.CEP = usuario.getCEP();
	}




    //sets e getters



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
