package br.com.digitalinnovation.basecamp.model;

import br.com.digitalinnovation.basecamp.model.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(String cpf) {
        super(cpf);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirInfosComuns();
    }
}
