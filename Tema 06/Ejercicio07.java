/**
 *
 * 
 * 
 */
public class Ejercicio07 {
  public static void main (String[] args) {
    
    String apuesta = "";
    int contador = 0 ;
        
    for (int i = 1 ; i < 14 ; i++) {
      contador++;
      if (i <= 9 ) {
       System.out.print(" " + contador + ".");
      }
      if (i > 9) {
        System.out.print(contador + ".");
      }
    for (int j = 0  ; j < 3 ; j++) {
    int quiniela = (int)(Math.random()*3) + 1;
    switch (quiniela) {
      case 1:
        apuesta = " |1    |";
        break;
      case 2:
        apuesta = " |  x  |";
        break;
      case 3:
        apuesta = " |    2|";
      default:
    }
    System.out.print(apuesta);
    }
    System.out.println();
  }
  }
}

