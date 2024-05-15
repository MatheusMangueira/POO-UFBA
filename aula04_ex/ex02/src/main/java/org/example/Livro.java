package org.example;

public class Livro extends MaterialFisico {
  private String situacao; // "disponivel", "emprestado"

  public Livro(String titulo) {
    super(titulo);
    this.situacao = "disponivel";
  }

  public void emprestar() {
    if (situacao.equals("disponivel")) {
      situacao = "emprestado";
      System.out.println("Livro \"" + titulo + "\" emprestado com sucesso!");
    } else {
      System.out.println("Livro \"" + titulo + "\" não está disponível para empréstimo.");
    }
  }

  public void devolver() {
    if (situacao.equals("emprestado")) {
      situacao = "disponivel";
      System.out.println("Livro \"" + titulo + "\" devolvido com sucesso!");
    } else {
      System.out.println("Livro \"" + titulo + "\" não está emprestado.");
    }
  }

  @Override
  public void mostrarDetalhes() {
    System.out.println("Título: " + titulo);
    System.out.println("Situação: " + situacao);
  }
}
