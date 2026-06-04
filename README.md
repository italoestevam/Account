# Sistema Bancário em Java ☕

Projeto desenvolvido para praticar Programação Orientada a Objetos (POO) em Java.

O sistema simula operações básicas de uma conta bancária através do terminal.

## Funcionalidades

- Depositar valores
- Sacar valores
- Consultar saldo
- Encerrar sistema
- Validação para impedir saque maior que o saldo
- Validação de valores inválidos

## Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Separação de responsabilidades
- Classes e métodos
- Estruturas de decisão (`if`, `switch`)
- Entrada de dados com `Scanner`

## Estrutura do projeto

```text
contaBancaria/
│
├── Account.java
├── AccountService.java
└── Main.java
````


## Responsabilidades:

`Account` → armazena dados da conta
`AccountService` → regras de depósito e saque
`Main` → interação com usuário


## Exemplo de uso: 
1_Deposit
2_Withdraw
3_Check balance
4_Exit

Escolha: 2

Quanto deseja sacar?
173

Saldo atual: R$327.00

## Objetivo

Projeto criado com objetivo de fortalecer lógica de programação e praticar conceitos fundamentais antes de avançar para desenvolvimento backend com Spring Boot.
