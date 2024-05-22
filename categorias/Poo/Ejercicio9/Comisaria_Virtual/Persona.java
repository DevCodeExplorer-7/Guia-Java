package Ejercicio9.ComisariaVirtual;

public class Persona {

    private int Identificacion;
    private String Nombre;

    public Persona(int identificacion, String nombre) {
        Identificacion = identificacion;
        Nombre = nombre;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }
}
