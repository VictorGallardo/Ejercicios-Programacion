
public class Ejercicio07 {
	
	public static void main (String[] args) {
    
    System.out.print("Por favor, introduzca el precio del articulo sin IVA: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Base Imponible %10.2f euros\n", baseImponible);
    System.out.printf("IVA            %10.2f euros\n", baseImponible * 0.21); 
    System.out.println("-------------------------------");
    System.out.printf("Total          %10.2f euros\n", baseImponible * 1.21);
	}
}

