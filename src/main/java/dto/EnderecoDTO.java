package dto;

import entidades.Endereco;

public class EnderecoDTO {



    private Long id;
    private String nome;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String CEP;

    public EnderecoDTO() {
    }

    public EnderecoDTO(Long id, String nome, int numero, String complemento, String bairro, String cidade, String CEP) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CEP = CEP;
    }

    public EnderecoDTO(Endereco endereco) {
		this.nome = endereco.getNome();
		this.id = endereco.getId();
		this.numero = endereco.getNumero();
		this.complemento = endereco.getComplemento();
		this.bairro = endereco.getBairro();
		this.cidade = endereco.getCidade();
		this.CEP = endereco.getCEP();
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
        this.CEP = cEP;
    }
}
