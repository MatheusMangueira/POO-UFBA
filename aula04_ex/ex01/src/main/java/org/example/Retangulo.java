package org.example;

public class Retangulo extends ObjetoGeometrico {
  private double base, altura;

  public Retangulo(double x, double y, double base, double altura) {
    super(x, y);
    this.base = base;
    this.altura = altura;
  }

  @Override
  public double calcularArea() {
    return base * altura;
  }

  @Override
  public double calcularPerimetro() {
    return 2 * (base + altura);
  }

  @Override
  public void mostrarDados() {
    System.out.println("Retângulo com canto em (" + getX() + ", " + getY() + ") e base " + base + " e altura " + altura);
    System.out.println("Área: " + calcularArea());
    System.out.println("Perímetro: " + calcularPerimetro());
  }
}
