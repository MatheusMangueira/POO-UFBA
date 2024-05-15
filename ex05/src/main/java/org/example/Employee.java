package org.example;

public class Employee {
  String name;

  Employee(String name) {
    this.name = name;
  }

  double getPay() {
    return 0.0;
  }

  void printPay() {
    System.out.println(name + " - Salary: $" + getPay());
  }
}
