/**
 * 
 * Este proyecto es solo para probar las funciones y aprender a manejarlas
 * 
 * 
 */

package pruebafunciones;
import java.util.Scanner;
import matematicas.Varias;
/**
 *
 * 
 */
public class PruebaFunciones {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    // CAPICUA
    // Comprueba si el número introducido es capicua  
    
    System.out.println("Introduzca un número, te diré si es capicua: ");
    int capicua;
    capicua = Integer.parseInt(s.nextLine());
    
    if (matematicas.Varias.esCapicua(capicua)){
      System.out.println("El numero " + capicua +  " es capicua");
    } else {
      System.out.println("No es capicua");
    }
    
    System.out.println();
    
    //--------------------------------------------------------------------------
    
    // PRIMO
    // Comprueba si el numero introducido es primo
    
    System.out.println("Introduzca un número, te diré si es primo: ");
    int primo;
    primo = Integer.parseInt(s.nextLine());
    
    if (matematicas.Varias.esPrimo(primo)){
      System.out.println("El numero " + primo +  " es primo");
    } else {
      System.out.println("No es primo");
    }    
    
    System.out.println();
    
    //--------------------------------------------------------------------------
    
    // SIGUIENTE PRIMO
    // Dice cual es el siguiente primo mayor al numero introducido
    
    System.out.println("Introduzca un número, te diré el siguiente primo mayor: ");
    int nextPrimo;
    nextPrimo = Integer.parseInt(s.nextLine());
        
    System.out.println("El siguiente primo a  " + nextPrimo +  " es " + (matematicas.Varias.siguientePrimo(nextPrimo)));
         
    System.out.println();
    
    //--------------------------------------------------------------------------
    
    // POTENCIAS
    // Da la pontencia de los numero introducidos
    
    System.out.println("Introduzca la base: ");   
    int base = Integer.parseInt(s.nextLine());
    
    System.out.println("Introduzca el exponente: ");   
    int exponente = Integer.parseInt(s.nextLine());
    
    System.out.println(base + " ^ " + exponente + " = " + matematicas.Varias.potencia(base, exponente));

    System.out.println();
    
    //--------------------------------------------------------------------------
    
    // DÍGITOS
    // Cuenta los dígitos que tiene el número introducido 
    
    System.out.println("Introduzca un dígito: ");
    long digito = Long.parseLong(s.nextLine());
    
    System.out.println("El número introducido tiene " + (matematicas.Varias.digitos(digito)));
    
    System.out.println();
    
    //--------------------------------------------------------------------------
    
    // NÚMERO VOLTEADO
    // Voltea el número introducido
    
    System.out.println("Introduzca un número: ");
    long voltear = Long.parseLong(s.nextLine());
    
    System.out.println("El numero " + voltear + " volteado es " + (matematicas.Varias.voltea(voltear)) );
    
    System.out.println();
    
    //--------------------------------------------------------------------------
    
    // POSICIÓN 
    // Muestra la posición de un número
    
    System.out.println("Introduzca un número entero de las cifras que desee");
    long numeroIntro = Long.parseLong(s.nextLine());
    
    System.out.println("Introduzca la posición de la que desea saber el número");
    int posicion = Integer.parseInt(s.nextLine());
    
    System.out.println("La posición " + posicion + " del número " + numeroIntro + " es " + (matematicas.Varias.digitoN(numeroIntro, posicion)));
    
    System.out.println();
    
    //--------------------------------------------------------------------------
    
    // POSICIÓN DE DÍGITO
    // Dentro de un numero de varia cifras muestra la posisción del numero 
    
    System.out.println("Introduzca un digito de varias cifras");
    long numeroIn = Long.parseLong(s.nextLine());
    
    System.out.println("¿De que digito desea saber su posición?");
    int digitoIn = Integer.parseInt(s.nextLine());
    
    int posici = matematicas.Varias.posicionDeDigito(numeroIn, digitoIn);
    
    //Esto es para que cuente a partir de uno si no empieza de cero
    posicion++;
    
    System.out.println(posicion);
            
    System.out.println();
    
    //--------------------------------------------------------------------------
    
    
    // QUITA DIGITOS POR DETRÁS
    // Esto le quita digitos de derecha a izquierda a un numero (desde detrás)
    
    System.out.println("Introduzca un numero");
    long numeroIntr = Long.parseLong(s.nextLine());
    
    System.out.println("Introduzca los números a quitar");
    int quitaNumero = Integer.parseInt(s.nextLine());
    
    System.out.println("Si le quitamos " + quitaNumero + " se queda en: " + matematicas.Varias.quitaPorDetras(numeroIntro, quitaNumero));
    
    System.out.println();
    
    //--------------------------------------------------------------------------
    
    
    // QUITA DIGITOS POR DELANTE 
    // Esta función quita los dígitos por DELANTE
    
    System.out.println("Introduzca un numero");
    long nIntro = Long.parseLong(s.nextLine());
    
    System.out.println("Introduzca los números a quitar");
    int qNumero = Integer.parseInt(s.nextLine());
    
    System.out.println("Si le quitamos " + qNumero + " se queda en: " + matematicas.Varias.quitaPorDelante(nIntro, qNumero));
    
    System.out.println();
    
    //--------------------------------------------------------------------------
    
    
    // PEGA DIGITOS POR DETRÁS
    // Esta funcion paga dígitos por delante
    
    System.out.println("Introduzca el numero al que le quiera pegar dígitos: ");
    long numeroAPegar = Long.parseLong(s.nextLine());
    
    System.out.println("Introduzca los digitos que desee pegar: ");
    int digitosAPegar = Integer.parseInt(s.nextLine());
    
    System.out.println(matematicas.Varias.pegaPorDetras(numeroAPegar, digitosAPegar));
    
    System.out.println();
    
    //--------------------------------------------------------------------------
    
    // PEGA DIGITOS POR DELANTE
    // Esta función pega digitos por delante
    
    System.out.println("Introduzca el numero al que le quiera pegar dígitos: ");
    long nAPegar = Long.parseLong(s.nextLine());
    
    System.out.println("Introduzca los digitos que desee pegar: ");
    int dAPegar = Integer.parseInt(s.nextLine());
    
    System.out.println(matematicas.Varias.pegaPorDelante(nAPegar, dAPegar));
    
    System.out.println();
    
    //--------------------------------------------------------------------------
    
    // TROZO DE NÚMERO 
    // Este función coge varios números de un conjunto de numeros, indicando mediante posicion
    
    System.out.println("Introduzca el numero al que le quiera quitar un trozo: ");
    long numeroTrozo = Long.parseLong(s.nextLine());
    
    System.out.println("Introduzca la primera posicion: ");
    int primeraPosicion = Integer.parseInt(s.nextLine());
    
    System.out.println("Introduzca la segunda posicion: ");
    int segundaPosicion = Integer.parseInt(s.nextLine());
    
    System.out.println(matematicas.Varias.trozoDeNumero(numeroTrozo, primeraPosicion, segundaPosicion));
    
    System.out.println();
    
   
  }
  
}
