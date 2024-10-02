# SBS - Sistema de Biblioteca Simples

O **SBS (Sistema de Biblioteca Simples)** é uma aplicação básica desenvolvida em Java utilizando JavaFX para fornecer uma interface gráfica amigável para gerenciar uma pequena biblioteca. O sistema permite a adição, remoção e busca de livros de maneira eficiente e prática. 

## Funcionalidades

- **Adicionar Livro**: Permite adicionar um novo livro ao sistema com as seguintes informações:
  - Título
  - Autor
  - Editora
  - Ano de publicação

- **Remover Livro**: Permite remover um livro existente do sistema utilizando as informações fornecidas.

- **Buscar Livro**: Permite buscar livros cadastrados na biblioteca pelos seguintes critérios:
  - Título
  - Autor
  - Editora
  - Ano de publicação

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal utilizada no desenvolvimento da aplicação.
- **JavaFX**: Framework para criação de interfaces gráficas (GUI).
- **PostgreSQL**: Banco de dados utilizado para armazenar as informações dos livros.
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências.

## Estrutura do Projeto

- `src/main/java`: Contém o código-fonte Java.
- `src/main/resources`: Contém os arquivos de configuração, como o arquivo de conexão com o banco de dados.
- `pom.xml`: Arquivo de configuração do Maven.

## Requisitos

- **Java 8 ou superior**
- **Maven**
- **PostgreSQL**

## Configuração do Banco de Dados

1. Instale o PostgreSQL e crie um banco de dados para o sistema.
2. Configure as credenciais de acesso ao banco de dados no arquivo `gitconfig.properties` e renomeia para `config.properties`localizado em `src/main/resources`.

```properties
DB_URL= jdbc:postgresql://localhost:port/database_name
DB_DRIVER = driver_do_banco_de_dados
DB_USER = seu_usuario
DB_PASSWORD = sua_senha
