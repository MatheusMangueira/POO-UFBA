package org.example;

import java.util.Date;

public class Transacao {
  private Date data;
  private TipoTransacao tipo;
  private double valor;
  private Conta conta;

  public Transacao(Date data, TipoTransacao tipo, double valor, Conta conta) {
    this.data = data;
    this.tipo = tipo;
    this.valor = valor;
    this.conta = conta;
  }

  // Getters para os atributos
  public Date getData() {
    return data;
  }

  public TipoTransacao getTipo() {
    return tipo;
  }

  public double getValor() {
    return valor;
  }

  public Conta getConta() {
    return conta;
  }
}
