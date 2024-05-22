package Ejercicio9.ComisariaVirtual;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComisariaVirtual {

    private final static List<Habitante> habitanteList = new ArrayList<>();
    private final static int[] cantidad = {0,0,0,0,0,0};
    public static void main(String[] args) {
        String menu = """
                ***** Menu de Comisaria Virtual *****
                1- Ingresar solicitud de permiso
                2- Registro personas con multa
                3- Mostrar todos los permisos
                4- Mostrar tipo de permiso ordenado por cantidad
                5- Mostrar todas la personas con 2 permisos
                6- Salir del programa
                """;

        int opcion, identificador;
        String nombre;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    identificador =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su id"));
                    nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                    ingresarSolicitud(identificador, nombre);
                    break;
                case 2:
                    identificador =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su id"));
                    registrarMulta(identificador);
                    break;
                case 3:
                    mostrarPermisos();
                    break;
                case 4:
                    mostrarPermisosPorCantidad();
                    break;
                case 5:
                    mostrarPersonasConDosPermisos();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Salida exitosamente");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida: " + opcion);
            }
        }while (true);
    }


    /**
     * Registra una solicitud de permiso para un habitante.
     *
     * @param id La identificación del habitante.
     * @param nombre El nombre del habitante.
     */
    public static void ingresarSolicitud(int id, String nombre) {
        // Itera sobre la lista de habitantes para encontrar al habitante con la misma identificación.
        for (Habitante habitante : habitanteList) {
            // Si se encuentra un habitante con la misma identificación.
            if (habitante.getIdentificacion() == id) {
                // Verifica si el habitante ya tiene 2 permisos.
                if (habitante.getCantidadPermisos() == 2) {
                    // Si el habitante ya tiene 2 permisos, muestra un mensaje y termina la ejecución del método.
                    System.out.println("No se puede otorgar permiso. La persona ya tiene 2 permisos.");
                    return;
                } else {
                    // Si el habitante tiene menos de 2 permisos, incrementa el contador de permisos del habitante.
                    habitante.setCantidadPermisos(habitante.getCantidadPermisos() + 1);
                    // Incrementa el contador de permisos para este habitante en la lista 'cantidad'.
                    cantidad[habitante.getIdentificacion() - 1]++;
                    // Muestra un mensaje de éxito y termina la ejecución del método.
                    System.out.println("Permiso registrado con éxito.");
                    return;
                }
            }
        }
        // Si no se encontró el habitante con la misma identificación, se crea uno nuevo.
        Habitante habitanteNuevo = new Habitante(id, nombre, 0, 1, 0);
        // Agrega el nuevo habitante a la lista de habitantes.
        habitanteList.add(habitanteNuevo);
        // Incrementa el contador de permisos para este nuevo habitante en la lista 'cantidad'.
        cantidad[0]++;
        // Muestra un mensaje de éxito.
        System.out.println("Permiso registrado con éxito.");
    }


    /**
     * Registra una multa para un habitante específico.
     *
     * @param id La identificación del habitante.
     */
    public static void registrarMulta(int id) {
        String multa;
        // Itera sobre la lista de habitantes para encontrar al habitante con la misma identificación.
        for (Habitante habitante : habitanteList) {
            // Si se encuentra un habitante con la misma identificación.
            if (habitante.getIdentificacion() == id) {
                // Solicita al usuario que ingrese si el habitante tiene multa o no.
                multa = JOptionPane.showInputDialog("¿La persona tiene multa (SI/NO)?: ");
                // Establece la multa del habitante según la entrada del usuario.
                habitante.setMulta(multa.equals("SI") ? 1 : 0);
                // Muestra un mensaje de éxito y termina la ejecución del método.
                System.out.println("Multa registrada con éxito.");
                return;
            }
        }
        // Si no se encontró el habitante con la misma identificación, muestra un mensaje de error.
        System.out.println("No se encontró la persona con esa identificación.");
    }


    /**
     * Muestra todos los permisos registrados para cada habitante.
     */
    private static void mostrarPermisos() {
        // Imprime un encabezado indicando que se van a mostrar todos los permisos.
        System.out.println("\nMostrar todos los permisos");
        // Itera sobre la lista de habitantes para mostrar los permisos de cada uno.
        for (Habitante habitante : habitanteList) {
            // Imprime la identificación del habitante.
            System.out.println("Identificación: " + habitante.getIdentificacion());
            // Imprime el nombre del habitante.
            System.out.println("Nombre: " + habitante.getNombre());
            // Imprime la cantidad de permisos del habitante.
            System.out.println("Cantidad de permisos: " + habitante.getCantidadPermisos());
            // Imprime si el habitante tiene multa o no.
            System.out.println("Multa: " + (habitante.getMulta() == 1 ? "SI" : "NO"));
            // Imprime un salto de línea para separar la información de los diferentes habitantes.
            System.out.println();
        }
    }


    /**
     * Muestra el tipo de permiso ordenado por cantidad de permisos otorgados.
     */
    private static void mostrarPermisosPorCantidad() {
        // Imprime un encabezado indicando que se va a mostrar el tipo de permiso ordenado por cantidad.
        System.out.println("\nMostrar tipo de permiso ordenado por cantidad");

        // Tipos de permisos disponibles.
        String[] tiposPermisos = {"Compra", "Salud", "Funeral", "Citación", "Matrimonio", "Viaje"};

        // Clona el arreglo de la cantidad de permisos para no modificar el original.
        int[] copiaCantidadPermisos = cantidad.clone();

        // Crea una lista para almacenar la cantidad de permisos ordenada.
        ArrayList<Integer> cantidadOrdenada = new ArrayList<>();
        for (int cantidad : copiaCantidadPermisos) {
            cantidadOrdenada.add(cantidad);
        }

        // Ordena la lista de cantidad de permisos en orden descendente.
        Collections.sort(cantidadOrdenada);

        // Itera sobre la lista ordenada de cantidad de permisos.
        for (int i = cantidadOrdenada.size() - 1; i >= 0; i--) {
            // Obtiene la cantidad de permisos en la posición i.
            int cantidad = cantidadOrdenada.get(i);
            // Encuentra el índice del tipo de permiso que corresponde a esta cantidad.
            int index = findIndex(copiaCantidadPermisos, cantidad);
            // Imprime el tipo de permiso y la cantidad de permisos otorgados.
            System.out.println(tiposPermisos[index] + ": " + cantidad);
        }
    }


    /**
     * Encuentra el índice de la primera aparición del valor especificado en el arreglo dado.
     *
     * @param arr El arreglo en el que se busca el valor.
     * @param value El valor que se busca.
     * @return El índice de la primera aparición del valor en el arreglo, o -1 si no se encuentra.
     */
    private static int findIndex(int[] arr, int value) {
        // Itera sobre el arreglo para buscar el valor.
        for (int i = 0; i < arr.length; i++) {
            // Si se encuentra el valor en la posición i, devuelve el índice.
            if (arr[i] == value) {
                return i;
            }
        }
        // Si el valor no se encuentra en el arreglo, devuelve -1.
        return -1;
    }


    /**
     * Muestra todas las personas que tienen exactamente 2 permisos registrados.
     */
    private static void mostrarPersonasConDosPermisos() {
        // Imprime un encabezado indicando que se van a mostrar todas las personas con 2 permisos.
        System.out.println("\nMostrar todas las personas con 2 permisos");

        // Itera sobre la lista de habitantes para encontrar aquellos que tienen exactamente 2 permisos.
        for (Habitante habitante : habitanteList) {
            // Si el habitante tiene exactamente 2 permisos.
            if (habitante.getCantidadPermisos() == 2) {
                // Imprime la identificación del habitante.
                System.out.println("Identificación: " + habitante.getIdentificacion());
                // Imprime el nombre del habitante.
                System.out.println("Nombre: " + habitante.getNombre());
                // Imprime la edad del habitante.
                System.out.println("Edad: " + habitante.getEdad());
                // Imprime la cantidad de permisos del habitante.
                System.out.println("Cantidad de permisos: " + habitante.getCantidadPermisos());
                // Imprime si el habitante tiene multa o no.
                System.out.println("Multa: " + (habitante.getMulta() == 1 ? "SI" : "NO"));
                // Imprime un salto de línea para separar la información de los diferentes habitantes.
                System.out.println();
            }
        }
    }

}
