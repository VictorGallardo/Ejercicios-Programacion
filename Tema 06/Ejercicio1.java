/**
 *
 * 
 * 
 */
public class Ejercicio1 {
  
  public static void main (String[] args) {
    
    int tirada = 0;
    int suma = 0;
    
    System.out.println("Este programa muestra la tirada de tres dados.");
   
    for (int i = 1; i <= 3; i++) {
      tirada = (int)(Math.random()*6 ) + 1;
      System.out.print(tirada + " - ");
      suma += tirada;
    }
    System.out.print("La suma de sus dados es de: " + suma);
	}
}

