package Ejercicio03;

public class Perro extends Animal {
  String raza;

  //Constructor
  public Perro(String raza, Sexo sexo, String nombre, String nombreCientifico, String habitad) {
    super(sexo, nombre, nombreCientifico, habitad);
    this.raza = raza;
  }
  //Getters & setters 

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }
  
  // Métodos
  public void ladrar(){
    System.out.println("perro" + this.getNombre() + "Guauu guau!");
  }
  public void comerChuche(){
    System.out.println("Dame una chuche de perro amo");
  }
  
  
}
