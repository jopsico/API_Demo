Este projeto é uma API simples desenvolvida com o Spring Boot, que gerencia categorias de produtos, utilizando operações CRUD (Create, Read, Update, Delete) básicas.

## Descrição

A aplicação oferece um conjunto de endpoints RESTful que permitem criar, listar, atualizar e deletar categorias. Ela foi projetada para demonstrar como utilizar o Spring Boot junto com o padrão de projeto de camadas (Controller, Service, Repository), além de interagir com objetos simples (DTO e Entity).

## Funcionalidades

- **Criar categoria**: Endpoint para adicionar uma nova categoria.
- **Listar categorias**: Endpoint para listar todas as categorias existentes.
- **Buscar categoria por ID**: Endpoint para buscar uma categoria específica através do seu ID.
- **Atualizar categoria**: Endpoint para atualizar uma categoria já existente.
- **Deletar categoria**: Endpoint para remover uma categoria.

## Estrutura do Projeto

O projeto segue a arquitetura MVC (Model-View-Controller), onde temos:

- **Model**: Representa a estrutura da entidade de categoria.
- **DTO**: Objeto de Transferência de Dados para facilitar a comunicação entre o cliente e o servidor.
- **Controller**: Recebe e processa as requisições HTTP, delegando a lógica para o serviço.
- **Service**: Contém a lógica de negócios, interagindo com o repositório.
- **Repository**: Responsável pelo gerenciamento dos dados, usando listas para simular o armazenamento de dados.

### Estrutura de Diretórios
```bash
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── br/
│   │           └── demo/
│   │               ├── controller/
│   │               │   └── CategoriaController.java
│   │               ├── dto/
│   │               │   └── CategoriaDTO.java
│   │               ├── model/
│   │               │   └── Categoria.java
│   │               ├── repository/
│   │               │   └── CategoriaRepository.java
│   │               └── service/
│   │                   └── CategoriaService.java
│   └── resources/
│       └── application.properties
```

## Como Rodar a Aplicação

**1.** Baixe o Postman no site oficial:
```bash
URL: https://www.postman.com/downloads/
```
   
**2.** Compile e execute o projeto

**3.** Abra o Postman e coloque a URL do projeto:
```bash
    A aplicação estará disponível em `http://localhost:8080`.
```

## Endpoints da API

- **POST /categorias** - Criar uma nova categoria.
- **GET /categorias/{id}** - Buscar categoria por ID.
- **GET /categorias** - Listar todas as categorias.
- **PUT /categorias/{id}** - Atualizar uma categoria existente.
- **DELETE /categorias/{id}** - Deletar uma categoria.
