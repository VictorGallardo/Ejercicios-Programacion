/**
 * LIBRERIA DE FUNCIONES MATEMÁTICAS
 *
 * Este java class es una biblioteca de funciones en concreto de matematicas.
 *
 * Índice:
 * esCapicua       | Responde con verdadero o falso si un número es capicuo o no
 * esPrimo         | Responde con verdadero o falso si un número es capicuo o no.
 * siguientePrimo  | Devuelve el menor primo que es mayor al número que se pasa como parámetro
 * potencia        | Dada una base y un exponente, devuelve la potencia
 * digitos         | Cuenta los digitos que tiene un numero entero 
 * voltea          | Le da la vuelta al numero introducido
 * digitoN         | Devuelve el dígito que está en la posición <code>n</code> de un número
 * posicionDeDigito| Da la posición de la primera ocurrencia de un dígito dentro de un número
 * quitaPorDetras  | Le quita a un número <code>n</code> dígitos por detrás (por la derecha)
 * quitaPorDelante | Le quita a un número <code>n</code> dígitos por delante (por la izquierda)
 * pegaPorDetras   | Añade un dígito a un número por detrás (por la derecha).
 * pegaPorDelante  | Añade un dígito a un número por delante (por la izquierda).
 * trozoDeNumero   | Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
 * juntaNumeros    | Pega dos números para formar uno solo.
 * 
 */

package matematicas;

public class Varias {

  
//------------------------------------------------------------------------------  

  
/**
 * ¿ES CAPICUO?
 * 
 * Responde con verdadero o falso si un número es capicuo o no.
 * 
 * Un número capicuo es el que se lee igual de los dos lados
 * 
 * x es el numero que qeremos comprovar 
 * return --> true o false
 * 
 */
  public static boolean esCapicua(long x) {
    return x == voltea(x);
}

/**
 * ¿ES CAPICUO?
 * 
 * Responde con verdadero o falso si un número es capicuo o no.
 * 
 * Un número capicuo es el que se lee igual de los dos lados
 * 
 * x es el numero que qeremos comprovar 
 * return --> true o false
 * 
 */
  public static boolean esCapicua(int x) {
    return esCapicua((long)x);
  }


//------------------------------------------------------------------------------


/**
 * ¿ES PRIMO?
 * 
 * Devuelve verdadero si el número es primo y falso si no lo es.
 * .............................................................................
 * 
 * ¿Que es un número primo? 
 * 
 * Un número primo es un número natural mayor que 1 y divisible únicamente
 * entre el mismo y entre 1.
 * .............................................................................
 *
 * x es el número del que se quiere saber si es primo
 * return verdadero si el número que se pasa como parámetro es primo y falso
 * en caso contrario
 * 
 */
  public static Boolean esPrimo(long n) {
    if (n < 2) {
      return false;
    } else {
      for (long i = n / 2; i >= 2; i--) {
        if (n % i == 0) {
        return false;
        }
      }
    }
    return true;
  }


//------------------------------------------------------------------------------


  /**
   * SIGUIENTE PRIMO
   * 
   * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
   * ...........................................................................
   * 
   * x Es el número entero a introducir
   * return  el menor primo que es mayor al número que se pasa como parámetro
   * 
   */
  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {};

    return x;
  }
  
  
  //----------------------------------------------------------------------------

  
  /**
   * POTENCIA
   * 
   * Dada una base y un exponente, devuelve la potencia.
   * ...........................................................................
   *
   * base =        base de la potencia
   * exponente =   exponente de la potencia
   * return =      número resultante de elevar la base a la potencia indicada
   * 
   */
  public static double potencia(int base, int exponente) {
    if (exponente == 0) {
      return 1;
    }

    if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }

    int n = 1;

    for (int i = 0; i < Math.abs(exponente); i++) {
      n = n * base;
    }

    return n;
  }
  
  
  //----------------------------------------------------------------------------

  
  /**
   * CUENTA DIGITOS
   * 
   * Cuenta los digitos que tiene un numero entero 
   * ...........................................................................
   *
   * x es el número al que se le quieren contar los dígitos
   * return  número de dígitos que tiene el número que se pasa como parámetro
   */
  public static int digitos(long x) { 
    if (x < 0) {
      x = -x;
    }

    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10; // se le quita un dígito a x
        n++; // incrementa la cuenta de dígitos
      }
      return n;
    }
  }
  
  /**
   * CUENTA DIGITOS
   * 
   * Cuenta los digitos que tiene un numero entero 
   * ...........................................................................
   *
   * x es el número al que se le quieren contar los dígitos
   * return  número de dígitos que tiene el número que se pasa como parámetro
   */
  public static int digitos(int x) {
    return digitos((long)x);
  }
  
  
//------------------------------------------------------------------------------

  
  /**
   * VOLTEA NÚMEROS.
   * 
   * Le da la vuelta al numero introducido.
   *
   * x número al que se le quiere dar la vuelta
   * return número volteado (al revés)
   */
  public static long voltea(long x) {
    if (x < 0) {
      return -voltea(-x);
    }
    long volteado = 0;

    while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }
    return volteado;
  }

  /**
   * VOLTEA NÚMEROS.
   * 
   * Le da la vuelta al numero introducido.
   *
   * x número al que se le quiere dar la vuelta
   * return número volteado (al revés)
   */
  public static int voltea(int x) {
    return (int)voltea((long)x);
    }


//------------------------------------------------------------------------------

  
  /**
   *
   */
  public static int digitoN(long x, int n) {
    x = voltea(x);

    while (n-- > 0) {
      x = x / 10;
    }

    return (int)x % 10;
  }
  
  /**
   *
   */
  public static int digitoN(int x, int n) {
    return digitoN((long)x, n);
  }
  
 
  //----------------------------------------------------------------------------
  
  
  /**
   * 
   */
  public static int posicionDeDigito(long x, int d) {
    int i;

    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};

    if (i == digitos(x)) {
      return -1;
    } else {
      return i;
    }
  }
  
  /**
   *
   */
  public static int posicionDeDigito(int x, int d) {
    return posicionDeDigito((long)x, d);
  }
  
  
  //----------------------------------------------------------------------------
  
  
  /**
   *
   */
  public static long quitaPorDetras(long x, int n) {
    return x / (long)potencia(10, n);
  }
  
  /**
   *
   */
  public static int quitaPorDetras(int x, int n) {

    return (int)quitaPorDetras((long) x, n);
  }

  
  //----------------------------------------------------------------------------
  
  
  /**
   *
   */
  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }

  /**
   *
   */
  public static int quitaPorDelante(int x, int n) {
    return (int)quitaPorDelante((long)x, n);
  }
  
//------------------------------------------------------------------------------
  
  
  /**
   *
   */
  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }

  /**
   *
   */
  public static int pegaPorDetras(int x, int d) {
    return (int)pegaPorDetras((long)x, d);
  }
  
  //----------------------------------------------------------------------------

  /**
   * 
   */
  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }

  /**
   * 
   */
  public static int pegaPorDelante(int x, int d) {
    return (int)pegaPorDelante((long)x, d);
  }
  
  
  //----------------------------------------------------------------------------

  
  /**
   * 
   */
  public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }

  /**
   * 
   */
  public static int trozoDeNumero(int x, int inicio, int fin) {
    return (int)trozoDeNumero((long)x, inicio, fin);
  }
  
  //----------------------------------------------------------------------------

  
  /**
   * 
   */
  public static long juntaNumeros(long x, long y) {
    return (long)(x * potencia(10, digitos(y))) + y;
  }

  /**
   * 
   */
  public static int juntaNumeros(int x, int y) {
    return (int)(juntaNumeros((long)x, (long)y));
  }

  
 
//Este es el final siempre escribir encima 
}
