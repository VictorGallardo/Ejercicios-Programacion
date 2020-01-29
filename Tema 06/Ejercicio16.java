/**
 *
 * 
 * 
 */
public class Ejercicio16 {
  public static void main (String[] args) {
    
    int numeroFigura = 0;
    String figura = "";
    String figuraUno = "";
    String figuraDos = "";
    String figuraTres = "";
    
    
      for (int i = 0 ; i < 3 ; i++) {
        numeroFigura = (int)(Math.random() * 5) + 1;
        switch (numeroFigura) {
          case 1:
            figura = "corazón";
            break;
          case 2:
            figura = "diamante";
            break;
          case 3:
            figura = "herradura";
            break;    
          case 4:
            figura = "campana";
            break;
          case 5:
            figura = "limón";
          default:
        }
      if (i == 0) {
        figuraUno = figura;
      }
      if (i == 1) {
        figuraDos = figura;
      }
      if (i == 2) {
        figuraTres = figura;
      }
      System.out.print(figura + "  "); 

      }
      if ((!(figuraUno.equals(figuraDos))) && (!(figuraUno.equals(figuraTres))) && (!(figuraDos.equals(figuraTres)))){
        System.out.print("\nLo siento ha perdido");
      } else if (((figuraUno.equals(figuraDos))) && ((figuraDos.equals(figuraTres)))) {
      System.out.print("\nBien, has ganado");
      } else {
      System.out.print("\nBien, has recuperado");  
      }


  }
}

