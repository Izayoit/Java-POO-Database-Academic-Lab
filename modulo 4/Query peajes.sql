CREATE DATABASE ControlPeajes;
USE ControlPeajes;

-- Tabla: Usuarios
CREATE TABLE Usuarios (
    usuario_id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    contrasena VARCHAR(255) NOT NULL
);

-- Tabla: Vehiculos
CREATE TABLE Vehiculos (
    vehiculo_id INT AUTO_INCREMENT PRIMARY KEY,
    placa VARCHAR(20) UNIQUE NOT NULL,
    tipo ENUM('Carro', 'Moto', 'Camión', 'Bus') NOT NULL
);

-- Tabla: Peajes
CREATE TABLE Peajes (
    peaje_id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    ubicacion VARCHAR(255) NOT NULL
);

-- Tabla: Tarifas
CREATE TABLE Tarifas (
    tarifa_id INT AUTO_INCREMENT PRIMARY KEY,
    peaje_id INT NOT NULL,
    tipo_vehiculo ENUM('Carro', 'Moto', 'Camión', 'Bus') NOT NULL,
    monto DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (peaje_id) REFERENCES Peajes(peaje_id)
);

-- Tabla: Registros
CREATE TABLE Registros (
    registro_id INT AUTO_INCREMENT PRIMARY KEY,
    vehiculo_id INT NOT NULL,
    peaje_id INT NOT NULL,
    usuario_id INT NOT NULL,
    fecha_hora DATETIME NOT NULL,
    tarifa_id INT NOT NULL,
    FOREIGN KEY (vehiculo_id) REFERENCES Vehiculos(vehiculo_id),
    FOREIGN KEY (peaje_id) REFERENCES Peajes(peaje_id),
    FOREIGN KEY (usuario_id) REFERENCES Usuarios(usuario_id),
    FOREIGN KEY (tarifa_id) REFERENCES Tarifas(tarifa_id)
);