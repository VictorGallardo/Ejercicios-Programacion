/**
 *
 * 
 * 
 */
public class Ejercicio10 {
  public static void main (String[] args) {
    
    String caracter = "";
    
    for (int f = 0; f < 10; f++) {
    int numeroCaracter = (int)(Math.random() * 6) + 1;

    switch (numeroCaracter) {
      case 1:
        caracter = "*";
        break;
      case 2:
        caracter = "-";
        break;
      case 3:
        caracter = "=";
        break;
      case 4:
        caracter = ".";
      case 5:
        caracter = "|";  
      case 6:
        caracter = "@";    
      default:
      } 
      
    int caracterFila = (int)(Math.random() * 40) + 1;  
    
    for (int i = 0; i < caracterFila; i++) {
      System.out.print(caracter);
      
     }
     System.out.println(); 
    }
  }
}

