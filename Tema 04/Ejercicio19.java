/**
 *
 * 
 * 
 */
public class Ejercicio19 {
	
	public static void main (String[] args) {
    
    int numero, digitos = 0;
    
    System.out.println("Este programa le dira cuantos dígitos tiene el número introducido.");
    System.out.println("Por favor, introduzca un número (5 cifras max)");
    numero = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( numero < 10 ) {
    digitos = 1;
    }
    if (( numero >= 10 ) && ( numero < 100 )) {
    digitos = 2;
    }
    if (( numero >= 100 ) && ( numero < 1000 )) {
    digitos = 3;
    }
    if (( numero >= 1000 ) && ( numero < 10000 )) {
    digitos = 4;
    }
    if ( numero >= 10000 ) {
    digitos = 5;
    }
    System.out.println("El número introducido tiene " + digitos + " dígitos.");
  }
}

