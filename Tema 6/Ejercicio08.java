/**
 *
 * 
 * 
 */
public class Ejercicio08 {
  public static void main (String[] args) {
    
    String apuesta = "";
    int contador = 0 ;
        
    for (int i = 0 ; i < 14 ; i++) {
      contador++;
      if (i <= 9 ) {
       System.out.print(" " + contador);
      }
      if (i >= 10) {
        System.out.print(contador);
      }
    for (int j = 0  ; j < 3 ; j++) {
    int quiniela = (int)(Math.random()*6) + 1;
    switch (quiniela) {
      case 1:
      case 2:
      case 3:
        apuesta = " |1    |";
        break;
      case 4:
      case 5:
        apuesta = " |  x  |";
        break;
      case 6:
        apuesta = " |    2|";
      default:
    }
    System.out.print(apuesta);
    }
    System.out.println();
  }
  }
}

