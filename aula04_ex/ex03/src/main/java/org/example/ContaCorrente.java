package org.example;

public class ContaCorrente extends Conta {
  public ContaCorrente(int id, int agencia, Cliente cliente) {
    super(id, agencia, cliente);
  }

  @Override
  public void sacar(double valor) throws IllegalArgumentException {
    super.sacar(valor);
  }
}