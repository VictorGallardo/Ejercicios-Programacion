/**
 * Programa que le dice el dia de la semana segun el numero introducido.
 * 
 * Introducir los datos por teclado.
 */
public class Ejercicio03 { // Tema 4
	public static void main (String[] args) {
    
		String dia;
    
    System.out.println("El Programa le dira el día de la semana.");
    System.out.print("Por favor, introduzca un número del 1 al 7: ");
    int n = Integer.parseInt(System.console().readLine());
    
    switch(n) {
      case 1:
        dia = "lunes";
        break;
      case 2:
        dia = "martes";
        break;
      case 3:
        dia = "miércoles";
        break;
      case 4:
        dia = "jueves";
        break;
      case 5:
        dia = "viernes";
        break;
      case 6:
        dia = "sábado";
        break;
      case 7:
        dia = "domingo";
        break;
      default:
        dia = "Debe introducir un número del 1 al 7";
    }
    System.out.println(dia);

	}
}

