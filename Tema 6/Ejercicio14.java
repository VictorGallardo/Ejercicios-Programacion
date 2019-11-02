/**
 *
 * 
 * 
 */
public class Ejercicio14 {
  public static void main (String[] args) {
    
    int miNumero = 23;
    int numeroPrograma = 0;
    for (int i = 0 ; i < 5 ; i++) {
    numeroPrograma = (int)(Math.random() * 100);
    
      if (numeroPrograma != miNumero) {
        System.out.println("El numero es incorrecto");
      }
    }
    
    System.out.print(numeroPrograma);
  }
}

