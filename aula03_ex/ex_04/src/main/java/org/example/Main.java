package org.example;

import org.example.produto.Produto;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o nome do produto:");
    String nome = scanner.nextLine();

    System.out.println("Informe o preço de custo do produto:");
    double precoCusto = scanner.nextDouble();

    System.out.println("Informe o preço de venda do produto:");
    double precoVenda = scanner.nextDouble();

    Produto produto = new Produto();
    produto.setNome(nome);
    produto.setPrecoCusto(precoCusto);
    produto.setPrecoVenda(precoVenda);

    produto.calcularMargemLucro();

    System.out.println("Margem de lucro: R$" + produto.getMargemLucro());
    System.out.println("Margem de lucro (%): " + produto.getMargemLucroPorcentagem() + "%");

    scanner.close();
  }
}