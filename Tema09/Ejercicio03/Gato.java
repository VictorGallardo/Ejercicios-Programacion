package Ejercicio03;

public class Gato extends Animal {
  
  int vidas;

  //Constructor
  public Gato(int vidas, Sexo sexo, String nombre, String nombreCientifico, String habitad) {
    super(sexo, nombre, nombreCientifico, habitad);
    this.vidas = vidas;
  }
  
  //Getters & setters
  public int getVidas() {
    return vidas;
  }

  public void setVidas(int vidas) {
    this.vidas = vidas;
  }
  
  //Métodos
  public void maullar() {
    System.out.println("Miauuuuuu");
  }
  
  public void arañar() {
    System.out.println("Zaaass! Aramiuuu!"); 
  }
  
  public void saltar() {
    System.out.println("Mira como salto");
  }
  
  
}
