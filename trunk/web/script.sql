create table TB_ROL
(
  IDROL  INTEGER not null,
  NOMBRE VARCHAR2(30)
)

ALTER TABLE TB_ROL
       ADD  (PRIMARY KEY (IDROL));


create table TB_USUARIO
(
  USERID          INTEGER not null,
  USERNAME        VARCHAR2(30),
  PASSWORD        VARCHAR2(8),
  NOMBRE          VARCHAR2(30),
  APELLIDOPATERNO VARCHAR2(30),
  APELLIDOMATERNO VARCHAR2(30),
  IDROL           INTEGER default 0 not null
);

ALTER TABLE TB_USUARIO
       ADD  ( PRIMARY KEY (USERID) ) ;

ALTER TABLE TB_USUARIO
       ADD  ( FOREIGN KEY (IDROL)
                             REFERENCES TB_ROL ) ;



create table tb_cancha
(
  codcancha    INTEGER not null,
  descripcion  VARCHAR2(30),
  tipoCesped   VARCHAR2(30),
  tamano       VARCHAR2(30),
  costoHora    real,
  estado       INTEGER
);

ALTER TABLE TB_CANCHA
       ADD  ( PRIMARY KEY (codcancha) ) ;

CREATE TABLE TB_Calendario (
       codigo               integer NOT NULL,
       codcancha            integer NULL,
       estado               varchar(20) NULL,
       fecha                date NULL,
       hora                 integer NULL
);

CREATE UNIQUE INDEX XPKTB_Calendario ON TB_Calendario
(
       codigo                      ASC
);

CREATE INDEX XIF2TB_Calendario ON TB_Calendario
(
       codcancha                         ASC
);

CREATE INDEX XIF3TB_Calendario ON TB_Calendario
(
       fecha                          ASC
);

CREATE INDEX XIF4TB_Calendario ON TB_Calendario
(
       hora                           ASC
);


ALTER TABLE TB_Calendario
       ADD  ( PRIMARY KEY (codigo) ) ;




CREATE TABLE TB_Fecha (
       fecha                DATE NOT NULL,
       fec_dia_semana       VARCHAR(150) NULL
);

CREATE UNIQUE INDEX XPKTB_Fecha ON TB_Fecha
(
       fecha                          ASC
);


ALTER TABLE TB_Fecha
       ADD  ( PRIMARY KEY (fecha) ) ;


create TABLE TB_hora (
       hora                 integer NOT NULL
);

CREATE UNIQUE INDEX XPKTB_hora ON TB_hora
(
       hora                           ASC
);


ALTER TABLE TB_hora
       ADD  ( PRIMARY KEY (hora) ) ;



CREATE TABLE TB_Reserva (
       codReserva           integer NOT NULL,
       horaInicio           integer NULL,
       hora                 integer NULL,
       fechaReserva         DATE NULL,
       userid               integer NULL,
       horaFin              integer NULL,
       codcancha            integer NULL,
       nroPersonas          integer NULL,
       montoPagar           integer NULL,
       estado               integer NULL
);

CREATE UNIQUE INDEX XPKTB_Reserva ON TB_Reserva
(
       codReserva                     ASC
);

CREATE INDEX XIF3TB_Reserva ON TB_Reserva
(
       userid                        ASC
);

CREATE INDEX XIF4TB_Reserva ON TB_Reserva
(
       codcancha                         ASC
);

CREATE INDEX XIF5TB_Reserva ON TB_Reserva
(
       fechaReserva                   ASC
);

CREATE INDEX XIF6TB_Reserva ON TB_Reserva
(
       hora                           ASC
);


ALTER TABLE TB_Reserva
       ADD  ( PRIMARY KEY (codReserva) ) ;



ALTER TABLE TB_Calendario
       ADD  ( FOREIGN KEY (hora)
                             REFERENCES TB_hora ) ;


ALTER TABLE TB_Calendario
       ADD  ( FOREIGN KEY (fecha)
                             REFERENCES TB_Fecha ) ;


ALTER TABLE TB_Calendario
       ADD  ( FOREIGN KEY (codcancha)
                             REFERENCES TB_Cancha ) ;


ALTER TABLE TB_Reserva
       ADD  ( FOREIGN KEY (hora)
                             REFERENCES TB_hora ) ;


ALTER TABLE TB_Reserva
       ADD  ( FOREIGN KEY (fechaReserva)
                             REFERENCES TB_Fecha ) ;


ALTER TABLE TB_Reserva
       ADD  ( FOREIGN KEY (codcancha)
                             REFERENCES TB_Cancha ) ;


ALTER TABLE TB_Reserva
       ADD  ( FOREIGN KEY (userid)
                             REFERENCES TB_USUARIO ) ;








