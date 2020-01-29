/**
 *
 * 
 * 
 */
public class Ejercicio06 {
  public static void main (String[] args) {
    
    System.out.print("Que número crees que es: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    numero = (int)(Math.random()*100);

    int numeroIntroducido = 0;
    for (int i = 0 ; i < 4 && numeroIntroducido != numero; i++) {
      System.out.print("El numero no es el acertado, introduzca otro numero: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());

    }
  }
}

