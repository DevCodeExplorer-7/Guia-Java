# Ejercicio de Gestión de Notas para Alumnos

Este repositorio alberga una aplicación principal que permite a los usuarios interactuar con un menú de opciones relacionado con la gestión de notas de un estudiante. La aplicación se centra en la clase llamada `Estudiante`, que incluye los atributos y métodos necesarios para llevar a cabo las siguientes funcionalidades:

## Nivel de Dificultad

Este ejercicio se considera de nivel intermedio en términos de programación y lógica de programación. Contiene una variedad de conceptos y funcionalidades comunes en la programación, como la creación de una interfaz de usuario de consola, la gestión de datos de un objeto, cálculos de promedios ponderados y validaciones de entrada de datos.

## Uso de Conceptos Clave

Este ejercicio abarca una serie de conceptos clave de la programación, incluyendo:

- Clases y Objetos
- Interfaz de Usuario de Consola
- Cálculo de Promedio Ponderado
- Validación de Entrada de Datos
- Estructuras de Control (bucles y condicionales)


## Menú Alumno

La aplicación ofrece las siguientes opciones en el menú:

1. **Ingreso Nota Cátedra 1**: Permite al usuario ingresar la nota correspondiente a la Cátedra 1.

2. **Ingreso Nota Cátedra 2**: Permite al usuario ingresar la nota correspondiente a la Cátedra 2.

3. **Ingreso Nota Examen**: Permite al usuario ingresar la nota correspondiente al Examen.

4. **Calcular Promedio**: Calcula el promedio ponderado de las notas ingresadas por el usuario. El usuario debe proporcionar las ponderaciones correspondientes para cada evaluación. El cálculo se basa en las notas previamente ingresadas y el resultado se almacena en el atributo correspondiente del objeto `Estudiante`.

5. **Mostrar Datos del Alumno**: Muestra por pantalla toda la información del alumno, incluyendo su Nombre, Nota Cátedra 1, Nota Cátedra 2, Nota Examen y Promedio.

6. **Salir**: Permite al usuario salir de la aplicación.

## Clase Estudiante

La clase `Estudiante` se ha diseñado con los siguientes atributos y métodos para cumplir con las funcionalidades mencionadas:

- **Atributos**:
  - Nombre del estudiante
  - Nota Cátedra 1
  - Nota Cátedra 2
  - Nota Examen
  - Promedio

- **Métodos**:
  - Métodos de ingreso de notas para Cátedra 1, Cátedra 2 y Examen
  - Método para calcular el promedio ponderado
  - Método para mostrar toda la información del alumno

## Validaciones

Se han implementado las siguientes validaciones:

a) Cuando se selecciona la opción 4, la aplicación valida que se hayan ingresado las 3 evaluaciones (Cátedra 1, Cátedra 2 y Examen).

b) Para el ingreso de las ponderaciones en la opción 4, se realiza una validación para asegurar que la suma de las ponderaciones sea igual al 100%. Se ha construido un método secundario para realizar esta validación.


¡Gracias por explorar este repositorio! Siéntete libre de contribuir, realizar sugerencias o utilizar esta aplicación para gestionar las notas de los estudiantes.

