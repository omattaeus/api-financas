# Entendendo decisões arquiteturais e a estrutura do projeto

## Requisitos para rodar o projeto

### Setup de ambiente:

- [Java 21](https://www.java.com/pt-BR/)
- [Spring Boot 3.2.5](https://spring.io/projects/spring-boot)
  - Usando [`JVM`](https://github.com/nvm-sh/nvm)
    - `winget search Oracle.JDK`
   
### Como rodar na minha máquina?

- Clone o projeto `git clone git@github.com:omattaeus/api-users.git`
  
- Rode `javac Startup.java`
- Pronto 🎉

### Estrutura do projeto

#### Camadas mais internas
- `./core`: É onde está toda a parte da camada mais interna da aplicação, como o Domain, exceções personalizadas e ports onde estará uma interface de Financas para ser implementadas em camadas mais externas.
- `./core/domain`: É onde está a parte de atributos que serão necessário para estar sendo utilizadas em camadas mais externas, como Despesas, Orcamentos, Receitas e Categoria de Despesas.
- `./exception`: É onde está a parte de tratamento de exceção com exceção personalizadas, como o se a finança já existe (FinancasAlreadyExists).
- `./ports`: É onde está parte de interface, ou seja, de um contrato, como métodos que será implementado em camadas mais externas.

#### Camadas externa intermediária
- `./apllication`: É onde está toda parte da camada que será feito os casos de uso, ou seja, a implementação da regra de negócio do sistema.
- `./apllication/gateways`: É onde está toda parte de interfaces com métodos declaradas mais não implementados, que será implementado no usecases.
- `./apllication/usecases`: É onde está toda parte da implementação do gateways, classes como CreateOrcamentos, CreateDespesas e CreateReceitas, para ser usado na camadas mais externa, essas implementações é como se fossem o service da aplicação.

- #### Camadas mais externa
- `./adapters`: É onde está toda a parte da camada mais externa da aplicação, é onde será a parte que será exposta para o cliente, como a parte de persistência, controllers etc.
- `./adapters/controllers`: É onde está a parte de controladores da aplicação, ou seja, é onde fica a parte mais externa, é por aqui que o usuário poderá estar fazendo requisições atráves da URl, por métodos HTTP: Get, Post, Put e Delete.
- `./adapters/gateways`: É onde está a parte de implementação do gateway.
- `./persistence`: É onde está toda a parte da entidade que será salva no banco de dados e com sua regra de negócio.


