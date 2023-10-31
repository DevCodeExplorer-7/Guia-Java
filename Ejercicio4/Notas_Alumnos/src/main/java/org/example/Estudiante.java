package org.example;

// Clase Estudiante
public class Estudiante {

    // Atributos de la clase
    private String nombre;
    private double notaCatedra1;
    private double notaCatedra2;
    private double notaExamen;
    private double promedio;

    // Constructor vacío
    public Estudiante() {
    }

    // Métodos para obtener el nombre del estudiante
    public String getNombre() {
        return nombre;
    }

    // Métodos para establecer el Nombre del estudiante
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para obtener  la nota de catedra 1
    public double getNotaCatedra1() {
        return notaCatedra1;
    }

    // Métodos para  establecer el promedio
    public void setNotaCatedra1(double notaCatedra1) {
        this.notaCatedra1 = notaCatedra1;
    }

    // Métodos para obtener  la nota de catedra 2
    public double getNotaCatedra2() {
        return notaCatedra2;
    }

    // Métodos para establecer el promedio
    public void setNotaCatedra2(double notaCatedra2) {
        this.notaCatedra2 = notaCatedra2;
    }

    // Métodos para obtener  la nota del examen
    public double getNotaExamen() {
        return notaExamen;
    }

    // Métodos para establecer el promedio
    public void setNotaExamen(double notaExamen) {
        this.notaExamen = notaExamen;
    }

    // Métodos para obtener  el promedio
    public double getPromedio() {
        return promedio;
    }

    // Método para calcular el promedio ponderado
    public void setPromedio(double ponderacion1, double ponderacion2, double ponderacionExamen) {
        if (notaCatedra1 == 0.0 || notaCatedra2 == 0.0 || notaExamen == 0.0) {
            System.out.println("No se puede calcular el promedio, faltan notas");
        } else {
            double total_Ponderacion = ponderacion1 + ponderacion2 + ponderacionExamen;
            if (total_Ponderacion != 100) {
                System.out.println("La suma de las ponderaciones debe ser 100");
            } else {
                // Calcula el promedio ponderado
                this.promedio = (notaCatedra1 * ponderacion1 / 100) + (notaCatedra2 * ponderacion2 / 100)
                        + (notaExamen * ponderacionExamen / 100);
            }
        }
    }

    // Método para mostrar la información del estudiante
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre= '" + nombre + '\'' +
                ", notaCatedra1= " + notaCatedra1 +
                ", notaCatedra2= " + notaCatedra2 +
                ", notaExamen= " + notaExamen +
                ", promedio= " + promedio +
                '}';
    }
}
