package br.com.digitalinnovation.basecamp.interfaces;

import br.com.digitalinnovation.basecamp.model.Conta;

public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
