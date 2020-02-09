
package Ejercicio06;

/**
 *
 * 
 */
public class TiempoMain {

  public static void main(String[] args) {
    
    Tiempo t = new Tiempo(0, 40, 50);
    Tiempo t2 = new Tiempo(0, 20, 10);
    Tiempo t3 = new Tiempo(0, 40, 25);
    
    
    System.out.println(t);
    System.out.println(t.resta(t, t2));

        
  }

}
