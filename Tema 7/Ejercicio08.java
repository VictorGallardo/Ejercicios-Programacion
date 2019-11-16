
package Ejercicios.tema7;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","optubre","noviembre","diciembre"};
    
    int temperaturas[] = new int[12];
    
    System.out.println("Introduzca las temperaturas de cada mes");
    System.out.println();
    
    for (int i = 0; i < 12; i++){
      System.out.print((i+1) + " Introduzca la media de " + mes[i] + ": ");
      temperaturas[i] = Integer.parseInt(s.nextLine());      
    }
    for (int i = 0; i < 12; i++){      
      System.out.println(mes[i]);
      for (int j = 0; j < temperaturas[i]; j++) {
        System.out.print("*");
      }
    }
    
    
    
    
  }
  
}
