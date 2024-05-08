package Ejercicio2.Celular_Prepago;

// Importa la clase Celular y la clase JOptionPane del paquete javax.swing
import javax.swing.*;

// Clase que modela las características y funcionalidades de un teléfono celular
public class Celular {
    // Atributos de la clase Celular
    private double saldoDinero; // Saldo en dinero
    private int cantidadCargaBateria; // Carga de batería en mAh
    private double dineroAcumuladoCargado; // Dinero acumulado cargado
    private int vecesCargadaBateria; // Cantidad de veces que se ha cargado la batería

    // Constructor de la clase Celular
    public Celular() {
        saldoDinero = 5000; // Establece el saldo inicial en $5000
        cantidadCargaBateria = 500; // Establece la carga de batería inicial en 500 mAh
        dineroAcumuladoCargado = 0; // Inicializa el dinero acumulado cargado en 0
        vecesCargadaBateria = 0; // Inicializa la cantidad de veces que se ha cargado la batería en 0
    }

    // Método para realizar una llamada telefónica
    public void realizarLlamada() {
        if (saldoDinero >= 150 && cantidadCargaBateria >= 50) {
            saldoDinero -= 150; // Descuenta $150 del saldo en dinero
            cantidadCargaBateria -= 50; // Descuenta 50 mAh de la carga de batería
            // Muestra un mensaje de confirmación de la llamada y el saldo y carga de batería restantes
            JOptionPane.showMessageDialog(null, "Llamada realizada. Saldo restante: $" + saldoDinero);
            JOptionPane.showMessageDialog(null, "Carga de batería restante: " + cantidadCargaBateria + " mAh");
        } else {
            // Muestra un mensaje si no se puede realizar la llamada debido a saldo o batería insuficientes
            JOptionPane.showMessageDialog(null, "No puedes realizar una llamada. Saldo o batería insuficientes.");
        }
    }

    // Método para recargar dinero en el celular
    public void recargarDinero(double monto) {
        saldoDinero += monto; // Incrementa el saldo en dinero con el monto especificado
        // Muestra un mensaje de confirmación con el saldo actual
        JOptionPane.showMessageDialog(null, "Saldo recargado. Saldo actual: $" + saldoDinero);
    }

    // Método para recargar la batería del celular
    public void recargarBateria() {
        cantidadCargaBateria += 300; // Incrementa la carga de batería en 300 mAh
        // Muestra un mensaje de confirmación con la carga de batería actual
        JOptionPane.showMessageDialog(null, "Batería recargada. Carga actual: " + cantidadCargaBateria + " mAh");
    }

    // Método para acumular el dinero cargado en dineroAcumuladoCargado
    public void acumularDineroCargado(double saldoDinero) {
        dineroAcumuladoCargado += saldoDinero; // Acumula el dinero cargado en dineroAcumuladoCargado
        // Muestra el dinero acumulado cargado
        JOptionPane.showMessageDialog(null, "Dinero acumulado cargado: $" + dineroAcumuladoCargado);
    }

    // Método para acumular la cantidad de veces que se ha cargado la batería
    public void acumularVecesCargadaBateria() {
        vecesCargadaBateria++; // Incrementa la cantidad de veces que se ha cargado la batería
        // Muestra la cantidad de veces que se ha cargado la batería
        JOptionPane.showMessageDialog(null, "Veces que se ha cargado la batería: " + vecesCargadaBateria);
    }

    // Método para mostrar las estadísticas del celular
    public void mostrarEstadisticas() {
        // Muestra en la consola las estadísticas del celular
        System.out.println("Estadísticas del celular:");
        System.out.println("Saldo en dinero: $" + saldoDinero);
        System.out.println("Carga de batería: " + cantidadCargaBateria + " mAh");
        System.out.println("Dinero acumulado cargado: $" + dineroAcumuladoCargado);
        System.out.println("Veces que se ha cargado la batería: " + vecesCargadaBateria);
    }
}
