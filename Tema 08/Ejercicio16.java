
package tema8;

/**
 * Ejercicio 16 // Tema 8 // Funciones
 * 
 * Este programa comprueba que numeros son capicuas entre el 0 y el 99999 
 * con ayuda de una función albergada en una libreria de funciones.
 * 
 */
public class Ejercicio16 {

  public static void main(String[] args) {
    
    for (int i = 0; i < 99999; i++) {
      if (matematicas.Varias.esCapicua(i)){
        System.out.println(i);
    }
    }
    

  }
  
}
