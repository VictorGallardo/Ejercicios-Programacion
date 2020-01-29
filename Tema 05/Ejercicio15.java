/**
 *
 * 
 */
public class Ejercicio15 {
  
  public static void main (String[] args) {
    
    System.out.print("Por favor, introduzca una base");
    int base = Integer.parseInt(System.console().readLine());
  
    System.out.print("Por favor, introduzca un exponente");
    int exponenteFinal = Integer.parseInt(System.console().readLine());  
    
    int potencia;
    int exponente;
      for (int i = 1; i <= exponenteFinal; i++) {
        potencia = 1;
        exponente = i;
      for (int p = 0; p < exponente; p++) {
        potencia *= base;
      }
    System.out.println(base + "^" + i + " = " + potencia);
    }
  }
}

