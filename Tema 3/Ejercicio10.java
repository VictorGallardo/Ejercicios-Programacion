/**
 * Conversor de Mb a Kb.
 *
 * Introducir los datos por teclado.
 * 
 */
public class Ejercicio10 { // Tema 3
	public static void main (String[] args) {
		
    System.out.print("Por favor, introduzca una cantidad en Mb: ");
    int mb = Integer.parseInt(System.console().readLine());
    
    int kb = (mb * 1000);
    System.out.print(mb + " Mb Son: " + kb + " Kb");
    
    } 
}

