package tema11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Programa que almacena en el fichero primos.dat los numeros primos comprendidos entre el 1 y 500
 *
 */
public class Ejercicio01 {

  public static void main(String[] args) {

    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
      for (int i = 1; i < 501; i++) {
        if (matematicas.Varias.esPrimo(i)) {
          bw.write(String.valueOf(i) + "\n");
         
        }

      }
      
       bw.close();
       
    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero");
    }
  }
}
