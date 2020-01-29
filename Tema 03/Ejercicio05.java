/**
 * Programa que calcula el área de un rectangulo.
 * 
 * Introducir los datos por teclado.
 * 
 */
public class Ejercicio05 {
	public static void main (String[] args) {
    
		System.out.print("Por favor, introduzca la base del rectángulo: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca la altura: ");
    double altura = Double.parseDouble(System.console().readLine());    
    
    System.out.println("El área del rectángulo es: " + (base * altura) + " cm2");
    
	}
}

