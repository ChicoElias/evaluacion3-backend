# 🌐 NexusHub Backend — API Market Manager  
Microservicio Java Spring Boot con base de datos H2 en memoria, diseñado para complementar la aplicación móvil **API Market Manager (NexusHub Enterprise)**.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/H2_Database-001A6E?logo=databricks&logoColor=white" />
  <img src="https://img.shields.io/badge/REST_API-02569B?logo=apachespark&logoColor=white" />
</p>

---

## 📌 Descripción  
Este repositorio contiene el **microservicio backend** del proyecto *API Market Manager*.  
Su propósito principal es cumplir el requerimiento académico de exponer servicios propios y demostrar arquitectura híbrida junto al frontend Android (Firebase + Spring Boot).

El backend funciona de manera **independiente**, **stateless** y con **H2 en memoria**, por lo que se ejecuta sin configuraciones adicionales.

---

## ✨ Características Principales

- ⚙️ **REST API** para entidades del proyecto (ventas, clientes, productos).  
- 🗄️ **Base de datos H2 en memoria** (modo académico, sin instalación extra).  
- 🚀 **Spring Boot 3.x** (estructura moderna y ligera).  
- 🔁 **Endpoints JSON listos para ser consumidos** desde cualquier cliente.  
- 🧪 **Colección de pruebas con Postman (opcional)**.  
- 🧱 **Arquitectura modular**: Controller → Service → Repository.

---

## 🏗️ Tecnologías Utilizadas

| Componente | Tecnología |
|-----------|------------|
| Lenguaje | Java 17 |
| Framework | Spring Boot 3.x |
| Base de Datos | H2 (In-Memory) |
| Build Tool | Maven |
| API Layer | Spring Web (REST) |

---

## 📂 Estructura del Proyecto

/src
/main
/java
/com.nexushub.backend
/controller
/service
/repository
/model
/resources
application.properties

yaml
Copy code

---

## ▶️ Cómo Ejecutar el Proyecto

### **1. Clonar el repositorio**
bash
git clone https://github.com/ChicoElias/evaluacion3-backend.git
2. Ejecutar con Maven
bash
Copy code
mvn spring-boot:run
3. Acceder a la aplicación
API Base URL: http://localhost:8080

Consola H2: http://localhost:8080/h2-console

Credenciales H2 por defecto

yaml
Copy code
JDBC URL: jdbc:h2:mem:testdb
Usuario: sa
Clave: (vacío)
🧪 Endpoints de Ejemplo
bash
Copy code
GET    /api/clientes
POST   /api/clientes
GET    /api/ventas
POST   /api/ventas
DELETE /api/ventas/{id}
Nota: La app Android utiliza Firebase como fuente principal.
Este backend es complementario y se incluye como parte del enfoque híbrido exigido.

📜 Licencia
Proyecto académico — Duoc UC 2025.

yaml
Copy code

---

# ✅ **ARCHIVO 2 — README.txt (Backend – Texto Plano)**

---


NEXUSHUB BACKEND – API MARKET MANAGER
Microservicio Java Spring Boot + H2

Descripción:
Este backend corresponde al microservicio utilizado como complemento académico para el proyecto "API Market Manager". Expone endpoints REST y utiliza una base de datos H2 en memoria. No requiere instalación ni configuración adicional.

Tecnologías:
- Java 17
- Spring Boot 3.x
- H2 In-Memory Database
- Maven

Estructura:
Controller / Service / Repository / Model
Archivo de configuración: src/main/resources/application.properties

Cómo ejecutar:
1. Abrir una terminal en la carpeta del proyecto.
2. Ejecutar: mvn spring-boot:run
3. API disponible en http://localhost:8080
4. Consola H2 disponible en http://localhost:8080/h2-console

Credenciales H2:
URL: jdbc:h2:mem:testdb
Usuario: sa
Clave: (vacía)

Notas:
- El backend se incluye como evidencia técnica de microservicios propios.
- La aplicación móvil funciona con enfoque "Firebase First".
- El backend no es requerido para el funcionamiento principal de la app Android.

Autores:
Elias Delgado y Matias Diaz 
