package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
  private String cpf;
  private String nome;
  private Date dataNascimento;
  private List<Conta> contas;

  public Cliente(String cpf, String nome, Date dataNascimento) {
    this.cpf = cpf;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.contas = new ArrayList<>();
  }

  // Getters e setters para os atributos
  public String getCpf() { return cpf; }
  public String getNome() { return nome; }
  public Date getDataNascimento() { return dataNascimento; }
  public List<Conta> getContas() { return contas; }

  public void adicionarConta(Conta conta) {
    this.contas.add(conta);
  }
}
