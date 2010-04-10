CREATE OR REPLACE PACKAGE RESERVA.PKG_RES_CANCHA AS
/******************************************************************************
   NAME:       PKG_RES_CANCHA
   PURPOSE:

   REVISIONS:
   Ver        Date        Author           Description
   ---------  ----------  ---------------  ------------------------------------
   1.0        06/04/2010             1. Created this package.
******************************************************************************/

  FUNCTION MyFunction(Param1 IN NUMBER) RETURN NUMBER;
 PROCEDURE SP_REGISTRA_CANCHA(V_DESCRIPCION IN VARCHAR2,V_TIPO IN VARCHAR2,TAMAÑO IN VARCHAR2,N_COSTO NUMBER, V_DIRECCION IN VARCHAR2 , N_RETORNO OUT NUMBER);
PROCEDURE SP_ELIMINA_CANCHA(N_CODIGO IN INTEGER,N_RETORNO OUT NUMBER);

END PKG_RES_CANCHA;
/


CREATE OR REPLACE PACKAGE RESERVA.PKG_RES_RESERVA AS
/******************************************************************************
   NAME:       PKG_RES_RESERVA
   PURPOSE:

   REVISIONS:
   Ver        Date        Author           Description
   ---------  ----------  ---------------  ------------------------------------
   1.0        05/04/2010             1. Created this package.
******************************************************************************/

  FUNCTION MyFunction(Param1 IN NUMBER) RETURN NUMBER;
  PROCEDURE SP_REGISTRA_RESERVA(V_FECHA IN VARCHAR2,
                                V_HORAINI IN VARCHAR2,
                                V_HORAFIN IN VARCHAR2,
                                V_USUARIO IN VARCHAR2,
                                V_CODCANCHA IN VARCHAR2,
                                N_MONTOAPAGAR IN NUMBER,  
                                N_NROPERSONAS IN NUMBER  );

END PKG_RES_RESERVA;
/


CREATE OR REPLACE PACKAGE BODY RESERVA.PKG_RES_CANCHA AS
/******************************************************************************
   NAME:       PKG_RES_CANCHA
   PURPOSE:

   REVISIONS:
   Ver        Date        Author           Description
   ---------  ----------  ---------------  ------------------------------------
   1.0        06/04/2010             1. Created this package body.
******************************************************************************/

  FUNCTION MyFunction(Param1 IN NUMBER) RETURN NUMBER IS
  BEGIN
    RETURN Param1;
  END;

  PROCEDURE SP_REGISTRA_CANCHA(V_DESCRIPCION IN VARCHAR2,V_TIPO IN VARCHAR2,TAMAÑO IN VARCHAR2,N_COSTO NUMBER, V_DIRECCION IN VARCHAR2 , N_RETORNO OUT NUMBER) IS
  N_CODIGO NUMBER;
  
  BEGIN
  SELECT SEQ_CANCHA.NEXTVAL INTO  N_CODIGO FROM DUAL;
   insert into TB_cancha ( CODCANCHA,DESCRIPCION ,TIPOCESPED,TAMANO,DIRECCION,COSTOHORA,ESTADO )
   values (N_CODIGO,V_DESCRIPCION, V_TIPO, TAMAÑO,V_DIRECCION, N_COSTO, 1);
    COMMIT;
  --CREANDO CALENDARIO  
    begin
    FOR C IN (SELECT * FROM TB_CANCHA WHERE CODCANCHA= N_CODIGO)
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
   N_RETORNO:=1;
  EXCEPTION WHEN OTHERS THEN 
   N_RETORNO:=0;
  END;

 PROCEDURE SP_ELIMINA_CANCHA(N_CODIGO IN INTEGER,N_RETORNO OUT NUMBER)
 IS 
 N_CANTIDAD NUMBER;
 BEGIN 
 SELECT COUNT('*') INTO N_CANTIDAD FROM TB_RESERVA WHERE CODCANCHA=N_CODIGO;
    IF N_CANTIDAD=0 THEN 
    DELETE TB_CALENDARIO WHERE CODCANCHA=N_CODIGO;
    COMMIT;
    DELETE TB_CANCHA WHERE CODCANCHA=N_CODIGO;
    COMMIT;
    N_RETORNO:=1;
    ELSE 
    N_RETORNO:=0;
    END IF;
 
 END;

END PKG_RES_CANCHA;
/


CREATE OR REPLACE PACKAGE BODY RESERVA.PKG_RES_RESERVA AS
/******************************************************************************
   NAME:       PKG_RES_RESERVA
   PURPOSE:

   REVISIONS:
   Ver        Date        Author           Description
   ---------  ----------  ---------------  ------------------------------------
   1.0        05/04/2010             1. Created this package body.
******************************************************************************/

  FUNCTION MyFunction(Param1 IN NUMBER) RETURN NUMBER IS
  BEGIN
    RETURN Param1;
  END;

    PROCEDURE SP_REGISTRA_RESERVA(V_FECHA IN VARCHAR2,
                                V_HORAINI IN VARCHAR2,
                                V_HORAFIN IN VARCHAR2,
                                V_USUARIO IN VARCHAR2,
                                V_CODCANCHA IN VARCHAR2,
                                N_MONTOAPAGAR IN NUMBER,  
                                N_NROPERSONAS IN NUMBER  )
 IS
   
  BEGIN
  INSERT INTO TB_RESERVA (CODRESERVA,FECHARESERVA,HORAINICIO,HORAFIN,USERID,CODCANCHA,NROPERSONAS,MONTOPAGAR,ESTADO,hORA)
   VALUES (SEQ_RESERVA.NEXTVAL,
           TO_DATE(V_FECHA,'DD/MM/YYYY'),
           V_HORAINI,
           V_HORAFIN,
           V_USUARIO,
           V_CODCANCHA,
           NVL(N_NROPERSONAS,0),
           N_MONTOAPAGAR,
           0,
           8);
           
           COMMIT;
  --ACTUALIZANDO EL CALENDARIO
  
  BEGIN 
  
  FOR V_CAL IN V_HORAINI ..V_HORAFIN LOOP
  
  UPDATE TB_CALENDARIO
  SET ESTADO='Reservado'
  WHERE CODCANCHA=V_CODCANCHA
  AND TO_CHAR(FECHA,'DD/MM/YYYY')=V_FECHA
  AND HORA=V_CAL;
  COMMIT;  
  
  END LOOP;
   
  EXCEPTION WHEN OTHERS THEN 
  ROLLBACK;
  END ;  
  
  
  END;

END PKG_RES_RESERVA;
/


