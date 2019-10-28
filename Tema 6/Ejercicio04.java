/**
 *
 * 
 * 
 */
public class Ejercicio04 {
  public static void main (String[] args) {
    
    int numeros = 0;
    
    System.out.println("Los 20 números generados del 0 al 10 son: ");
    
    for (int i = 0; i < 20; i++) {
      numeros = (int)(Math.random()*11);
      
      System.out.print(numeros + "  ");
    }
  }
}

