package org.example;

// Clase Caja
public class Caja {

    // Atributos
    private final int valorEntradaNino; // Precio de la entrada para niños
    private final int valorEntradaAdulto; // Precio de la entrada para adultos
    private final int valorEntradaTerceraEdad; // Precio de la entrada para tercera edad

    private int ventaVendidaNino; // Cantidad de entradas vendidas para niños
    private int ventaVendidaAdulto; // Cantidad de entradas vendidas para adultos
    private int ventaVendidaTerceraEdad; // Cantidad de entradas vendidas para tercera edad

    // Constructor
    public Caja() {
        this.valorEntradaNino = 2000; // Establece el precio de entrada para niños
        this.valorEntradaAdulto = 5000; // Establece el precio de entrada para adultos
        this.valorEntradaTerceraEdad = 3000; // Establece el precio de entrada para tercera edad
        this.ventaVendidaNino = 0; // Inicializa la cantidad de entradas vendidas para niños a 0
        this.ventaVendidaAdulto = 0; // Inicializa la cantidad de entradas vendidas para adultos a 0
        this.ventaVendidaTerceraEdad = 0; // Inicializa la cantidad de entradas vendidas para tercera edad a 0
    }

    // Métodos set para actualizar las cantidades vendidas
    public void setCantVendidaNino(int cantVendidaNino) {
        this.ventaVendidaNino += cantVendidaNino; // Suma la cantidad vendida de niños a la cantidad existente
    }

    public void setCantVendidaAdulto(int cantVendidaAdulto) {
        this.ventaVendidaAdulto += cantVendidaAdulto; // Suma la cantidad vendida de adultos a la cantidad existente
    }

    public void setCantVendidaTerceraEdad(int cantVendidaTerceraEdad) {
        this.ventaVendidaTerceraEdad += cantVendidaTerceraEdad; // Suma la cantidad vendida de tercera edad a la cantidad existente
    }

    // Métodos get para obtener el valor de las entradas
    public int getValorEntradaNino() {
        return valorEntradaNino; // Devuelve el precio de entrada para niños
    }

    public int getValorEntradaAdulto() {
        return valorEntradaAdulto; // Devuelve el precio de entrada para adultos
    }

    public int getValorEntradaTerceraEdad() {
        return valorEntradaTerceraEdad; // Devuelve el precio de entrada para tercera edad
    }

    // Método toString para obtener una representación en cadena de la instancia de la clase
    @Override
    public String toString() {
        return "Caja{" +
                "valorEntradaNino=" + valorEntradaNino +
                ", valorEntradaAdulto=" + valorEntradaAdulto +
                ", valorEntradaTerceraEdad=" + valorEntradaTerceraEdad +
                ", cantVendidaNino=" + ventaVendidaNino +
                ", cantVendidaAdulto=" + ventaVendidaAdulto +
                ", cantVendidaTerceraEdad=" + ventaVendidaTerceraEdad +
                '}';
    }
}
