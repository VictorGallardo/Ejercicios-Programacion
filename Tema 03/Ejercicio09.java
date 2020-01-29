/**
 * Programa que calcula el volumen de un cono.
 * 
 * Introducir los datos por teclado.
 */
public class Ejercicio09 {
	public static void main (String[] args) {
		
    System.out.print("Por favor introduzaca el radio del cono en cm: ");
    double radio = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor introduzca la altura del cono en cm: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.print(("El volumen de cono es: ") + (3.14 * radio * 
    radio * altura) / 3 + (" cm3"));
	}
}

