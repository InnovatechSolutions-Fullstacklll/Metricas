# 📊 MS Métricas - Inovatech

Microservicio encargado del seguimiento de indicadores y rendimiento de proyectos.

Permite:

* Registrar métricas
* Consultar métricas
* Actualizar métricas
* Eliminar métricas
* Registrar objetivos y logros recientes

---

# 📌 Tecnologías utilizadas

* Java 21
* Spring Boot 3
* Spring Data JPA
* H2 Database
* Lombok
* Maven
* Postman

---

# 📦 Dependencias utilizadas

* Spring Web
* Spring Data JPA
* H2 Database
* Lombok
* DevTools
* Validation
* Spring Boot Starter Test

---

# 🛠 Requisitos previos

## ✅ Java 21

https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html

---

## ✅ Maven

https://maven.apache.org/download.cgi

---

## ✅ IntelliJ IDEA

https://www.jetbrains.com/idea/download/

---

## ✅ Postman

https://www.postman.com/downloads/

---

# ⚙ Configuración

## Puerto

server.port=9095

---

# 🗄 Base de datos H2

## Configuración

spring.datasource.url=jdbc:h2:file:./data/metricasdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=admin
spring.datasource.password=admin

spring.jpa.hibernate.ddl-auto=update

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

---

# 🧪 Consola H2

Abrir:

http://localhost:9095/h2-console

---

# ▶ Cómo ejecutar

MsMetricasApplication

---

# 📡 Endpoints principales

## Crear métrica

POST http://localhost:9090/api/metricas

---

## Obtener métricas

GET http://localhost:9090/api/metricas

---

## Actualizar métricas

PUT http://localhost:9090/api/metricas/{id}

---

## Eliminar métricas

DELETE http://localhost:9090/api/metricas/{id}

---

# 📈 Información almacenada

Cada registro puede contener:

* Nombre del indicador
* Valor actual
* Valor objetivo
* Porcentaje de avance
* Objetivos planteados
* Logros recientes

---

# 🧠 Función del microservicio

Este microservicio:

* Permite monitorear el rendimiento de los proyectos
* Registra avances y resultados
* Facilita el seguimiento de KPIs
* Almacena objetivos y logros históricos

---

# 🧪 Tests

mvn test

---

# 👨‍💻 Autores

Camilo Leiva ([cc.leiva@duocuc.cl](mailto:cc.leiva@duocuc.cl))

Nicolas Rivera ([nico.veraf@duocuc.cl](mailto:nico.veraf@duocuc.cl))

Ramiro Gomez ([ra.gomezv@duocuc.cl](mailto:ra.gomezv@duocuc.cl))

Laura Fontecilla ([la.fontecilla@duocuc.cl](mailto:la.fontecilla@duocuc.cl))

## Proyecto desarrollado para Inovatech.
