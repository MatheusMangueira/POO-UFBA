package org.example.prova;

import org.example.gabarito.Gabarito;

import java.util.ArrayList;
import java.util.List;

public class Prova {
  private Gabarito gabarito;
  private List<Character> respostasAluno;

  public Prova(Gabarito gabarito) {
    this.gabarito = gabarito;
    this.respostasAluno = new ArrayList<>();
  }

  public Gabarito getGabarito() {
    return gabarito;
  }

  public void setGabarito(Gabarito gabarito) {
    this.gabarito = gabarito;
  }

  public List<Character> getRespostasAluno() {
    return respostasAluno;
  }

  public void setRespostasAluno(List<Character> respostasAluno) {
    this.respostasAluno = respostasAluno;
  }

  public  void respostaAluno(char resposta) {
    respostasAluno.add(resposta);
  }

  public int acertos() {
    int count = 0;
    for (int i = 0; i < gabarito.getRespostas().size(); i++) {
      if (gabarito.respostaQuestao(i) == respostasAluno.get(i)) {
        count++;
      }
    }
    return count;
  }

  public double nota(){
    int acertos = acertos();
    double nota = 0;
    for(int i = 0; i < 15; i++){
      if (i < 10) {
        nota += (respostasAluno.get(i) == gabarito.respostaQuestao(i) ? 0.5 : 0);
      } else  {
        nota += (respostasAluno.get(i) == gabarito.respostaQuestao(i)) ? 1 : 0;
      }
    }
    return nota;
  }

  public static double maior (Prova primeiraProva, Prova segundaProva){
    int acertosPrimeiraProva = primeiraProva.acertos();
    int acertosSegundaProva = segundaProva.acertos();

    if(acertosPrimeiraProva > acertosSegundaProva) {
      return primeiraProva.nota();
    } else if (acertosSegundaProva > acertosPrimeiraProva) {
      return segundaProva.nota();
    } else {
      double notaPrimeiraProva = primeiraProva.nota();
      double notaSegundaProva = segundaProva.nota();
      return (Math.max(notaPrimeiraProva, notaSegundaProva));
    }
  }


}
