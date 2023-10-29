package org.example;

public class MaquinaBebida {


    // Atributos para almacenar precios y cantidades vendidas
    int precioFanta;            // Precio de una lata de Fanta en centavos
    int precioSprite;           // Precio de una lata de Sprite en centavos
    int cantidadDeFantaVendidas; // Cantidad de latas de Fanta vendidas
    int cantidadDeSpriteVendidas; // Cantidad de latas de Sprite vendidas

    // Constructor que inicializa los valores por defecto
    public MaquinaBebida() {
        precioFanta = 500;       // Precio inicial de una lata de Fanta (5 dólares)
        precioSprite = 250;     // Precio inicial de una lata de Sprite (2.50 dólares)
        cantidadDeFantaVendidas = 0; // Inicialmente, no se han vendido latas de Fanta
        cantidadDeSpriteVendidas = 0; // Inicialmente, no se han vendido latas de Sprite
    }

    // Métodos "get" para obtener los precios de Fanta y Sprite
    public int getPrecioFanta() {
        return precioFanta;
    }

    public int getPrecioSprite() {
        return precioSprite;
    }

    // Métodos "set" para actualizar la cantidad de Fanta y Sprite vendidas
    public void setCantidadDeFantaVendidas(int cantidadDeFantaVendidas) {
        this.cantidadDeFantaVendidas = cantidadDeFantaVendidas;
    }

    public void setCantidadDeSpriteVendidas(int cantidadDeSpriteVendidas) {
        this.cantidadDeSpriteVendidas = cantidadDeSpriteVendidas;
    }

    // Métodos "get" para obtener la cantidad de Fanta y Sprite vendidas
    public int getCantidadDeFantaVendidas() {
        return cantidadDeFantaVendidas;
    }

    public int getCantidadDeSpriteVendidas() {
        return cantidadDeSpriteVendidas;
    }

    // Método para mostrar estadísticas de la máquina de bebidas
    public String Mostrar_Estadisticas() {
        return "MaquinaBebida{" +
                ", cantidadDeFantaVendidas=" + cantidadDeFantaVendidas +
                ", cantidadDeSpriteVendidas=" + cantidadDeSpriteVendidas +
                '}';
    }

}
