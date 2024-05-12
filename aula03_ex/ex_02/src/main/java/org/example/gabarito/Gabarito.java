package org.example.gabarito;

import java.util.List;

public class Gabarito {
  private List<Character> respostas;

  public Gabarito(List<Character> respostas) {
    this.respostas = respostas;
  }

  public char respostaQuestao(int questao) {
    return respostas.get(questao);
  }

  public List<Character> getRespostas() {
    return respostas;
  }

  public void setRespostas(List<Character> respostas) {
    this.respostas = respostas;
  }
}
