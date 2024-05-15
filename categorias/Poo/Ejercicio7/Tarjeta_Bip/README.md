# Descripción del Ejercicio

Este proyecto se centra en la creación de dos clases: `Bip` y `Totem`, que permiten gestionar una tarjeta de transporte, simbolizada por la tarjeta "Bip" utilizada en Santiago, Chile. La clase `Bip` gestiona la información de la tarjeta, mientras que la clase `Totem` se encarga de interactuar con el usuario para realizar operaciones en la tarjeta.

## Nivel de Dificultad

El ejercicio se clasifica como de nivel intermedio en programación Java y abarca los siguientes conceptos:

- Clases y Objetos
- Encapsulación
- Constructores
- Métodos
- Lógica de Negocio
- Interacción con el Usuario
- Conceptos de Programación Orientada a Objetos (POO)

## Clase Bip

### Atributos

- `codigo_tarjeta` (protegido)
- `saldo` (protegido)

Estos atributos se protegen para evitar el acceso directo desde fuera de la clase. Además, se ha implementado un método constructor que permite inicializar el código y el saldo de la tarjeta al crear un objeto.

### Métodos

- `Carga()`: Suma una cantidad recibida al saldo de la tarjeta. No se realiza ninguna acción si la cantidad es negativa o cero.

- `Pago()`: Resta $790 del saldo cada vez que se ejecuta este método. Si después de restar $790 el saldo se vuelve negativo, se permite un saldo negativo, pero no se permitirá que supere los $1.580 en negativo en la tarjeta.

- `mostrarSaldo()`: Muestra el código de la tarjeta y su saldo actual.

## Clase Totem

La clase `Totem` es la clase principal del proyecto y permite al usuario realizar las siguientes operaciones:

- Cargar saldo en la tarjeta.
- Realizar pagos con la tarjeta.
- Ver los datos de la tarjeta, incluyendo el código y el saldo actual.

### Consideraciones

El código de la tarjeta y el saldo son generados por el usuario. Se utiliza un menú de opciones para interactuar con el usuario, el cual puede ser implementado a través de ventanas gráficas (JOptionPane) o mediante la consola de salida (ventana Output).

