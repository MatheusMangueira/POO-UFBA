package org.example;

public class Salaried extends Employee {
  double salary;

  Salaried(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  @Override
  double getPay() {
    return salary;
  }
}
