# Aplicación para el Registro de Permisos en Cuarentena

**Dificultad:** Moderada

**Conceptos de Java involucrados:**
- Clases y Objetos: Crear estructuras de datos y trabajar con ellas.
- Herencia: Compartir atributos y métodos entre clases.
- ArrayList: Usar una lista dinámica para almacenar datos.
- Estructuras de Control: Tomar decisiones y repetir acciones.
- Ordenamiento: Clasificar datos en un cierto orden.
- Validación: Comprobar que los datos ingresados sean válidos.

La Subsecretaría de Prevención del Delito requiere que desarrolles una aplicación principal que permita registrar los permisos temporales durante la cuarentena en Santiago. Para cumplir con este objetivo, han proporcionado un conjunto de requerimientos que debes implementar en la aplicación. A continuación, detallo los requisitos:

## Requerimientos

1. **Clase Persona**
   - Debes crear una clase llamada "Persona" con los siguientes atributos:
     - Identificación
     - Nombre

     1.1. La clase debe incluir un método constructor que inicialice los atributos mencionados anteriormente.

     1.2. Debes implementar métodos "get" para obtener la información de la identificación y el nombre por separado.

2. **Clase Habitante**
   - Crea la clase "Habitante" que hereda de la clase "Persona" sus atributos y métodos. La clase "Habitante" debe agregar los siguientes atributos:
     - Edad
     - Cantidad de Permisos
     - Multa

     2.1. La clase "Habitante" debe tener un método constructor que inicialice sus atributos y los heredados de la clase "Persona".

     2.2. Implementa métodos "get" y "set" para cumplir con los requerimientos de la Subsecretaría de Prevención del Delito.

     2.3. Agrega un método que muestre información de los habitantes con permisos, mostrando todos los detalles.

3. **Menú de Opciones**
   - La aplicación principal debe incluir un menú de opciones que permita:

     3.1. **Comisaría Virtual**
     - 1. Ingresar solicitud de permiso
     - 2. Registrar personas con multa
     - 3. Mostrar todos los permisos
     - 4. Mostrar tipo de permiso ordenado por cantidad
     - 5. Mostrar todas las personas con 2 permisos
     - 6. Salir

     3.2. **Detalles de las Opciones**
     - **Opción 1:** Permite ingresar los datos de las personas que solicitan permisos. El atributo de identificación debe ser un número entero positivo. Se ingresan todos los datos, excepto el atributo "multa". Debes considerar que cada vez que una persona solicite un permiso, debes verificar que no tenga solicitados 2 permisos. Si tiene 0 o 1 permiso, se debe sumar 1 a este atributo y contabilizar según el tipo de permiso en el arreglo "cantidad". Si tiene dos permisos, se debe mostrar un mensaje que diga "No se puede otorgar permiso". Debes utilizar ArrayList para registrar los ingresos de las personas a medida que se ejecuta esta opción.
     - **Opción 2:** Permite ingresar la identificación de la persona y luego muestra todos sus datos. Si el atributo "multa" está vacío o tiene el valor "NO", se debe ingresar "SI", lo que corresponde a haber cursado una multa a la persona.
     - **Opción 3:** Muestra todos los permisos solicitados con todos los atributos.
     - **Opción 4:** Muestra el tipo de permiso ordenado por cantidad de permisos en forma ascendente, es decir, de mayor a menor. Esta información debe ser procesada desde los arreglos "cantidad" y "permiso".
     - **Opción 5:** Muestra todas las personas que han solicitado dos permisos.
     - **Opción 6:** Permite salir de la aplicación.

4. **Arreglos**
   - Crear dos arreglos en la aplicación principal con el siguiente detalle:

   | Permiso    | Compra | Salud | Funeral | Citación | Matrimonio | Viaje |
   |------------|--------|-------|---------|----------|------------|-------|
   | Cantidad   |   0    |   0   |    0    |    0     |     0      |   0   |


