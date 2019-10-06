/**
 *
 * 
 * 
 */
public class Ejercicio06 {
	public static void main (String[] args) {
		
    System.out.print("Por favor, introduzca la altura (en metros) desde donde caerá el objeto: ");
    double h = Double.parseDouble(System.console().readLine());
    
    double g = 9.81;
    
    double solución = Math.sqrt(2 * h / g);
    System.out.printf("La velocidad a la que caerá el objeto es de %.2fs\n", solución);
    
	}
}

