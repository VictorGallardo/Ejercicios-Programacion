/**
 * Conversor de euros a pesetas.
 * 
 * La cantidad se introduce por teclado.
 * 
 */
public class Ejercicio02 { // Tema 3
	public static void main (String[] args) {
    
		System.out.print("Por favor, introduzca la cantidad en euros: ");
    double euros = Integer.parseInt(System.console().readLine());
    
    double total = euros * (int) 166.386;
    
    System.out.print("El resultado de la conversión es: ");
    System.out.print(total + " pesetas");
	}
}

