/* Populate tabla clientes */



insert into tarjetas (num_tarjeta, fecha_vencimiento) values ('3465474734', '2027-03-13')
insert into tarjetas (num_tarjeta, fecha_vencimiento) values ('3465445734', '2027-06-13')
insert into tarjetas (num_tarjeta, fecha_vencimiento) values ('6578924435', '2027-11-22')

INSERT INTO clientes (nombre, apellido, email, fecha_nacimiento, tarjeta_id) VALUES('Marina', 'Belliville', 'ema-test@gmail.com', '2018-01-01', 1);
INSERT INTO clientes (nombre, apellido, email, fecha_nacimiento, tarjeta_id) VALUES('Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02', 2);
INSERT INTO clientes (nombre, apellido, email, fecha_nacimiento, tarjeta_id) VALUES('Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03', 3);

INSERT INTO empleados (nombre, apellido, email) VALUES('Matias', 'Navio', 'jane.doe@gmail.com');
INSERT INTO empleados (nombre, apellido, email) VALUES('Agustin', 'Navio', 'jane.doe@gmail.com');
INSERT INTO empleados (nombre, apellido, email) VALUES('Eseba', 'Carrizo', 'jane.doe@gmail.com');

insert into productos (marca, precio, tipo) values('LG', 120000, 'Heladera')
insert into productos (marca, precio, tipo) values('SONY', 60000, 'Parlantes')
insert into productos (marca, precio, tipo) values('Samsung', 130000, 'Teléfono')

insert into ventas (monto, tipo_pago, cliente_id, empleado_id, producto_id) values(2000.0, 'Efectivo', 1, 1, 1)
insert into ventas (monto, tipo_pago, cliente_id, empleado_id, producto_id) values(1450.5, 'Débito', 2, 2, 2)
insert into ventas (monto, tipo_pago, cliente_id, empleado_id, producto_id) values(12000, 'Crédito', 3, 3, 3)




