package Ejercicio03;

public class Lagarto extends Animal {

  public Lagarto(Sexo sexo, String nombre, String nombreCientifico, String habitad) {
    super(sexo, nombre, nombreCientifico, habitad);
  }
  
  public void tomarSol(){
    System.out.println("Mira como tomo el sol en esta roca");
  }
  public void morder() {
    System.out.println("Mordiendo... te he mordido");
  }
  
}
