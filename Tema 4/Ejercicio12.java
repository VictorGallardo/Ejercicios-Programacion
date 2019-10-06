/**
 *
 * 
 * 
 */
public class Ejercicio12 {
	
	public static void main (String[] args) {
    
		int puntos = 0;
    
    System.out.println("Vamos a realizar una pequeña encuesta sobre el curso DAM.");
    System.out.println("Son un total de 10 preguntas, 2 por asignatura ¡Suerte!");
    System.out.println("¡Vamos con Programación!");
    
    System.out.println("1º pregunta ¿Cuantos bytes de almacenamiento contien una variable int?");
    short pregunta1 = Short.parseShort(System.console().readLine());
    
      if (pregunta1 == 4 ) {
        puntos++;
        System.out.println("¡Correcto!");
      
    } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    
    System.out.println("2º pregunta: ¿Con que tipo de dato almacenarias este caracter 'a'?");
    String pregunta2 = System.console().readLine();
    
      if  {
        puntos++;
        System.out.println("¡Correcto!");
    } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    
    System.out.println("Ahora pasamos a Base de Datos, seguro que es tu asignatura favorita...");
    
    System.out.println("3º pregunta: ¿Que tipo de clave no debe contener valores nulos?");
    String pregunta3 = System.console().readLine();
    
      if (pregunta3.equals("Primaria")) {
        puntos++;
        System.out.println("¡Correcto!");
    } 
      if (pregunta3.equals("Clave primaria")) {
        puntos++;
        System.out.println("¡Correcto!");
    } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    
    System.out.println("4º pregunta: ¿Que otro nombre recibe una funcion de aleatorización?");
    String pregunta4 = System.console().readLine();
    
      if (pregunta4.equals("Hashing")) {
        puntos++;
        System.out.println("¡Correcto!");
    } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    
    System.out.println("Ahora es el turno de Lenguaje de Marcas");
    System.out.println("5º pregunta: ¿Que versión de html usamos en LM?");
    short pregunta5 = Short.parseShort(System.console().readLine());
    
      if (pregunta5 == 5) {
        puntos++;
        System.out.println("¡Correcto!");
    } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    
    System.out.println("6º pregunta: ¿Con que caracteres separarias los párafos?");
    String pregunta6 = System.console().readLine();
    
      if (pregunta6.equals("<p> </p>")) {
        puntos++;
        System.out.println("¡Correcto!");
    } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    
    
    System.out.println("Y seguimos con Pilar en... Entornos de desarrollo."); 
    System.out.println("7º pregunta: ¿Que tipo de lenguaje es el que esta mas cercano al humano?");
    String pregunta7 = System.console().readLine();
    
        
      if (pregunta7.equals("Lenguaje de alto nivel")) {
        puntos++;
        System.out.println("¡Correcto!");
    } 
      if (pregunta7.equals("De alto nivel")) {
        puntos++;
        System.out.println("¡Correcto!");
    }
      if (pregunta7.equals("Alto nivel")) {
        puntos++;
        System.out.println("¡Correcto!");
    } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    
    System.out.println("8º pregunta: ¿Que modelo de cascada se utiliza hoy dia lineal o retroalimentación?");
    String pregunta8 = System.console().readLine();   
    
      if (pregunta8.equals("Retroalimentación")) {
        puntos++;
        System.out.println("¡Correcto!");
    } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    
    System.out.println("Ahora es el turno de Sistemas Informaticos.");
    System.out.println("9º pregunta: ¿Que significan las siglas IC?");
    String pregunta9 = System.console().readLine();
    
      if (pregunta9.equals("Integrated circuit")) {
        puntos++;
        System.out.println("¡Correcto!");
    }
      if (pregunta9.equals("Circuito integrado")) {
        puntos++;
        System.out.println("¡Correcto!");
    } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    
    System.out.println("10º pregunta: ¿Quien invento la primera máquina de calcular a base de ruedas dentadas?");
    String pregunta10 = System.console().readLine();
    
      if (pregunta10.equals("Blaise Pascal")) {
        puntos++;
        System.out.println("¡Correcto!");
    } 
      if (pregunta9.equals("Pascal")) {
        puntos++;
        System.out.println("¡Correcto!");
    } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    System.out.println("Has finalizado el cuestionario, su puntuacion es de " + puntos);
	}
}

