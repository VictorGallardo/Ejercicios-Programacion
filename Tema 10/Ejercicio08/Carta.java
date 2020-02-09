
package Ejercicio08;

public class Carta {
  
  public static String[] nu= {"As","Dos","Tres","Cuatro","Cinco", "Seis", "Siete", "Sota", "Caballo", "Rey"};
  public static String[] pa= {"bastos","copas","espadas","oros"};
  
  private String numero;
  private String palo;

  //Constructor
  public Carta(String numero, String palo) {
    this.numero = nu[(int)(Math.random()*10)];
    this.palo = pa[(int)(Math.random()*4)];
  }

 //Getters & Setters 
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getPalo() {
    return palo;
  }

  public void setPalo(String palo) {
    this.palo = palo;
  }

  @Override
  public String toString() {
    return this.numero + " de " + this.palo;
  }
  
  
  
  
  
  
  
  
  
}
