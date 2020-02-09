
package Ejercicio01;
/**
 * Ejercicio01 Clase Caballo
 * 
 */
public class Caballo {
  
  private String nombre;
  private String raza;
  private int edad;
  private String color; 

  Caballo(String nombre, String raza, int edad, String color) {
    this.nombre = nombre;
    this.raza = raza;
    this.edad = edad;
    this.color = color;
  }

  public Caballo() {
  }
  
  public String getNombre(){
    return this.nombre;
  }
  public String getRaza(){
    return this.raza;
  }
  public int getedad(){
    return this.edad;
  }
  public String getcolor(){
    return this.color;
  } 
  public void cabalga() {
    System.out.println("Tocotoc tocotoc tocotoc");
  }
  public void relincha() {
    System.out.println("Hiiiiiiieeeeee");
  }
  public void rumia() {
    System.out.println("Ñam ñam ñam");
  }
}
