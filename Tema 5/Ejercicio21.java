import java.util.Scanner;

public class Ejercicio21 {
  
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, introduzca numeros pulsando enter cuando introduzca uno negativo el programa parará.");
    
    int numeroIntroducido = 1; //he puesto uno para que entre en el while.
    int contador = 0;
    int suma = 0;
    int numeroMayor = numeroIntroducido;
    int contadorImpar = 0;
    
    // Nos cuenta los números introducidos hasta que se introduce uno negativo.
    while (numeroIntroducido > 0) {
      numeroIntroducido = Integer.parseInt(s.nextLine());
      contador++;
      // Número mas alto de los pares.
      if (numeroIntroducido % 2 == 0) {
        if (numeroIntroducido > numeroMayor) {
          numeroMayor = numeroIntroducido;
        }
      } else { 
        suma += numeroIntroducido;
        contadorImpar++;
    }
    }
    //Es la cuenta de los números introducidos.
    System.out.println("Ha introducido " + (contador - 1) + " números.");
    System.out.println("De los numeros pares introducidos " + numeroMayor + " es el mayor.");
    System.out.println("La media de los números impares es " + suma / contadorImpar);

  }
}

