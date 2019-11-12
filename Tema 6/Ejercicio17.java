/**
 * 
 * 
 * 
 */
public class Ejercicio17 {
  public static void main (String[] args) {
    
    int altura = 0;
    int ancho = 0;
    int pez = 0;
    
    System.out.println("Por favor introduzca la altura de la pecera (minimo 4):");
    altura = Integer.parseInt(System.console().readLine()); 
    
    System.out.println("Por favor introduzca el ancho de la pecera (minimo 4):");
    ancho = Integer.parseInt(System.console().readLine()); 
    
    
    int pezAltura = (int)(Math.random()* altura) - 2;
    int pezAncho = (int)(Math.random()* ancho) - 2;
    
    for ( int a = 0 ; a < altura ; a++) {
      System.out.print("*");
      
      for (int an = 0 ; an < ancho ; an++) 
        if (a == 0 || a == altura -1) {
          System.out.print("*");
        } else if ((a == pezAltura) && (an == pezAncho)) {
          System.out.print("&");
          
        } else {
          System.out.print(" ");
          }
      System.out.println("*");
    }
  }
}

