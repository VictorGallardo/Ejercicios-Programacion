/**
 * Ejercicio03 - Tema3
 * 
 * Conversor de pesetas a euros.
 * 
 * La cantidad debe ser introducida desde teclado.
 * 
 */
public class Ejercicio03 {
	public static void main (String[] args) {
		
    System.out.println("Por favor, introduzca la cantidad en pesetas: ");
    
    int pesetas = Integer.parseInt(System.console().readLine());
    double total = pesetas / 166.386;
    
    System.out.println("El resultado de la conversión es: ");
    System.out.printf("%.2f euros", total);
	}
}

