
package tema11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * 
 */
public class Ejercicio06 {

  public static void main(String[] args) {
        
    if (args.length != 2) {
      System.out.println("Uso: Introducir dos parametros [FICHERO] [PALABRA]");
      System.exit(-1);
    }
        
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      String linea = "";
      String palabra = args[1];
      
      int contador = 0;

      while (linea != null) {
        linea = br.readLine();
        if (linea != null) {
          if (linea.contains(args[1])) {
            contador++;
          }
        }
      }
      
      br.close();
      
      System.out.println("La palabra " + palabra + " se repite " + contador + " veces.");

    } catch (IOException ioe) {
      System.err.println(ioe.getMessage());
    }
  }
}
