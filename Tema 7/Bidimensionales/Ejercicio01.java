
package Ejercicios.tema7;
/**
 *
 * @author victor
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    
    int[][] num = new int[3][6];
    
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
    
    int fila;
    int columna;
    
    System.out.print("       ");
    for(columna = 0; columna < 6; columna++){
      System.out.print(" | Columna " + columna);
    }
    System.out.println();
    
    System.out.print("         ");
    for(columna = 0; columna < 6; columna++){
    System.out.print("-----------|");
    }
    System.out.println();
    
    for(fila = 0; fila < 3; fila++){
      System.out.print("Fila: " + fila + "  ");
      
      
      for(columna = 0; columna < 6; columna++){

        System.out.printf("%10d |", num[fila][columna]);             
      }
      System.out.println();
          System.out.print("         ");
    for(columna = 0; columna < 6; columna++){
    System.out.print("-----------|");
    }
    System.out.println();
          
    }
    
    
    

  }
  
}
