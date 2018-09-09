create table administrador(
	id varchar(30),
	contraseña varchar(30),
	primary key(id)
);

create table asistencia(
	clave_evento varchar(30),	
	nombre_evento varchar(300),
	matricula_usuario varchar(30),
	hora time,
	primary key(clave_evento,matricula_usuario)
);

create table evento(
	clave varchar(30),
	nombre varchar(300),
	capacidad int,
	fecha date,
	hora_inicio time,
	hora_fin time,
	calle varchar(30),
	numero varchar(30),
	cp varchar(30),
	colonia varchar(30)
	primary key(clave)
);

create table usuario(
	matricula varchar(30),
	contraseña varchar(30),
	nombre varchar(30),
	apaterno varchar(30),
	amaterno varchar(30),
	email varchar(30),
	telefono varchar(30),
	rutaQR varchar(300),
	primary key(matricula);
);