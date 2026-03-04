# Repositório de Trabalhos da Faculdade em Java

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

Este repositório serve como um arquivo central para os diversos trabalhos e exercícios de programação desenvolvidos na linguagem Java durante o período da faculdade. O objetivo é documentar e organizar os projetos, que abrangem desde conceitos básicos de lógica de programação até aplicações mais estruturadas utilizando Programação Orientada a Objetos (POO).

---

## 📂 Estrutura do Repositório

O código-fonte de todos os projetos está localizado no diretório `src/`. Para manter a organização e o isolamento entre os trabalhos, cada subdiretório dentro de `src/` representa um projeto ou um conjunto de exercícios independentes.

```
src/
├── ExerciciosMedia         (Exercícios de lógica e cálculos)
├── ExerciciosPOO           (Projetos aplicando conceitos de POO)
│   ├── Projeto_Escola      (Sistema de registro escolar)
│   └── SistemaBanco        (Gerenciamento de contas bancárias)
├── ExerciciosPOO2          (Sistemas avançados com foco em Clean Code)
│   ├── Faculdade           (Gestão acadêmica com alta coesão)
│   └── ProjetoLocadora     (Sistema de locação de filmes)
└── ExerciciosVetor         (Exercícios com foco em manipulação de vetores)
```

Essa estrutura modular permite que cada trabalho seja compilado e executado de forma independente, sem interferir nos demais.

---

## ✨ O que há de novo?

### 🚀 Exercícios de POO2 (Object Calisthenics & Clean Code)

Recentemente, foram adicionados projetos na pasta `ExerciciosPOO2` com foco em técnicas avançadas de design de software. Estes exercícios foram desenvolvidos aplicando os princípios do **Object Calisthenics** e **Clean Code**, visando criar um código mais legível, testável e de fácil manutenção.

**Destaques das práticas aplicadas:**
-   **Apenas um nível de indentação por método:** Reduzindo a complexidade ciclomática.
-   **Não utilizar o 'ELSE':** Favorecendo o uso de *Early Returns* e polimorfismo.
-   **Encapsulamento de tipos primitivos (Value Objects):** Uso de classes como `Nome`, `RegistroAcademico` e `Periodo` para evitar a obsessão por primitivos.
-   **Classes e métodos pequenos:** Foco total na Responsabilidade Única (SRP).
-   **Coleções de Primeira Classe:** Listas de alunos e professores encapsuladas em suas próprias classes de domínio.

---

## ⚙️ Como Compilar e Executar os Projetos

Para compilar e executar qualquer um dos projetos contidos neste repositório, siga o guia geral abaixo.

### Pré-requisitos

-   **Java Development Kit (JDK)**: Versão 17 ou superior. Para verificar se você possui o Java instalado, utilize o comando `java -version`.

### Guia Geral de Execução

1.  **Abra seu terminal** e navegue até a raiz do projeto `ExerciciosJava`.

2.  **Entre no diretório de código-fonte (`src`):**
    ```sh
    cd src
    ```

3.  **Compile o projeto desejado:**
    Use o comando `javac`, especificando o nome do pacote (que corresponde ao nome do diretório do projeto) e os arquivos Java que deseja compilar.

    *Exemplo para compilar todos os arquivos do `Projeto_Escola`:*
    ```sh
    javac ExerciciosPOO/Projeto_Escola/*.java
    ```

4.  **Execute a classe principal:**
    Após a compilação, use o comando `java` com o nome completo da classe principal (formato: `NomeDoPacote.NomeDaClasse`).

    *Exemplo para executar o `Projeto_Escola`:*
    ```sh
    java ExerciciosPOO.Projeto_Escola.Main
    ```

> **Nota:** O nome da classe principal (aquela que contém o método `public static void main(String[] args)`) pode variar entre os projetos. Verifique o código-fonte do projeto que você deseja executar para encontrá-la.
