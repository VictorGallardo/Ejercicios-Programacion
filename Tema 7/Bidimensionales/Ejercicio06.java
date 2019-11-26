
package Ejercicios.tema7;
/**
 *
 * @author victor
 */
public class Ejercicio06 {
  public static void main(String[] args) throws InterruptedException {

    
    int[][] numeros = new int[6][10];
    int fila;
    int columna;
    int minimo = 2000;
    int filaMinimo = 0;
    int columnaMinimo = 0;    
    int maximo = -2000;
    int filaMaximo = 0;
    int columnaMaximo = 0;
    
    
    for(fila = 0; fila < 6; fila++){
      for(columna = 0; columna < 10; columna++){
        do {
         numeros[fila][columna] = (int)(Math.random() * 1000);       
        } while (numeros[fila][columna] != numeros[fila][columna]);

        // Calcula el mínimo y guarda sus coordenadas
        if (numeros[fila][columna] < minimo) {
          minimo = numeros[fila][columna];
          filaMinimo = fila;
          columnaMinimo = columna;
        }
        
        // Calcula el máximo y guarda sus coordenadas
        if (numeros[fila][columna] > maximo) {
          maximo = numeros[fila][columna];
          filaMaximo = fila;
          columnaMaximo = columna;
        }
      }
    }
    
    System.out.print("       ");
    for(columna = 0; columna < 10; columna++){
      System.out.print(" | Columna " + columna);
    }
    System.out.println();
    
    System.out.print("         ");
    for(columna = 0; columna < 10; columna++){
      System.out.print("-----------|");
    }
    System.out.println();
    
    for(fila = 0; fila < 6; fila++){
      System.out.print("Fila: " + fila + "  ");
      
      
      for(columna = 0; columna < 10; columna++){

        System.out.printf("%10d |", numeros[fila][columna]);             
      }
      System.out.println();
      System.out.print("         ");
      for(columna = 0; columna < 10; columna++){
        System.out.print("-----------|");
        Thread.sleep(100);
    }
      
      System.out.println();
          
    }
    System.out.println("\nEl máximo es: " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnaMaximo);
    System.out.println("El mínimo es: " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);
    System.out.println();
    
    
  }
}  
    
    
  
  

