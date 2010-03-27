-- creacion de secuencia
CREATE SEQUENCE RESERVA.SEQ_CALENDARIO
  START WITH 1
  MAXVALUE 999999999999999999999999999
  MINVALUE 0
  NOCYCLE
  NOCACHE
  NOORDER;

-- llenado de horas

begin 
for x in 8..22
loop
insert into  TB_hora values ( x);
commit;

end loop;

end; 


-- llenado de fechas

begin
for x in 0..365
loop
insert into  TB_fecha values ( sysdate+x ,to_chaR((SYSDATE+x),'DAY' ));
commit;
end loop;
end; 


-- llenado de calendario por cancha y fecha

begin
FOR C IN (SELECT * FROM TB_CANCHA)
LOOP
    for x in (SELECT * FROM TB_FECHA ORDER BY FECHA )
    loop
        for H in (SELECT * FROM TB_HORA ORDER BY HORA)
        loop
        insert into  TB_CALENDARIO values (SEQ_CALENDARIO.nextval , C.CODCANCHA,'Disponible', X.FECHA,H.HORA);
        commit;
        END LOOP;
    END LOOP;
end loop;
end; 

/*inserts*/
insert into TB_ROL (IDROL, NOMBRE)
values (0, 'Usuario');
insert into TB_ROL (IDROL, NOMBRE)
values (1, 'Administrador');

insert into TB_USUARIO (USERID, USERNAME, PASSWORD, NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO, IDROL)
values (1, 'marco_chuquillanqui', '1234', 'Marco Antonio', 'Chuquillanqui ', 'Meza', 1);
insert into TB_USUARIO (USERID, USERNAME, PASSWORD, NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO, IDROL)
values (2, 'luigi_tinta', '1234', 'Luigi', 'Tinta', 'Delgado', 1);
insert into TB_USUARIO (USERID, USERNAME, PASSWORD, NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO, IDROL)
values (3, 'denise_flores', '1234', 'Denisse', 'Flores', 'Espinoza', 1);
insert into TB_USUARIO (USERID, USERNAME, PASSWORD, NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO, IDROL)
values (4, 'joel_gavilan', '1234', 'Joel', 'Gavilan', 'Reynoso', 1);

insert into TB_cancha values (1, 'Cancha A', 'Natural', 'Grande', 80.00, 1)
insert into TB_cancha values (2, 'Cancha B', 'Natural', 'Grande', 70.00, 1)
insert into TB_cancha values (3, 'Cancha C', 'Artificial', 'Grande', 100.00, 1)
insert into TB_cancha values (4, 'Cancha D', 'Natural', 'Mediana', 90.00, 1)
insert into TB_cancha values (5, 'Cancha E', 'Artificial', 'Mediana', 80.00, 1)

insert into TB_ROL (IDROL, NOMBRE)
values (0, 'Usuario');
insert into TB_ROL (IDROL, NOMBRE)
values (1, 'Administrador');