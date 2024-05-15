package org.example;

public class Triangulo extends ObjetoGeometrico {
  private double ladoA, ladoB, ladoC;

  public Triangulo(double x, double y, double ladoA, double ladoB, double ladoC) {
    super(x, y);
    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
  }

  @Override
  public double calcularArea() {
    double p = (ladoA + ladoB + ladoC) / 2;
    return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
  }

  @Override
  public double calcularPerimetro() {
    return ladoA + ladoB + ladoC;
  }

  @Override
  public void mostrarDados() {
    System.out.println("Triângulo com canto em (" + getX() + ", " + getY() + ") e lados " + ladoA + ", " + ladoB + ", " + ladoC);
    System.out.println("Área: " + calcularArea());
    System.out.println("Perímetro: " + calcularPerimetro());
  }

}
