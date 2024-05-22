## Ejercicio 10 - Caso Bono

### Nivel de dificultad: Intermedio

El ejercicio se centra en los siguientes aspectos:

- Creación de clases y objetos
- Métodos y atributos
- Entrada y salida de datos
- Gestión de flujos y lógica de negocio

#### Ejercicio

El gobierno entregara un bono a un grupo de 10 personas beneficiadas con esta ayuda, para tal efecto cuenta con un arreglo que contiene los puntajes socioeconómicos de las beneficiarios:

 En la aplicación principal debe crear el siguiente menú de opciones:
 - int puntaje[]={200,350,115,320,280,175,300,175,260,180};

1. **Opción 1 Ingresar la solicitud de bono**: El beneficiario ingresara su ID(número entero entre el 1 y el 10), y su nombre, por cada ingreso se debe instanciar la clase Beneficiario.

2. **Opción 2 Asignar Bono**: Asignar bono a cada Beneficiario de acuerdo con el puntaje, si puntaje es menor a 200, crear y utilizar la función azar para que genere el monto igual o superior a 50000 + 30000 adicionales
Si puntaje es mayor o igual a 200 sólo el monto calculado por la función azar, guardar el puntaje y el monto del bono en cada Beneficiario.

3. **Opción 3 Mostrar Informacion**: Mostrar la información ordenada por monto del bono asignado a los Beneficiarios (mostrar ID, nombre, puntaje y bono)

4. **Opción 4 Generar Archivo**: Generar un archivo de texto con toda la información de los Beneficiario.

5. **Salir**: Finaliza el programa.

Consideraciones:
- 
A continuación, se debe crear una clase llamada `Beneficiario` con los siguientes atributos y métodos:

#### Atributos:
- `id`: identificador.
- `nombre`: nombre.
- `puntaje`: puntuje del beneficio.
- `bono`: bono obtenido.

#### Métodos:
- `constructor()`: Un método constructor que permita inicializar los atributos cuando se ingrese la información de las personas de la opción 1.
- `set o getter`: según se necesite
