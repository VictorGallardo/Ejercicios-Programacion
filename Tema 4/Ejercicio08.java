/**
 * Programa que calcula la media de tres notas.
 * 
 * Introducir los datos por teclado.
 */
public class Ejercicio08 {	
	public static void main (String[] args) {
    
    System.out.println("Este programa calculará la nota media de sus tres notas.");
    
		System.out.print("Por favor, introduzca una nota: ");
    double primeraNota = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca otra nota: ");
    double segundaNota = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca la última nota: ");
    double terceraNota = Double.parseDouble(System.console().readLine());
    
    double solución = (primeraNota + segundaNota + terceraNota) / 3;
    
    System.out.printf("Su media es de %.2f \n" ,solución);
    
  
    if (solución < 5.00) {
      System.out.print("Insuficient, lo siento, has suspendido.");
    }
    if ((solución >=5.00) && (solución < 6.00)) {
      System.out.print("Suficiente ¡Estas aprobado!");
    }
    if ((solución >=6.00) && (solución < 7.00)) {
      System.out.print("Bien ¡Estas aprobado!");
    }
    if ((solución >=7.00) && (solución < 9.00)) {
      System.out.print("Notable ¡Estas aprobado!");
    }
    if ((solución >=9.00) && (solución < 10.00)) {
      System.out.print("Sobresaliente ¡Estas aprobado!");
    }
	}
}

