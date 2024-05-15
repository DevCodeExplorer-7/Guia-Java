package Ejercicio8;

public class Caja {

    private int cantidadVendidaModeloUno;
    private int cantidadVendidaModeloDos;
    private int ventasAcumuladasModeloUno;
    private int ventasAcumuladasModeloDos;

    public Caja() {
        this.cantidadVendidaModeloUno = 0;
        this.cantidadVendidaModeloDos = 0;
        this.ventasAcumuladasModeloUno = 0;
        this.ventasAcumuladasModeloDos = 0;
    }

    public void acumularCantidadVendidaModeloUno(int cantidadVendidaModeloUno) {
        this.cantidadVendidaModeloUno += cantidadVendidaModeloUno;
    }

    public void acumularCatidadVendidaModeloDos(int catidadVendidaModeloDos) {
        this.cantidadVendidaModeloDos += catidadVendidaModeloDos;
    }

    public void acumularVentasModeloUno(int ventasModeloUnoVentas) {
        this.ventasAcumuladasModeloUno += ventasModeloUnoVentas;
    }

    public void acumularVentasModeloDos(int ventasModeloDosVentas) {
        this.ventasAcumuladasModeloDos += ventasModeloDosVentas;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "cantidadVendidaModeloUno=" + cantidadVendidaModeloUno +
                ", cantidadVendidaModeloDos=" + cantidadVendidaModeloDos +
                ", ventasAcumuladasModeloUno=" + ventasAcumuladasModeloUno +
                ", ventasAcumuladasModeloDos=" + ventasAcumuladasModeloDos +
                '}';
    }
}
