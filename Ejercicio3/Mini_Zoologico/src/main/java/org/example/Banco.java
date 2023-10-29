package org.example;

// Clase Banco
public class Banco {

    // Atributos
    private final String numTarjeta1;  // Número de tarjeta 1 (constante)
    private final String numTarjeta2;  // Número de tarjeta 2 (constante)

    // Constructor
    public Banco() {
        this.numTarjeta1 = "visa123";   // Asigna un valor inicial a numTarjeta1
        this.numTarjeta2 = "master456"; // Asigna un valor inicial a numTarjeta2
    }

    // Método para validar número de tarjeta
    public boolean validarNumTarjeta(String numTarjeta) {
        if (numTarjeta.equals(numTarjeta1)) {
            System.out.println("Tarjeta valida: " + numTarjeta);
            return true;
        } else if (numTarjeta.equals(numTarjeta2)) {
            System.out.println("Tarjeta valida: " + numTarjeta);
            return true;
        } else {
            System.out.println("Tarjeta no valida: " + numTarjeta);
            return false;
        }
    }
}
