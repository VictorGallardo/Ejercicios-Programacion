/**
 *
 * 
 */
public class Ejercicio13 {
  
  public static void main (String[] args) {
    
    int numeroPositivo = 0;
    int numeroNegativo = 0;
    int numeroIntro;
    int contador = 0;
    
    System.out.println("Introduzca una serie de 10 números independientemente de si son - o +.");
    
    while (contador < 10) { 
      
      numeroIntro = Integer.parseInt(System.console().readLine());
      
      if (numeroIntro > 0) {
        numeroPositivo++;
        
      } else {
        numeroNegativo++;  
      } 
      contador++;    
    }
      System.out.print("De los 10 números " + numeroPositivo + " son positivos y " + numeroNegativo + " son negativos.");
  }
}

