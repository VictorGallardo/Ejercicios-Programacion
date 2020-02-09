package Ejercicio03;

public class Mamifero extends Animal {
  
  String amamantar;
  
  //Constructor

  public Mamifero(String amamantar, Sexo sexo, String nombre, String nombreCientifico, String habitad) {
    super(sexo, nombre, nombreCientifico, habitad);
    this.amamantar = amamantar;
  }
  
  //Getters & setters

  public String getAmamantar() {
    return amamantar;
  }

  public void setAmamantar(String amamantar) {
    this.amamantar = amamantar;
  }

}
