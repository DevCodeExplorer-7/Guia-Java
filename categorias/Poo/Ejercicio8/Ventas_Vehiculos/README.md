# Gestión de Ventas de Vehículos

**Dificultad:** Moderada

**Conceptos de Java:**

- **Clases y Objetos:** El ejercicio implica la creación de clases (Vehículo y Caja) y el uso de objetos basados en esas clases.
- **Métodos:** Se utilizan métodos en las clases para llevar a cabo acciones específicas.
- **Atributos:** Las clases contienen atributos para almacenar información importante, como precios y cantidades en stock.
- **Control de Flujo:** El ejercicio implica la creación de un menú con opciones y la necesidad de tomar decisiones basadas en la entrada del usuario.
- **Manejo de Errores:** Se debe controlar el número de intentos de entrada de una clave y manejar posibles errores.
- **Entrada/Salida de Datos:** La aplicación interactúa con el usuario a través de la entrada y salida de datos, como la entrada de claves y la presentación de resultados.
- **Programación Orientada a Objetos (POO):** El ejercicio se basa en la creación de clases y objetos, un concepto fundamental en la programación orientada a objetos.

## Introducción

Hace algunos años, Francisco decidió invertir sus ahorros en un emprendimiento dedicado a la importación y venta de automóviles de última generación. Gracias a su capacidad para obtener modelos antes que las concesionarias más conocidas, su negocio ha experimentado un éxito constante y un crecimiento sostenido. Para mantener y potenciar este éxito, Francisco ha tomado algunas decisiones estratégicas, entre las que se incluyen la venta de vehículos exclusivos, la creación de una aplicación informática para registrar las ventas y mantener un control sobre el inventario. En esta empresa, ha contratado a dos roles fundamentales: Juan, quien se desempeña como Administrador de la aplicación, y Hugo, el Vendedor.

## Requisitos para el Desarrollo de la Aplicación de Ventas

### Autenticación

Cuando se inicie la aplicación, se requerirá el ingreso de una clave de acceso. La aplicación mantendrá registrada la clave "Autos2020" en un método seguro. Si la clave es correcta, se mostrará el menú de Ventas de Vehículos. En caso contrario, se solicitará el ingreso de la clave nuevamente, otorgando al usuario hasta tres intentos de ingreso. En el tercer intento fallido, la aplicación se cerrará.

### Menú de Ventas de Vehículos

La aplicación contendrá un menú de opciones:

1. Consultar Stock
2. Consultar Ventas
3. Realizar Venta
4. Salir

- **Opción 1:** Esta opción mostrará las estadísticas del stock disponible para cada uno de los modelos.
- **Opción 2:** Muestra las estadísticas de ventas acumuladas para cada modelo.
- **Opción 3:** Permite al usuario seleccionar un modelo para comprar, ingresar la cantidad deseada y calcular el valor total de la compra multiplicando el precio del modelo por la cantidad. Posteriormente, se actualizará el stock, la cantidad y el valor de venta.
- **Opción 4:** Permite salir de la aplicación.

### Clase Vehículo

Esta clase contendrá los siguientes atributos:

- Precio del Modelo Uno.
- Precio del Modelo Dos.
- Cantidad en Stock del Modelo Uno.
- Cantidad en Stock del Modelo Dos.

#### Métodos:

- `Constructor`: Inicializa los precios de los vehículos en la creación del objeto en la aplicación principal y establece el stock inicial en 10 unidades para ambos modelos.
- `getPrecioModeloUno`: Devuelve el precio del Modelo Uno.
- `getPrecioModeloDos`: Devuelve el precio del Modelo Dos.
- `rebajarStockModeloUno`: Reduce la cantidad de stock del Modelo Uno.
- `rebajarStockModeloDos`: Reduce la cantidad de stock del Modelo Dos.
- `mostrarEstadísticas`: Muestra el stock actual de ambos modelos de vehículos.

### Clase Caja

En esta clase, se definen los siguientes atributos:

- Cantidad vendida del Modelo Uno.
- Cantidad vendida del Modelo Dos.
- Ventas acumuladas del Modelo Uno.
- Ventas acumuladas del Modelo Dos.

#### Métodos:

- `Constructor`: Inicializa en cero todos los atributos.
- `acumularCantidadModeloUnoVendido`: Incrementa la cantidad vendida del Modelo Uno según la cantidad de vehículos vendidos.
- `acumularCantidadModeloDosVendido`: Incrementa la cantidad vendida del Modelo Dos según la cantidad de vehículos vendidos.
- `acumularVentasModeloUnoVendido`: Incrementa las ventas acumuladas del Modelo Uno según el valor total de las ventas.
- `acumularVentasModeloDosVendido`: Incrementa las ventas acumuladas del Modelo Dos según el valor total de las ventas.
- `mostrarEstadísticas`: Muestra la cantidad de vehículos vendidos para el Modelo Uno y Dos, así como las ventas acumuladas de ambos modelos.


