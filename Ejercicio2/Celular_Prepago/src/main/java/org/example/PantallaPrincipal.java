package org.example;

// Importa la clase Celular y la clase JOptionPane del paquete javax.swing
import javax.swing.*;

public class PantallaPrincipal {
    public static void main(String[] args) {
        // Crea una instancia de la clase Celular
        Celular celular = new Celular();

        // Define un menú en formato de cadena multilinea
        String menu = """
                *****Menu Celular*****
                1-LLamada Telefonica
                2-Cargar Dinero al Celular
                3-Cargar Bateria al Celular
                4-Mostrar Estadisticas
                5-Salir
                """;

        int opcion; // Almacena la opción seleccionada por el usuario
        int cargarCelular; // Almacena el monto a cargar en el celular

        // Inicia un bucle que se ejecutará indefinidamente hasta que el usuario elija salir
        do {
            // Muestra el menú y recoge la opción del usuario como una cadena, luego la convierte a un entero
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            // Evalúa la opción seleccionada por el usuario
            switch (opcion) {
                case 1:
                    // Realiza una llamada telefónica y actualiza el estado del celular
                    celular.realizarLlamada();
                    break;
                case 2:
                    // Solicita al usuario que ingrese la cantidad de dinero a cargar en el celular
                    cargarCelular = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a cargar"));

                    // Realiza la recarga de dinero en el celular y actualiza el dinero acumulado cargado
                    celular.recargarDinero(cargarCelular);
                    celular.acumularDineroCargado(cargarCelular);
                    break;
                case 3:
                    // Recarga la batería del celular y registra esta acción
                    celular.recargarBateria();
                    celular.acumularVecesCargadaBateria();
                    break;
                case 4:
                    // Muestra las estadísticas del celular
                    celular.mostrarEstadisticas();
                    break;
                case 5:
                    // Muestra un mensaje de despedida y sale del programa
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa, saliendo...");
                    System.exit(0);
                    break;
                default:
                    // Muestra un mensaje de error si la opción no es válida
                    JOptionPane.showMessageDialog(null, "Opción no válida, debe ser entre 1 y 5");
            }
        } while (true); // El bucle se ejecuta indefinidamente
    }
}