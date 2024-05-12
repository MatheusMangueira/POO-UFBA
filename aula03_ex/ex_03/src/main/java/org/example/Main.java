package org.example;

import org.example.vetor.Vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o tamanho inicial do vetor:");
    int tamanhoInicial = scanner.nextInt();
    Vetor vetor = new Vetor(tamanhoInicial);

    System.out.println("Digite os elementos a serem inseridos no vetor (ou digite 'fim' para parar):");
    String elemento;
    while (!(elemento = scanner.next()).equalsIgnoreCase("fim")) {
      vetor.insert(elemento);
    }

    System.out.println("Tamanho atual do vetor: " + vetor.size());

    System.out.println("Digite a posição do elemento que deseja obter:");
    int posicao = scanner.nextInt();
    String elementoNaPosicao = vetor.get(posicao);
    if (elementoNaPosicao != null) {
      System.out.println("Elemento na posição " + posicao + ": " + elementoNaPosicao);
    } else {
      System.out.println("Posição inválida ou elemento não existe.");
    }

    scanner.close();


  }
}