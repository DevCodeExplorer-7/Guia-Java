# Ejercicio de Gestión de Inventario

## Descripción

El ejercicio de gestión de inventario se trata de una aplicación que utiliza la clase "Bodega" para gestionar el inventario de dos productos. La clase Bodega contiene atributos y métodos que permiten realizar operaciones de aumento y disminución de unidades de los productos, así como mostrar el saldo y detectar productos en stock crítico.

## Nivel de Dificultad

- **Nivel de Dificultad**: Fácil

## Conceptos Cubiertos

Este ejercicio cubre los siguientes conceptos:

- Creación y uso de clases.
- Métodos para modificar atributos de una clase.
- Inicialización de atributos en una clase.
- Uso de estructuras condicionales para detectar stock crítico.
- Implementación de un menú de opciones en una aplicación principal.

## Clase Bodega

La clase Bodega representa un sistema de gestión de inventario con los siguientes atributos y métodos:

### Atributos:
- `cant_prod1` (entero): Cantidad disponible del producto 1 en la bodega.
- `cant_prod2` (entero): Cantidad disponible del producto 2 en la bodega.

### Métodos:
- `aumentarProd1()`: Incrementa la cantidad de producto 1 en la bodega.
- `aumentarProd2()`: Incrementa la cantidad de producto 2 en la bodega.
- `disminuirProd1()`: Reduce la cantidad de producto 1 en la bodega.
- `disminuirProd2()`: Reduce la cantidad de producto 2 en la bodega.
- `mostrarSaldo()`: Muestra el saldo actual de ambos productos en la bodega.
- `mostrarStockCritico()`: Identifica y muestra los productos que están bajo stock crítico (menos de 10 unidades).

## Aplicación Principal

En la aplicación principal, se ha implementado un menú de opciones que permite realizar las siguientes acciones:

1. **Ingresar unidades a ambos productos**: Permite aumentar la cantidad de unidades disponibles para los productos en la bodega.
2. **Disminuir unidades de ambos productos**: Permite reducir la cantidad de unidades disponibles para los productos en la bodega.
3. **Mostrar el saldo de ambos productos**: Proporciona una vista rápida del saldo actual de los productos en la bodega.
4. **Mostrar productos bajo stock crítico**: Identifica y muestra los productos que están por debajo de la cantidad mínima de 10 unidades, lo que se considera como stock crítico.

### Consideraciones Importantes
- Los atributos `cant_prod1` y `cant_prod2` se inicializan en cero al iniciar el programa.

