package org.example.mes;

import org.example.enums.Mes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
  private List<Compromisso> compromissos;

  public Agenda() {
    compromissos = new ArrayList<>();
  }

  public void adicionarCompromisso(Scanner scanner) {
    System.out.println("Digite o mês do compromisso (1-Janeiro, 12-Dezembro): ");
    int mesEscolha = scanner.nextInt();

    if (mesEscolha < 1 || mesEscolha > 12) {
      System.out.println("Mês inválido. Tente novamente.");
      return;
    }

    Mes mes = Mes.values()[mesEscolha - 1]; // Converte valor para enum Mes

    System.out.println("Digite a descrição do compromisso: ");
    scanner.nextLine(); // Consumir quebra de linha anterior (caso necessário)
    String descricao = scanner.nextLine();

    compromissos.add(new Compromisso(mes, descricao));
  }

  public List<Compromisso> getCompromissos() {
    return compromissos;
  }

  public void imprimirCompromissos() {
    for (Compromisso compromisso : compromissos) {
      System.out.println(compromisso);
    }
  }
}
