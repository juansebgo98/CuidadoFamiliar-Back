DROP DATABASE IF EXISTS cuidadoFamiliar;

CREATE DATABASE cuidadoFamiliar;

USE cuidadoFamiliar;

CREATE TABLE usuario (
  ID BIGINT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(255),
  nombre_de_usuario VARCHAR(255),
  contrasena VARCHAR(255),
  email VARCHAR(255),
  telefono VARCHAR(20),
  fecha_alta DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fecha_ultima_modificacion DATETIME
);

CREATE TABLE persona_mayor (
  ID BIGINT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(255),
  fecha_de_nacimiento DATE,
  direccion VARCHAR(255),
  fecha_alta DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fecha_ultima_modificacion DATETIME
);

CREATE TABLE usuario_persona_mayor (
  usuario_id BIGINT,
  persona_mayor_id BIGINT,
  rol VARCHAR(50),
  PRIMARY KEY (persona_mayor_id, usuario_id),
  FOREIGN KEY (usuario_id) REFERENCES usuario(ID),
  FOREIGN KEY (persona_mayor_id) REFERENCES persona_mayor(ID)
);

CREATE TABLE medicamento (
  ID BIGINT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(255),
  cantidad_actual INT,
  cantidad_minima_requerida INT,
  cantidad_de_pastillas_por_dia INT,
  frecuencia_de_dosificacion VARCHAR(50),
  persona_mayorid BIGINT,
  fecha_alta DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fecha_ultima_modificacion DATETIME,
  FOREIGN KEY (persona_mayorid) REFERENCES persona_mayor(ID)
);

CREATE TABLE cita_medica (
  ID BIGINT PRIMARY KEY AUTO_INCREMENT,
  fechaYHora DATETIME,
  descripcion VARCHAR(255),
  lugar VARCHAR(255),
  tipo_de_cita VARCHAR(50),
  persona_mayorid BIGINT,
  fechaAlta DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fechaUltimaModificacion DATETIME,
  FOREIGN KEY (persona_mayorid) REFERENCES persona_mayor(ID)
);

CREATE TABLE ticket (
  ID BIGINT PRIMARY KEY AUTO_INCREMENT,
  fecha_de_compra DATETIME,
  cita_medica_id BIGINT,
  persona_mayor_id BIGINT,
  fechaAlta DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fechaUltimaModificacion DATETIME,
  FOREIGN KEY (cita_medica_id) REFERENCES cita_medica(ID),
  FOREIGN KEY (persona_mayor_id) REFERENCES persona_mayor(ID)
);

CREATE TABLE informe_medico (
  ID BIGINT PRIMARY KEY AUTO_INCREMENT,
  fecha_del_informe DATETIME,
  descripcion VARCHAR(255),
  citamedica_id BIGINT,
  fechaAlta DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fechaUltimaModificacion DATETIME,
  FOREIGN KEY (citamedica_id) REFERENCES cita_medica(ID)
);

CREATE TABLE comentario (
  ID BIGINT PRIMARY KEY AUTO_INCREMENT,
  contenido VARCHAR(255),
  fechayhora_del_comentario DATETIME,
  usuario_id BIGINT,
  persona_mayor_id BIGINT,
  fechaAlta DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fechaUltimaModificacion DATETIME,
  FOREIGN KEY (usuario_id) REFERENCES usuario(ID),
  FOREIGN KEY (persona_mayor_id) REFERENCES persona_mayor(ID)
);

CREATE TABLE permiso_laboral (
  ID BIGINT PRIMARY KEY AUTO_INCREMENT,
  fecha_de_inicio_del_permiso DATETIME,
  fecha_de_fin_del_permiso DATETIME,
  descripcion VARCHAR(255),
  estado VARCHAR(50),
  usuario_id BIGINT,
  fechaAlta DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fechaUltimaModificacion DATETIME,
  FOREIGN KEY (usuario_id) REFERENCES usuario(ID)
);
