package tema10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 *
 */
public class Ejercicio10 {

  public static void main(String[] args) {

    HashMap<String, String> lista = new HashMap<>();
    Scanner sc = new Scanner (System.in);

    lista.put("Mesa", "Table");
    lista.put("Silla","Chair");
    lista.put("Chico","Boy");
    lista.put("Chica","Girl");
    lista.put("Comida","food");
    lista.put("Musica","Music");
    lista.put("Montaña","Mountain");
    lista.put("Nube","Cloud");
    lista.put("Ventana","Window");
    lista.put("Sombra","Shadow");
    lista.put("Coche","Car");
    lista.put("Correr","Run");
    lista.put("libro","Book");
    lista.put("Azul","Blue");
    lista.put("Rojo","Red");
    lista.put("Verde","Green");
    lista.put("Negro","Black");
    lista.put("Serpiente","Snake");
    lista.put("Leon","Lion");
    lista.put("Perro","Dog");
    
    System.out.println("Introduzca un palabra le daré su traducción en ingles");
    String palabra = sc.nextLine();
    
    if (lista.containsKey(palabra)) {
      System.out.println("La traduccion al inglés sería " + lista.get(palabra));    
    } else {
      System.out.println("No conozco la traducción de esa palabra.");
    }

  }

}
