/**
 *
 * 
 */
public class Ejercicio10 {
  
  public static void main (String[] args) {
    
    double numeroIntroducido = 0;    
    double contador = 0;
    double suma = 0;
    double resultado = 0;
    
    System.out.println("Por favor, introduzaca un número");
    
    while (numeroIntroducido >= 0); {
      
      numeroIntroducido = Double.parseDouble(System.console().readLine());
      contador++;
      suma =+ numeroIntroducido;
      
      if (numeroIntroducido < 0) {
    } else {
      resultado = ((suma - numeroIntroducido)/ (contador - 1));
    }
   }
    System.out.println("La media de los números positivos introducidos es " + resultado);
 } 
}
