/**
 * Programa que calcula el salario semanal de un empleado
 * en base a las horas trabajadas.
 * 
 * Introducir los datos por teclado.
 */
public class Ejercicio08 { // Tema 3
	public static void main (String[] args) {
		
    System.out.print("Introduzca las horas trabajadas en la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    System.out.print("El salario correspondiente a dicha semana es de: " + horasTrabajadas * 12
    + "euros");
  
	}
}

