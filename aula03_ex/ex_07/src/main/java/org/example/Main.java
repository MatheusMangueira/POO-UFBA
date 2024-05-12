package org.example;

import org.example.serieLimitada.SerieLimitada;

public class Main {
  public static void main(String[] args) {
    int numeroInstancias = 5;

    for (int i = 0; i < numeroInstancias; i++) {
      try {
        SerieLimitada serieLimitada = new SerieLimitada();
        System.out.println("Série " + (i + 1) + ": " + serieLimitada.getNumeroSerie());
      } catch (IllegalStateException e) {
        System.out.println("Erro: " + e.getMessage());
        break;
      }
    }

    System.out.println("\nNúmero máximo de instâncias: " + SerieLimitada.getMaximoDeInstancias());
    System.out.println("Instâncias criadas: " + SerieLimitada.getContador());

  }
}