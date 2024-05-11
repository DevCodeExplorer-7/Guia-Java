package Ejercicio5.Gestion_Inventario;

// Clase Bodega
public class Bodega {

    // Atributos
    private int cant_prod1; // Cantidad del producto 1 en la bodega
    private int cant_prod2; // Cantidad del producto 2 en la bodega

    // Constructor
    public Bodega(int cant_prod1, int cant_prod2) {
        this.cant_prod1 = cant_prod1; // Inicializa la cantidad de producto 1
        this.cant_prod2 = cant_prod2; // Inicializa la cantidad de producto 2
    }

    // Metodos

    // Incrementa la cantidad de producto 1 en la bodega
    public void aumentarProd1(){
        this.cant_prod1++;
        System.out.println("Se aumento el producto 1: " + this.cant_prod1 + " unidades");
    }

    // Incrementa la cantidad de producto 2 en la bodega
    public void aumentarProd2(){
        this.cant_prod2++;
        System.out.println("Se aumento el producto 2: " + this.cant_prod2 + " unidades");
    }

    // Metodo para disminuir la cantidad de producto 1 en la bodega
    public void disminuirProd1(){
        if (this.cant_prod1 > 0){
            this.cant_prod1--;
        }else {
            System.out.println("No se puede disminuir el producto 1: " + this.cant_prod1 + " unidades");
        }
    }

    // Metodo para disminuir la cantidad de producto 2 en la bodega
    public void disminuirProd2(){
        if (this.cant_prod2 > 0){
            this.cant_prod2--;
        }else {
            System.out.println("No se puede disminuir el producto 2: " + this.cant_prod2 + " unidades");
        }
    }

    // Metodo para mostrar el saldo de ambos productos en la bodega
    public void mostrarSaldo(){
        System.out.println("El saldo del producto 1 es: " + this.cant_prod1 + " unidades");
        System.out.println("El saldo del producto 2 es: " + this.cant_prod2 + " unidades");
    }

    // Metodo para mostrar si el stock de los productos es crítico o suficiente
    public void mostrarStockCritico(){
        if(this.cant_prod1 < 10){
            System.out.println("El producto 1 tiene stock crítico: " + this.cant_prod1 + " unidades");
        }else {
            System.out.println("El producto 1 tiene stock suficiente: " + this.cant_prod1 + " unidades");
        }
        if(this.cant_prod2 < 10){
            System.out.println("El producto 2 tiene stock crítico: " + this.cant_prod2 + " unidades");
        }else {
            System.out.println("El producto 2 tiene stock suficiente: " + this.cant_prod2 + " unidades");
        }
    }
}
