package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Banco banco = new Banco();
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    // Criação de cliente
    System.out.println("Digite o CPF do cliente:");
    String cpf = scanner.nextLine();
    System.out.println("Digite o nome do cliente:");
    String nome = scanner.nextLine();
    System.out.println("Digite a data de nascimento do cliente (Formato: dd/mm/aaaa):");
    Date dataNascimento = null;
    try {
      dataNascimento = dateFormat.parse(scanner.nextLine());
    } catch (ParseException e) {
      System.out.println("Data de nascimento inválida!");
      return;
    }

    Cliente cliente = new Cliente(cpf, nome, dataNascimento);
    banco.adicionarCliente(cliente);

    // Criação de conta
    System.out.println("Escolha o tipo de conta (1 - Conta Corrente, 2 - Conta Poupança):");
    int tipoConta = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer
    System.out.println("Digite o número da agência:");
    int agencia = scanner.nextInt();

    Conta conta;
    if (tipoConta == 1) {
      conta = banco.criarContaCorrente(cliente, agencia);
    } else if (tipoConta == 2) {
      conta = banco.criarContaPoupanca(cliente, agencia);
    } else {
      System.out.println("Opção inválida!");
      return;
    }

    System.out.println("Conta criada com sucesso! ID da conta: " + conta.getId());

    // Operações na conta
    while (true) {
      System.out.println("Escolha a operação:");
      System.out.println("1 - Depósito");
      System.out.println("2 - Saque");
      System.out.println("3 - Consultar saldo");
      System.out.println("4 - Histórico de transações");
      System.out.println("5 - Sair");

      int opcao = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer

      switch (opcao) {
        case 1:
          System.out.println("Digite o valor do depósito:");
          double valorDeposito = scanner.nextDouble();
          conta.depositar(valorDeposito);
          System.out.println("Depósito realizado com sucesso!");
          break;
        case 2:
          System.out.println("Digite o valor do saque:");
          double valorSaque = scanner.nextDouble();
          conta.sacar(valorSaque);
          System.out.println("Saque realizado com sucesso!");
          break;
        case 3:
          System.out.println("Saldo atual: " + conta.getSaldo());
          break;
        case 4:
          System.out.println("Digite a data inicial para o histórico (Formato: dd/mm/aaaa):");
          Date dataInicial = null;
          try {
            dataInicial = dateFormat.parse(scanner.nextLine());
          } catch (ParseException e) {
            System.out.println("Data inválida!");
            break;
          }
          for (Transacao transacao : conta.obterHistoricoTransacoes(dataInicial)) {
            System.out.println(transacao);
          }
          break;
        case 5:
          System.out.println("Saindo...");
          return;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    }


  }
}