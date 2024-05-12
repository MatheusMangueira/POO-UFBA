package org.example.serieLimitada;

import java.util.Random;

public class SerieLimitada {

  private static final int MAXIMO_DE_INSTANCIAS = 6;
  private static int contador = 0;
  private int numeroSerie;

  public SerieLimitada() {
    if (contador >= MAXIMO_DE_INSTANCIAS) {
      throw new IllegalStateException("Número máximo de instâncias atingido!");
    }
    contador++;
    Random random = new Random();
    numeroSerie = random.nextInt(90000) + 10000;
  }

  public int getNumeroSerie() {
    return numeroSerie;
  }

  public static int getMaximoDeInstancias() {
    return MAXIMO_DE_INSTANCIAS;
  }

  public static int getContador() {
    return contador;
  }
}
