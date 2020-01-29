/**
 *
 * 
 */
public class Ejercicio08 {
  
  public static void main (String[] args) {
    
    int numeroIntroducido; 
    
    System.out.print("Por favor, introduzca un número.");
    numeroIntroducido = Integer.parseInt(System.console().readLine());

    for (int m = 0 ; m <= 10; m++) {
      System.out.println(numeroIntroducido + " x " + m + " = " + numeroIntroducido * m);
    }   
  }
}

