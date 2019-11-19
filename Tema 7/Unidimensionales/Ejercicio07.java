
import java.util.Scanner;
/**
 *
 * @author victor
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] numero = new int[100];
    int numero1;
    int numero2;
    
    for (int i = 0; i < 100; i++){
      numero[i] = (int)(Math.random()* 20);   
    }
    
    for (int i = 0; i < numero.length; i++) {
      System.out.print("  " + numero[i]);
    } 
  
    System.out.println("\nIntroduzca un numero: ");
    numero1 = Integer.parseInt(s.nextLine());
    
    System.out.println("Introduzca un numero");
    numero2 = Integer.parseInt(s.nextLine());
    
    for (int i = 0 ; i < numero.length; i++){
      if (numero[i] == numero1) {
        numero[i] = numero2;
        System.out.print( "/" + numero[i] + "/");
      } else {
        System.out.print("  " + numero[i]);
        }
    
    }
    
  }
  
}
