
package Ejercicio01;
/**
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 * Este main pruba la clase Caballo 
 * 
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    
    Caballo a = new Caballo("Sultan", "Andalúz", 15, "negro");
    Caballo b = new Caballo("Goloso", "Percherón", 17, "marrón");
    Caballo c = new Caballo("Galana", "Árabe", 7, "canela");
    
    System.out.println("El nombre del caballo a es " + a.getNombre());
    System.out.println("Su raza es " + a.getRaza());
    System.out.println("Tiene " + a.getedad() + " años");
    
    a.cabalga();
    a.relincha();
    a.rumia();
    
    
  }
  
}
