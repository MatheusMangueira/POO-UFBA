package org.example;

import org.example.contaBancaria.ContaBancaria;
import org.example.loja.Produto;
import org.example.triangulo.Triangulo;

public class Main {
  public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria("João", 1000, 1234);

    System.out.println("Titular: " + conta.getTitular());

    conta.depositar(200);
    System.out.println("Saldo após depósito: " + conta.getSaldo());

    conta.sacar(100);
    System.out.println("Saldo após saque: " + conta.getSaldo());

    System.out.println("---------------------------------");
    // -------------------------------------------------------

    Triangulo triangulo = new Triangulo(10, 5);
    System.out.println("Área do triângulo: " + triangulo.calcularArea());
    System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());

    System.out.println("---------------------------------");
    // -------------------------------------------------------

    Produto produto = new Produto("Camiseta", 19.90, 10);

    produto.adicionar(5);
    produto.diminuir(3);

    produto.visualizarProduto();


  }
}