package org.example.diarioTurmas;

import org.example.aluno.Aluno;
import org.example.diaAula.DiaAula;
import org.example.registroFrequencia.RegistroFrequencia;
import org.example.registroNotas.RegistroNotas;
import org.example.tuma.Turma;

import java.util.ArrayList;
import java.util.List;

public class DiarioTurmas {
  private List<Aluno> alunos;
  private List<Turma> turmas;
  private List<DiaAula> diasAula;
  private List<RegistroFrequencia> registrosFrequencia;
  private List<RegistroNotas> registrosNotas;

  public DiarioTurmas() {
    this.alunos = new ArrayList<>();
    this.turmas = new ArrayList<>();
    this.diasAula = new ArrayList<>();
    this.registrosFrequencia = new ArrayList<>();
    this.registrosNotas = new ArrayList<>();
  }

  public void adicionarAluno(Aluno aluno) {
    alunos.add(aluno);
  }

  public void adicionarTurma(Turma turma) {
    turmas.add(turma);
  }

  public void adicionarDiaAula(DiaAula diaAula) {
    diasAula.add(diaAula);
  }

  public void adicionarRegistroFrequencia(RegistroFrequencia registroFrequencia) {
    registrosFrequencia.add(registroFrequencia);
  }

  public void adicionarRegistroNotas(RegistroNotas registroNotas) {
    registrosNotas.add(registroNotas);
  }

  public List<Aluno> getAlunos() {
    return alunos;
  }

  public void setAlunos(List<Aluno> alunos) {
    this.alunos = alunos;
  }

  public List<Turma> getTurmas() {
    return turmas;
  }

  public void setTurmas(List<Turma> turmas) {
    this.turmas = turmas;
  }

  public List<DiaAula> getDiasAula() {
    return diasAula;
  }

  public void setDiasAula(List<DiaAula> diasAula) {
    this.diasAula = diasAula;
  }

  public List<RegistroFrequencia> getRegistrosFrequencia() {
    return registrosFrequencia;
  }

  public void setRegistrosFrequencia(List<RegistroFrequencia> registrosFrequencia) {
    this.registrosFrequencia = registrosFrequencia;
  }

  public List<RegistroNotas> getRegistrosNotas() {
    return registrosNotas;
  }

  public void setRegistrosNotas(List<RegistroNotas> registrosNotas) {
    this.registrosNotas = registrosNotas;
  }
}
