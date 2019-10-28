/**
 *
 * 
 * 
 */
public class Ejercicio05 {
  public static void main (String[] args) {
    
    int numeros = 0;
    int suma = 0;
    int min = 199;
    int max = 100;
    
    System.out.println("Los 50 números generados del 100 al 199 son: ");
    
    for (int i = 0; i < 50; i++) {
      numeros = (int)(Math.random()*100) + 100;
      suma += numeros;
      System.out.print(numeros + "  ");
      
      if (numeros > max) {
        max = numeros;
      }
      if (numeros < min) {
        min = numeros;
      }
    }
    System.out.println("\nEl máximo es el " + max);
    System.out.println("El mínimo es el " + min);
    System.out.println("La media de los numeros es: " + suma / 50 );
  }
}

