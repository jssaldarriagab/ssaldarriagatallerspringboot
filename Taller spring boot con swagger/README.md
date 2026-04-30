# C2 Taller Basico de Spring Boot

Este repositorio contiene la solucion completa a los 10 proyectos del C2 Taller Basico de Spring Boot.

## Informacion Academica
- **Universidad:** Universidad Distrital Francisco Jose de Caldas
- **Curso:** Programacion por Componentes
- **Profesor:** Noe Arcos Muzos
- **Estudiante:** Jhoan Sebastian Saldarriaga Bello

---

## Proyectos incluidos y Endpoints Swagger

Cada uno de los 10 proyectos funciona como un microservicio independiente. A continuacion, un resumen de la funcionalidad de cada uno, incluyendo la ruta directa para acceder a su documentacion Swagger UI (Asegurate de iniciar el proyecto antes de abrir el enlace).

### 1. jss-usuarios (Gestion de usuarios simples)
- **Funcionalidad:** API REST para creacion, listado y eliminacion de usuarios.
- **Ruta Swagger:** http://localhost:8080/jssb-usuarios/swagger-ui/index.html

### 2. jss-temperaturas (Conversor de temperaturas)
- **Funcionalidad:** Convierte valores entre grados Celsius, Fahrenheit y Kelvin.
- **Ruta Swagger:** http://localhost:8081/jss-temperaturas/swagger-ui/index.html

### 3. jss-calculadora (Calculadora basica)
- **Funcionalidad:** Realiza operaciones matematicas basicas (sumar, restar, multiplicar, dividir).
- **Ruta Swagger:** http://localhost:8082/jss-calculadora/swagger-ui/index.html

### 4. jss-productos (Gestor de productos)
- **Funcionalidad:** Rutas CRUD para la gestion de inventario y productos.
- **Ruta Swagger:** http://localhost:8083/jss-productos/swagger-ui/index.html

### 5. jss-tareas (To-Do List)
- **Funcionalidad:** Creacion, listado y gestion del estado de tareas pendientes.
- **Ruta Swagger:** http://localhost:8084/jss-tareas/swagger-ui/index.html

### 6. jss-saludo (Saludo personalizado)
- **Funcionalidad:** Endpoint basico que retorna un mensaje de saludo dinamico.
- **Ruta Swagger:** http://localhost:8085/jss-saludo/swagger-ui/index.html

### 7. jss-moneda (Conversor de divisas)
- **Funcionalidad:** Convierte valores numericos entre diferentes tipos de moneda.
- **Ruta Swagger:** http://localhost:8086/jss-moneda/swagger-ui/index.html

### 8. jss-edad (Validador de edad)
- **Funcionalidad:** Verifica si una persona es mayor de edad segun su ano de nacimiento.
- **Ruta Swagger:** http://localhost:8087/jss-edad/swagger-ui/index.html

### 9. jss-libros (Gestor de biblioteca)
- **Funcionalidad:** Sistema CRUD para agregar y buscar libros en una biblioteca virtual.
- **Ruta Swagger:** http://localhost:8088/jss-libros/swagger-ui/index.html

### 10. jss-mensajes (Generador de mensajes motivacionales)
- **Funcionalidad:** Retorna una frase aleatoria para la motivacion diaria.
- **Ruta Swagger:** http://localhost:8089/jss-mensajes/swagger-ui/index.html

---

## Documentacion con Swagger (OpenAPI)

De acuerdo al punto 5 del taller, se ha integrado la dependencia springdoc-openapi-starter-webmvc-ui (version 2.8.5) en todos los archivos pom.xml.
Al acceder a las rutas proporcionadas en la seccion anterior, encontraras la interfaz interactiva de Swagger UI. Desde alli podras ver todos los controladores detectados por Spring Boot y probar cada uno de los endpoints de manera grafica y en tiempo real.
