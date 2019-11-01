/**
 *
 * 
 * 
 */
public class Ejercicio09 {
  public static void main (String[] args) {
    
    int numeroAleatorio = 0;
    int contador = 0;
    
     do {
      numeroAleatorio = (int)(Math.random() * 100);
      if (numeroAleatorio % 2 == 0) {
      contador++;  
      }
    } while (numeroAleatorio != 24);
    
    System.out.print("Se han generado " + contador + " números pares.");
  }
}

