package org.example.produto;

public class Produto {
  private String nome;
  private double precoCusto;
  private double precoVenda;
  private double margemLucro;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPrecoCusto() {
    return precoCusto;
  }

  public void setPrecoCusto(double precoCusto) {
    this.precoCusto = precoCusto;
  }

  public double getPrecoVenda() {
    return precoVenda;
  }

  public void setPrecoVenda(double precoVenda) {
    if (precoVenda >= precoCusto) {
      this.precoVenda = precoVenda;
    } else {
      System.out.println("Preço de venda não pode ser inferior ao preço de custo!");
      throw new IllegalArgumentException("Preço de venda não pode ser inferior ao preço de custo!");
    }
  }

  public double getMargemLucro() {
    return margemLucro;
  }

  public void setMargemLucro(double margemLucro) {
    this.margemLucro = margemLucro;
  }

  public void calcularMargemLucro() {
    this.margemLucro = precoVenda - precoCusto;
  }

  public double getMargemLucroPorcentagem() {
    return (margemLucro / precoCusto) * 100;
  }
}
