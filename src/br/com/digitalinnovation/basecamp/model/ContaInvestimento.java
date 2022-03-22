package br.com.digitalinnovation.basecamp.model;

import br.com.digitalinnovation.basecamp.model.Conta;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(String cpf) {
        super(cpf);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 100) {
            throw new RuntimeException("Não é permitido saque acima de R$ 100,00. Tente novamente.");
        }
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > 100) {
            throw new RuntimeException("Não é permitido transferir acima de R$ 100,00. Tente novamente.");
        }
        this.saldo -= valor;
    }

    @Override
    public void imprimirExtrato() {

        System.out.println("*** Extrato Conta Investimento ***");
        super.imprimirInfosComuns();
    }
}
