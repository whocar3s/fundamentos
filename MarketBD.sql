create database market;
use market;
create table Tblclientes(
	Identificacion varchar(15),
    Nombre varchar(20),
    Apellido varchar(20),
    DireccionResidencia varchar(30),
    CorreoElectronico varchar(20),
    Ciudad varchar(40)
);
create table Tblarticulos(
	Codigo varchar(15),
    Descripción varchar(20),
    PrecioUnitario numeric,
    Unidadmedida varchar(8),
    Proveedor varchar(20),
	Ciudad varchar(40)
);
create table TblFactura(
	Numerofactura numeric,
	Identificacion varchar(15),
	Fecha varchar(10)
);
create table TblfacturaDetalle(
	NumeroFactura numeric,
	Codigo varchar(15),
	Cantidad numeric,
	ValorUnitario numeric,
	ValorTotal numeric
);
