package Ejercicio7.Tarjeta_Bip;

import javax.swing.*;

// Clase Totem
public class Totem {
    public static void main(String[] args) {
        // Instancia de la clase Bip
        Bip bip = new Bip("123456789", 0);

        // Menu de opciones
        String menu = """
                ***** Menu Totem *****
                1.- Cargar Saldo de la Tarjeta
                2.- Descontar Saldo de la Tarjeta
                3.- Ver Datos de la Tarjeta
                4.- Salir
                """;
        // Variables
        int opcion, monto;
        do {
            // Menu de opciones
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            // Switch de opciones
            switch (opcion) {
                case 1 : {
                    // Cargar saldo
                    JOptionPane.showMessageDialog(null, "Cargando Saldo ");
                    monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a cargar"));
                    bip.cargarSaldo(monto);
                    break;
                }
                case 2 :{
                    // saldo descontado
                    JOptionPane.showMessageDialog(null, "Saldo Descontado");
                    bip.pagar();
                    break;
                }
                case 3: {
                    // Mostrar datos
                    JOptionPane.showMessageDialog(null, "Datos de la tarjeta");
                    bip.mostrarDatos();
                    break;
                }
                case 4: {
                    // Salir
                    JOptionPane.showMessageDialog(null, "Gracias por usar el totem");
                    System.exit(0);
                    break;
                }
                // Opcion no valida
                default: JOptionPane.showMessageDialog(null, "Opción no válida: " + opcion);
            }
        }while (true);
    }
}