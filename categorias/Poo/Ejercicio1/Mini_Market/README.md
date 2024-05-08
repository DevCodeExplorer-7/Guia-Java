## Ejercicio 1 - Máquina de Bebidas

### Nivel de dificultad: Intermedio

El ejercicio se centra en los siguientes aspectos:

- Creación de clases y objetos
- Métodos y atributos
- Entrada y salida de datos
- Gestión de flujos y lógica de negocio

#### Ejercicio

En un minimercado, se necesita desarrollar una aplicación que permita la venta de dos productos: Fanta y Sprite. Para ello, se debe implementar un menú de opciones en la aplicación principal con las siguientes funcionalidades:

1. **Venta de Fanta**: Esta opción permite al usuario ingresar la cantidad de Fanta que desea comprar.

2. **Venta de Sprite**: Similar a la opción anterior, aquí el usuario ingresa la cantidad de Sprite que desea comprar. No es necesario comprar ambos productos.

3. **Total a Pagar**: Calcula el monto total a pagar por la compra. Para ello, se multiplican los precios de los productos por la cantidad comprada. Luego, el sistema muestra el monto total y solicita al usuario que ingrese el pago. Tanto el total a pagar como el pago se envían a un método secundario llamado `calcular_vuelto()`, que calcula el cambio que se debe entregar al cliente.

4. **Estadística de Ventas**: Muestra la cantidad de Fanta y Sprite vendida hasta el momento.

5. **Salir**: Finaliza el programa.

Consideraciones:
- Cada compra se procesa de manera individual, lo que significa que se reinician las cantidades de Fanta y Sprite vendidas después de cada compra.

A continuación, se debe crear una clase llamada `MaquinaBebida` con los siguientes atributos y métodos:

#### Atributos:
- `precio_fanta`: precio de una unidad de Fanta.
- `precio_sprite`: precio de una unidad de Sprite.
- `cantidad_fanta_vendida`: cantidad acumulada de Fanta vendida.
- `cantidad_sprite_vendida`: cantidad acumulada de Sprite vendida.

#### Métodos:
- `constructor()`: Este método actualiza los precios de Fanta y Sprite al crear un objeto de la clase, además de inicializar en cero el resto de los atributos.
- `get_precio_fanta()`: Devuelve el precio de una unidad de Fanta.
- `get_precio_sprite()`: Devuelve el precio de una unidad de Sprite.
- `acumular_venta_fanta(cantidad)`: Este método acumula la cantidad de Fanta vendida, recibiendo esta información desde la aplicación principal.
- `acumular_venta_sprite(cantidad)`: Similar al método anterior, acumula la cantidad de Sprite vendida.
- `mostrar_estadisticas()`: Muestra la cantidad de Fanta y Sprite vendida hasta el momento.






