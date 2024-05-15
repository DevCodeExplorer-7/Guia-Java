# Máquina de Café

Este repositorio contiene un programa que simula una máquina de café, permitiendo a los usuarios comprar café y consultar estadísticas. La simulación se logra a través de un menú de opciones implementado en Java utilizando la biblioteca JOptionPane.

## Dificultad

Este ejercicio es adecuado para personas con conocimientos básicos de programación en Java.

## Contenido de Java

Para abordar este ejercicio, es útil contar con conocimientos sobre los siguientes aspectos de Java:

- **Clases y Objetos**: Debes comprender cómo crear clases en Java y cómo utilizar objetos de esas clases.

- **Atributos y Métodos**: Es importante saber cómo declarar y usar variables de clase (atributos) y funciones de clase (métodos).

- **Entrada y Salida de Datos**: Debes estar familiarizado con la obtención de datos del usuario y la presentación de resultados. En este ejercicio, se utiliza JOptionPane para estas tareas.

- **Inicialización de Atributos**: Aprenderás cómo asignar valores iniciales a los atributos de una clase.

- **Métodos de Acceso (getters)**: Se requiere comprender la creación y el uso de funciones para obtener valores de los atributos.

- **Mensajes y Salida de Resultados**: Debes saber cómo mostrar mensajes y resultados al usuario de manera efectiva.

## Menú de Opciones

El menú de opciones se presenta de la siguiente manera:

1. Venta de Café
   - Café Express
   - Total Venta ($)
   - Cantidad de Café (vta)
   - Salir

## Clase MaquinaCafe

Se ha creado una clase llamada `MaquinaCafe`, que incluye los siguientes atributos y métodos:

### Atributos

- `precio_cafe_express`: Almacena el precio del café express, inicializado en 1500.
- `vta_acum_cafexpress`: Registra el total acumulado de ventas de café express, inicializado en 0.
- `cant_acum_cafexpress`: Lleva un registro de la cantidad acumulada de café express vendido, inicializado en 0.

### Métodos

- `get_precio_cafexpress()`: Permite obtener el precio del café express.
- `acum_vta_cafexpress()`: Actualiza el total de ventas acumuladas de café express.
- `acum_cant_cafexpress()`: Actualiza la cantidad acumulada de café express vendido.
- `mostrar_venta_acum()`: Muestra el total de ventas acumuladas utilizando el atributo `vta_acum_cafexpress`.
- `mostrar_cant_acum()`: Muestra la cantidad acumulada de café express vendido utilizando el atributo `cant_acum_cafexpress`.

## Requerimientos Iniciales

Los atributos de la clase `MaquinaCafe` se inicializan de la siguiente manera:

- `precio_cafe_express` se establece en 1500.
- `vta_acum_cafexpress` se inicia en 0.
- `cant_acum_cafexpress` se inicia en 0.

## Funcionalidad del Menú

- **Opción 1**: Al seleccionar esta opción, el programa solicitará al usuario que ingrese la cantidad de café que desea comprar. Luego, calculará el total de la venta multiplicando la cantidad comprada por el precio del café express utilizando el método `get_precio_cafexpress()`. Posteriormente, actualizará el total de la venta con el método `acum_vta_cafexpress()` y la cantidad de unidades vendidas con el método `acum_cant_cafexpress()`.

- **Opción 2**: Esta opción mostrará el total de ventas acumuladas contenido en el atributo `vta_acum_cafexpress`, utilizando el método `mostrar_venta_acum()`.

- **Opción 3**: Esta opción mostrará la cantidad de cafés vendidos contenida en el atributo `cant_acum_cafexpress`, utilizando el método `mostrar_cant_acum()`.


