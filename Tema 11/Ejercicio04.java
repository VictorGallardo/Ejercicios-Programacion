
package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * 
 */
public class Ejercicio04 {

  public static void main(String[] args) {
        
    if (args.length != 1) {
      System.out.println("Introducir 1 parametro [Nombre del fichero]");
      System.exit(-1);
    }

    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0] + ".txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[0] + "_sort.txt"));
      ArrayList<String> palabras = new ArrayList<>();

      String line = "";

      while (line != null) {
        line = br.readLine();
        palabras.add(line);
      }
      br.close();
      palabras.remove(palabras.size() - 1);
      Collections.sort(palabras);

      for (String word : palabras) {
        bw.write(word + "\n");
      }

      bw.close();
      
    } catch (FileNotFoundException fnfe) { 
      System.out.println("No se encuentra el fichero");
    } catch (IOException ioe) { 
      System.out.println("No se puede leer el fichero");
    }

  }
}
