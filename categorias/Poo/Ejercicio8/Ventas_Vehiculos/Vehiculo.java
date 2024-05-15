package Ejercicio8;

public class Vehiculo {

    private int modeloUno;
    private int modeloDos;
    private int cantidadStockModeloUno;
    private int cantidadStockModeloDos;

    public Vehiculo(int modeloUno, int modeloDos, int cantidadStockModeloUno, int cantidadStockModeloDos) {
        this.modeloUno = modeloUno;
        this.modeloDos = modeloDos;
        this.cantidadStockModeloUno = cantidadStockModeloUno;
        this.cantidadStockModeloDos = cantidadStockModeloDos;
    }

    public int getModeloUno() {
        return modeloUno;
    }

    public int getModeloDos() {
        return modeloDos;
    }

    public void rebajarStockModeloUno(int cantidadStockModeloUno) {
        this.cantidadStockModeloUno -= cantidadStockModeloUno;
    }

    public void rebajarStockModeloDos( int cantidadStockModeloDos) {
        this.cantidadStockModeloDos -= cantidadStockModeloDos;
    }

    public void mostrarEstadisticas(){
        System.out.println("cantidad de Stock del Modelo Uno es : " + this.cantidadStockModeloUno);
        System.out.println("Cantidad de Stock del Modelo Dos es : " + this.cantidadStockModeloDos);
    }
}
