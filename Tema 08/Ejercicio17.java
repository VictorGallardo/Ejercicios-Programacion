
package tema8;

import java.util.Scanner;

/**
 * Ejercicio 17 // Tema 8 // Funciones
 * 
 * Este programa pasa de binario a decimal 
 * 
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    long nDecimal = 0;
    
    System.out.println("Introduzca el numero binario a transformar: ");
    long binario = Long.parseLong(s.nextLine());
    
    int bits = matematicas.Varias.digitos(binario);
    
    for (int i = 0; i < bits; i++){
      nDecimal += matematicas.Varias.digitoN(binario, bits - i - 1) * matematicas.Varias.potencia(2, i);
    }
      
    System.out.println(binario + " en binario es " + nDecimal + " en decimal.");  
  }
  
}
