
package Ejercicios.tema7;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] numeros = new int[8];
    
    for (int i = 0; i < 8; i++){
      System.out.print((i+1) + ") Introduzca un número: ");
      numeros[i] = Integer.parseInt(s.nextLine());    
    }
    System.out.println();
    
    for (int i = 0; i < 8; i++){
      if (numeros[i] % 2 == 0){
        System.out.println(numeros[i] + " Este número es par.");       
      } else {
        System.out.println(numeros[i] + " Este número es impar.");
      }
    }
  }
  
}
