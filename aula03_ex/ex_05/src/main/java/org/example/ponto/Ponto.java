package org.example.ponto;

public class Ponto {

  private double x;
  private double y;

  public Ponto() {
    this(0, 0);
  }

  public Ponto(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Ponto(Ponto outroPonto) {
    this(outroPonto.getX(), outroPonto.getY());
  }

  public void desloca(int dx, int dy) {
    this.x += dx;
    this.y += dy;
  }

  public void desloca(Ponto outroPonto) {
    this.x += outroPonto.getX();
    this.y += outroPonto.getY();
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public void setPonto(double x, double y) {
    setX(x);
    setY(y);
  }

  public void setPonto(Ponto outroPonto) {
    setX(outroPonto.getX());
    setY(outroPonto.getY());
  }

  @Override
  public String toString() {
    return String.format("(%f, %f)", x, y);
  }

}
