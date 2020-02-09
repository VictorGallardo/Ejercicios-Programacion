package Ejercicio02;

import java.util.Scanner;

/**
 * Prueba de la clase vehiculos y sus subclases Coche y Bicicleta
 * 
 */
public class PruebaVehiculo {

  public static void main(String[] args) {
    
    int eleccion = 0;
    int km;
    Scanner s = new Scanner(System.in);
    
    Bicicleta proflex = new Bicicleta(16);
    Coche seatIbiza = new Coche(1600);
    
    while (eleccion != 8) {
      
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");  
      
      eleccion = Integer.parseInt(s.nextLine());
      
      switch (eleccion) {
        case 1:
          System.out.println("¿Cuantos kilometros quieres hacer? ");
          km = Integer.parseInt(s.nextLine());
          proflex.recorre(km);
          break;
        case 2:
          proflex.hazCaballito();
          break;
        case 3:
          System.out.println("¿Cuantos kilometros quieres hacer? ");
          km = Integer.parseInt(s.nextLine());
          seatIbiza.recorre(km);
          break;
        case 4:
          seatIbiza.quemaRueda();
          break;
        case 5:
          System.out.println("La bicicleta lleva recorridos: ");
          System.out.println(proflex.getkilomentrosRecorridos() + "km");
          break;
        case 6:
          System.out.println("El coche lleva recorridos: ");
          System.out.println(seatIbiza.getkilomentrosRecorridos() + "km");
          break;          
        case 7:
          System.out.println("El kilometraje total de los vehículos es: ");
          System.out.println(Vehiculo.getkilometrosTotales() + "km");
        default:  
        
      }
      
    }

  }
  
}
