package br.com.digitalinnovation.basecamp;

import br.com.digitalinnovation.basecamp.model.*;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Jaciane");
        cliente1.setCpf("032...");

        Conta cc = new ContaCorrente("032...");
        cc.depositar(500);

        Conta poupanca = new ContaPoupanca("032...");
        cc.transferir(50, poupanca);

        Conta investimento = new ContaInvestimento("032...");
        cc.transferir(250, investimento);
        investimento.sacar(100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        investimento.imprimirExtrato();

    }
}
