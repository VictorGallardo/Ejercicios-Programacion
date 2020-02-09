
package tema10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * 
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    HashMap<String, Integer> usuario = new HashMap <>();
    
    usuario.put("Antonio Horózcopo",2341);
    usuario.put("Maribí Yonce",3332);
    usuario.put("Richard Trompin",9983);
    usuario.put("John Weldon",9222);
    usuario.put("Roger Waters",4445);
    
    String nombre;
    int clave;
    int intentos = 1;
    boolean acceso = false;
    
    do {
      System.out.println("Por favor introduzca su nombre de usuario: ");
      nombre = (sc.nextLine());
      System.out.println("Introduzca su contraseña: ");
      clave = Integer.parseInt(sc.nextLine());
      
      if (usuario.containsKey(nombre)) { 
        if (usuario.get(nombre).equals(clave)){
          System.out.println("Ha accedido al área restringida");
          acceso = true;
        } else {
          System.out.println("Contraseña incorrecta");
          intentos++;
        }   
      } else {
          System.out.println("El usuario es incorrecto");      
          intentos++;
      }  
    } while ((!acceso) && (intentos < 3));
    
    if (!acceso){
      System.out.println("Lo siento, no tiene acceso al área restringida.");
    }
  }
}
