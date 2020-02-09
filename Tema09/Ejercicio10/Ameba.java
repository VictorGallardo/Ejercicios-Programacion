package Ejercicio10;

public class Ameba {

  private int peso;
  private int amebaPesoInicial;

  public Ameba() {
    this.peso = 3;
  }  

  public void come(int comida){
    this.peso += comida -1;
  }
  public void come (Ameba comeAmeba){
    this.peso += comeAmeba.peso;
    comeAmeba.peso = 0;
  }
  @Override
  public String toString() {
    return "Soy un ameba y peso " + peso + " microgramos";
  }
}
