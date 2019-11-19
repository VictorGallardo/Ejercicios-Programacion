package Ejercicios.tema7;
import java.util.Scanner;
/**
 *
 * @author victor
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    int[] numero = new int[15];
    
    System.out.println("Introduzca 15 numeros, pulse intro después de cada introducción:");
    for (int i = 0 ; i < 15 ; i++) {
      numero[i] = Integer.parseInt(s.nextLine());
      
    }
    System.out.print("Array original:     ");
    for (int i = 0; i < 15; i++) {
      System.out.printf("%4d|", numero[i]);
      
    }
    System.out.println();
    
    for (int j = 14 ; j > 0 ; j--) {
      int aux = numero[j-1];
      numero[j-1] = numero[j];
      numero[j] = aux;     
    }
    
    System.out.print("Cambio de posisción:");
    for (int j = 0; j < 15; j++) {
      System.out.printf("%4d|", numero[j]);
      
    }
    
  }
  
}
