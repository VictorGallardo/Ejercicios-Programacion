/**
 *
 * 
 */
import java.util.Scanner; 
 
public class Ejercicio07 {
  
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int clave = 1989;
    int claveUsuario;
    int intentos = 4;
    
    System.out.print("Por favor introduzca la clave: ");
    
    do {
      
      claveUsuario = Integer.parseInt(s.nextLine());
     
      if (clave == claveUsuario) {
        System.out.print("La clave introducida es correcta"); 
      
      } else {
        System.out.println("La clave introducida es incorrecta.");
        intentos--;
      }
      if (intentos == 0) {
        System.out.print("Se agotaron sus cuatro intentos.");
      }
    } while ((clave != claveUsuario) && (intentos != 0));
  }
}

