insert into users(name,email,password)values('sergio','sergiofabrihuerta@gmail.com',1234);
select*from users;
update users set name ='albert',email ='yoiqs',password ='421' where id=1;
delete from users where id=2 ;
select*from categoria; 
insert into categoria(nombre,descripcion,condicion) values ('verduras','alto en fibra',false);













select *from articulo;



insert into articulo(codigo,nombre,stock,descripcion,imagen,estado,idcategoria) values (001,'durazno',15,'',' ','activo',2);
select * from categoria ;

select a.idarticulo,a.codigo,a.nombre,a.stock,a.descripcion,a.imagen,a.estado,c.nombre,c.idcategoria
from articulo a ,categoria c
where a.idcategoria = c.idcategoria order by a.idarticulo;

update articulo set descripcion='', imagen='' where idarticulo=2;

select *from articulo;

delete from articulo where idarticulo =10;

update articulo set idcategoria = 2 where idarticulo=1;

select *from ingreso;
insert into persona(tipo_persona,nombre ,tipo_documento, num_documento,direccion, telefono ,email) values ('cliente','sergio','Dni','343564','calle moore','123456','olamaquina');

select* from persona;

update persona set tipo_persona ='cliente',nombre ='le0', tipo_documento = 'RUC', num_documento = '54547547',direccion='la rosa', telefono='3242342' ,email='chooclo' where idpersona = 4;
delete from persona where idpersona = 1;

select p.idpersona,p.tipo_persona, p.nombre, p.tipo_documento, p.num_documento , p.direccion , p.telefono , p.email
from persona p;

select * from ingreso;
insert into ingreso(idproveedor,tipo_comprobante,serie_comprobante,num_comprobante,fecha_hora,impuesto,estado) values (2,"factura","0000001","0000000001",'2024-12-14 12:00:00',0.18,"registrado");

select i.idingreso,i.tipo_comprobante,i.serie_comprobante,i.num_comprobante,i.fecha_hora,i.impuesto,i.estado,p.tipo_persona,p.idpersona
from ingreso i ,persona p
where i.idproveedor = p.idpersona order by i.idingreso;


select * from venta;
insert into venta(idcliente,idusuario,tipo_comprobante,serie_comprobante,num_comprobante,fecha_hora,impuesto,total_venta,estado) values (3,1,"boleta","00001","0000001",'2024-12-15 12:00:00',0.18,140,"registrado");

SELECT v.idventa, v.tipo_comprobante, v.serie_comprobante, v.num_comprobante, 
       v.fecha_hora, v.impuesto, v.total_venta, v.estado, 
       p.tipo_persona, p.idpersona, u.name, u.id 
FROM venta v, persona p, users u 
WHERE v.idcliente = p.idpersona AND v.idusuario = u.id 
ORDER BY v.idventa;
UPDATE detalle_ingreso 
SET cantidad = 25, precio_compra = 55.00, precio_venta = 65.00, idingreso = 3, idarticulo = 6
WHERE iddetalle_ingreso = 3;
select * from detalle_ingreso;
UPDATE detalle_ingreso SET  idingreso = 2, idarticulo = 2,cantidad = 3, precio_compra = 0.20, precio_venta = 0.60 WHERE iddetalle_ingreso = 1;

insert into detalle_ingreso(idingreso,idarticulo,cantidad,precio_compra,precio_venta) values (2,1,0,0,0);

select d.iddetalle_ingreso , d.cantidad , d.precio_compra , d.precio_venta , i.idingreso , i.estado , a.idarticulo , a.nombre
from ingreso i, articulo a,detalle_ingreso d
where  d.idarticulo = a.idarticulo and d.idingreso = i.idingreso;


select * from detalle_venta;
describe detalle_venta;

insert into detalle_venta(idventa,idarticulo,cantidad,precio_venta,descuento) values (5,1,1,2,2);

select d.iddetalle_venta , d.cantidad, d.precio_venta, d.descuento , v.idventa, a.idarticulo, a.nombre
from detalle_venta d, venta v ,articulo a
where d.idarticulo = a.idarticulo and d.idventa = v.idventa;

select* from detalle_venta;

SELECT v.idventa, v.tipo_comprobante, v.serie_comprobante, v.num_comprobante,v.fecha_hora, v.impuesto, v.total_venta, v.estado, p.tipo_persona, p.idpersona, u.name, u.id 
FROM venta v, persona p, users u 
WHERE v.idcliente = p.idpersona AND v.idusuario = u.id
ORDER BY v.idventa;



