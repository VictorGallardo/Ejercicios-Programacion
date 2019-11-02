/**
 *
 * 
 * 
 */
public class Ejercicio13 {
  public static void main (String[] args) {
    
    int tiradaUno = 0;
    int tiradaDos = 0;
    
    System.out.println("Este programa muestra la tirada de dos dados.");
    
    while (tiradaUno != 2 || tiradaDos != 2) {
      tiradaUno = (int)(Math.random()*6 ) + 1;
      tiradaDos = (int)(Math.random()*6 ) + 1;
      System.out.println(tiradaUno + " - " + tiradaDos);
    }
  }
}

