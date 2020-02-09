package tema10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 *
 */
public class Ejercicio14 {

  public static void main(String[] args) {

    HashMap<String, Double> pro = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    String productoIntro;
    int cantidadIntro = 0;

    pro.put("Avena", 2.21);
    pro.put("Garbanzos", 2.39);
    pro.put("Tomate", 1.59);
    pro.put("Jengibre", 3.13);
    pro.put("Quinoa", 4.50);
    pro.put("Guisantes", 1.60);

    ArrayList<String> nom = new ArrayList<>();
    ArrayList<Integer> cant = new ArrayList<>();

    do {
      System.out.println("Producto: ");
      productoIntro = sc.nextLine();
      nom.add(productoIntro);
      if (!productoIntro.equals("Fin")) {
        System.out.println("Cantidad: ");
        cantidadIntro = Integer.parseInt(sc.nextLine());
        cant.add(cantidadIntro);
        if (nom.contains(productoIntro)) {
          int posicion = nom.indexOf(productoIntro);
          cant.set(posicion, cant.get(posicion) + cantidadIntro);
        } else {
          nom.add(productoIntro);
          cant.add(cantidadIntro);
        }
      }
    } while (!productoIntro.equals("Fin"));

    System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
    String codigoDto = sc.nextLine();

    System.out.println("Producto Precio Cantidad Subtotal");
    System.out.println("---------------------------------");

    double total = 0;

    for (int i = 0; i < nom.size(); i++) {
      String producto = nom.get(i);
      double precio = pro.get(producto);
      int cantidad = cant.get(i);
      double subtotal = precio * cantidad;
      total = +subtotal;

      System.out.printf("%-8s %7.2f %6d  %7.2f\n", producto, precio, cantidad, subtotal);
    }
    double descuento = 0;
    if (codigoDto.equals("ECODTO")) {
      descuento = total / 10.0;
      total -= descuento;
    }

    System.out.println("---------------------------------");
    System.out.printf("Descuento: %.2f\n", descuento);
    System.out.println("---------------------------------");
    System.out.printf("TOTAL: %.2f\n", total);
  }

}
