package Ejercicio03;

public class Canario extends Ave {
  
  //Constructor
  public Canario(String familia, String plumaje, double embergadura, Sexo sexo, String nombre, String nombrecientifico, String habitad) {
    super(familia, plumaje, embergadura, sexo, nombre, nombrecientifico, habitad);
  }
  
  //Metodos 
  public void cantar(){
    System.out.println("♫ ♪ ♫ ♪ ♫ ♪ ♫ ♪ ♫ ♪ ♫ ♪");
  }
  
  public void enjaulado(){
    double jaula = (int)(Math.random()*10);
    if (jaula>5) {
      System.out.println("Estoy enjaulado");
    } else {
      System.out.println("No estoy enjaulado soy libre.");
    }
    
  }
  
}
