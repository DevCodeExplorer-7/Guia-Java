package Ejercicio9.ComisariaVirtual;

public class Habitante extends Persona {

    private int edad;
    private int cantidadPermisos;
    private int multa;


    public Habitante(int identificacion, String nombre) {
        super(identificacion, nombre);
    }

    public Habitante(int identificacion, String nombre, int edad, int cantidadPermisos, int multa) {
        super(identificacion, nombre);
        this.edad = edad;
        this.cantidadPermisos = cantidadPermisos;
        this.multa = multa;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadPermisos() {
        return cantidadPermisos;
    }

    public void setCantidadPermisos(int cantidadPermisos) {
        this.cantidadPermisos = cantidadPermisos;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public void mostrarInfoHabitante() {
        System.out.println("Identificación: " + getIdentificacion());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Cantidad de Permisos: " + getCantidadPermisos());
        System.out.println("Multa: $" + getMulta());
    }
}
