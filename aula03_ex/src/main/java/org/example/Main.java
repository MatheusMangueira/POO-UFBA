package org.example;

import org.example.aluno.Aluno;
import org.example.diaAula.DiaAula;
import org.example.diarioTurmas.DiarioTurmas;
import org.example.registroFrequencia.RegistroFrequencia;
import org.example.registroNotas.RegistroNotas;
import org.example.tuma.Turma;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    DiarioTurmas diario = new DiarioTurmas();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nMenu:");
      System.out.println("(a) Registrar um aluno.");
      System.out.println("(b) Registrar uma turma.");
      System.out.println("(c) Registrar um dia-aula.");
      System.out.println("(d) Registrar uma nota.");
      System.out.println("(e) Registrar uma frequência.");
      System.out.println("(f) Dado um dia aula e uma turma, identificar os alunos presentes.");
      System.out.println("(g) Dado um aluno e uma turma, mostrar a quantidade de presenças e de faltas.");
      System.out.println("(h) Dado um aluno e uma turma, mostrar sua nota.");
      System.out.println("(i) Listar os alunos inscritos em uma turma.");
      System.out.println("(j) Listar as turmas.");
      System.out.println("(k) Listar o total de faltas e presenças por aluno, para uma dada turma.");
      System.out.println("(l) Listar notas por aluno para uma dada turma.");
      System.out.println("(m) Sair do sistema.");

      System.out.print("\nEscolha uma opção: ");
      String opcao = scanner.nextLine();

      switch (opcao.toLowerCase()) {
        case "a":
          registrarAluno(diario, scanner);
          break;
        case "b":
          registrarTurma(diario, scanner);
          break;
        case "c":
          registrarDiaAula(diario, scanner);
          break;
        case "d":
          registrarNota(diario, scanner);
          break;
        case "e":
          registrarFrequencia(diario, scanner);
          break;
        case "f":
          identificarAlunosPresentes(diario, scanner);
          break;
        case "g":
          mostrarQuantidadePresencasFaltas(diario, scanner);
          break;
        case "h":
          mostrarNotaAlunoTurma(diario, scanner);
          break;
        case "i":
          listarAlunosTurma(diario, scanner);
          break;
        case "j":
          listarTurmas(diario);
          break;
        case "k":
          listarFaltasPresencasTurma(diario, scanner);
          break;
        case "l":
          listarNotasTurma(diario, scanner);
          break;
        case "m":
          System.out.println("Saindo do sistema...");
          scanner.close();
          System.exit(0);
        default:
          System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
      }
    }
  }

  private static void registrarAluno(DiarioTurmas diario, Scanner scanner) {
    System.out.println("\nRegistrar Aluno:");
    System.out.print("Nome do aluno: ");
    String nome = scanner.nextLine();
    System.out.print("Matrícula: ");
    String matricula = scanner.nextLine();
    System.out.print("Data de nascimento (DD/MM/AAAA): ");
    String dataNascimento = scanner.nextLine();

    Aluno aluno = new Aluno(nome, matricula, dataNascimento);
    diario.adicionarAluno(aluno);
    System.out.println("Aluno registrado com sucesso.");
  }

  private static void registrarTurma(DiarioTurmas diario, Scanner scanner) {
    System.out.println("\nRegistrar Turma:");
    System.out.print("Código da turma: ");
    String codigo = scanner.nextLine();
    System.out.print("Disciplina: ");
    String disciplina = scanner.nextLine();

    Turma turma = new Turma(codigo, disciplina);
    diario.adicionarTurma(turma);
    System.out.println("Turma registrada com sucesso.");
  }

  private static void registrarDiaAula(DiarioTurmas diario, Scanner scanner) {
    System.out.println("\nRegistrar Dia-Aula:");
    System.out.print("Data (DD/MM/AAAA): ");
    String data = scanner.nextLine();
    System.out.print("Horário (HH:MM-HH:MM): ");
    String horario = scanner.nextLine();
    System.out.print("Código da turma: ");
    String codigoTurma = scanner.nextLine();
    System.out.print("Conteúdo ministrado: ");
    String conteudo = scanner.nextLine();

    Turma turma = buscarTurmaPorCodigo(diario, codigoTurma);
    if (turma == null) {
      System.out.println("Turma não encontrada.");
      return;
    }

    DiaAula diaAula = new DiaAula(data, horario, turma, conteudo);
    diario.adicionarDiaAula(diaAula);
    System.out.println("Dia-Aula registrado com sucesso.");
  }

  private static void registrarNota(DiarioTurmas diario, Scanner scanner) {
    System.out.println("\nRegistrar Nota:");
    System.out.print("Matrícula do aluno: ");
    String matricula = scanner.nextLine();
    System.out.print("Código da turma: ");
    String codigoTurma = scanner.nextLine();
    System.out.print("Nota: ");
    double nota = Double.parseDouble(scanner.nextLine());

    Aluno aluno = buscarAlunoPorMatricula(diario, matricula);
    if (aluno == null) {
      System.out.println("Aluno não encontrado.");
      return;
    }

    Turma turma = buscarTurmaPorCodigo(diario, codigoTurma);
    if (turma == null) {
      System.out.println("Turma não encontrada.");
      return;
    }

    RegistroNotas registroNotas = new RegistroNotas(aluno, turma, nota);
    diario.adicionarRegistroNotas(registroNotas);
    System.out.println("Nota registrada com sucesso.");
  }

  private static void registrarFrequencia(DiarioTurmas diario, Scanner scanner) {
    System.out.println("\nRegistrar Frequência:");
    System.out.print("Matrícula do aluno: ");
    String matricula = scanner.nextLine();
    System.out.print("Data do dia-aula (DD/MM/AAAA): ");
    String data = scanner.nextLine();
    System.out.print("Código da turma: ");
    String codigoTurma = scanner.nextLine();
    System.out.print("Presente (S/N): ");
    boolean presente = scanner.nextLine().equalsIgnoreCase("S");

    Aluno aluno = buscarAlunoPorMatricula(diario, matricula);
    if (aluno == null) {
      System.out.println("Aluno não encontrado.");
      return;
    }

    Turma turma = buscarTurmaPorCodigo(diario, codigoTurma);
    if (turma == null) {
      System.out.println("Turma não encontrada.");
      return;
    }

    DiaAula diaAula = buscarDiaAula(diario, data, turma);
    if (diaAula == null) {
      System.out.println("Dia-Aula não encontrado.");
      return;
    }

    RegistroFrequencia registroFrequencia = new RegistroFrequencia(aluno, diaAula, presente);
    diario.adicionarRegistroFrequencia(registroFrequencia);
    System.out.println("Frequência registrada com sucesso.");

  }

  private static void identificarAlunosPresentes(DiarioTurmas diario, Scanner scanner) {
    System.out.println("\nIdentificar Alunos Presentes:");
    System.out.print("Data do dia-aula (DD/MM/AAAA): ");
    String data = scanner.nextLine();
    System.out.print("Código da turma: ");
    String codigoTurma = scanner.nextLine();

    Turma turma = buscarTurmaPorCodigo(diario, codigoTurma);
    if (turma == null) {
      System.out.println("Turma não encontrada.");
      return;
    }

    DiaAula diaAula = buscarDiaAula(diario, data, turma);
    if (diaAula == null) {
      System.out.println("Dia-Aula não encontrado.");
      return;
    }

    System.out.println("Alunos presentes na turma " + turma.getNomeDaDisciplina() + " no dia " + data + ":");
    for (RegistroFrequencia registro : diario.getRegistrosFrequencia()) {
      if (registro.getDiaAula().equals(diaAula) && registro.isPresente()) {
        System.out.println(registro.getAluno().getNome());
      }
    }
  }

  private static void mostrarQuantidadePresencasFaltas(DiarioTurmas diario, Scanner scanner) {
    System.out.println("\nMostrar Quantidade de Presenças e Faltas:");
    System.out.print("Matrícula do aluno: ");
    String matricula = scanner.nextLine();
    System.out.print("Código da turma: ");
    String codigoTurma = scanner.nextLine();

    Aluno aluno = buscarAlunoPorMatricula(diario, matricula);
    if (aluno == null) {
      System.out.println("Aluno não encontrado.");
      return;
    }

    Turma turma = buscarTurmaPorCodigo(diario, codigoTurma);
    if (turma == null) {
      System.out.println("Turma não encontrada.");
      return;
    }

    int presencas = 0;
    int faltas = 0;
    for (RegistroFrequencia registro : diario.getRegistrosFrequencia()) {
      if (registro.getAluno().equals(aluno) && registro.getDiaAula().getTurma().equals(turma)) {
        if (registro.isPresente()) {
          presencas++;
        } else {
          faltas++;
        }
      }
    }

    System.out.println("Aluno: " + aluno.getNome());
    System.out.println("Turma: " + turma.getNomeDaDisciplina());
    System.out.println("Presenças: " + presencas);
    System.out.println("Faltas: " + faltas);
  }


  private static void mostrarNotaAlunoTurma(DiarioTurmas diario, Scanner scanner) {
    System.out.println("\nMostrar Nota do Aluno:");
    System.out.print("Matrícula do aluno: ");
    String matricula = scanner.nextLine();
    System.out.print("Código da turma: ");
    String codigoTurma = scanner.nextLine();

    Aluno aluno = buscarAlunoPorMatricula(diario, matricula);
    if (aluno == null) {
      System.out.println("Aluno não encontrado.");
      return;
    }

    Turma turma = buscarTurmaPorCodigo(diario, codigoTurma);
    if (turma == null) {
      System.out.println("Turma não encontrada.");
      return;
    }

    double nota = 0;
    for (RegistroNotas registro : diario.getRegistrosNotas()) {
      if (registro.getAluno().equals(aluno) && registro.getTurma().equals(turma)) {
        nota = registro.getNota();
        break;
      }
    }

    System.out.println("Nota do aluno " + aluno.getNome() + " na turma " + turma.getNomeDaDisciplina() + ": " + nota);
  }

  private static void listarAlunosTurma(DiarioTurmas diario, Scanner scanner) {
    System.out.println("\nListar Alunos Inscritos em uma Turma:");
    System.out.print("Código da turma: ");
    String codigoTurma = scanner.nextLine();

    Turma turma = buscarTurmaPorCodigo(diario, codigoTurma);
    if (turma == null) {
      System.out.println("Turma não encontrada.");
      return;
    }

    System.out.println("Alunos da turma " + turma.getNomeDaDisciplina() + ":");
    for (Aluno aluno : turma.listarAlunos()) {
      System.out.println(aluno.getNome());
    }
  }

  private static void listarTurmas(DiarioTurmas diario) {
    System.out.println("\nListar Turmas:");
    for (Turma turma : diario.getTurmas()) {
      System.out.println("Código: " + turma.getCodigo() + ", Disciplina: " + turma.getNomeDaDisciplina());
    }
  }

  private static void listarNotasTurma(DiarioTurmas diario, Scanner scanner) {
    System.out.println("\nListar Notas por Aluno em uma Turma:");
    System.out.print("Código da turma: ");
    String codigoTurma = scanner.nextLine();

    Turma turma = buscarTurmaPorCodigo(diario, codigoTurma);
    if (turma == null) {
      System.out.println("Turma não encontrada.");
      return;
    }

    System.out.println("Notas da turma " + turma.getNomeDaDisciplina() + ":");
    for (RegistroNotas registro : diario.getRegistrosNotas()) {
      if (registro.getTurma().equals(turma)) {
        System.out.println("Matrícula: " + registro.getAluno().getMatricula() +
            ", Nome: " + registro.getAluno().getNome() +
            ", Nota: " + registro.getNota());
      }
    }
  }

  private static void listarFaltasPresencasTurma(DiarioTurmas diario, Scanner scanner) {
    System.out.println("\nListar Total de Faltas e Presenças por Aluno em uma Turma:");
    System.out.print("Código da turma: ");
    String codigoTurma = scanner.nextLine();

    Turma turma = buscarTurmaPorCodigo(diario, codigoTurma);
    if (turma == null) {
      System.out.println("Turma não encontrada.");
      return;
    }

    Map<Aluno, Integer> faltasPresencas = new HashMap<>();
    for (RegistroFrequencia registro : diario.getRegistrosFrequencia()) {
      if (registro.getDiaAula().getTurma().equals(turma)) {
        Aluno aluno = registro.getAluno();
        if (!faltasPresencas.containsKey(aluno)) {
          faltasPresencas.put(aluno, 0);
        }
        if (!registro.isPresente()) {
          faltasPresencas.put(aluno, faltasPresencas.get(aluno) + 1);
        }
      }
    }

    System.out.println("Total de faltas e presenças na turma " + turma.getNomeDaDisciplina() + ":");
    for (Map.Entry<Aluno, Integer> entry : faltasPresencas.entrySet()) {
      System.out.println("Matrícula:" + entry.getKey().getMatricula() + ", Nome:" + entry.getKey().getNome() +
          ", Presenças: " + (diario.getRegistrosFrequencia().stream()
          .filter(registro -> registro.getAluno().equals(entry.getKey()))
          .filter(RegistroFrequencia::isPresente)
          .count()) +
          ", Faltas: " + entry.getValue());
    }
  }


  private static Aluno buscarAlunoPorMatricula(DiarioTurmas diario, String matricula) {
    for (Aluno aluno : diario.getAlunos()) {
      if (aluno.getMatricula().equals(matricula)) {
        return aluno;
      }
    }
    return null;
  }

  private static Turma buscarTurmaPorCodigo(DiarioTurmas diario, String codigo) {
    for (Turma turma : diario.getTurmas()) {
      if (turma.getCodigo().equals(codigo)) {
        return turma;
      }
    }
    return null;
  }

  private static DiaAula buscarDiaAula(DiarioTurmas diario, String data, Turma turma) {
    for (DiaAula diaAula : diario.getDiasAula()) {
      if (diaAula.getData().equals(data) && diaAula.getTurma().equals(turma)) {
        return diaAula;
      }
    }
    return null;
  }


}