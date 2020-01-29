/**
 *
 * 
 * 
 */
public class Ejercicio11 {
  public static void main (String[] args) {
    
    
    String nota = "";
    int notaGenerada = 0;
    int insuficiente = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    
    for (int i = 0; i < 20; i++) {
     
    notaGenerada = (int)(Math.random() * 5) + 1;
    
    switch (notaGenerada) {
      case 1: 
        nota = "Insuficiente";
        if (nota == "Insuficiente") {
          insuficiente++;
        }
      break;  
      case 2:
        nota = "Suficiente";
        if (nota == "Suficiente") {
          suficiente++;
        }
      break;
      case 3:
        nota = "Bien";
        if (nota == "Bien") {
          bien++;
        }
      break;
      case 4:
        nota = "Notable";
        if (nota == "Notable") {
          notable++;
        }
      break;
      case 5:
        nota = "Sobresaliente";  
        if (nota == "Sobresaliente") {
          sobresaliente++;
        }
      default:  
    } 
     
    System.out.println(nota);
    
    }
    System.out.println("-----------------");
    System.out.println("Contadores");
    System.out.println("-----------------");    
    System.out.println("Insuficientes:  " + insuficiente);
    System.out.println("Suficientes:    " + suficiente);
    System.out.println("Bien:           " + bien);
    System.out.println("Notables:       " + notable);
    System.out.println("Sobresalientes: " + sobresaliente);
	}
}

