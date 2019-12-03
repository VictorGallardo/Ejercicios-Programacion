
package tema8;
import java.util.Scanner;

/**
 * Ejercicio 18 // tema 8 // Funciones 
 * 
 * Este programa pasa de decimal a binario 
 * 
 */
public class Ejercicio18 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
     
    int numero;
    int exp;
    int digito;
    double binario;
    
    System.out.print("Introduce un numero entero >= 0: ");
    do{  
      numero = sc.nextInt();
      if (numero < 0) {
        System.out.println("El numero introducido en negativo, vuelva a intentarlo");
      }
    }while(numero<0);

    exp=0;
    binario=0;
    while(numero!=0){
      digito = numero % 2;           
      binario = binario + digito * Math.pow(10, exp);  
      exp++;
      numero = numero/2;
    }
    System.out.printf("Binario: %.0f %n", binario);    
   
  }
  
}
