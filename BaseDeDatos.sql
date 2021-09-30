/* Drop Tables */

DROP TABLE IF EXISTS Acudiente CASCADE
;

DROP TABLE IF EXISTS Colegio CASCADE
;

DROP TABLE IF EXISTS Estudiante CASCADE
;

DROP TABLE IF EXISTS Historial_Academico CASCADE
;

DROP TABLE IF EXISTS Origen CASCADE
;

DROP TABLE IF EXISTS Salud CASCADE
;

/* Create Tables */

CREATE TABLE Acudiente
(
	idAcudiente SERIAL,
	nombreMadre varchar NULL,
	nombrePadre varchar NULL,
	email varchar NULL,
	telefono1 varchar NULL,
	telefono2 varchar NULL,
	activo boolean NULL,
	idEstudiante integer NULL
)
;

CREATE TABLE Colegio
(
	idColegio SERIAL,
	ciudad varchar NULL,
	tipo varchar NULL,
	activo boolean NULL,
	nombre varchar NULL
)
;

CREATE TABLE Estudiante
(
	idEstudiante SERIAL,
	primerNombre varchar NULL,
	primerApellido varchar NULL,
	segundoNombre varchar NULL,
	segundoApellido varchar NULL,
	activo boolean NULL,
	idColegio integer NULL
)
;

CREATE TABLE Historial_Academico
(
	idHistorial_academico SERIAL,
	cole_ant varchar NULL,
	año varchar NULL,
	grado varchar NULL,
	activo boolean NULL,
	idEstudiante integer NULL
)
;

CREATE TABLE Origen
(
	idOrigen SERIAL,
	activo boolean NULL,
	estado varchar NULL,
	ciudad varchar NULL,
	idEstudiante integer NULL
)
;

CREATE TABLE Salud
(
	idSeguroMedico SERIAL,
	activo boolean NULL,
	peso varchar NULL,
	altura varchar NULL,
	presionAlterial varchar NULL,
	grupo_sang varchar NULL,
	indiceMasaCorporal varchar NULL,
	idEstudiante integer NULL
)
;

/* Create Primary Keys, Indexes, Uniques, Checks */

ALTER TABLE Acudiente ADD CONSTRAINT PK_Acudiente
	PRIMARY KEY (idAcudiente)
;

ALTER TABLE Colegio ADD CONSTRAINT PK_Colegio
	PRIMARY KEY (idColegio)
;

ALTER TABLE Estudiante ADD CONSTRAINT PK_Estudiante
	PRIMARY KEY (idEstudiante)
;

ALTER TABLE Historial_Academico ADD CONSTRAINT PK_Historial_Academico
	PRIMARY KEY (idHistorial_academico)
;

ALTER TABLE Origen ADD CONSTRAINT PK_Origen
	PRIMARY KEY (idOrigen)
;

ALTER TABLE Salud ADD CONSTRAINT PK_Salud
	PRIMARY KEY (idSeguroMedico)
;

/* Create Foreign Key Constraints */

ALTER TABLE Acudiente ADD CONSTRAINT FK_tiene_Estudiante
	FOREIGN KEY (idEstudiante) REFERENCES Estudiante (idEstudiante) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Estudiante ADD CONSTRAINT FK_pertenece_Colegio
	FOREIGN KEY (idColegio) REFERENCES Colegio (idColegio) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Historial_Academico ADD CONSTRAINT FK_tiene_Estudiante
	FOREIGN KEY (idEstudiante) REFERENCES Estudiante (idEstudiante) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Origen ADD CONSTRAINT FK_tiene_Estudiante
	FOREIGN KEY (idEstudiante) REFERENCES Estudiante (idEstudiante) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Salud ADD CONSTRAINT FK_tiene_Estudiante
	FOREIGN KEY (idEstudiante) REFERENCES Estudiante (idEstudiante) ON DELETE No Action ON UPDATE No Action
;
