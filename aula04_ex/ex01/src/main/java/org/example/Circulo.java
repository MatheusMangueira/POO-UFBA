package org.example;

public class Circulo extends ObjetoGeometrico {

  private double raio;

  public Circulo(double x, double y, double raio) {
    super(x, y);
    this.raio = raio;
  }

  @Override
  public double calcularArea() {
    return Math.PI * raio * raio;
  }

  @Override
  public double calcularPerimetro() {
    return 2 * Math.PI * raio;
  }

  @Override
  public void mostrarDados() {
    System.out.println("Círculo com centro em (" + getX() + ", " + getY() + ") e raio " + raio);
    System.out.println("Área: " + calcularArea());
    System.out.println("Perímetro: " + calcularPerimetro());
  }
}
