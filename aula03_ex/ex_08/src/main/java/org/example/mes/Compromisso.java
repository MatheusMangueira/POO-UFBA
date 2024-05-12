package org.example.mes;

import org.example.enums.Mes;

public class Compromisso {
  private Mes mes;
  private String descricao;

  public Compromisso(Mes mes, String descricao) {
    this.mes = mes;
    this.descricao = descricao;
  }

  public Mes getMes() {
    return mes;
  }

  public void setMes(Mes mes) {
    this.mes = mes;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return "Compromisso{" +
        "mes=" + mes +
        ", descricao='" + descricao + '\'' +
        '}';
  }
}
