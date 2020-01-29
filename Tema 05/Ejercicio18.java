/**
 *
 * 
 */
public class Ejercicio18 {
  
  public static void main (String[] args) {
    
    System.out.println("Este programa obtendrá los numeros enteros comprendidos entre los numeros introducidos por teclado.");
    
    System.out.print("Por favor, introduzca un número entero.");
    int primerNumero = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca otro número entero.");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    
    if (primerNumero < segundoNumero) {
      for ( int p = primerNumero ; p <= segundoNumero ; p += 7 ) {
        System.out.print(p + " - ");
      }
    }
    if (primerNumero > segundoNumero) {
      for ( int s = segundoNumero; s <= primerNumero ; s += 7 ) {
        System.out.print(s + " - ");
      }
    }
  }
}



