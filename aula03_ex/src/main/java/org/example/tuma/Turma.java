package org.example.tuma;

import org.example.aluno.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Turma {
  private String codigo;
  private String nomeDaDisciplina;
  private List<Aluno> alunos;

  public Turma(String codigo, String nomeDaDisciplina) {
    this.codigo = codigo;
    this.nomeDaDisciplina = nomeDaDisciplina;
    this.alunos = new ArrayList<>();
  }

  public String getCodigo() {
    return codigo;
  }

  public void setId(String codigo) {
    this.codigo = codigo;
  }

  public String getNomeDaDisciplina() {
    return nomeDaDisciplina;
  }

  public void setNomeDaDisciplina(String nomeDaDisciplina) {
    this.nomeDaDisciplina = nomeDaDisciplina;
  }

  public void adicionarAluno(Aluno aluno) {
    this.alunos.add(aluno);
  }

  public List<Aluno> listarAlunos() {
    return this.alunos;
  }
}
