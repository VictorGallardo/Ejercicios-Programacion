
package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * 
 */
public class Ejercicio05 {

  public static void main(String[] args) {
        
    if (args.length != 2) {
      System.out.println("USO: Introducir dos parametros, [PROGRAMA] [PROGRAMA_SIN_COMENTARIOS]");
      System.exit(-1);
    }

    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
      
      String linea = "";
      String lineaC = "";
      
      boolean comentario = false;
      
      linea = br.readLine();
      while (linea != null) {
        if (linea.contains("//")) {
          linea = br.readLine();
          continue;
        }
       
        if (linea.indexOf("/*") != -1) {
          comentario = true;
        }
        if (linea.indexOf("*/") != -1) {
          comentario = false;
          linea = br.readLine();
        }
        if (!comentario) {
          bw.write(linea + "\n");
        }
        linea = br.readLine();
      }
      br.close();
      bw.close();

    } catch (FileNotFoundException fnfe) { 
      System.out.println("No se encuentra el fichero");
    } catch (IOException ioe) { 
      System.out.println("No se puede leer el fichero");
    }

  }

}
