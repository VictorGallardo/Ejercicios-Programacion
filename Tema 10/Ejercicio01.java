
package tema10;

import java.util.ArrayList;

/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 * 
 */
public class Ejercicio01 {

  public static void main(String[] args) {
    
    ArrayList<String> comp = new ArrayList<String>();
    
    comp.add("Miguel");
    comp.add("Iván");
    comp.add("Fran");
    comp.add("Lucas");
    comp.add("Jose Antonio");
    comp.add("Javi");
    
    System.out.println("Seis de mis compañeros son: ");
    
    for (String companeros : comp) {
      System.out.println(companeros);
    }
    
    
    
    

  }
  
}
