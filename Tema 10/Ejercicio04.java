
package tema10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 * 
 */
public class Ejercicio04 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    ArrayList<String> palabras = new ArrayList<String>();
    
    System.out.println("Vaya introduciendo palabras y pulsando enter: ");
    
    for (int i = 0; i < 10; i++) {
      palabras.add(s.nextLine());
    }
    System.out.println();
    System.out.println("Lista de palabras original:");
    System.out.println(palabras);
    System.out.println();
    
    Collections.sort(palabras);
    
    System.out.println();
    System.out.println("Lista de palabras ordenadas: ");
    System.out.println(palabras);
  }
}
