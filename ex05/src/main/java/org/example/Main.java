package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Choose an option:");
      System.out.println("1. Add a salaried employee");
      System.out.println("2. Add an hourly employee");
      System.out.println("3. Print payroll");
      System.out.println("4. Exit");
      int option = scanner.nextInt();

      switch (option) {
        case 1:
          System.out.println("Enter employee name: ");
          scanner.nextLine(); // Consume newline
          String name = scanner.nextLine();
          System.out.println("Enter employee's monthly salary: ");
          double salary = scanner.nextDouble();
          employees.add(new Salaried(name, salary));
          break;
        case 2:
          System.out.println("Enter employee name: ");
          scanner.nextLine(); // Consume newline
          String name2 = scanner.nextLine();
          System.out.println("Enter employee's hourly rate: ");
          double rate = scanner.nextDouble();
          employees.add(new Hourly(name2, rate));
          break;
        case 3:
          double totalPayroll = 0.0;
          System.out.println("\nPayroll:");
          for (Employee emp : employees) {
            emp.printPay();
            totalPayroll += emp.getPay();
          }
          System.out.println("\nTotal payroll: $" + totalPayroll);
          break;
        case 4:
          System.out.println("Exiting...");
          System.exit(0);
        default:
          System.out.println("Invalid option. Please choose again.");
      }
    }
  }
}