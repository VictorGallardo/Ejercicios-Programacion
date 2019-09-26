public class Ejercicio05 {
  public static void main(String[] args) {


    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";

    System.out.println(blanco + "LUNES\tMARTES\tMIÉRC.\tJUEVES\tVIERNES");
    System.out.println(blanco + "---------------------------------------");
    System.out.println(rojo + "PROG" + celeste + "\tEDD" + rojo + "\tPROG\tPROG" + morado + "\tSINF");
    System.out.println(rojo + "PROG" + verde + "\tLM" + rojo + "\tPROG\tPROG" + morado + "\tSINF");
    System.out.println(rojo + "PROG" + verde + "\tLM" + rojo + "\tPROG" + celeste + "\tEDD" + morado + "\tSINF");
    System.out.println(azul + "BBDD" + morado + "\tSINF" + azul + "\tBBDD" + celeste + "\tEDD" + naranja + "\tFOL");
    System.out.println(azul + "BBDD" + morado + "\tSINF" + azul + "\tBBDD" + verde + "\tLM" + naranja + "\tFOL");
    System.out.println(azul + "BBDD" + morado + "\tSINF" + azul + "\tBBDD" + verde + "\tLM" + naranja + "\tFOL");
  }
}
    
