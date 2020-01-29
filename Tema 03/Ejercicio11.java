/**
 * Conversor de Kb a Mb.
 *
 * Introducir los datos por teclado.
 * 
 */
public class Ejercicio11 { // Tema 3
	public static void main (String[] args) {
		
    System.out.print("Por favor, introduzca una cantidad en Kb: ");
    int kB = Integer.parseInt(System.console().readLine());
    
    double mB = (double) kB / 1000;
    System.out.print(kB + " Kb Son: " + mB + " Mb");
    
    } 
}

