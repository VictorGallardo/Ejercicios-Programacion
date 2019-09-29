/**
 *
 * 
 * 
 */
public class Ejercicio12 { // Tema 3
	public static void main (String[] args) {
		System.out.print("Introduce la nota del primer examen: ");
    double examen1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("¿Que nota quieres sacar en trimeste? ");
    double trimestre = Double.parseDouble(System.console().readLine());
    
    double examen2 = ((trimestre * 100) - (examen1 * 40)) / 60;
    
    System.out.print("Para sacar un " + trimestre + " en el trimestre, necesitas un " + examen2 + 
    " en el segundo examen.");   
	}
}

