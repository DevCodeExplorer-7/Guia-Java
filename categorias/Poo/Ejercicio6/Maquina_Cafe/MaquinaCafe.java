package Ejercicio6.Maquina_Cafe;

import javax.swing.*;

// Clase MaquinaCafe que contiene los metodos para mostrar la venta acumulada y la cantidad acumulada
public class MaquinaCafe {

    // Atributos de la clase MaquinaCafe
    private int precio_cafe_express;
    private int vta_acum_cafexpress;
    private int cant_acum_cafexpress;

    // Constructor de la clase MaquinaCafe
    public MaquinaCafe(int precio_cafe_express, int vta_acum_cafexpress, int cant_acum_cafexpress) {
        this.precio_cafe_express = precio_cafe_express;
        this.vta_acum_cafexpress = vta_acum_cafexpress;
        this.cant_acum_cafexpress = cant_acum_cafexpress;
    }

    // Metodos de la clase MaquinaCafe para mostrar la venta acumulada y la cantidad acumulada
    public int getPrecio_cafe_express() {
        return precio_cafe_express;
    }

    public void setVta_acum_cafexpress(int vta_acum_cafexpress) {
        this.vta_acum_cafexpress = vta_acum_cafexpress;
    }

    public void setCant_acum_cafexpress(int cant_acum_cafexpress) {
        this.cant_acum_cafexpress += cant_acum_cafexpress;
    }

    // Metodos de la clase MaquinaCafe para mostrar la venta acumulada y la cantidad acumulada
    public void  mostrarVentaAcum(){
        JOptionPane.showMessageDialog(null, "Venta acumulada: " + this.vta_acum_cafexpress);
    }

    public void mostrarCantAcum(){
        JOptionPane.showMessageDialog(null, "Cantidad acumulada: " + this.cant_acum_cafexpress);
    }
}
