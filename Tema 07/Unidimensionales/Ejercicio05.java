


import java.util.Scanner;
/**
 *
 * @author victor
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int[] numero = new int[10];
    int i;
    
    System.out.println("Este programa le pedirá 10 numeros, vaya introduciendolos y pulsando enter");
    for (i = 0 ; i < 10 ; i++); {
      numero[i] = Integer.parseInt(s.nextLine());
      
      if (numero[i] < minimo){
        minimo = numero[i];
      }
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
    }
    System.out.println();
    
    for (i = 0 ; i < 10 ; i++) {
      System.out.print(numero[i]);
      if (numero[i] == maximo);
        System.out.print(" máximo");
    }  
  }
}
  

