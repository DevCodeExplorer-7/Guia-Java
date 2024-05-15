package Ejercicio6.Maquina_Cafe;

import javax.swing.*;

// Clase Main que contiene el menu de la maquina de cafe
public class Main {
    public static void main(String[] args) {
        // Menu de la maquina de cafe
        String menu = """
                ***** Maquina de Cafe *****
                1.- Cafe Express
                2.- Total Venta ($)
                3.- Cantidad de Cafe(vta)
                4.- Salir
                """;

        // Instancia de la clase MaquinaCafe
        MaquinaCafe maquinaCafe = new MaquinaCafe(1500,0,0);

        int opcion, cantidaCafe, totalVenta;// Variables para el menu

        // Ciclo do-while para el menu
        do {
            // Se muestra el menu y se pide la opcion
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1: {
                    // Se pide la cantidad de cafe y se calcula el total de la venta. se guarda en las variables de la clase MaquinaCafe
                    JOptionPane.showMessageDialog(null, "Cafe Express");
                    cantidaCafe = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de cafe"));
                    totalVenta = (maquinaCafe.getPrecio_cafe_express() * cantidaCafe);
                    maquinaCafe.setVta_acum_cafexpress(totalVenta);
                    maquinaCafe.setCant_acum_cafexpress(cantidaCafe);
                    break;
                }
                case 2: {
                    // Se muestra el total de la venta
                    JOptionPane.showMessageDialog(null, "Total Venta ($)");
                    maquinaCafe.mostrarVentaAcum();
                    break;
                }
                case 3: {
                    // Se muestra la cantidad de cafe
                    JOptionPane.showMessageDialog(null, "Cantidad de Cafe(vta)");
                    maquinaCafe.mostrarCantAcum();
                    break;
                }
                case 4: {
                    // Se sale de la maquina de cafe
                    JOptionPane.showMessageDialog(null, "Saliendo de la maquina de cafe");
                    System.exit(0);
                    break;
                }
                default:
                    // Se muestra un mensaje de error si la opcion no es valida
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }while (true);// Se repite el ciclo hasta que se elija la opcion 4
    }
}