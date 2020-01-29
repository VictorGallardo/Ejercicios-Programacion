/**
 *
 * 
 */
public class Ejercicio14 {
  
  public static void main (String[] args) {
    
    System.out.println("Este programa le calculara la potencia de un numero (entero y positivo)");
    System.out.print("Por favor, introduzca una base: ");
    double base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca un exponente: ");
    double exponente = Integer.parseInt(System.console().readLine());
    
    int resultado = (int)Math.pow(base, exponente);
    
    System.out.print("La potencia del número introducido es de: " + resultado);
  }
}

