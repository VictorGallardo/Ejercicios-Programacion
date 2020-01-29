
package Ejercicios.tema7;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    //array para el tablero
    int [][] tablero = new int[8][8];
    //array para almacenar la entrada

    //pide la posicion por teclado
    System.out.print("Introduzca la posición del alfil (Ej: c4): ");
    String posicion = s.nextLine();
    // esto almacena la posicion 0  de la entrada
    int posicionX = posicion.charAt(0) -97;
    // esto almacena la posicion 1 de la entrada
    int posicionY = Character.getNumericValue(posicion.charAt(1)) -1;
    
    for (int i = 0; i < posicionX - 1; i++){
      for (int j = 0; j < posicionY -1; j++){
        System.out.print(tablero[posicionX][posicionY]);
      }
      
    }
    
    
    
    


  }
  
}
