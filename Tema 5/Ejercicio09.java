/**
 *
 * 
 */
public class Ejercicio09 {
  
  public static void main (String[] args) {
    
    
    System.out.print("Por favor, introduzca un número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int contador = 0;
    
    do {
      numeroIntroducido = numeroIntroducido / 10;
      contador++;
    } while (contador > 10);
    System.out.print(numeroIntroducido + " tiene " + contador + " Digito/s.");
  }
}

