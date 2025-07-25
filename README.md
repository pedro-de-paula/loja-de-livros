
# 📚 Sistema de Compra de Livros em Java - Curso Introdução à Linguagem Java - Senac SP

Este projeto é um programa simples em Java que simula a compra de livros por diferentes gêneros. O usuário pode escolher entre categorias como **Aventura**, **Romance**, **Mistério** e **Ciência**, selecionar livros e ver o valor total da compra.

---

## 🧠 Sobre o Projeto

O sistema permite que o usuário:

- Escolha um gênero de livro.
- Veja uma lista com 5 livros disponíveis para aquele gênero.
- Selecione livros para adicionar ao carrinho.
- Finalize a compra e veja o total.

O código está dividido em duas classes principais: `Livro` e `Main`

---

## 📦 Estrutura do Código

 1. 📁 Classe `Livro`

A classe `Livro` contém as variáveis referentes ao nome do livro e ao preço, do tipo String e double, respectivamente, um método construtor e as funções *getters* e *setters*.

2. 📁 Classe `Main`

A classe `Main`contém a lógica de interação com o usuário, menu de escolha de gêneros e livros, além do controle do carrinho e total da compra, utilizando as funções *switch* e *do/while*. Na classe ainda foram instanciados os objetos (livros).

### Métodos disponíveis:

```java
public Livro(String nome, double preco); // Construtor
public void setNome(String nome); // Setter
public String getNome(); // Getter
public void setPreco(double preco); // Setter
public double getPreco(); // Getter
```

---
#### 👨‍💻 Autores:

| Nome           | GitHub                                                  |
|----------------|---------------------------------------------------------|
| Pedro Augusto  | [@pedrrodev](https://github.com/pedrrodev)              |
| Pedro de Paula | [@pedro-de-paula](https://github.com/pedro-de-paula)    |
| Sabrina de Sá  | [@sabrinabispodesa](https://github.com/sabrinabispodesa)|
| Ryan Muto      | [@RyanMFroes](https://github.com/RyanMFroes)            |
| Rafaela Leite  | [@RafissEtiel](https://github.com/RafissEtiel)          |
