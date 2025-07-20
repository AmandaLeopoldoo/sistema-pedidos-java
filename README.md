![Versão](https://img.shields.io/badge/versão-1.0.0-blue)
![Status](https://img.shields.io/badge/status-concluído-brightgreen)
![Java](https://img.shields.io/badge/Java-8+-orange)
![Licença](https://img.shields.io/badge/licença-MIT-green)

# 🛒 Sistema de Gerenciamento de Pedidos

Este projeto é um sistema simples para cadastro e gerenciamento de pedidos de clientes, desenvolvido em Java com foco em boas práticas de programação orientada a objetos. O sistema permite cadastrar clientes, produtos e realizar pedidos, incluindo validação de dados e um resumo detalhado da compra.

## ✨ Funcionalidades

- 👤 Cadastro de clientes com validação de e-mail e data de nascimento
- 📦 Cadastro de produtos
- 📝 Realização de pedidos com múltiplos itens
- ✔️ Validação de dados de entrada (quantidade, preço, status do pedido)
- 🧾 Resumo detalhado do pedido, incluindo cálculo do valor total
- 🔄 Enum para status do pedido (PAGAMENTO_PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE)

## 📁 Estrutura do Projeto

```
aplication/
│   Program.java
│
├── aplication/utils/
│     ValidacaoDeDados.java
│
└── entities/
    │   Cliente.java
    │   ItemPedido.java
    │   Pedido.java
    │   Produto.java
    │
    └── entities/enums/
           StatusPedido.java
```

## 🚀 Como Executar

1. **Requisitos**:
   - ☕ JDK 8 ou superior

2. **Compilação**:
   Compile todos os arquivos `.java`:

   ```sh
   javac aplication/Program.java
   ```

3. **Execução**:
   Execute o programa principal:

   ```sh
   java aplication.Program
   ```

4. **Fluxo do Sistema**:
   - Informe os dados do cliente (nome, e-mail, data de nascimento)
   - Informe os dados do pedido (status, quantidade de itens)
   - Informe os dados de cada produto (nome, preço, quantidade)
   - Veja o resumo final do pedido no console

## 💻 Exemplo de Uso

```
Digite as informações do cliente:
Nome: João da Silva
Digite o e-mail: joao@email.com
Data de nascimento (DD/MM/AAAA): 10/02/1990

Digite os dados do pedido:
Status do pedido (PAGAMENTO_PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE): ENVIADO
Qual a quantidade de itens do pedido? 2

Digite os dados do #1 item:
Nome do produto: Livro
Preço do produto: 50
Quantidade: 1

Digite os dados do #2 item:
Nome do produto: Caneta
Preço do produto: 2.5
Quantidade: 5

-----------------------------------
RESUMO DO PEDIDO:
-----------------------------------
Momento do Pedido: 20/07/2025 16:40:21
Status do pedido: ENVIADO
Client: João da Silva (1990-02-10) - joao@email.com
Itens do pedido:
Livro, R$50.00, Quantidade: 1, Subtotal: R$50.00
Caneta, R$2.50, Quantidade: 5, Subtotal: R$12.50
-----------------------------------
Valor total: R$62.50
-----------------------------------
```

## 🛠️ Tecnologias e Conceitos Utilizados

- ☕ Java SE (Standard Edition)
- 🧑‍💻 Programação Orientada a Objetos (POO)
- 📦 Pacotes e organização modular
- 🔄 Enumeração (`enum`)
- 📅 Manipulação de datas (`java.time`)
- ⌨️ Entrada de dados via Scanner
- 📋 Estruturas de dados (`ArrayList`)
- ✔️ Validação de dados de entrada
- 📝 Sobrescrita de `toString()` para formatação customizada

## 👩‍💻 Autor

Amanda Leopoldoo

---

Sinta-se à vontade para adaptar e evoluir este projeto! 🚀