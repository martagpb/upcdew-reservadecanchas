prompt PL/SQL Developer import file
prompt Created on Lunes, 22 de Marzo de 2010 by Marco Antonio
set feedback off
set define off
prompt Creating TB_ROL...
create table TB_ROL
(
  IDROL  INTEGER not null,
  NOMBRE VARCHAR2(30)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table TB_ROL
  add constraint PK_IDROL primary key (IDROL)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating TB_USUARIO...
create table TB_USUARIO
(
  USERID          INTEGER not null,
  USERNAME        VARCHAR2(30),
  PASSWORD        VARCHAR2(8),
  NOMBRE          VARCHAR2(30),
  APELLIDOPATERNO VARCHAR2(30),
  APELLIDOMATERNO VARCHAR2(30),
  IDROL           INTEGER default 0 not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table TB_USUARIO
  add constraint PK_USERID primary key (USERID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table TB_USUARIO
  add constraint FK_IDROL foreign key (IDROL)
  references TB_ROL (IDROL);

prompt Disabling triggers for TB_ROL...
alter table TB_ROL disable all triggers;
prompt Disabling triggers for TB_USUARIO...
alter table TB_USUARIO disable all triggers;
prompt Disabling foreign key constraints for TB_USUARIO...
alter table TB_USUARIO disable constraint FK_IDROL;
prompt Deleting TB_USUARIO...
delete from TB_USUARIO;
commit;
prompt Deleting TB_ROL...
delete from TB_ROL;
commit;
prompt Loading TB_ROL...
insert into TB_ROL (IDROL, NOMBRE)
values (0, 'Usuario');
insert into TB_ROL (IDROL, NOMBRE)
values (1, 'Administrador');
commit;
prompt 2 records loaded
prompt Loading TB_USUARIO...
insert into TB_USUARIO (USERID, USERNAME, PASSWORD, NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO, IDROL)
values (1, 'marco_chuquillanqui', '1234', 'Marco Antonio', 'Chuquillanqui ', 'Meza', 1);
insert into TB_USUARIO (USERID, USERNAME, PASSWORD, NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO, IDROL)
values (2, 'luigi_tinta', '1234', 'Luigi', 'Tinta', 'Delgado', 1);
insert into TB_USUARIO (USERID, USERNAME, PASSWORD, NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO, IDROL)
values (3, 'denise_flores', '1234', 'Denisse', 'Flores', 'Espinoza', 1);
insert into TB_USUARIO (USERID, USERNAME, PASSWORD, NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO, IDROL)
values (4, 'joel_gavilan', '1234', 'Joel', 'Gavilan', 'Reynoso', 1);
commit;
prompt 4 records loaded
prompt Enabling foreign key constraints for TB_USUARIO...
alter table TB_USUARIO enable constraint FK_IDROL;
prompt Enabling triggers for TB_ROL...
alter table TB_ROL enable all triggers;
prompt Enabling triggers for TB_USUARIO...
alter table TB_USUARIO enable all triggers;
set feedback on
set define on
prompt Done.
