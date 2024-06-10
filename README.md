# 💹 API - Finanças

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) </br>
[![licence mit](https://img.shields.io/badge/licence-MIT-blue.svg)](./LICENSE)

---------

### SOBRE
A API de Finanças tem como objetivo cadastrar Despesas, Orcaçamentos e Receitas para que se possa ter um controle,
e relatórios de gastos, sendo possível cadastrar por data, descrição e valor, entre outros.

--------

# About the Project/Sobre o Projeto

## Contributing/Contribuir

### O que devo ter em mente antes de abrir um PullRequest?
- Esse é um projeto opensource feito pelo dev Mateus e contribuições são bem vindas.
- Para aumentar a chance de a sua contribuição ser aprovada, escolha um título legal, simples e explicativo para os itens, e siga a formatação correta dos arquivos.
- Mais interessante seria ajudar com o código e projeto em si
- 🇧🇷: Quer contribuir com o projeto? [Confira o passo a passo](./CONTRIBUTING.md)

--------
## Vamos nos conectar :handshake:

<a href="https://www.linkedin.com/in/mateusgd/"><img src="https://cdn2.iconfinder.com/data/icons/social-media-2285/512/1_Linkedin_unofficial_colored_svg-128.png" width="40"></a>|
|--

### TECNOLOGIAS
A API de Finanças tem como objetivo principal o estudo de Arquitetura Limpa, ou seja, aprimorar habilidades com este
estilo arquitetural e também treinar habilidades com API Restful e Spring Security com Spring Boot.

--------
### PASTAS
A pasta Core tem como seu principal foco a parte do core da aplicação, ou seja, é a camada mais interna da Arquitetura Limpa,
pensando que este estilo arquitetural visa que as camadas mais internas não se relacionem com a camada mais externa,
ou seja, para proteger a aplicação contra possíveis mudanças futuras.

Dentro da pasta Core, podemos ter:

    /Domain
        /dtos
    /exception
    /ports
--------
### PASTA DOMAIN/DTOS
Na pasta Domain/DTOS podemos encontrar as entidades que serão persistidas no banco de dados,
ou seja, podemos encontrar como a Classe de Despesas, Orçamentos e Receitas, que serão persistidas no banco de dados,[
com os atributos e os metódos de Get, Set e também os construtores.
### PASTA EXCEPTION
Na pasta de exception, ou seja, de exceções, podemos encontrar a Classe de FinancasAlreadyExists, ou seja,
quando uma finança já existir ele lançará uma exceção dizendo que aquela finança já existe.
### PASTA PORTS
Na pasta ports podemos encontrar uma interface com metódos que serão implementados em outra classe,
podemos encontrar metódos públicos que dirão para pegar todas as despesas, orçamentos e receitas que estão persistidas
no banco de dados e também temos metódos para implementar futuramente de salvar.

--------
## Vamos nos conectar :handshake:

<a href="https://www.linkedin.com/in/mateusgd/"><img src="https://cdn2.iconfinder.com/data/icons/social-media-2285/512/1_Linkedin_unofficial_colored_svg-128.png" width="40"></a>|
|--
