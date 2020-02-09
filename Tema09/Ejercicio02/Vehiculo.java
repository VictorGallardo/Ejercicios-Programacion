package Ejercicio02;
/**
 * Clase vehículo / Ejercicio 02
 * 
 */
public abstract class Vehiculo {
  //Atributos de clase 
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales= 0;
  
  //Atributos de instancia
  
  private int kilometrosRecorridos;
  
  public Vehiculo(){
    this.kilometrosRecorridos = 0;
  }
  public int getkilomentrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  public static int getkilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }
  
    public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }
}
