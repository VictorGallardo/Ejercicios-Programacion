
package Ejercicio11;

import java.text.DecimalFormat;

public class TarjetaRegalo {
  
  private String numero;
  private double cantidad;
  

  public TarjetaRegalo(double cantidad) {
    this.cantidad = cantidad;
    this.numero = "";
    for(int i = 0;i<5;i++){
      this.numero += (int)(Math.random()*10);
    }
   
  }
  public void gasta(double gasto){
    if (gasto > cantidad){
      System.out.printf("No tiene suficiente saldo para gastar %.2f€\n" , gasto);
    } else {
    cantidad -= gasto;
    }
  }
  
  @Override
  public String toString(){
    DecimalFormat dosDecimales = new DecimalFormat("0.00");
    return "Tarjeta Nº " + this.numero + " - Saldo " + dosDecimales.format(cantidad) + " €";
  }

  public double getCantidad() {
    return cantidad;
  }

  public void setCantidad(double cantidad) {
    this.cantidad = cantidad;
  }
  
  
    TarjetaRegalo fusionaCon(TarjetaRegalo t) {
    double nuevoSaldo = this.getCantidad() + t.getCantidad();
    this.setCantidad(0);
    t.setCantidad(0);
    return new TarjetaRegalo(nuevoSaldo);
  }
}
