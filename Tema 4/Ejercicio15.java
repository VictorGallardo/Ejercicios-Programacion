/**
 *
 */
public class Ejercicio15 {
	
	public static void main (String[] args) {
		
    System.out.println("Por favor, introduzca un caracter del tipo (&-%-$-@-*-) ");
    String c = System.console().readLine();
    
    System.out.println("Por favor, elija hacia donde quiere que apunte el vértice.");
    System.out.println("Introduzca por teclado: Arriba, abajo, derecha o izquierda");
    String vertice = System.console().readLine();
    
    if (vertice.equalsIgnoreCase("Arriba")) {
      System.out.println("  " + c );
      System.out.println(" " + c + c + c );
      System.out.println(c + c + c + c + c);
    }
    if (vertice.equalsIgnoreCase("Abajo")) {
      System.out.println(c + c + c + c + c);
      System.out.println(" " + c + c + c);
      System.out.println("  " + c);
    }
    if (vertice.equalsIgnoreCase("Derecha")) {
      System.out.println(c);
      System.out.println(c + c);
      System.out.println(c + c + c);
      System.out.println(c + c);
      System.out.println(c);
    } 
    if (vertice.equalsIgnoreCase("izquierda")) {
      System.out.println("  " + c);
      System.out.println(" " + c + c);
      System.out.println(c + c + c);
      System.out.println(" " + c + c);
      System.out.println("  " + c);
    } 
	} 
}

