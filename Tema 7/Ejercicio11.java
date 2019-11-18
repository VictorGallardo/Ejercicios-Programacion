
package Ejercicios.tema7;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] numeros = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int contadorP = 0;
    int contadorNoP = 0;
    boolean esPrimo = false;
            
    int i;
    int contador = 2;
    
    
    System.out.println("Introduzca 10 numero por teclado: ");
    for (i = 0; i < 10; i++){
      System.out.print((i+1) + ") introduzca un numero: ");
      numeros[i] = Integer.parseInt(s.nextLine());
      
    esPrimo = true;  
      for (int j = 2; j < numeros[i] - 1; j++){
        if (numeros[i] % j == 0){
          esPrimo = false;
        }      
      }
      if (esPrimo) {
        primo[contadorP++] = numeros[i];      
      } else {
        noPrimo[contadorNoP++] = numeros[i];
      }
    }
    System.out.println("\nArray original:");
    System.out.println("\n------------------------------------------------------------|");
    for (i = 0; i < 10; i++){
      System.out.printf("│%4d ", i);
    }
    System.out.println("\n------------------------------------------------------------|");
    for (i = 0; i < 10; i++){
      System.out.printf("|%4d ", numeros[i]);
    }
    System.out.println("\n------------------------------------------------------------|");

    System.out.println();
    

    
    for (i = 0; i < contadorP; i++) {
      numeros[i] = primo[i];     
    }
    for (i = contadorP; i < contadorP + contadorNoP; i++){
      numeros[i] = noPrimo[i-contadorP];
    }
    
    System.out.println("\nArray con primos al principio:");
    System.out.println("\n------------------------------------------------------------|");
    for (i = 0; i < 10; i++){
      System.out.printf("│%4d ", i);
    }
    System.out.println("\n------------------------------------------------------------|");
    for (i = 0; i < 10; i++){
      System.out.printf("|%4d ", numeros[i]);
    }
    System.out.println("\n------------------------------------------------------------|");
    
    

  }
  
}
