/**
 * Programa que le dice que asignartura tiene a primera hora del día introducido.
 * 
 * Introducir datos por teclado.
 */
public class Ejercicio01 {
	public static void main (String[] args) {
		
    String dia;
    System.out.print("Por favor, introduzca un día de la semana: ");
    
    
    dia = (System.console().readLine());
    dia.toLowerCase(); 
    
    switch(dia) {
      case "lunes":
        System.out.println("Programación");
      break;  
      case "martes":
        System.out.println("Entornos de desarrollo");
      break;
      case "miércoles":
      case "jueves":
        System.out.println("Programación");
      break;
      case "viernes":
        System.out.println("Sistemas informaticos");
      break;
      case "sábado":
      case "domingo":
        System.out.println("¡Ese día no hay clase!");
      break;
      default:
        System.out.println("El día introducido no es correcto.");
    }
	}
}

