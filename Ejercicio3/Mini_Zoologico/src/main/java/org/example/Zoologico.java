package org.example;

// Definición de la clase Zoologico
public class Zoologico {

    // Atributos privados para llevar un seguimiento de la asistencia en diferentes categorías.
    private int cantAsistNinos;         // Cantidad de asistentes niños
    private int cantAsistAdultos;       // Cantidad de asistentes adultos
    private int cantAsistTerceraEdad;   // Cantidad de asistentes de la tercera edad

    // Constructor de la clase Zoologico
    public Zoologico() {
        // Inicialización de los atributos a cero cuando se crea una instancia de la clase.
        this.cantAsistNinos = 0;
        this.cantAsistAdultos = 0;
        this.cantAsistTerceraEdad = 0;
    }

    // Método para reiniciar la cantidad de asistentes en todas las categorías a cero.
    public void reiniciarCantidadAsistentes() {
        this.cantAsistNinos = 0;
        this.cantAsistAdultos = 0;
        this.cantAsistTerceraEdad = 0;
    }

    // Métodos para registrar la asistencia en cada categoría.

    // Registrar la asistencia de niños.
    public void registrarAsistenciaNino(int cantidad) {
        this.cantAsistNinos += cantidad;
    }

    // Registrar la asistencia de adultos.
    public void registrarAsistenciaAdulto(int cantidad) {
        this.cantAsistAdultos += cantidad;
    }

    // Registrar la asistencia de personas de la tercera edad.
    public void registrarAsistenciaTerceraEdad(int cantidad) {
        this.cantAsistTerceraEdad += cantidad;
    }

    // Métodos para obtener la cantidad de asistentes en cada categoría.

    // Obtener la cantidad de asistentes niños.
    public int getCantAsistNinos() {
        return cantAsistNinos;
    }

    // Obtener la cantidad de asistentes adultos.
    public int getCantAsistAdultos() {
        return cantAsistAdultos;
    }

    // Obtener la cantidad de asistentes de la tercera edad.
    public int getCantAsistTerceraEdad() {
        return cantAsistTerceraEdad;
    }

    // Método para representar la instancia de la clase como una cadena.
    @Override
    public String toString() {
        return "Zoologico{" +
                "cantAsistNinos=" + cantAsistNinos +
                ", cantAsistAdultos=" + cantAsistAdultos +
                ", cantAsistTerceraEdad=" + cantAsistTerceraEdad +
                '}';
    }
}
