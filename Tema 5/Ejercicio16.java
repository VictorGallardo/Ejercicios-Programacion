/**
 *
 * 
 */
public class Ejercicio16 {
  
  public static void main (String[] args) {
    
    System.out.print("Este programa le dira si el numero introducido es primo.");
    System.out.print("Por favor, introduzca un numero.");
    
    int primo = Integer.parseInt(System.console().readLine());
    
    if ((primo / 1) && (primo / primo)) {
      System.out.print("El número introducido es primo.");
    } else {
      System.out.print("El número introducido no es primo.");
    }  
  }
}

