package entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity
public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull(message = "Nome não pode ser vazio")
        private String nome;

        @Column(unique = true)
        @NotNull(message = "CPF não pode ser vazio")
        private String cpf;

        @Column(unique = true)
        @NotNull(message = "Email não pode ser vazio")
        private String email;

        @NotNull(message = "Data de nascimento não pode ser vazia")
        private String dataNascimento;

        @NotNull(message = "CEP não pode ser vazia")
        private String CEP;

    //Construtor vazio, com parâmetros e os getters e setters



/*
        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name="usuario_id")
        private List<Endereco> endereco;

        */



    public Usuario() {
        super();
    }
/*

    public Usuario(@NotNull(message = "Nome não pode ser vazio") String nome,
                   @NotNull(message = "Email não pode ser vazio")  String email,
                   @NotNull(message = "CPF não pode ser vazio")  String cpf,
                   @NotNull(message = "Data de nascimento não pode ser vazia") String dataNascimento,
                   @NotNull(message = "Endereço não pode ser vazia") List<Endereco> endereco,
                   @NotNull(message = "CEP não pode ser vazia") String CEP) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        //this.endereco = endereco;
        this.CEP = CEP;
    }
*/




    public Usuario(@NotNull(message = "Nome não pode ser vazio") String nome,
                   @NotNull(message = "CPF não pode ser vazio") String cpf,
                   @NotNull(message = "Email não pode ser vazio") String email,
                   @NotNull(message = "Data de nascimento não pode ser vazia") String dataNascimento,
                   @NotNull(message = "CEP não pode ser vazia") String cEP) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        CEP = cEP;
    }

    /*public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }*/

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

    public Long getId() {
        return id;
    }





    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }




    @Override
    public int hashCode() {
        return Objects.hash(cpf, dataNascimento, email, id, nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        return Objects.equals(cpf, other.cpf) && Objects.equals(dataNascimento, other.dataNascimento)
                && Objects.equals(email, other.email) && Objects.equals(id, other.id)
                && Objects.equals(nome, other.nome);
    }


}
