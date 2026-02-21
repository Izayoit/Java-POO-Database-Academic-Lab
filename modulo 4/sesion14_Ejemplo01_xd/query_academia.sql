use academia;
insert into curso(nombre) values ('Estads');
select * from estudiante;
select * from curso;
select * from curso order by nombre asc;
  select e.CodEstudiante,  e.Nombres,e.Apellidos,e.Foto, c.Nombre,c.CodCurso
  from estudiante e,curso c
  where e.CodCurso= c.CodCurso order by e.Nombres asc;
  update estudiante set foto = ' ' where cod=2;