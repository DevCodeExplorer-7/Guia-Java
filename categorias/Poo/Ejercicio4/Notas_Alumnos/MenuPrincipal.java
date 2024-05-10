package Ejercicio4.Notas_Alumnos;

import javax.swing.*;

public class MenuPrincipal {
    public static void main(String[] args) {
        // Crear una instancia de la clase Estudiante
        Estudiante estudiante = new Estudiante();

        // Menú con opciones para el usuario
        String menu = """
                *** Menu Alumnos ***
                
                1.- Ingreso Nota Catedra 1
                2.- Ingreso Nota Catedra 2
                3.- Ingreso Nota Examen
                4.- Calcular Promedio
                5.- Mostrar Datos del Alumno
                6.- Salir
                """;

        int opcion; // Variable para almacenar la opción seleccionada por el usuario

        double notaCatedra1, notaCatedra2, notaExamen; // Variables para almacenar las notas ingresadas por el usuario
        double ponderacion1, ponderacion2, ponderacionExamen; // Variables para almacenar las ponderaciones ingresadas por el usuario

        // Solicitar el nombre del alumno al usuario
        estudiante.setNombre(JOptionPane.showInputDialog("Ingrese nombre del alumno"));

        do {
            // Mostrar el menú y obtener la opción del usuario
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1: {
                    // Ingresar y almacenar la nota de la Cátedra 1
                    notaCatedra1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota catedra 1"));
                    estudiante.setNotaCatedra1(notaCatedra1);
                    System.out.println("La nota de catedra 1 es: " + estudiante.getNotaCatedra1());
                    break;
                }
                case 2: {
                    // Ingresar y almacenar la nota de la Cátedra 2
                    notaCatedra2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota catedra 2"));
                    estudiante.setNotaCatedra2(notaCatedra2);
                    System.out.println("La nota de catedra 2 es: " + estudiante.getNotaCatedra2());
                    break;
                }
                case 3: {
                    // Ingresar y almacenar la nota del Examen
                    notaExamen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota examen"));
                    estudiante.setNotaExamen(notaExamen);
                    System.out.println("La nota de examen es: " + estudiante.getNotaExamen());
                    break;
                }
                case 4: {
                    // Calcular el promedio del alumno
                    JOptionPane.showMessageDialog(null, "Calculando  Promedio");
                    ponderacion1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese ponderacion nota catedra 1"));
                    ponderacion2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese ponderacion nota catedra 2"));
                    ponderacionExamen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese ponderacion nota examen"));
                    estudiante.setPromedio(ponderacion1, ponderacion2, ponderacionExamen);// Calcular el promedio
                    System.out.println("El alumno " + estudiante.getNombre() + " Tiene un promedio de: " + estudiante.getPromedio());
                    break;
                }
                case 5: {
                    // Mostrar los datos del alumno
                    JOptionPane.showMessageDialog(null, "Mostrar Datos del Alumno");
                    System.out.println(estudiante);// Mostrar los datos del alumno
                    break;
                }
                case 6: {
                    // Salir del programa
                    JOptionPane.showMessageDialog(null, "Salir");
                    System.exit(0);
                    break;
                }
                default: {
                    // Opción incorrecta
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta: " + opcion + "\nIntente nuevamente");
                    break;
                }
            }
        } while (true); // Bucle infinito para mantener el programa en ejecución
    }
}
