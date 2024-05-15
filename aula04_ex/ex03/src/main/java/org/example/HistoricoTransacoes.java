package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoricoTransacoes {
  private List<Transacao> transacoes;

  public HistoricoTransacoes() {
    this.transacoes = new ArrayList<>();
  }

  public void adicionarTransacao(Transacao transacao) {
    this.transacoes.add(transacao);
  }

  public List<Transacao> listarTransacoes() {
    return this.transacoes;
  }

  public List<Transacao> listarTransacoesAPartirDe(Date dataInicio) {
    List<Transacao> resultado = new ArrayList<>();
    for (Transacao transacao : transacoes) {
      if (transacao.getData().after(dataInicio)) {
        resultado.add(transacao);
      }
    }
    return resultado;
  }
}
