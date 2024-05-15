package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
  private List<MaterialBiblioteca> acervo;

  public Biblioteca() {
    acervo = new ArrayList<>();
  }

  public void adicionarMaterial(MaterialBiblioteca material) {
    acervo.add(material);
  }

  public void mostrarAcervo() {
    System.out.println("**Acervo da Biblioteca:**");
    for (MaterialBiblioteca material : acervo) {
      material.mostrarDetalhes();
      System.out.println();
    }
  }

  public void emprestarLivro(String titulo) {
    for (MaterialBiblioteca material : acervo) {
      if (material instanceof Livro && material.getTitulo().equals(titulo)) {
        ((Livro) material).emprestar();
        return;
      }
    }
    System.out.println("Livro \"" + titulo + "\" não encontrado no acervo.");
  }

  public void devolverLivro(String titulo) {
    for (MaterialBiblioteca material : acervo) {
      if (material instanceof Livro && material.getTitulo().equals(titulo)) {
        ((Livro) material).devolver();
        return;
      }
    }
    System.out.println("Livro \"" + titulo + "\" não encontrado no acervo.");
  }
}
