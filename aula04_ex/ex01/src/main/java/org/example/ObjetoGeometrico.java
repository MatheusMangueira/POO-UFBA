package org.example;

public abstract class ObjetoGeometrico {
  private double x, y;

  public  ObjetoGeometrico(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public abstract void  mostrarDados();
  public abstract double calcularArea();
  public abstract double calcularPerimetro();

}
