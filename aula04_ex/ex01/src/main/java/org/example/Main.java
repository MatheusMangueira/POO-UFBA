package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada para Circulo
    System.out.print("Digite o valor de x para o círculo: ");
    double xCirculo = scanner.nextDouble();
    System.out.print("Digite o valor de y para o círculo: ");
    double yCirculo = scanner.nextDouble();
    System.out.print("Digite o valor do raio para o círculo: ");
    double raio = scanner.nextDouble();

    ObjetoGeometrico circulo = new Circulo(xCirculo, yCirculo, raio);
    circulo.mostrarDados();
    System.out.println("Área do círculo: " + circulo.calcularArea());
    System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

    // Entrada para Retangulo
    System.out.print("\nDigite o valor de x para o retângulo: ");
    double xRetangulo = scanner.nextDouble();
    System.out.print("Digite o valor de y para o retângulo: ");
    double yRetangulo = scanner.nextDouble();
    System.out.print("Digite o valor da base para o retângulo: ");
    double base = scanner.nextDouble();
    System.out.print("Digite o valor da altura para o retângulo: ");
    double altura = scanner.nextDouble();

    Retangulo retangulo = new Retangulo(xRetangulo, yRetangulo, base, altura);
    retangulo.mostrarDados();
    System.out.println("Área do retângulo: " + retangulo.calcularArea());
    System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

    // Entrada para Triangulo
    System.out.print("\nDigite o valor de x para o triângulo: ");
    double xTriangulo = scanner.nextDouble();
    System.out.print("Digite o valor de y para o triângulo: ");
    double yTriangulo = scanner.nextDouble();
    System.out.print("Digite o valor do lado 1 para o triângulo: ");
    double lado1 = scanner.nextDouble();
    System.out.print("Digite o valor do lado 2 para o triângulo: ");
    double lado2 = scanner.nextDouble();
    System.out.print("Digite o valor do lado 3 para o triângulo: ");
    double lado3 = scanner.nextDouble();

    Triangulo triangulo = new Triangulo(xTriangulo, yTriangulo, lado1, lado2, lado3);
    triangulo.mostrarDados();
    System.out.println("Área do triângulo: " + triangulo.calcularArea());
    System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());

    scanner.close();
  }
}