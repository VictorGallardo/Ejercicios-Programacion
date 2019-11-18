
package Ejercicios.tema7;
/**
 *
 * @author victor
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    /*Declaro las variables*/
    int numeros[] = new int[20];
    int contadorPar = 0;
    int contadorImpar = 0; 
    int pares[] = new int[20];
    int impares[] = new int[20];
    int i;
    
    /*Este bucle junto con random me genera los numero aleatorios*/
    for (i = 0; i < 20; i++){
      numeros[i] = (int)(Math.random() * 100);
      
      /*Aqui se compruba si es par o impar*/
      if (numeros[i] % 2 == 0){  
        pares[contadorPar++] = numeros[i];
      } else {
        impares[contadorImpar++] = numeros[i];
        } 
    } 
    /*Este bucle muestra el array original*/
    System.out.println("Array sin converesión");
    for (i = 0; i < 20; i++){
      System.out.print(numeros[i] + " ");
    }
    /* Este bucle pone los pares al principio del array*/
    for (i = 0; i < contadorPar; i++){
      numeros[i] = pares[i];
    }
    /* Este bucle pone los impares en los huecos sobrantes*/
    for (i = contadorPar; i < 20; i++){
      numeros[i] = impares[i-contadorPar];
    }
    System.out.println();
    System.out.println();
    
    /* Este bucle muer¡stra el array con los pares al principio*/
    System.out.println("Arrays con los pares al principio:");
    for (i = 0; i < 20; i++){ 
      System.out.print(numeros[i] + " ");
    }

  }
  
}
