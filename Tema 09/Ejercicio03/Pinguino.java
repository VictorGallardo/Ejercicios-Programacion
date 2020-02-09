package Ejercicio03;

public class Pinguino extends Ave {

  //Constructor
  public Pinguino(String familia, String plumaje, double embergadura, Sexo sexo, String nombre, String nombrecientifico, String habitad) {
    super(familia, plumaje, embergadura, sexo, nombre, nombrecientifico, habitad);
  }
  //Métodos
  public void deslizar() {
    System.out.println("Mira como me deslizo por el hielo");
  }
  
  @Override
  public void vuela() {  
    System.out.println("No puedo volar");
  }
  
  
  
  
  
}
