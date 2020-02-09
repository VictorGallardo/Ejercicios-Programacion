package Ejercicio05;

public class Pizza {

  private static int nPedidas = 0;
  private static int nServidas = 0;
  private String tamano;
  private String tipo;
  private String estado;

  public Pizza(String tipo, String tamano) {
    this.tipo = tipo;
    this.tamano = tamano;
    this.estado = "pedida";
    Pizza.nPedidas++;
  }

  public String toString() {
    return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
  }

  public static int getTotalPedidas() {
    return Pizza.nPedidas;
  }

  public static int getTotalServidas() {
    return Pizza.nServidas;
  }

  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.nServidas++;
    } else {
      System.out.println("esa pizza ya se ha servido");
    }
  }
}