
package Ejercicio09;

import java.text.DecimalFormat;

public class Movil extends Terminal {
  
  private double precio = 0;
  private String tarifa;
  

  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
    this.precio = 0;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public String getTarifa() {
    return tarifa;
  }

  public void setTarifa(String tarifa) {
    this.tarifa = tarifa;
  }
  
  @Override
  public void llama(Terminal t, int segundosLlamada){
    super.llama(t, segundosLlamada);
    double minutos = (double) segundosLlamada / 60;
    
    switch (this.tarifa){
      case "rata":
        this.precio += minutos * 0.06;
        break;
      case "mono":
        this.precio += minutos * 0.12;
        break;
      case "bisonte":
        this.precio += minutos * 0.30;
        break;
      default:
    }
  }  
  @Override 
  public String toString() {
    DecimalFormat formatoEuros = new DecimalFormat("0.00");
    return "Nº" + this.getNumero() + " - " + this.getTiempoLlamada()
      + "s de conversación - tarificados " 
      + formatoEuros.format(this.precio) + " euros";
  }
    
}
  
