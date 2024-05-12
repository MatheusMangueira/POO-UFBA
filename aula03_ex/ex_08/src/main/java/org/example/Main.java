package org.example;

import org.example.mes.Agenda;
import org.example.enums.Mes;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Agenda agenda = new Agenda();

    int opcao;

    do {
      System.out.println("\nMenu Agenda:");
      System.out.println("1. Adicionar compromisso");
      System.out.println("2. Imprimir compromissos");
      System.out.println("3. Sair");
      System.out.print("Digite sua opção: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          agenda.adicionarCompromisso(scanner);
          break;
        case 2:
          agenda.imprimirCompromissos();
          break;
        case 3:
          System.out.println("Saindo da agenda.");
          break;
        default:
          System.out.println("Opção inválida.");
      }
    } while (opcao != 3);

    scanner.close();
  }
}