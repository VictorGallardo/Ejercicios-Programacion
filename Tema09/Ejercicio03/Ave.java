package Ejercicio03;

public class Ave extends Animal {
  
private String familia; 
private String plumaje;
private double embergadura;

//Getters & setters

  public String getFamilia() {
    return familia;
  }

  public void setFamilia(String familia) {
    this.familia = familia;
  }

  public String getPlumaje() {
    return plumaje;
  }

  public void setPlumaje(String plumaje) {
    this.plumaje = plumaje;
  }

  public double getEmbergadura() {
    return embergadura;
  }

  public void setEmbergadura(double embergadura) {
    this.embergadura = embergadura;
  }
  
  //Constructor 

  public Ave(String familia,String plumaje, double embergadura, Sexo sexo, String nombre, String nombrecientifico, String habitad) {    
    super(sexo,nombre,nombrecientifico,habitad);
    this.familia = familia;
    this.plumaje = plumaje;
    this.embergadura = embergadura;
  }

  @Override
  public String toString() {
    return "Ave{" + "familia=" + familia + ", plumaje=" + plumaje + ", embergadura=" + embergadura + '}';
  }

  void vuela() {
    System.out.println("El " + this.getNombre() + " vuela y vuela.");
  }
  void miPlumaje() {
    System.out.println("Mira mi plumaje " + plumaje + " que bonito es." );
  }


  
}
