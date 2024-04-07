# Métodos Numéricos

## Matemáticas Aplicadas y Computación

Este repositorio contiene el proyecto final para la asignatura de Métodos Numéricos I. El proyecto ofrece una biblioteca de algoritmos que se utilizan comúnmente en el campo de las matemáticas numéricas para resolver diferentes tipos de problemas matemáticos.

### Características

El proyecto incluye implementaciones de los siguientes algoritmos y métodos:

#### Solución de Ecuaciones No Lineales

- **Método de Bisección**: Método iterativo para encontrar raíces de polinomios.
- **Método de Falsa Posición**: Variante del método de bisección con convergencia mejorada.
- **Método de Newton (Newton-Raphson)**: Uso de derivadas para la búsqueda de raíces.
- **Método de la Secante**: Similar al método de Newton pero sin requerir el cálculo de derivadas.

#### Sistemas de Ecuaciones Lineales

- **Métodos Exactos**:
  - Inversión de Matrices Particionadas.
  - Método de Gauss-Jordan Particionado.
- **Método de Jacobi**: Método iterativo para resolver sistemas de ecuaciones lineales.
- **Método de Gauss-Seidel**: Mejora del método de Jacobi con una convergencia más rápida.
- **Método de Relajación**: Una variación del método de Gauss-Seidel.

#### Factorización LU

- **Método de Cholesky**: Descomposición para matrices simétricas y definidas positivas.
- **Método de Doolittle**: Factorización LU donde la matriz L (lower) tiene todos sus elementos de la diagonal principal igual a 1.
- **Método de Crout**: Factorización LU donde la matriz U (upper) tiene todos sus elementos de la diagonal principal igual a 1.
# Instalación y Ejecución

Si clonas este proyecto y tratas de ejecutarlo, podrías encontrarte con un error en la clase `evaluarFunciones`

![Ejemplo del error](/src/imagenesReadme/error_orgs.png "Error de org")

Para solucionar este problema, necesitas agregar dos archivos JAR específicos al proyecto. Sigue estos pasos para resolverlo:

1. **Descarga los archivos JAR necesarios:**
   - Descarga `ext-1.1.1.jar` desde [este enlace](http://www.java2s.com/Code/Jar/e/Downloadext111jar.htm).
   - Descarga `jep-2.4.1.jar` desde [este enlace](http://www.java2s.com/Code/Jar/j/Downloadjep241jar.htm).

2. **Añade los archivos JAR al proyecto:**
   - En tu entorno de desarrollo (NetBeans), haz clic derecho en el directorio `Libraries` dentro de tu proyecto.
   - Selecciona `Add Jar/Folder` en el menú contextual.
      ![Ejemplo del error](/src/imagenesReadme/menucontext.png "Error de org")
   - Navega hasta la ubicación donde descargaste los archivos JAR y selecciónalos.
      ![Ejemplo del error](/src/imagenesReadme/addfolder.png "Error de org")
   - Haz clic en `Abrir` o `Aceptar` para añadir los archivos JAR a tu proyecto.



Con estos pasos, deberías haber resuelto el error en la clase `evaluarFunciones` y tu proyecto debería ejecutarse correctamente.

# Ejemplo de uso

Pendiente...
