package org.example.registroNotas;

import org.example.aluno.Aluno;
import org.example.tuma.Turma;

public class RegistroNotas {
  private Aluno aluno;
  private Turma turma;
  private double nota;

  public RegistroNotas(Aluno aluno, Turma turma, double nota) {
    this.aluno = aluno;
    this.turma = turma;
    this.nota = nota;
  }

  public Aluno getAluno() {
    return aluno;
  }

  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
  }

  public Turma getTurma() {
    return turma;
  }

  public void setTurma(Turma turma) {
    this.turma = turma;
  }

  public double getNota() {
    return nota;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }
}
