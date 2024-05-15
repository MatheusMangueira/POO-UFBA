package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();
    Scanner scanner = new Scanner(System.in);
    String opcao;

    // Menu para interação com o usuário
    do {
      System.out.println("\nMenu da Biblioteca");
      System.out.println("1. Adicionar Livro");
      System.out.println("2. Adicionar Periódico");
      System.out.println("3. Mostrar Acervo");
      System.out.println("4. Emprestar Livro");
      System.out.println("5. Devolver Livro");
      System.out.println("6. Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextLine();

      switch (opcao) {
        case "1":
          System.out.print("Digite o título do livro: ");
          String tituloLivro = scanner.nextLine();
          biblioteca.adicionarMaterial(new Livro(tituloLivro));
          break;
        case "2":
          System.out.print("Digite o título do periódico: ");
          String tituloPeriodico = scanner.nextLine();
          System.out.print("Digite o número do volume do periódico: ");
          int numeroVolume = scanner.nextInt();
          scanner.nextLine(); // consumir a nova linha
          biblioteca.adicionarMaterial(new Periodico(tituloPeriodico, numeroVolume));
          break;
        case "3":
          biblioteca.mostrarAcervo();
          break;
        case "4":
          System.out.print("Digite o título do livro a ser emprestado: ");
          String tituloEmprestimo = scanner.nextLine();
          biblioteca.emprestarLivro(tituloEmprestimo);
          break;
        case "5":
          System.out.print("Digite o título do livro a ser devolvido: ");
          String tituloDevolucao = scanner.nextLine();
          biblioteca.devolverLivro(tituloDevolucao);
          break;
        case "6":
          System.out.println("Saindo do sistema...");
          break;
        default:
          System.out.println("Opção inválida, por favor, tente novamente.");
          break;
      }
    } while (!opcao.equals("6"));

    scanner.close();
  }
}