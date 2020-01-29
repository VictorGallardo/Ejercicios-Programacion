
public class Ejercicio06 {
	
	public static void main (String[] args) {
    
    double baseImponible;
    double iva;
    
    baseImponible = 100.00;
    iva = 21.00;
		
    System.out.printf("Base Imponible %10.2f euros\n", baseImponible);
    System.out.printf("IVA            %10.2f euros\n", iva); 
    System.out.println("-------------------------------");
    System.out.printf("Total          %10.2f euros\n", baseImponible + iva);
	}
}

