# API_Demo

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
  ![Post](https://github.com/user-attachments/assets/4fb28e3f-8367-47a0-9459-f8599a5ef113)
- **GET /categorias/{id}** - Buscar categoria por ID.
- **GET /categorias** - Listar todas as categorias.
   ![Get](https://github.com/user-attachments/assets/c4d53e7a-61d6-41d9-84bd-73266a1f4833)
- **PUT /categorias/{id}** - Atualizar uma categoria existente.
  ![Put](https://github.com/user-attachments/assets/2383fb70-094b-46fe-b4a2-fe55047f997c)
- **DELETE /categorias/{id}** - Deletar uma categoria.
  ![Delete](https://github.com/user-attachments/assets/81348edf-7223-4482-9bc7-976bbd08464b)
