package Ejercicio03;

public abstract class Animal {
  
  private Sexo sexo;
  private String nombre;
  private String nombreCientifico;
  private String habitad;
  
  //Getters

  public Sexo getSexo() {
    return sexo;
  }

  public String getNombre() {
    return nombre;
  }

  public String getNombreCientifico() {
    return nombreCientifico;
  }

  public String getHabitad() {
    return habitad;
  }

  public void setSexo(Sexo sexo) {
    this.sexo = sexo;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setNombreCientifico(String nombreCientifico) {
    this.nombreCientifico = nombreCientifico;
  }

  public void setHabitad(String habitad) {
    this.habitad = habitad;
  }

  public Animal(Sexo sexo, String nombre, String nombreCientifico, String habitad) {
    this.sexo = sexo;
    this.nombre = nombre;
    this.nombreCientifico = nombreCientifico;
    this.habitad = habitad;
  }

  @Override
  public String toString() {
    return "Animal{" + "sexo=" + sexo + ", nombre=" + nombre + ", nombreCientifico=" + nombreCientifico + ", habitad=" + habitad + '}';
  }
  
}
