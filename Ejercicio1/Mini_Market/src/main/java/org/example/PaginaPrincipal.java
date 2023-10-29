package org.example;

import javax.swing.*;

public class PaginaPrincipal {
    public static void main(String[] args) {

        MaquinaBebida maquinaBebida = new MaquinaBebida();
        String menu = """
                ***Mini Market***
                1-Venta Fanta
                2-Venta Sprite
                3-Total Pagar
                4-Estadisticas de ventas
                5-Salir
                """;
        int opcion;
        int cantidadFanta;
        int cantidadSprite;
        int totalPagar;
        int pago;
        int vuelto;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu)); // Muestra el menú y obtiene la opción del usuario.

            switch (opcion) {
                case 1: {
                    cantidadFanta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de bebidas Fanta"));
                    maquinaBebida.setCantidadDeFantaVendidas(cantidadFanta); // Registra la cantidad de Fanta vendida.
                    break;
                }
                case 2: {
                    cantidadSprite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de bebidas Sprite"));
                    maquinaBebida.setCantidadDeSpriteVendidas(cantidadSprite); // Registra la cantidad de Sprite vendida.
                    break;
                }
                case 3: {
                    // Calcula el total a pagar en función de las cantidades vendidas y los precios.
                    totalPagar = (maquinaBebida.getCantidadDeFantaVendidas() * maquinaBebida.getPrecioFanta()) +
                            (maquinaBebida.getCantidadDeSpriteVendidas() * maquinaBebida.getPrecioSprite());
                    JOptionPane.showMessageDialog(null, "El total a pagar es: " + totalPagar); // Muestra el total a pagar.
                    pago = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Pago")); // Obtiene la cantidad de pago del usuario.
                    if (pago <= 0 || pago <= totalPagar) {
                        JOptionPane.showMessageDialog(null, "Error, debe ingresar un pago mayor o igual al total a pagar "); // Maneja errores de pago insuficiente.
                    } else {
                        vuelto = pago - totalPagar;
                        if (vuelto > 0) {
                            JOptionPane.showMessageDialog(null, "Su vuelto es: " + vuelto, "Vuelto", JOptionPane.INFORMATION_MESSAGE); // Calcula y muestra el vuelto.
                        } else {
                            JOptionPane.showMessageDialog(null, "Gracias por comprar en el Mini Market"); // Muestra un mensaje de agradecimiento.
                        }
                    }
                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, maquinaBebida.Mostrar_Estadisticas()); // Muestra estadísticas de ventas.
                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, "Saliendo del Mini Market");// Muestra un mensaje de salida.
                    System.exit(0);
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Error, debe elegir un número de 1 a 5", "Error", JOptionPane.ERROR_MESSAGE); // Maneja entradas incorrectas.
            }
        } while (true); // Continúa el ciclo hasta que el usuario elija salir (opción 5).


    }
}