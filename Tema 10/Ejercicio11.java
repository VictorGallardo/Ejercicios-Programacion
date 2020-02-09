package tema10;

import java.util.HashMap;
import java.util.Scanner;

/**
Realiza un programa que escoja al azar 5 palabras en español del mini-
diccionario del ejercicio anterior. El programa irá pidiendo que el usuario teclee
la traducción al inglés de cada una de las palabras y comprobará si son
correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas
y cuántas erróneas.
 *
 */
public class Ejercicio11 {

  public static void main(String[] args) {

    HashMap<String, String> lista = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    lista.put("Mesa", "Table");
    lista.put("Silla", "Chair");
    lista.put("Chico", "Boy");
    lista.put("Chica", "Girl");
    lista.put("Comida", "food");
    lista.put("Musica", "Music");
    lista.put("Montaña", "Mountain");
    lista.put("Nube", "Cloud");
    lista.put("Ventana", "Window");
    lista.put("Sombra", "Shadow");
    lista.put("Coche", "Car");
    lista.put("Correr", "Run");
    lista.put("libro", "Book");
    lista.put("Azul", "Blue");
    lista.put("Rojo", "Red");
    lista.put("Verde", "Green");
    lista.put("Negro", "Black");
    lista.put("Serpiente", "Snake");
    lista.put("Leon", "Lion");
    lista.put("Perro", "Dog");
    
    System.out.println("Traduzca la siguiente palabra: ");

  }

}
