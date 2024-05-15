package org.example;

public abstract class MaterialFisico implements MaterialBiblioteca {
  protected String titulo; // Changed access modifier from private to protected

  public MaterialFisico(String titulo) {
    this.titulo = titulo;
  }

  @Override
  public String getTitulo() {
    return titulo;
  }

  public abstract void mostrarDetalhes();
}
