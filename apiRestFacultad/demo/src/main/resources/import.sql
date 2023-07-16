/* Populate tabla clientes */



INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Marina', 'Belliville', 'ema-test@gmail.com', '2018-01-01');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03');
--INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2018-01-04');
--INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01');
--INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10');
--INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18');
--INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28');
--INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03');
--INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04');
--INSERT INTO clientes (nombre, apellido, email, create_at) VALUES('Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05');

INSERT INTO empleados (nombre, apellido, email) VALUES('Matias', 'Navio', 'jane.doe@gmail.com');
INSERT INTO empleados (nombre, apellido, email) VALUES('Agustin', 'Navio', 'jane.doe@gmail.com');
INSERT INTO empleados (nombre, apellido, email) VALUES('Eseba', 'Carrizo', 'jane.doe@gmail.com');

insert into productos (marca, precio, tipo) values('LG', 120000, 'Heladera')
insert into productos (marca, precio, tipo) values('SONY', 60000, 'Parlantes')
insert into productos (marca, precio, tipo) values('Samsung', 130000, 'Teléfono')

insert into ventas (monto, tipo_pago, cliente_id, empleado_id, producto_id) values(2000.0, 'Efectivo', 1, 1, 1)
insert into ventas (monto, tipo_pago, cliente_id, empleado_id, producto_id) values(1450.5, 'Débito', 2, 2, 2)
insert into ventas (monto, tipo_pago, cliente_id, empleado_id, producto_id) values(12000, 'Crédito', 3, 3, 3)




