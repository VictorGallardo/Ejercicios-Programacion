
package Ejercicios.tema7;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[][] numeros = new int[4][5];
    int fila ;
    int columna ;
    
    System.out.println("Por favor introduzca 20 numeros enteros:");
    
    for(fila = 0; fila < 4; fila++){
      for(columna = 0; columna < 5; columna++){
        System.out.print(fila + columna + ") Introduzca un díjito: ");
        numeros[fila][columna] = Integer.parseInt(s.nextLine());       
      }
    }

    System.out.println();
    
    for(columna = 0; columna < 5; columna++){
    System.out.print("-----------|");
    }
    System.out.println();
    
    int sumaFila;
    
    for(fila = 0; fila < 4; fila++){  
      sumaFila = 0;     
      for(columna = 0; columna < 5; columna++){
        System.out.printf("%10d |", numeros[fila][columna]);    
        sumaFila += numeros[fila][columna];
      }
      System.out.println(" " + sumaFila + " Σ Fila " + fila);
        
      for(columna = 0; columna < 5; columna++){
        System.out.print("-----------|");
      }  
      System.out.println();    
    }
    int sumaColumna;
    int sumaTotal = 0;
    
    for(columna = 0; columna < 5; columna++){  
      sumaColumna = 0;  
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += numeros[fila][columna];        
      }
      sumaTotal += sumaColumna;
      System.out.printf("%10d  ", sumaColumna); 
    }
    
    System.out.println(" Total = " + sumaTotal);
    System.out.println();
    System.out.println();
  }    

}
  

