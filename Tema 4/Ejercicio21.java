/**
 *
 * 
 * 
 */
public class Ejercicio21 {
	
	public static void main (String[] args) {
		
    System.out.println("Este programa le calculará la nota media de programación.");
    System.out.print("Por favor, introduzca una nota: ");
    double nota1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca su segunda nota: ");
    double nota2 = Integer.parseInt(System.console().readLine());
    
    if (nota1 >= 5 || nota2 >= 5) {
      System.out.println("La media de sus notas es de " + (nota1 + nota2) / 2);
    if (nota1 < 5 || nota2 < 5) 
      System.out.println("Introduzca si su examen de recuperacion fue apto o no apto:");
      String notaR = (System.console().readLine());
    if (notaR.equals("apto"));
      double media = (5 + nota1 + nota2) / 3;
      System.out.printf("La media de sus notas es de %.2f" , media);
    }
	}
}

