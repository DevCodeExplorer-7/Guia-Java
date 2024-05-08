# Caso: Mini Zoológico

Este repositorio contiene una aplicación desarrollada en Java que permite a un mini zoológico de la ciudad registrar las ventas diarias de boletos y obtener información estadística sobre los asistentes, así como las ventas totales de boletos. La aplicación utiliza ventanas gráficas JOptionPane y se basa en programación orientada a objetos.

**Dificultad**: Intermedia 
- Programación Orientada a Objetos (POO)
- Interfaz Gráfica de Usuario (GUI)
- Estructuras de Control
- Manejo de Excepciones

**Contenido de Java**:
- Clases y Objetos
- Herencia
- Encapsulación
- Interfaz Gráfica de Usuario (GUI)
- Entrada/Salida
- Estructuras de Control
- Manejo de Excepciones
- Métodos y Funciones


## Requerimientos

**Clase `VentaEntradas`**:
- Métodos:
    - `main()`: La aplicación principal que muestra un menú de opciones para la gestión de ventas de boletos.
    - `darVuelto()`: metodo para dar vuelto.

**Clase `Zoologico`**:
- Atributos:
  - `cant_asist_niños`
  - `cant_asist_adultos`
  - `cant_asist_amayor`
  - `valor_entrada_niños`
  - `valor_entrada_adultos`
  - `valor_entrada_amayor`

- Métodos:
  - `act_cant_asist_niños()`
  - `act_cant_asist_adultos()`
  - `act_cant_asist_amayor()`
  - `mostar_estadistica_asistencia()`

**Clase `Banco`**:
- Atributos:
  - `num_tarjeta1`
  - `num_tarjeta2`

- Métodos:
  - `validarNumTarjeta()`

**Clase `Caja`**:
- Atributos:
  - `vta_Acum_niños`
  - `vta_Acum_adultos`
  - `vta_Acum_amayor`

- Métodos:
  - `act_vtas_acum_niños()`
  - `act_vtas_acum_adultos()`
  - `act_vtas_acum_amayor()`
  - `obtener_valor_entrada_niños()`
  - `obtener_valor_entrada_adultos()`
  - `obtener_valor_entrada_amayor()`
  - `mostrar_estadistica_ventas()`



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

