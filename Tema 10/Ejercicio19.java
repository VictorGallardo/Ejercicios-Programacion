
package tema10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * 
 */
public class Ejercicio19 {

  public static void main(String[] args) {
    
    HashMap<String, String> d = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    
    d.put("caliente","hot");
    d.put("rojo","red");
    d.put("ardiente","hot");
    d.put("verde","green");
    d.put("agujetas","stiff");
    d.put("abrasador","hot");
    d.put("hierro","iron");
    d.put("grande","big");
    
    System.out.println("Introduzca una palabra y le daré los sinónimos:");
    String palabraIntro = sc.nextLine();
    if (d.containsKey(palabraIntro)) {

      
      
    }
         
  }

}
