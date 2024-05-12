package org.example;

import org.example.gabarito.Gabarito;
import org.example.prova.Prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Character> gabaritoRespostas = new ArrayList<>();

    gabaritoRespostas.add('A');
    gabaritoRespostas.add('B');
    gabaritoRespostas.add('C');
    gabaritoRespostas.add('D');
    gabaritoRespostas.add('E');
    gabaritoRespostas.add('A');
    gabaritoRespostas.add('B');
    gabaritoRespostas.add('C');
    gabaritoRespostas.add('D');
    gabaritoRespostas.add('E');
    gabaritoRespostas.add('A');
    gabaritoRespostas.add('B');
    gabaritoRespostas.add('C');
    gabaritoRespostas.add('D');
    gabaritoRespostas.add('E');

    Gabarito gabarito = new Gabarito(gabaritoRespostas);
    Prova prova = new Prova(gabarito);

    System.out.println("Responda as questões da prova (A, B, C, D ou E):");
    for (int i = 0; i < 15; i++) {
      System.out.print("Questão " + (i + 1) + ": ");
      char resposta = scanner.next().toUpperCase().charAt(0);
      prova.respostaAluno(resposta);
    }

    System.out.println("Acertos: " + prova.acertos());
    System.out.println("Nota: " + prova.nota());

    Prova prova2 = new Prova(gabarito);
    System.out.println("\nSegundo aluno:");
    System.out.println("Responda as questões da prova (A, B, C, D ou E):");
    for (int i = 0; i < 15; i++) {
      System.out.print("Questão " + (i + 1) + ": ");
      char resposta = scanner.next().toUpperCase().charAt(0);
      prova2.respostaAluno(resposta);
    }

    System.out.println("Acertos do segundo aluno: " + prova2.acertos());
    System.out.println("Nota do segundo aluno: " + prova2.nota());

    System.out.println("\nMaior nota: " + Prova.maior(prova, prova2));

    scanner.close();
  }
}