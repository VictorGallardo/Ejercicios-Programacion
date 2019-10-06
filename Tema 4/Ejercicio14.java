/**
 * Ejercicio14
 * 
 */
public class Ejercicio14 {
	
	public static void main (String[] args) {
		
    System.out.println("Este programa determinara si un numero es par y/o divisible entre 5");
    System.out.println("Por favor, introduzca un número entero: ");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    if ((numero % 2 ) == 0) {
      System.out.println("El número es par.");
    } else {
      System.out.println("El número es impar.");  
    }
    if ((numero % 5 ) == 0) {
      System.out.println("El número es divisible entre 5");
    } else { 
      System.out.println("el numero introducido no es divisible entre 5");
    }
	}
}

