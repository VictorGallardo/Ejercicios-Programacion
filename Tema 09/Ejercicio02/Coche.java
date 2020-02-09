
package Ejercicio02;

public class Coche extends Vehiculo {
  
  private int cilindrada;
  
  public Coche(int cil) {
    super();
    this.cilindrada = cil;
  }
  
  public void quemaRueda(){
    System.out.println("Quemandooo ruedaaa!!!");
  }
  
}
