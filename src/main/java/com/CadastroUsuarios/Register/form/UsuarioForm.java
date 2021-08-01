package com.CadastroUsuarios.Register.form;

import com.CadastroUsuarios.Register.entidades.Endereco;
import com.CadastroUsuarios.Register.entidades.Usuario;
import com.CadastroUsuarios.Register.repository.UsuarioRepository;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(uniqueConstraints={@UniqueConstraint(columnNames={"cpf", "email"})})
public class UsuarioForm {
    @NotNull
    @NotEmpty
    private String nome;
    @NotNull @NotEmpty @Length(min = 10)
    @Column(unique = true)
    private String cpf;
    @NotNull @NotEmpty
    @Column(unique = true)
    private String email;
    @NotNull @NotEmpty
    private String dataNascimento;

    @NotNull @NotEmpty
    private String CEP;

    private List<Endereco> endereco;

    //Construtor vazio, com parâmetros e os getters e setters


    public UsuarioForm() {
    }

    public UsuarioForm(String nome, String cpf, String email, String dataNascimento, String CEP, List<Endereco> endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.CEP = CEP;
        this.endereco = endereco;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }
    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String cEP) {
        CEP = cEP;
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
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Usuario converter(UsuarioRepository usuariosRepository) {
        return new Usuario( nome,  email ,cpf, dataNascimento, endereco, CEP);

    }
}
