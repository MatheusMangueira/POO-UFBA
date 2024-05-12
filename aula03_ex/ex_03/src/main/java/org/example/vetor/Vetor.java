package org.example.vetor;

public class Vetor {
  private int tamanho;
  private String[] elementos;
  private int capacidade;


  public Vetor(int capacidadeInicial) {
    this.elementos = new String[capacidadeInicial];
    this.tamanho = 0;
    this.capacidade = capacidadeInicial;
  }

  public void insert(String elemento) {
    if (tamanho == capacidade) {
      aumentaCapacidade();
    }
    elementos[tamanho] = elemento;
    tamanho++;
  }

  public String get(int index) {
    if (index < 0 || index >= tamanho) {
      throw new IllegalArgumentException("Index inválido");
    }
    return elementos[index];
  }

  public int size() {
    return tamanho;
  }

  private void aumentaCapacidade() {
    // no vetor dinamico a capacidade do vetor é dobrada quando o vetor enche
    int novaCapacidade = capacidade * 2;
    String[] novoV = new String[novaCapacidade];
    for (int i = 0; i < tamanho; i++) {
      novoV[i] = elementos[i];
    }
    elementos = novoV;
    capacidade = novaCapacidade;
  }
}
