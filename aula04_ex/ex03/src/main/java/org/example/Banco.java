package org.example;

import java.util.ArrayList;
import java.util.List;

public class Banco {
  private List<Cliente> clientes;
  private List<Conta> contas;
  private int proximoIdConta;

  public Banco() {
    this.clientes = new ArrayList<>();
    this.contas = new ArrayList<>();
    this.proximoIdConta = 1;
  }

  public ContaCorrente criarContaCorrente(Cliente cliente, int agencia) {
    ContaCorrente contaCorrente = new ContaCorrente(proximoIdConta++, agencia, cliente);
    contas.add(contaCorrente);
    cliente.adicionarConta(contaCorrente);
    return contaCorrente;
  }

  public ContaPoupanca criarContaPoupanca(Cliente cliente, int agencia) {
    ContaPoupanca contaPoupanca = new ContaPoupanca(proximoIdConta++, agencia, cliente);
    contas.add(contaPoupanca);
    cliente.adicionarConta(contaPoupanca);
    return contaPoupanca;
  }

  public void adicionarCliente(Cliente cliente) {
    clientes.add(cliente);
  }
}
