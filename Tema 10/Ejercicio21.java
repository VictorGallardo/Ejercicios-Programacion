package tema10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 *
 */
public class Ejercicio21 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    HashMap<String, String> ha = new HashMap<>();
    HashMap<String, String> al = new HashMap<>();

    ha.put("rana", "En los tropicos y cerca de las zonas humedadas y acuaticas ");
    ha.put("salamandra", "Ecosistemas humedos");
    ha.put("sapo", "En cualquier sitio salvo el desierto y la Antártida");
    ha.put("tritón", "América y África");

    al.put("rana", "Larvas e insectos");
    al.put("salamandra", "Pequeños crustáceos e insectos");
    al.put("sapo", "Insectos, lombrices y pequeños roedores");
    al.put("triton", "insectos");

    System.out.println("Introduzca el tipo de anfibio: ");
    String anfibioIntro = sc.nextLine();
    if (al.containsKey(anfibioIntro)) {
      System.out.println("Habitad: " + ha.get(anfibioIntro));
      System.out.println("Alimentacion: " + al.get(anfibioIntro));
    } else {
      System.out.println("Ese tipo de anfibio no existe");

    }

  }

}
