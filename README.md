<h1 align="center">Controle de endereços</h1>

<p align="center"> O projeto é um sistema de controle de 
endereços, usando um web service que retornar o endereço, realizando a busca pelo CEP.</p>

<p> Para mais detalhes sobre a implementação do código, existe um artigo publicado sobre esse
passo a passo</p>



<a target="_blank" href="https://github-readme-medium-recent-article.vercel.app/medium/@iagoaguiar202/0"><img src="https://github-readme-medium-recent-article.vercel.app/medium/@iagoaguiar202/0" alt="Recent Article 0">


<p align="center">
     <a href="#objetivo">Features</a> •
     <a href="#roadmap">Pré-requisitos</a> • 
     <a href="#tecnologias">Executando o projeto</a> • 
     <a href="#tecnologias">Endpoints</a> • 
     <a href="#tecnologias">Tecnologias</a> • 
     <a href="#autor">Autor</a>
</p>

<h4 align="center"> 
	🚧  Controle de endereços 🚀 Escopo inicial finalizado, mas aberto para melhorias.
</h4>

### Features

- [x] Cadastro de Usuarios
- [x] Cadastro de Endereços pelo CEP
- [x] Endpoit de Endereços por usuário


### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), Além disto a recomendação é o editor [Intellij](https://www.jetbrains.com/pt-br/idea/).
[Java](https://www.java.com/pt-BR/) versão 11+.
<br>


###  Executando o projeto

```bash
# Clone este repositório
$ git clone <https://github.com/iagoAguiar/ControleEnderecos>

# Acesse a pasta do projeto no terminal/cmd
$ cd ControleEnderecos

# Execute a aplicação em modo de desenvolvimento
$ mvn spring-boot:run

#Ou execute direto pelo Intellij.
selecione a classe principal e  use o atalho: CTRL + Shift + F10. 

# O servidor inciará na porta:8080 - acesse <http://localhost:8080>
```

### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:



- [Java](https://www.java.com/pt-BR/)
- [Spring](https://spring.io/)
- [Swagger](https://swagger.io/)
- [Lombok](https://projectlombok.org/)
- [Mapstruct](https://mapstruct.org/)
- [Bean Validation](https://beanvalidation.org/)
- [JPA](https://www.oracle.com/java/technologies/persistence-jsp.html)
- [Open Feign](https://spring.io/projects/spring-cloud-openfeign/)
- [Junit](https://junit.org/junit5/)
- [Mockito](https://site.mockito.org/)


### 🛠 Endpoints

<h4>Documentação</h4>

```bash
http://localhost:8080/swagger-ui.html
```


<h4>GET</h4>

```bash
http://localhost:8080/enderecos
http://localhost:8080/usuarios
http://localhost:8080/usuario/{id}
http://localhost:8080/
````
<h4>POST</h4>

```bash
http://localhost:8080/endereco
http://localhost:8080/usuarios

````

<h4>POST</h4>

```bash
https://controle-enderecos.herokuapp.com/endereco
https://controle-enderecos.herokuapp.com/usuarios
https://controle-enderecos.herokuapp.com/usuarios/{id}
https://controle-enderecos.herokuapp.com

````


### Autor ###
---

 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/38701614?v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Iago Duarte de Aguiar</b></sub></a> <a>🚀</a>


Feito com ❤️ por Iago Aguiar👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Iago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/iagoduarte/)](https://www.linkedin.com/in/iagoduarte/)
[![Gmail Badge](https://img.shields.io/badge/-iagoaguiar202@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:iagoaguiar202@gmail.com)](mailto:iagoaguiar202@gmail.com)



