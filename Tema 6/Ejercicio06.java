/**
 *
 * 
 * 
 */
public class Ejercicio06 {
  public static void main (String[] args) {
    
    System.out.print("Que número crees que es: ");
    int numero = 0;
    
    numero = (int)(Math.random()*100);
    for (int i = 0 ; i < 1 ; i++) {
      System.out.print(numero);
    }
    
    int numeroIntroducido = 0;
    do {
      for (int i = 0 ; i < 5 ; i++)
      System.out.print("El numero no es el acertado.");
      numeroIntroducido = Integer.parseInt(System.console().readLine());

    } while (numeroIntroducido != numero);
    
  }
}

