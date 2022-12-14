-- 1. CREAR UNA BASE DATOS

DROP DATABASE IF EXISTS PROBANDO;
CREATE DATABASE PROBANDO;

-- 2. USAR UNA BASE DE DATOS

USE PROBANDO;

-- 3. CREAR UNA TABLA

CREATE TABLE IF NOT EXISTS Proveedor (
  idProveedor INT          NOT NULL AUTO_INCREMENT,
  nombre      VARCHAR(20)  NOT NULL,
  nif         VARCHAR(20)  NOT NULL,
  direccion   VARCHAR(100) NOT NULL,
              PRIMARY KEY (idProveedor)
)ENGINE = InnoDB;

-- 4. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

SHOW TABLES;

-- 5. DESCRBIR UNA TABLE

DESCRIBE Proveedor;

-- 6. INSERTAR REGISTRO EN UNA TABLA

ALTER TABLE Proveedor AUTO_INCREMENT = 13;

INSERT INTO Proveedor(nombre,nif,direccion) VALUES('Luis','111111111A','Direccion 1');
INSERT INTO Proveedor(nombre,nif,direccion) VALUES('Marcos','22222222B','Direccion 2');

-- 7. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Proveedor;
