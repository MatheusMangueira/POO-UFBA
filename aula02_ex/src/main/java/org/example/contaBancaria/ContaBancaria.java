package org.example.contaBancaria;

public class ContaBancaria {
  private String titular;
  private double saldo;
  private int numeroDaConta;

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public int getNumeroDaConta() {
    return numeroDaConta;
  }

  public void setNumeroDaConta(int numeroDaConta) {
    this.numeroDaConta = numeroDaConta;
  }

  public ContaBancaria(String titular, double saldo, int numeroDa) {
    this.titular = titular;
    this.saldo = saldo;
    this.numeroDaConta = numeroDa;
  }


  public void sacar(double valor) {
    if (valor > this.saldo) {
      throw new IllegalArgumentException("Saldo insuficiente");
    } else {
      this.saldo -= valor;
    }
  }

  public void depositar(double valor) {
    if (valor <= 0) {
      throw new IllegalArgumentException("Valor inválido");
    }
    this.saldo += valor;
  }

}
