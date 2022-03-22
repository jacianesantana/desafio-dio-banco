package br.com.digitalinnovation.basecamp.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String cpf) {
        super(cpf);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupança ***");
        super.imprimirInfosComuns();
    }

}
