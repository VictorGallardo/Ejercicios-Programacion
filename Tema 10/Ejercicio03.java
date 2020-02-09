
package tema10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList .
 * 
 */
public class Ejercicio03 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    
    ArrayList<Integer> n = new ArrayList<>();
    
    System.out.println("Introduzca un numero y vaya pulsando enter");
    for (int i = 0; i < 10; i++) {
      n.add(Integer.parseInt(s.nextLine()));
    }
    System.out.println();
    System.out.println("Array original: ");
    System.out.println(n);
    System.out.println();
    
    Collections.sort(n);
    
    System.out.println("Array ordenado: ");
    System.out.println(n);
  }

}
