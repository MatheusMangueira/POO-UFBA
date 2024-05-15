package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Criando objetos de CD e DVD
    CD cd = new CD();
    DVD dvd = new DVD();

    // Inserindo dados para CD
    System.out.println("Inserindo dados para CD:");
    System.out.print("Digite o código do CD: ");
    int codigoCD = scanner.nextInt();
    System.out.print("Digite o preço do CD: ");
    double precoCD = scanner.nextDouble();
    scanner.nextLine(); // Limpar o buffer
    System.out.print("Digite o nome do CD: ");
    String nomeCD = scanner.nextLine();
    System.out.print("Digite o número de músicas do CD: ");
    int numMusicasCD = scanner.nextInt();

    cd.setCodigo(codigoCD);
    cd.setPreco(precoCD);
    cd.setNome(nomeCD);
    cd.setMusicas(numMusicasCD);

    // Inserindo dados para DVD
    System.out.println("\nInserindo dados para DVD:");
    System.out.print("Digite o código do DVD: ");
    int codigoDVD = scanner.nextInt();
    System.out.print("Digite o preço do DVD: ");
    double precoDVD = scanner.nextDouble();
    scanner.nextLine(); // Limpar o buffer
    System.out.print("Digite o nome do DVD: ");
    String nomeDVD = scanner.nextLine();
    System.out.print("Digite o número de faixas do DVD: ");
    int numFaixasDVD = scanner.nextInt();

    dvd.setCodigo(codigoDVD);
    dvd.setPreco(precoDVD);
    dvd.setNome(nomeDVD);
    dvd.setFaixas(numFaixasDVD);

    // Imprimindo detalhes
    System.out.println("\nDetalhes do CD:");
    System.out.println("Tipo: " + cd.getTipo());
    System.out.println(cd.getDetalhes());

    System.out.println("\nDetalhes do DVD:");
    System.out.println("Tipo: " + dvd.getTipo());
    System.out.println(dvd.getDetalhes());

  }
}