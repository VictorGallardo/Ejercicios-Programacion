/**
 * Programa que calcula los segundos que faltan hasta la media noche,
 * introduciendo los datos por teclado.
 * 
 */
public class Ejercicio11 {
	
	public static void main (String[] args) {
		
    System.out.println("Este programa le dira los segundos que faltan hasta la media noche.");
    
    int horasTotales = 24;
    
    System.out.println("Por favor, introduzca una la hora (0-24 h): ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.println("Por favor, introduzca los minutos (0-60 min): ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int solucion = (horasTotales - horas) * 3600 + (minutos * 60);
    
    System.out.println("Faltan " + solucion + " para la media noche.");
    
	}
}

