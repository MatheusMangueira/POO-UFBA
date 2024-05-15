package org.example;

import java.util.Date;

public class ContaPoupanca extends Conta {
  private static final double TAXA_SACAR = 0.05;
  private static final double RENDIMENTO_MENSAL = 0.04;

  public ContaPoupanca(int id, int agencia, Cliente cliente) {
    super(id, agencia, cliente);
  }

  @Override
  public void sacar(double valor) throws IllegalArgumentException {
    double valorComTaxa = valor * (1 + TAXA_SACAR);
    super.sacar(valorComTaxa);
  }

  public void render() {
    double rendimento = this.saldo * RENDIMENTO_MENSAL;
    this.saldo += rendimento;
    historico.adicionarTransacao(new Transacao(new Date(), TipoTransacao.RENDIMENTO, rendimento, this));
  }
}