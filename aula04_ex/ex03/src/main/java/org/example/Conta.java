package org.example;

import java.util.Date;
import java.util.List;

public abstract class Conta {
  private int id;
  private int agencia;
  private Cliente cliente;
  protected double saldo;
  private Date dataCriacao;
  protected HistoricoTransacoes historico;

  public Conta(int id, int agencia, Cliente cliente) {
    this.id = id;
    this.agencia = agencia;
    this.cliente = cliente;
    this.saldo = 0.0;
    this.dataCriacao = new Date();
    this.historico = new HistoricoTransacoes();
  }

  // Getters e setters para os atributos
  public int getId() { return id; }
  public int getAgencia() { return agencia; }
  public Cliente getCliente() { return cliente; }
  public double getSaldo() { return saldo; }
  public Date getDataCriacao() { return dataCriacao; }

  public void depositar(double valor) {
    if (valor > 0) {
      this.saldo += valor;
      historico.adicionarTransacao(new Transacao(new Date(), TipoTransacao.DEPOSITO, valor, this));
    }
  }

  public void sacar(double valor) {
    if (valor > 0 && valor <= this.saldo) {
      this.saldo -= valor;
      historico.adicionarTransacao(new Transacao(new Date(), TipoTransacao.SAQUE, valor, this));
    } else {
      throw new IllegalArgumentException("Saldo insuficiente ou valor do saque inválido.");
    }
  }

  public List<Transacao> obterHistoricoTransacoes(Date dataInicio) {
    return historico.listarTransacoesAPartirDe(dataInicio);
  }

}
