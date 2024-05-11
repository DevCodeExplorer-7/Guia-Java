package Ejercicio5.Gestion_Inventario;

import java.util.Scanner;

// clase Principal
public class Main {
    public static void main(String[] args) {

        // Crear una instancia de la clase Bodega con saldo y stock iniciales en 0
        Bodega bodega = new Bodega(0, 0);

        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Menú de opciones
        String menu = """
         *****Programa De Gestion De Bodega*****
        1. Aumentar producto 1 y aumentar producto 2
        2. Disminuir producto 1 y disminuir producto 2
        3. Mostrar saldo
        4. Mostrar stock crítico
        5. Salir
        """;

        int opcion;

        do {
            System.out.println();
            System.out.println(menu); // Mostrar el menú
            System.out.println();
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt(); // Leer la opción ingresada por el usuario
            System.out.println();

            // Manejo de opciones del usuario mediante un switch
            switch (opcion) {
                case 1: {
                    // Aumentar la cantidad de producto 1 y producto 2
                    bodega.aumentarProd1();
                    bodega.aumentarProd2();
                    break;
                }
                case 2: {
                    // Disminuir la cantidad de producto 1 y producto 2
                    bodega.disminuirProd1();
                    bodega.disminuirProd2();
                    break;
                }
                case 3: {
                    // Mostrar el saldo actual
                    bodega.mostrarSaldo();
                    break;
                }
                case 4: {
                    // Mostrar el stock crítico
                    bodega.mostrarStockCritico();
                    break;
                }
                case 5: {
                    // Salir del programa
                    System.out.println("Gracias por usar el programa de gestión de bodega");
                    System.exit(0);
                }
                default: {
                    // Mensaje de opción no válida si el usuario ingresa una opción no reconocida
                    System.out.println("Opción no válida: " + opcion + "\n");
                }
            }
        } while (true); // Bucle infinito para mantener el menú activo
    }
}
