package tema10;

import java.util.ArrayList;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 *  
 */
public class Ejercicio02 {

  public static void main(String[] args) {
      
    ArrayList<Integer> aleatorio = new ArrayList<Integer>();
      
    int tamanoList = (int)(Math.random() * 10 + 10);
      
    for(int i = 0; i < tamanoList; i++){
      aleatorio.add((int)(Math.random() * 100));
    }
      
    System.out.println(aleatorio);
      
    int suma = 0;
    int max = 0;
    int min = 100;
      
    for(int num: aleatorio) {
      suma += num;
    
      if (num < min) {
      min = num;
      }
      if (num > max) {
      max = num;
      }
    }
      
    System.out.println("Suma total: " + suma);
    System.out.println("La media es: " + suma/tamanoList);
    System.out.println("El mínimo es: " + min);
    System.out.println("El máximo es: " + max); 
        
  }
}
