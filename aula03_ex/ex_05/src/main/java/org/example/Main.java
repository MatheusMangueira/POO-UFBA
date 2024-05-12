package org.example;

import org.example.ponto.Ponto;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite as coordenadas (x, y) para o primeiro ponto:");
    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();

    System.out.println("Digite as coordenadas (dx, dy) para deslocamento:");
    int dx = scanner.nextInt();
    int dy = scanner.nextInt();

    Ponto ponto1 = new Ponto(x1, y1);

    System.out.println("Ponto original: " + ponto1);

    ponto1.desloca(dx, dy);

    System.out.println("Ponto deslocado: " + ponto1);

    scanner.close();
  }
}