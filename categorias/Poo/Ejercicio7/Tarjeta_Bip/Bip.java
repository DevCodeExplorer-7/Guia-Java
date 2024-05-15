package Ejercicio7.Tarjeta_Bip;

import javax.swing.*;

// Clase Bip
public class Bip {
    // Atributos
    protected String codigoTarjeta;
    protected int saldo;

    // Constructor
    public Bip(String codigoTarjeta, int saldo) {
        this.codigoTarjeta = codigoTarjeta;
        this.saldo = saldo;
    }

    // Metodos

    // metodo cargar saldo
    public void cargarSaldo(int monto) {
        if (monto > 0) {
            JOptionPane.showMessageDialog(null, "Saldo cargado: " + monto);
            this.saldo += monto;
        } else {
            JOptionPane.showMessageDialog(null, "El monto debe ser mayor a 0");
        }
    }

    // metodo pagar
    public void pagar() {
        int saldoLimite = this.saldo -= 790;
        if (saldoLimite == -1580) {
            JOptionPane.showMessageDialog(null, "El saldo a superado el limite, no se puede pagar");
        }else {
            JOptionPane.showMessageDialog(null, "Saldo descontado: " + 790);
        }
    }

    // metodo mostrar datos
    public void mostrarDatos(){
        System.out.println("Codigo Tarjeta: " + this.codigoTarjeta);
        System.out.println("Saldo: " + this.saldo);
    }

}
