# Entendendo decisões arquiteturais e a estrutura do projeto

## Requisitos para rodar o projeto

### Setup de ambiente:

- [Java 21](https://www.java.com/pt-BR/)
  - Instalar [`Java 21`](https://www.oracle.com/br/java/technologies/downloads/#java21)
- [Spring Boot 3.2.5](https://spring.io/projects/spring-boot)
  - Usando [`JVM`](https://github.com/nvm-sh/nvm)
    - `winget search Oracle.JDK`
   
### Como rodar na minha máquina?

- Clone o projeto `git clone git@github.com:omattaeus/api-financas.git`
  
- Rode `javac Startup.java`
- Pronto 🎉

### Documentação
    
     🕗 EM DESENVOLVIMENTO

- [Documentação](https://github.com/omattaeus/api-financas/tree/master/documenta%C3%A7%C3%A3o)
    
- `./documentação`: É onde você pode encontrar os arquivos de documentação, como planilha de teste, digramas e entre outros.
- `./documentação/planilha-de-teste`: É onde você pode encontrar os arquivos de planilha de teste com cobertura de teste prevista de 90% e também fazendo utilização do Pitest para Teste de Mutação para fazer verificação e análises dos testes implementados.
- `./documentação/diagramas`: É onde você pode encontrar os arquivos de diagramas, entre eles: Diagramas De Classe, Diagramas de Casos de Uso e Diagrama De Implantação.
Com os Diagramas podemos ter uma visão mais ampla e geral do sistema ao todo.

### Estrutura do projeto

#### Camadas mais internas

- [Core (camada mais interna)](https://github.com/omattaeus/api-financas/tree/master/src/main/java/br/com/matsoft/apifinancas/core)

- `./core`: É onde está toda a parte da camada mais interna da aplicação, como o Domain, exceções personalizadas e ports onde estará uma interface de Financas para ser implementadas em camadas mais externas.
- `./core/domain`: É onde está a parte de atributos que serão necessário para estar sendo utilizadas em camadas mais externas, como Despesas, Orcamentos, Receitas e Categoria de Despesas.
- `./exception`: É onde está a parte de tratamento de exceção com exceção personalizadas, como o se a finança já existe (FinancasAlreadyExists).
- `./ports`: É onde está parte de interface, ou seja, de um contrato, como métodos que será implementado em camadas mais externas.

#### Camadas externa intermediária

- [Application (camadas externa intermediária)](https://github.com/omattaeus/api-financas/tree/master/src/main/java/br/com/matsoft/apifinancas/application)
  
- `./apllication`: É onde está toda parte da camada que será feito os casos de uso, ou seja, a implementação da regra de negócio do sistema.
- `./apllication/gateways`: É onde está toda parte de interfaces com métodos declaradas mais não implementados, que será implementado no usecases.
- `./apllication/usecases`: É onde está toda parte da implementação do gateways, classes como CreateOrcamentos, CreateDespesas e CreateReceitas, para ser usado na camadas mais externa, essas implementações é como se fossem o service da aplicação.

#### Camadas mais externa

- [Adapters (camadas mais externa)](https://github.com/omattaeus/api-financas/tree/master/src/main/java/br/com/matsoft/apifinancas/adapters)
  
- `./adapters`: É onde está toda a parte da camada mais externa da aplicação, é onde será a parte que será exposta para o cliente, como a parte de persistência, controllers etc.
- `./adapters/controllers`: É onde está a parte de controladores da aplicação, ou seja, é onde fica a parte mais externa, é por aqui que o usuário poderá estar fazendo requisições atráves da URl, por métodos HTTP: Get, Post, Put e Delete.
- `./adapters/gateways`: É onde está a parte de implementação do gateway.
- `./persistence`: É onde está toda a parte da entidade que será salva no banco de dados e com sua regra de negócio.


