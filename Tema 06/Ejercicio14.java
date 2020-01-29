/**
 *
 * 
 * 
 */
public class Ejercicio14 {
  public static void main (String[] args) {
    
    int miNumero = 23;
    int numeroPrograma = 0;
    String mayorOmenor = "";
    

    numeroPrograma = (int)(Math.random() * 100);
    
      if (numeroPrograma != miNumero) {
        System.out.println(numeroPrograma);
        System.out.println("El numero es incorrecto");
        System.out.print("¿El número es mayor o menor?");
        mayorOmenor = (System.console().readLine());
      }
      if (mayorOmenor == "Mayor") {
        numeroPrograma = (int)(Math.random() * numeroPrograma);
          if (numeroPrograma != miNumero) {
            System.out.println(numeroPrograma);
            System.out.println("El numero es incorrecto");
            System.out.print("¿El número es mayor o menor?");
            mayorOmenor = (System.console().readLine());
           }  
      }
      }
  }




