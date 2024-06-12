# Sistema Bancário em Java

Este é um simples sistema bancário em Java que permite a criação de contas correntes e contas poupança, realização de operações como depósito, saque e transferência, e também exibição de extratos e histórico de transações.

## Funcionalidades Implementadas

- Criação de contas correntes e contas poupança associadas a clientes.
- Operações de depósito, saque e transferência entre contas.
- Exibição de extratos bancários para contas correntes e poupanças.
- Registro de histórico de transações para cada conta.
- Listagem de clientes associados ao banco.

## Estrutura do Projeto

O projeto está dividido em várias classes:

- `Banco`: Representa o banco e contém uma lista de contas associadas.
- `Cliente`: Representa um cliente do banco.
- `Conta`: Classe abstrata que representa uma conta bancária e implementa a interface `IConta`.
- `ContaCorrente`: Subclasse de `Conta` que representa uma conta corrente.
- `ContaPoupanca`: Subclasse de `Conta` que representa uma conta poupança.
- `IConta`: Interface que define os métodos básicos que uma conta deve ter.
- `Main`: Classe principal que contém o método `main()` para testar o sistema.

## Como Utilizar

Para utilizar o sistema, você pode seguir estes passos:

1. Clone ou baixe o repositório para o seu computador.
2. Abra o projeto em sua IDE Java preferida.
3. Execute a classe `Main`.
4. A classe `Main` contém exemplos de como criar clientes, contas, realizar operações e exibir informações.

## Contribuição

Se você quiser contribuir com melhorias ou correções para este projeto, sinta-se à vontade para enviar um pull request. Todas as contribuições são bem-vindas!
 
