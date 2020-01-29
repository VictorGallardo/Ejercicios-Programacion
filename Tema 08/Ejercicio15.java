
package tema8;

/**
 *
 * Ejercicio 15 // Tema 8 (Funciones)
 * 
 * Este programa muestra los números primo del 1 al 1000
 * utilizando una funcion de una librería
 */
public class Ejercicio15 {

  public static void main(String[] args) {
    
    for (int i = 1; i < 1000; i++) {
      if (matematicas.Varias.esPrimo(i)) {
        System.out.print(i + "-");
      }
      
    }
    
  }
  
}
