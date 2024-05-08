package Ejercicio3.Mini_Zoologico;

import javax.swing.*;

public class VentaEntrada {
    public static void main(String[] args) {

        // Creacion de instancias de las clases Caja, Zoologico y Banco
        Caja caja= new Caja();
        Zoologico zoologico= new Zoologico();
        Banco banco= new Banco();

        // Menu de opciones
        String menu= """
                **** Menu de Ventas de Entrada ****
                1. Ventas Boleto Niños
                2. Ventas Boleto Adultos
                3. Ventas Boleto Tercera Edad
                4. Total a Pagar
                5. Estadistica Ventas
                6. Estadistica Asistencia
                7. Salir
                """;

        int opcion;
        int cantBoletosNinos, cantBoletosAdultos, cantBoletosTerceraEdad;
        int totalPagar;

        // Bucle para mostrar el menu de opciones
        do{
            // Mostrar menu de opciones y obtener la opcion seleccionada
            opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));

            // Switch para seleccionar la opcion
            switch (opcion){

                // Caso 1: Registrar asistencia de niños
                case 1:{
                    System.out.println("Ventas Boleto Niños");
                    cantBoletosNinos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de boletos para niños"));
                    zoologico.registrarAsistenciaNino(cantBoletosNinos);
                    System.out.println("Cantidad de boletos para niños: "+ cantBoletosNinos);
                    break;
                }
                // Caso 2: Registrar asistencia de adultos
                case 2:{
                    System.out.println("Ventas Boleto Adultos");
                    cantBoletosAdultos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de boletos para adultos"));
                    zoologico.registrarAsistenciaAdulto(cantBoletosAdultos);
                    System.out.println("Cantidad de boletos para adultos: "+ cantBoletosAdultos);
                    break;
                }
                // Caso 3: Registrar asistencia de tercera edad
                case 3:{
                    System.out.println("Ventas Boleto Tercera Edad");
                    cantBoletosTerceraEdad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de boletos para tercera edad"));
                    zoologico.registrarAsistenciaTerceraEdad(cantBoletosTerceraEdad);
                    System.out.println("Cantidad de boletos para tercera edad: "+ cantBoletosTerceraEdad);
                    break;
                }
                // Caso 4: Calcular total a pagar
                case 4:{
                    System.out.println("Total a Pagar");
                    totalPagar= (caja.getValorEntradaNino()*zoologico.getCantAsistNinos())+
                            (caja.getValorEntradaAdulto()*zoologico.getCantAsistAdultos())+
                            (caja.getValorEntradaTerceraEdad()*zoologico.getCantAsistTerceraEdad());

                    if (totalPagar > 0) {
                        String tipoPago = JOptionPane.showInputDialog("Ingrese tipo de pago");
                        if (tipoPago.equalsIgnoreCase("efectivo")) {
                            System.out.println("Total a pagar: " + totalPagar);
                            int dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dinero"));
                            vuelto(dinero, totalPagar);
                            caja.setCantVendidaNino(zoologico.getCantAsistNinos() * caja.getValorEntradaNino());
                            caja.setCantVendidaAdulto(zoologico.getCantAsistAdultos() * caja.getValorEntradaAdulto());
                            caja.setCantVendidaTerceraEdad(zoologico.getCantAsistTerceraEdad() * caja.getValorEntradaTerceraEdad());


                        } else if (tipoPago.equalsIgnoreCase("tarjeta")) {
                            String numTarjeta = JOptionPane.showInputDialog("Ingrese numero de tarjeta");
                            boolean tipoTarjeta = banco.validarNumTarjeta(numTarjeta);
                            if (tipoTarjeta) {
                                System.out.println("Pago Completado: " + totalPagar);
                                caja.setCantVendidaNino(zoologico.getCantAsistNinos() * caja.getValorEntradaNino());
                                caja.setCantVendidaAdulto(zoologico.getCantAsistAdultos() * caja.getValorEntradaAdulto());
                                caja.setCantVendidaTerceraEdad(zoologico.getCantAsistTerceraEdad() * caja.getValorEntradaTerceraEdad());

                            }else {
                                System.out.println("Tarjeta no valida: " + numTarjeta);
                            }
                        } else {
                            System.out.println("Tipo de pago no valido: "+ tipoPago);
                        }
                    } else {
                        System.out.println("No hay boletos vendidos: "+ totalPagar);
                        break;
                    }
                    break;
                }
                // Caso 5: Mostrar estadisticas de ventas
                case 5:{
                    System.out.println("Estadistica Ventas");
                    System.out.println(caja);
                    break;
                }
                // Caso 6: Mostrar estadisticas de asistencia
                case 6:{
                    System.out.println("Estadistica Asistencia");
                    System.out.println(zoologico);
                    zoologico.reiniciarCantidadAsistentes();
                    break;
                }
                // Caso 7: Salir del programa
                case 7:{
                    JOptionPane.showMessageDialog(null, "Salir del programa de menu de ventas de entrada");
                    System.exit(0);
                }
                // Caso por defecto: Opcion no valida
                default:{
                    JOptionPane.showMessageDialog(null, "Opcion no valida: " + opcion);
                    break;
                }
            }
        }while (true); // Bucle infinito
    }

    // Metodo para calcular el vuelto
    public static void vuelto(int dinero, int totalPagar){
        int vuelto = dinero - totalPagar;
        if (vuelto >= 0) {
            System.out.println("Vuelto: " + vuelto);
            System.out.println("Gracias por su compra");
        } else {
            while (vuelto < 0){
                System.out.println("Dinero insuficiente: " + vuelto);
                System.out.println("Total a pagar: " + totalPagar);
                dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dinero"));
                vuelto = dinero - totalPagar;
                if (vuelto >= 0) {
                    System.out.println("Vuelto: " + vuelto);
                    System.out.println("Gracias por su compra");
                }
            }
        }
    }
}