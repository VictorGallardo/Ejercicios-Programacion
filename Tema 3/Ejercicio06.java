/**
 * Programa que calcula el área de un triángulo.
 * 
 * Introducir los datos por teclado.
 * 
 */
public class Ejercicio06 {
	public static void main (String[] args) {
    
		System.out.print("Por favor, introduzca la base del triángulo: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca la altura: ");
    double altura = Double.parseDouble(System.console().readLine());    
    
    System.out.println("El área del triangulo es: " + (base * altura / 2 ) + " cm2");
    
	}
}

