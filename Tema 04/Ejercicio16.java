/**
 *
 * 
 */
public class Ejercicio16 {
	
	public static void main (String[] args) {
		
    System.out.println("Programa que le ayudará a saber si su pareja le es infiel.");
    System.out.println("Por favor responda a las sieguientes preguntas con verdadero o falso:");
    
    int puntos = 0;
    
    System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo");
    String primera = (System.console().readLine());
    if (primera.equalsIgnoreCase("verdadero")) {
      puntos += 3;
    }  
    System.out.println("Ha aumentado sus gastos de vestuario");
    String segunda = (System.console().readLine());
    if (segunda.equalsIgnoreCase("verdadero")) {
      puntos += 3;
    } 
        System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
    String tercera = (System.console().readLine());
    if (tercera.equalsIgnoreCase("verdadero")) {
      puntos += 3;
    } 
        System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");

    String cuarta = (System.console().readLine());
    if (cuarta.equalsIgnoreCase("verdadero")) {
      puntos += 3;
    } 
        System.out.println("No te deja que mires la agenda de su teléfono móvil");
    String quinta = (System.console().readLine());
    if (quinta.equalsIgnoreCase("verdadero")) {
      puntos += 3;
    } 
        System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");

    String sexta = (System.console().readLine());
    if (sexta.equalsIgnoreCase("verdadero")) {
      puntos += 3;
    } 
        System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    String septima = (System.console().readLine());
    if (septima.equalsIgnoreCase("verdadero")) {
      puntos += 3;
    } 
        System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");

    String octava = (System.console().readLine());
    if (octava.equalsIgnoreCase("verdadero")) {
      puntos += 3;
    } 
        System.out.println("Has notado que últimamente se perfuma más");
    String novena = (System.console().readLine());
    if (novena.equalsIgnoreCase("verdadero")) {
      puntos += 3;
    } 
        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    String decima = (System.console().readLine());
    if (decima.equalsIgnoreCase("verdadero")) {
      puntos += 3;
    } 
    if (puntos <= 10) {
      System.out.println("Tienes una puntuación de " + puntos + " sobre 30 ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
         
    if ((puntos > 10) && (puntos < 23)) {
      System.out.println("Tienes una puntuación de " + puntos + " sobre 30");
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia.");
    }
    if ((puntos > 22) && (puntos <= 30)) {
      System.out.println("Tienes una puntuación de " + puntos + " sobre 30");
      System.out.println("¡Su pareja le es infiel! Lo siento amig@.");
    }
	}
}

