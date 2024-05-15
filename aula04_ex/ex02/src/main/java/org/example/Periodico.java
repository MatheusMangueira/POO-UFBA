package org.example;

public class Periodico extends MaterialFisico {
  private int numeroVolume;

  public Periodico(String titulo, int numeroVolume) {
    super(titulo);
    this.numeroVolume = numeroVolume;
  }

  @Override
  public void mostrarDetalhes() {
    System.out.println("Título: " + titulo);
    System.out.println("Número do Volume: " + numeroVolume);
    System.out.println("**Este periódico não pode ser emprestado.**");
  }

}
