/**
  * Ejercicio01.java
  * 
  * Programa en el que se introducen dos numeros
  * y muestra el resultado de su multiplicacion.
  * 
  */
public class Ejercicio01 {
	public static void main (String[] args) {
    
    String linea;
    
    System.out.print("Por favor, introduzca un número: ");
    int primerNumero = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca otro, por favor: ");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    
    int total = primerNumero * segundoNumero;
    
    System.out.print("El resultado de la multiplicación de estos números es: ");
    System.out.print(total);
    
	}
}

