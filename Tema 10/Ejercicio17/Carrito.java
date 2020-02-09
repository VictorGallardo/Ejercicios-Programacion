
package Ejercicio17;

import java.util.ArrayList;

public class Carrito {
  
  ArrayList<Elemento> lista = new ArrayList<>();
  public void agrega(Elemento e){
    lista.add(e);
  }
  public int numeroDeElementos(){
     return lista.size();  
  }
  public double importeTotal(){
    double total = 0;
    for (Elemento elemento : lista) {
      total += elemento.getCantidad()* elemento.getCantidad();
    }
    return total;
  }
  @Override
  public String toString(){
    
    String contenido= "Contenido del carrito\n"
      + "=============================\n";
    for (Elemento elemento : lista) {
      contenido += elemento + "\n";
    } 
    return contenido;
    
  }

     
}
