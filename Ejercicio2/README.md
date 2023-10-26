# Aplicación de Celular Prepago

## Dificultad: Principiante

### Conceptos Involucrados:
- Programación Orientada a Objetos
- Clases
- Atributos
- Métodos
- Interacción con el usuario
- Control de flujo

Esta aplicación Java te permite administrar y recargar un teléfono celular prepago de acuerdo a las siguientes opciones del menú:

1. **Llamada Telefónica**
2. **Recargar Dinero al Celular**
3. **Recargar Batería del Celular**
4. **Mostrar Estadísticas del Celular**
5. **Salir**

La aplicación incluye una clase secundaria llamada `Celular`, que modela las características y funcionalidades del teléfono celular. A continuación, se describen los atributos y métodos de la clase `Celular`:

### Atributos

- `saldoDinero`: Representa el saldo en dinero del celular.
- `cantidadCargaBateria`: Representa la cantidad de carga de la batería en miliamperios (mAh).
- `dineroAcumuladoCargado`: Registra la cantidad de dinero acumulado cargado al celular.
- `vecesCargadaBateria`: Lleva un registro de la cantidad de veces que se ha cargado la batería del celular.

### Métodos

- `realizarLlamada()`: Descuenta $150 del saldo en dinero del celular y 50 mAh de la carga de batería.
- `recargarDinero(double monto)`: Permite cargar dinero en el celular sumando el monto especificado al saldo. Registra el monto en `dineroAcumuladoCargado`.
- `recargarBatería()`: Incrementa la carga de batería en 300 mAh y registra una nueva carga en `vecesCargadaBateria`.
- `acumularDineroCargado()`: Registra el dinero cargado en `dineroAcumuladoCargado`.
- `acumularVecesCargadaBatería()`: Registra una nueva carga de batería en `vecesCargadaBateria`.
- `mostrarEstadísticas()`: Muestra las estadísticas del celular, incluyendo el saldo en dinero, la carga de batería, el dinero acumulado cargado y la cantidad de veces que se ha cargado la batería.

### Consideraciones

- El saldo inicial del celular es de $5,000.
- La carga de batería inicial es de 500 mAh.
- Los otros atributos se inicializan en cero.

## Uso de la Aplicación

- Al seleccionar la **opción 1**, se utiliza el método `realizarLlamada()` para efectuar una llamada telefónica y actualizar los valores.
- Al seleccionar la **opción 2**, se permite al usuario ingresar el monto a cargar en el celular y se emplea el método `recargarDinero()` para realizar la carga.
- Al seleccionar la **opción 3**, se utiliza el método `recargarBatería()` para cargar la batería del celular.
- Al seleccionar la **opción 4**, se muestra un resumen de las estadísticas del celular.
- Al seleccionar la **opción 5**, la aplicación se cierra.






