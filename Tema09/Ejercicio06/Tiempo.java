
package Ejercicio06;

/**
 *
 *
 */
public class Tiempo {
  
  private int hor;
  private int min;
  private int seg;

  public Tiempo(int hor, int min, int seg) {
    this.hor = hor;
    this.min = min;
    this.seg = seg;
  } 
  
  public Tiempo suma(Tiempo t1, Tiempo t2) {
    int h = t1.hor + t2.hor;
    int m = t1.min + t2.min;
    int s = t1.seg + t2.seg;
    
    if (s>60) {
      s-=60;
      m++;
    }
    if (m>60) {
      m-=60;
      h++;
    }
    return new Tiempo(h, m, s);
  }
  public Tiempo resta(Tiempo t1, Tiempo t2){
    int h = t1.hor - t2.hor;
    int m = t1.min - t2.min;
    int s = t1.seg - t2.seg;
    
    if (s<0) {
      m--;
      s+=60;
    }
    if (m<0){
      h--;
      m+=60;
    } 
    if (h<0 || m<0 || s<0){
      System.out.println("Esta operacion da un resutado negativo, no podemos volver al pasado lo siento.");
      return new Tiempo (0, 0, 0);
    } else {
    return new Tiempo (h, m, s);
    }
  }
  
  
  @Override
  public String toString(){
    return this.hor + "h - " + this.min + "m - " + this.seg + "s ";
  }
}
