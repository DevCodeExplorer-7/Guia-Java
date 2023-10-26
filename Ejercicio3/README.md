# Caso: Mini Zoológico

Este repositorio contiene una aplicación desarrollada en Java que permite a un mini zoológico de la ciudad registrar las ventas diarias de boletos y obtener información estadística sobre los asistentes, así como las ventas totales de boletos. La aplicación utiliza ventanas gráficas JOptionPane y se basa en programación orientada a objetos.

## Requerimientos

### Clases

- `VentaEntradas`
- `Zoologico`
- `Caja`
- `Banco`

### Atributos y Métodos de las Clases

- En la clase `VentaEntradas`, se encuentran los métodos para registrar las ventas y mostrar estadísticas.
- La clase `Caja` se utiliza para realizar cálculos relacionados con las ventas.
- La clase `Banco` se encarga de validar tarjetas de crédito.

## Menú de Opciones

La clase `VentaEntradas` es la aplicación principal y muestra el siguiente menú de opciones:

**Ventas de Entradas**
1. Venta boleto Niños
2. Venta boleto Adulto
3. Venta boleto Adulto Mayor
4. Total a Pagar
5. Estadística Ventas
6. Estadística Asistencia
7. Salir

### Opciones 1, 2, 3

Al seleccionar una de estas opciones, se solicita la cantidad de entradas a comprar para la categoría correspondiente.

### Opción 4

- Esta opción valida que se haya seleccionado al menos una de las opciones 1, 2 o 3.
- Calcula el total a pagar según la categoría de entrada (niño, adulto o adulto mayor).
- Solicita el tipo de pago: "contado" (efectivo) o "tarjeta".
- Si se elige "contado", se ingresa la cantidad de dinero y se muestra el vuelto.
- Se acumulan las ventas en la clase `Caja`.

### Opción 5

- Muestra las ventas del día por tipo de boleto (niños, adultos y adultos mayores) y el monto total vendido.

### Opción 6

- Muestra la cantidad de asistentes al zoológico por categoría y el total de asistentes.

### Opción 7

- Permite salir del menú de opciones y finalizar la ejecución del programa.

## Consideraciones

- Se crean objetos para las clases `Caja`, `Banco` y `Zoologico`.
- Los atributos se inicializan, y los valores predeterminados son:
  - `valor_entrada_niños=2,000`
  - `valor_entrada_adulto=5,000`
  - `valor_entrada_amayor=3,000`
  - `num_tarjeta1="visa123"`
  - `num_tarjeta2="master456"`

