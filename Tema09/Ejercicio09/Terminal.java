
package Ejercicio09;

public abstract class Terminal {

  private String numero;
  private int tiempoLlamada;
  
  //Constructor
  public Terminal(String numero) {
    this.numero = numero; 
    this.tiempoLlamada = 0;
  }
  //Getter
  public String getNumero() {
    return numero;
  }
  //Setter
  public void setNumero(String numero) {
    this.numero = numero;
  }

  public int getTiempoLlamada() {
    return tiempoLlamada;
  }

  public void setTiempoLlamada(int tiempoLlamada) {
    this.tiempoLlamada = tiempoLlamada;
  }
 
  @Override 
  public String toString() {
    return "Nº " + this.numero + " - " + this.tiempoLlamada + "s de conversación.";
  }
  
  //Método llama
  public void llama(Terminal t, int segundosLlamada){
    this.tiempoLlamada += segundosLlamada;
    t.tiempoLlamada += segundosLlamada;
  }
  
  
  
}
