# 📱 Desafio iPhone - Java POO (DIO)

Este projeto foi desenvolvido como parte do desafio da aula **"Exercícios: Interfaces e Lambda em Java"** no **Bootcamp Back-End Java Santander**, promovido pela **Digital Innovation One (DIO)**.

O objetivo foi simular, com base em POO, as funcionalidades básicas de um iPhone, separando seus comportamentos em interfaces distintas e aplicando polimorfismo e encapsulamento em Java.

---

## 🎯 Funcionalidades simuladas

O sistema representa os seguintes papéis do iPhone:

- 🎵 **Reprodutor Musical**  
  Métodos: `tocar()`, `pausar()`, `selecionarMusica(String)`

- 📞 **Aparelho Telefônico**  
  Métodos: `ligar(String)`, `atender()`, `iniciarCorreioVoz()`

- 🌐 **Navegador na Internet**  
  Métodos: `exibirPagina(String)`, `adicionarNovaAba()`, `atualizarPagina()`

Todos os comportamentos foram centralizados na classe `Iphone`, que implementa as três interfaces.

---

## 🧠 Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Criação de interfaces
- Implementação e sobrescrita de métodos
- Encapsulamento e polimorfismo
- Separação de responsabilidades

---

## 📁 Estrutura do Projeto

iphone-desafio/
├── AparelhoTelefonico.java
├── NavegadorInternet.java
├── ReprodutorMusical.java
├── Iphone.java
└── Main.java

yaml
Copiar
Editar

---

## 🚀 Como executar o projeto

1. Clone este repositório:

git clone https://github.com/seu-usuario/desafio-iphone-java-poo-dio.git
cd desafio-iphone-java-poo-dio
Compile os arquivos:

javac *.java
Execute o programa:

java Main

## 💡 Saída esperada

Selecionando a música: Imagine - John Lennon

Tocando música...

Música pausada.

Ligando para 11999999999...

Atendendo chamada...

Iniciando correio de voz...

Exibindo página: www.dio.me

Nova aba adicionada.

Atualizando a página....

## 🧑‍💻 Autor
Desenvolvido por Bianca como parte da formação Back-End Java Santander na DIO
