
package Ejercicios.tema7;
import java.util.Scanner;
/**
 *
 * @author victor
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()* 100);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];         
    }
    System.out.println("Ahora se mostrarán 20 numeros, elevados al cuadrado y al cubo");
    for (int i = 0; i < 20; i++) {
    System.out.printf( "%4d | %6d | %8d \n",numero[i],cuadrado[i],cubo[i]);
    }
    

  }
  
}
