
package Ejercicios.tema7;
import java.util.Scanner;
/**
 *
 * @author victor
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] n = new int[10];
    int i;
    
    System.out.println("Por favor, introduzca 10 números enteros.");
    System.out.println("Pulse la tecla INTRO después de introducir cada número.");
    
    for (i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println("\nLos números introducidos, al revés, son los siguientes:");
    for (i = 9; i >= 0; i--) {
      System.out.println(n[i]);
    }
  }
  
}
