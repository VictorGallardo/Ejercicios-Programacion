
package tema7;

/**
 *
 * @author victor
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    
    char [] simbolo = new char[10];
    
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[2] = '@';
    simbolo[3] = ' ';
    simbolo[4] = '+';
    simbolo[5] = 'Q';
    
    for (int i = 0; i < 10; i++) {
      System.out.println("simbolo[" + i + "] :" + simbolo[i]);
    }  
  }
  
}
