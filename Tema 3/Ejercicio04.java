/**
 * Programa de suma, resta, multiplicación y división.
 * 
 * Introducir los factores por teclado.
 * 
 */
public class Ejercicio04 {
	public static void main (String[] args) {
		
    System.out.print("Por favor, introduzca un número: ");
    int x = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca otro número: ");
    int y = Integer.parseInt(System.console().readLine());
    
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x * y = " + (x * y));
    System.out.println("x / y = " + (x / y));
    
    
	}
}

