# Desafio DIO - Criando um Banco Digital com Java e Orientação a Objetos

## Desafio de Projeto
- Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java.
Para isso, vamos interpretar o seguinte cenário: “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança),
as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”;
- Use todo o seu conhecimento para estender o domínio, incluindo novas classes, atributos e/ou métodos;
- Incluir o Lombok ao projeto para reduzir sua verbosidade de código.

## Pilares da Orientação a Objetos

### 1. Abstração
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais.
Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

### 2. Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender.
O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

### 3. Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai.
A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

### 4. Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir
das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando,
muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.

## Representação da OO no projeto

### 1. Abstração
- Pensando nas entidades que são essenciais para um banco, inicialmente foram criadas as classe: Banco, ContaCorrente, ContaPoupanca e Cliente;
- Posteriormente foram adicionados os atributos essenciais para cada classe e os métodos essenciais de um banco.

### 2. Encapsulamento
- Pensando em não expor mais do que o necessário, os atibutos das classes foram modificados de "public" para "private",
garantindo a segurança de alterações, sendo somente acessíveis através dos métodos get e set.
- Nas classes contas, foi criado somente o método get para que os atributos não sofram modificações.

### 3. Herança
- Ao perceber que as classes ContaCorrente e ContaPoupanca tem abributos e métodos em comum, para evitar repetição de código
foi criada a superclasse Conta com os atributos para que a mesma fosse herdada através do uso do "extends";
- Definindo um contrato, foi criada a interface IConta para obrigar a implementação dos métodos em comum na superclasse Conta;

### 4. Polimorfismo
- A superclasse Conta foi denifida como abstrata servindo apenas como base para as classes que a herdam, não podendo ser instanciada por si só. 
- Os atributos da superclasse Conta foram modificados de "private" para "protected" tornando-se acessível apenas para as classe que a herdam.

## Extensão do Domínio
- Para ampliar o domínio foi criada a classe ContaInvestimento com condições diferentes das demais contas para uso dos métodos.
- Na superclasse Conta foi utilizada a biblioteca Lombok visando reduzir o código e aumentar a produtividade.

## Stack

- Java 11
- Lombok
