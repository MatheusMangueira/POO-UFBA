package org.example.registroFrequencia;

import org.example.aluno.Aluno;
import org.example.diaAula.DiaAula;

public class RegistroFrequencia {
  private Aluno aluno;
  private DiaAula diaAula;
  private boolean presente;

  public RegistroFrequencia(Aluno aluno, DiaAula diaAula, boolean presente) {
    this.aluno = aluno;
    this.diaAula = diaAula;
    this.presente = presente;
  }

  public Aluno getAluno() {
    return aluno;
  }

  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
  }

  public DiaAula getDiaAula() {
    return diaAula;
  }

  public void setDiaAula(DiaAula diaAula) {
    this.diaAula = diaAula;
  }

  public boolean isPresente() {
    return presente;
  }

  public void setPresente(boolean presente) {
    this.presente = presente;
  }

}
