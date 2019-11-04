/**
 * 
 * 
 * 
 */
public class Ejercicio15 {
  public static void main (String[] args) {
    
    int numeroNota = 0;
    int compas = 0;
    String primeraNota = "";
    String nota = ""; 

    compas = (int)(Math.random() * 7) + 1;
    for (int j = 0; j < compas ; j++) {

      for (int i = 0 ; i < 4 ; i++) {
        numeroNota = (int)(Math.random() * 7) + 1;
        switch (numeroNota) {
          case 1:
            nota = "do";
            break;
          case 2:
            nota = "re";
            break;
          case 3:
            nota = "mi";
            break;    
          case 4:
            nota = "fa";
            break;
          case 5:
            nota = "sol";
            break;
          case 6:
            nota = "la";
            break;  
          case 7:
            nota = "si";
            break;    
        }
        if (j == 0 && i == 0) {
          primeraNota = nota;
        }
        if (i == 3 && j == compas - 1) {
          System.out.print(primeraNota);
        } else {
      System.out.print(nota + " ");
        }
      }
      System.out.print("|");
    }
    System.out.print("|");
  }
}


