package Ejercicio8;

import javax.swing.*;

public class VentasVehiculos {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo(1000, 1500,5,5);
        Caja caja = new Caja();
        String menu = """
            ***** Menu de Ventas de Vehiculos *****
            1. Consultar Stock
            2. Consultar Ventas
            3. Realizar Ventas
            4. Salir
            """;
        int opcion,modelo,cantidad,total, n=0;
        String password;

        while (n <= 3){
            password = JOptionPane.showInputDialog("Ingrese su password");
            if (password.equals("Autos2020")){
                do {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                    switch (opcion) {
                        case 1:
                            JOptionPane.showMessageDialog(null,"Mostrando la Estadisticas de Vehiculos");
                            vehiculo.mostrarEstadisticas();
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null,"Mostrando la Ventas de Vehiculos");
                            System.out.println(caja);
                            break;
                        case 3:
                            modelo = modeloVehiculos();
                            if (modelo == 1) {
                                cantidad = cantidadVehiculos();
                                vehiculo.rebajarStockModeloUno(cantidad);
                                total = totalVehiculos(cantidad,vehiculo.getModeloUno());
                                caja.acumularCantidadVendidaModeloUno(cantidad);
                                caja.acumularVentasModeloUno(total);
                            }else if (modelo == 2) {
                                cantidad = cantidadVehiculos();
                                vehiculo.rebajarStockModeloDos(cantidad);
                                total = totalVehiculos(cantidad,vehiculo.getModeloDos());
                                caja.acumularCatidadVendidaModeloDos(cantidad);
                                caja.acumularVentasModeloDos(total);
                            }else {
                                JOptionPane.showMessageDialog(null,"Hubo algun error: " + modelo);
                            }
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null,"Salida exitosamente");
                            System.exit(0);
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida: " + opcion);
                    }
                }while (true);
            }else {
                n +=1;
                System.out.println(n);
                JOptionPane.showMessageDialog(null, "Error Ingrese nuevamente el password");
                if (n == 3) {
                    JOptionPane.showMessageDialog(null, "Le queda un Intento");
                } else if (n > 3) {
                    JOptionPane.showMessageDialog(null, "Muchos Intentos Cuenta Bloqueada");
                    System.exit(0);
                }
            }
        }
    }

    public static int modeloVehiculos(){
        String modeloVehiculo = """
                Modelos de Autos
                1-Modelo uno
                2-Modelo dos
                """;
        int opcion;
        JOptionPane.showMessageDialog(null,"Ingrese un Modelo");
        opcion = Integer.parseInt(JOptionPane.showInputDialog(modeloVehiculo));
        if (opcion < 0){
            JOptionPane.showMessageDialog(null, "Error Ingrese un Modelo");
        }
        return opcion;
    }

    public static int cantidadVehiculos(){
        int cantidad =Integer.parseInt(JOptionPane.showInputDialog("Ingrese una Cantidad de vehiculos "));
        return cantidad;
    }

    public static int totalVehiculos(int cantidad, int precioVehiculo) {
        int total;
        total =(precioVehiculo*cantidad);
        JOptionPane.showMessageDialog(null,"El total es: " + total);
        return total;
    }
}
