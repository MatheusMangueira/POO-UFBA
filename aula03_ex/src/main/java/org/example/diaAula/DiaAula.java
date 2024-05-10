package org.example.diaAula;

import org.example.tuma.Turma;

public class DiaAula {
  private String data;
  private String horario;
  private Turma turma;
  private String conteudo;

  public DiaAula(String data, String horario, Turma turma, String conteudo) {
    this.data = data;
    this.horario = horario;
    this.turma = turma;
    this.conteudo = conteudo;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }

  public Turma getTurma() {
    return turma;
  }

  public void setTurma(Turma turma) {
    this.turma = turma;
  }

  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }
}
