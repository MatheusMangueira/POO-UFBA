package org.example;

import java.util.Scanner;

public class DVD extends Midia{
  private int nFaixas;

  public DVD() {
    super();
    this.nFaixas = 0;
  }

  public DVD(int codigo, double preco, String nome, int nFaixas) {
    super(codigo, preco, nome);
    this.nFaixas = nFaixas;
  }

  @Override
  public String getTipo() {
    return "DVD";
  }

  @Override
  public String getDetalhes() {
    return super.getDetalhes() + ", Número de Faixas: " + nFaixas;
  }

  public void setFaixas(int nFaixas) {
    this.nFaixas = nFaixas;
  }
}
