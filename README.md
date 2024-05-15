# Sistema de Gestión de Medicación y Citas Médicas para Personas Mayores

Este proyecto es un sistema web diseñado para facilitar la gestión de la medicación y citas médicas de personas mayores, permitiendo a sus cuidadores supervisar y administrar de manera eficiente la medicación, citas médicas y otros aspectos relacionados con la salud de sus seres queridos.

## Características Principales

- **Gestión de Medicación:** Permite registrar medicamentos, incluyendo la cantidad actual, cantidad mínima requerida, frecuencia de dosificación y otra información relevante.
- **Gestión de Citas Médicas:** Facilita la programación y seguimiento de citas médicas, incluyendo la fecha, hora, lugar y tipo de cita.
- **Tickets para Citas Médicas:** Asocia tickets a las citas médicas para controlar su disponibilidad y uso.
- **Informes Médicos:** Permite adjuntar informes médicos a las citas médicas para un registro completo del historial médico.
- **Comentarios y Notas:** Permite a los cuidadores agregar comentarios y notas sobre la condición de la persona mayor.
- **Permiso Laboral:** Facilita la gestión de permisos laborales para los cuidadores.

## Tecnologías Utilizadas

- **Backend:** Desarrollado en Java utilizando el framework Spring Boot para la creación de servicios web RESTful.
- **Frontend:** Implementado con Angular para una interfaz de usuario moderna e interactiva.
- **Base de Datos:** Utiliza MySQL para almacenar datos relacionales de manera eficiente y segura.
- **Despliegue:** Se puede implementar en un servidor local utilizando Ubuntu Server.

## Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalados los siguientes requisitos:

- Java 17 o superior.
- Node.js y Angular CLI para el desarrollo del frontend.
- MySQL Server para la base de datos.

## Configuración

Sigue estos pasos para configurar y ejecutar el proyecto en tu entorno local:

1. Clona este repositorio en tu máquina local.
2. Configura la base de datos MySQL y asegúrate de que la conexión esté especificada en el archivo de configuración de Spring Boot.
3. Navega hasta el directorio del frontend y ejecuta `npm install` para instalar las dependencias.
4. Inicia el backend ejecutando la aplicación Spring Boot.
5. Inicia el frontend ejecutando `ng serve` desde el directorio del frontend.

## Uso

Una vez configurado y ejecutado el proyecto, puedes acceder a la interfaz de usuario desde tu navegador web. Inicia sesión con tus credenciales y explora las diferentes características y funcionalidades del sistema.

## Contribución

¡Tu contribución es bienvenida! Si deseas contribuir a este proyecto, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/feature-name`).
3. Realiza tus cambios y haz commits (`git commit -am 'Add new feature'`).
4. Haz push de la rama (`git push origin feature/feature-name`).
5. Crea un nuevo Pull Request.

## Licencia

Este proyecto está bajo la Licencia
