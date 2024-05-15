package org.example;

import java.util.Scanner;

public class CD extends Midia{
  private int nMusicas;

  public CD() {
    super();
    this.nMusicas = 0;
  }

  public CD(int codigo, double preco, String nome, int nMusicas) {
    super(codigo, preco, nome);
    this.nMusicas = nMusicas;
  }

  @Override
  public String getTipo() {
    return "CD";
  }

  @Override
  public String getDetalhes() {
    return super.getDetalhes() + ", Número de Músicas: " + nMusicas;
  }

  public void setMusicas(int nMusicas) {
    this.nMusicas = nMusicas;
  }
}
