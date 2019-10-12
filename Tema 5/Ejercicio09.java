/**
 *
 * 
 */
public class Ejercicio09 {
  
  public static void main (String[] args) {
    
    int numeroDigitos = 1, n, numeroIntroducido;
    
    System.out.print("Por favor, introduzca un número: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    n = numeroIntroducido;
    
    while (n > 10) {
      
      n /= 10;
      numeroDigitos++;
    }
    System.out.print(numeroIntroducido + " tiene " + numeroDigitos + " Digito/s.");
  }
}

