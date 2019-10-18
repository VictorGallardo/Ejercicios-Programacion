/**
 *
 * 
 */
public class Ejercicio19 {
  
  public static void main (String[] args) {
    
    System.out.print("Introduzca la altura de la pirámide.");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el caracter deseado.");
    String caracter = (System.console().readLine());
    
    int caracterPorfila = 1;
    int espaciosDelanteros = altura;
    
    for (int i = 0 ; i < altura ; i++ ) {
      //espacios de lanteros en cada fila.
      
      for (int piso = 0 ; piso < espaciosDelanteros ; piso++) {
        System.out.print(" ");
      }      

      // pinta los caracteres de la fila.
      for (int piso = 0 ; piso < caracterPorfila ; piso++) {
        System.out.print(caracter);
      }
      System.out.println();
      
      caracterPorfila += 2;
      espaciosDelanteros--;
    }
  }
}

