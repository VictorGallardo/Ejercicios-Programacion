/**
 * Programa que calcula la media de tres notas.
 * 
 * Introducir los datos por teclado.
 */
public class Ejercicio07 {	
	public static void main (String[] args) {
    
    System.out.println("Este programa calculará la nota media de sus tres notas.");
    
		System.out.print("Por favor, introduzca una nota: ");
    double primeraNota = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca otra nota: ");
    double segundaNota = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca la última nota: ");
    double terceraNota = Double.parseDouble(System.console().readLine());
    
    double solución = (primeraNota + segundaNota + terceraNota) / 3;
    
    System.out.printf("La media de sus notas es de %.2f .\n" ,solución);
    
      if (solución >= 5.00) {
        System.out.print("¡Estas aprobado!");
      } else {
        System.out.print("Lo siento, has suspendido.");
      }
    
	}
}

