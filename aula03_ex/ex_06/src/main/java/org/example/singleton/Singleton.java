package org.example.singleton;

public class Singleton {
  private static Singleton instance;

  private Singleton() {
    System.out.println("Criando instância de Singleton...");
  }

  public static synchronized Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
