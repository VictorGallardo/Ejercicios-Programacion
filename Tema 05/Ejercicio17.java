/**
 *
 * 
 */
public class Ejercicio17 {
  
  public static void main (String[] args) {
    
    System.out.println("Este programa le sumara los 100 números siguientes a el número introducido.");
    System.out.println("El número tiene que ser entero y positivo.");
    
    int numeroIntro = 0;
    
    do {
      System.out.print("Introduzca un número: ");
      numeroIntro = Integer.parseInt(System.console().readLine());
      
      if(numeroIntro < 0) {
        System.out.println("El número introducido es negativo, por favor introduzca un número positivo.");
        }
        
    } while (numeroIntro < 0);
    
    int suma = 0;

    for(int i = numeroIntro; i < numeroIntro + 100; i++) {
      suma += i;
    }
      System.out.println("La suma de los 100 números siguientes a " + numeroIntro + " es " + suma);
  }
}
    

    

    
    


