package org.example;

public class Hourly extends Employee {
  double hourlyRate;
  double hours;

  Hourly(String name, double hourlyRate) {
    super(name);
    this.hourlyRate = hourlyRate;
  }

  @Override
  double getPay() {
    return hourlyRate * hours;
  }

  void addHours(double hours) {
    this.hours += hours;
  }
}
