--------------------------------------------------------
--  File created - Sunday-April-08-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence CATEGORY_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "OFFICESUPPLY"."CATEGORY_SEQ"  MINVALUE 1 MAXVALUE 999999999 INCREMENT BY 1 START WITH 348 CACHE 20 NOORDER  NOCYCLE   ;
--------------------------------------------------------
--  DDL for Sequence EMPLOYEE_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "OFFICESUPPLY"."EMPLOYEE_SEQ"  MINVALUE 1 MAXVALUE 99999999999999999 INCREMENT BY 1 START WITH 60 CACHE 20 NOORDER  NOCYCLE   ;
--------------------------------------------------------
--  DDL for Table CATEGORY
--------------------------------------------------------

  CREATE TABLE "OFFICESUPPLY"."CATEGORY" 
   (	"PRODUCTID" NUMBER, 
	"NAME" VARCHAR2(80 BYTE), 
	"DESCRIPT" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table EMPLOYEES
--------------------------------------------------------

  CREATE TABLE "OFFICESUPPLY"."EMPLOYEES" 
   (	"EMPLOYEEID" NUMBER, 
	"USERNAME" VARCHAR2(20 BYTE), 
	"PASSWORD" VARCHAR2(20 BYTE), 
	"NAME" VARCHAR2(25 BYTE), 
	"DEPARTMENT" CHAR(2 BYTE), 
	"MANAGER" NUMBER, 
	"SSN" NUMBER, 
	"SALARY" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ORDERITEM
--------------------------------------------------------

  CREATE TABLE "OFFICESUPPLY"."ORDERITEM" 
   (	"ORDERID" NUMBER, 
	"PRODUCTID" NUMBER, 
	"QUANTITY" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ORDERS
--------------------------------------------------------

  CREATE TABLE "OFFICESUPPLY"."ORDERS" 
   (	"ORDERID" NUMBER, 
	"EMPLOYEEID" NUMBER, 
	"ORDERDATE" DATE, 
	"STATUS" CHAR(1 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PRODUCT
--------------------------------------------------------

  CREATE TABLE "OFFICESUPPLY"."PRODUCT" 
   (	"PRODUCTID" NUMBER, 
	"CATID" NUMBER, 
	"NAME" VARCHAR2(80 BYTE), 
	"DESCRIPT" VARCHAR2(255 BYTE), 
	"UNITCOST" NUMBER, 
	"SUPPID" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table SUPPLIER
--------------------------------------------------------

  CREATE TABLE "OFFICESUPPLY"."SUPPLIER" 
   (	"SUPPID" NUMBER, 
	"NAME" VARCHAR2(80 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for View NEW_VIEW
--------------------------------------------------------

  CREATE OR REPLACE FORCE EDITIONABLE VIEW "OFFICESUPPLY"."NEW_VIEW" ("EMPLOYEEID", "USERNAME", "PASSWORD", "NAME", "DEPARTMENT", "MANAGER") AS 
  SELECT EMPLOYEEID, USERNAME, PASSWORD, NAME, DEPARTMENT, MANAGER
FROM EMPLOYEES
;
--------------------------------------------------------
--  DDL for View PRODUCTS_VIEW
--------------------------------------------------------

  CREATE OR REPLACE FORCE EDITIONABLE VIEW "OFFICESUPPLY"."PRODUCTS_VIEW" ("NAME", "DESCRIPT") AS 
  SELECT NAME, DESCRIPT
FROM PRODUCT
;
REM INSERTING into OFFICESUPPLY.CATEGORY
SET DEFINE OFF;
Insert into OFFICESUPPLY.CATEGORY (PRODUCTID,NAME,DESCRIPT) values (1,'Audio Visual',null);
Insert into OFFICESUPPLY.CATEGORY (PRODUCTID,NAME,DESCRIPT) values (2,'Art Supplies',null);
Insert into OFFICESUPPLY.CATEGORY (PRODUCTID,NAME,DESCRIPT) values (3,'Cleaning Supplies','Office');
Insert into OFFICESUPPLY.CATEGORY (PRODUCTID,NAME,DESCRIPT) values (4,'Computer Supplies','Office');
Insert into OFFICESUPPLY.CATEGORY (PRODUCTID,NAME,DESCRIPT) values (5,'Desk Accesories',null);
Insert into OFFICESUPPLY.CATEGORY (PRODUCTID,NAME,DESCRIPT) values (6,'Writting Supplies',null);
Insert into OFFICESUPPLY.CATEGORY (PRODUCTID,NAME,DESCRIPT) values (7,'Printers',null);
Insert into OFFICESUPPLY.CATEGORY (PRODUCTID,NAME,DESCRIPT) values (8,'Staplers','STAPLERS FOR EVERYONE');
REM INSERTING into OFFICESUPPLY.EMPLOYEES
SET DEFINE OFF;
Insert into OFFICESUPPLY.EMPLOYEES (EMPLOYEEID,USERNAME,PASSWORD,NAME,DEPARTMENT,MANAGER,SSN,SALARY) values (1,'dclark','drc','dclark','HR',0,null,null);
Insert into OFFICESUPPLY.EMPLOYEES (EMPLOYEEID,USERNAME,PASSWORD,NAME,DEPARTMENT,MANAGER,SSN,SALARY) values (2,'jsmith','js','jsmith','IT',1,null,null);
Insert into OFFICESUPPLY.EMPLOYEES (EMPLOYEEID,USERNAME,PASSWORD,NAME,DEPARTMENT,MANAGER,SSN,SALARY) values (3,'mjones','mj','mjones','HR',1,null,null);
Insert into OFFICESUPPLY.EMPLOYEES (EMPLOYEEID,USERNAME,PASSWORD,NAME,DEPARTMENT,MANAGER,SSN,SALARY) values (4,'klink','kl','klink','IT',0,null,null);
Insert into OFFICESUPPLY.EMPLOYEES (EMPLOYEEID,USERNAME,PASSWORD,NAME,DEPARTMENT,MANAGER,SSN,SALARY) values (6,'zvaughn','zva','zvaughn','HR',0,null,null);
Insert into OFFICESUPPLY.EMPLOYEES (EMPLOYEEID,USERNAME,PASSWORD,NAME,DEPARTMENT,MANAGER,SSN,SALARY) values (7,'Jojo','jojo123','JKelly','IT',1,null,null);
REM INSERTING into OFFICESUPPLY.ORDERITEM
SET DEFINE OFF;
REM INSERTING into OFFICESUPPLY.ORDERS
SET DEFINE OFF;
Insert into OFFICESUPPLY.ORDERS (ORDERID,EMPLOYEEID,ORDERDATE,STATUS) values (1,1,to_date('01-MAR-98','DD-MON-RR'),'B');
Insert into OFFICESUPPLY.ORDERS (ORDERID,EMPLOYEEID,ORDERDATE,STATUS) values (2,1,to_date('02-MAR-98','DD-MON-RR'),'B');
REM INSERTING into OFFICESUPPLY.PRODUCT
SET DEFINE OFF;
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (1,2,'Ruler','12 Inch Stainless Steel',2.79,2);
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (2,1,'Transparency','Quick dry ink jet',24.49,1);
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (3,1,'Overhead Bulb','High intensity replacement bulb',12,1);
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (4,1,'Laser Pointer','General purpose laser pointer',29.99,2);
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (5,2,'Colored Pencils','Non toxic 12 pack',2.84,1);
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (6,3,'All-Purpose Cleaner','Use on all washable surfaces',4.29,2);
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (7,3,'Paper Hand Towels','320 sheet per roll',5.25,1);
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (8,4,'CD-R','700mb with jewel case',1.09,1);
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (9,4,'3.5 inch Disks','High Density Formatted Box of 10',5.99,1);
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (10,4,'Monitor wipes','Non abrasive link free',6.99,2);
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (11,4,'Dust Blaster','Ozone safe no CFCs',8.99,2);
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (12,2,'Clear Tape','1 Inch wide 6 rolls',3.9,1);
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (13,1,'Overhead Projector','Portable with travel cover',759.97,1);
Insert into OFFICESUPPLY.PRODUCT (PRODUCTID,CATID,NAME,DESCRIPT,UNITCOST,SUPPID) values (14,2,'Glue Stick','Oderless non toxic',1.99,2);
REM INSERTING into OFFICESUPPLY.SUPPLIER
SET DEFINE OFF;
Insert into OFFICESUPPLY.SUPPLIER (SUPPID,NAME) values (1,'XYZ OFFICE SUPPLIES');
Insert into OFFICESUPPLY.SUPPLIER (SUPPID,NAME) values (2,'ABC OFFICE PRODUCTS');
--------------------------------------------------------
--  DDL for Index PK_ORDERITEM
--------------------------------------------------------

  CREATE UNIQUE INDEX "OFFICESUPPLY"."PK_ORDERITEM" ON "OFFICESUPPLY"."ORDERITEM" ("ORDERID", "PRODUCTID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_ORDERS
--------------------------------------------------------

  CREATE UNIQUE INDEX "OFFICESUPPLY"."PK_ORDERS" ON "OFFICESUPPLY"."ORDERS" ("ORDERID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_CATEGORY
--------------------------------------------------------

  CREATE UNIQUE INDEX "OFFICESUPPLY"."PK_CATEGORY" ON "OFFICESUPPLY"."CATEGORY" ("PRODUCTID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_EMPLOYEES
--------------------------------------------------------

  CREATE UNIQUE INDEX "OFFICESUPPLY"."PK_EMPLOYEES" ON "OFFICESUPPLY"."EMPLOYEES" ("EMPLOYEEID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_SUPPLIER
--------------------------------------------------------

  CREATE UNIQUE INDEX "OFFICESUPPLY"."PK_SUPPLIER" ON "OFFICESUPPLY"."SUPPLIER" ("SUPPID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index CUST_INDEX2
--------------------------------------------------------

  CREATE INDEX "OFFICESUPPLY"."CUST_INDEX2" ON "OFFICESUPPLY"."ORDERITEM" ("ORDERID", "PRODUCTID", "QUANTITY") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_PRODUCT
--------------------------------------------------------

  CREATE UNIQUE INDEX "OFFICESUPPLY"."PK_PRODUCT" ON "OFFICESUPPLY"."PRODUCT" ("PRODUCTID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Trigger AFTER_DELETE2
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "OFFICESUPPLY"."AFTER_DELETE2" 
AFTER DELETE
ON CATEGORY
FOR EACH ROW 

BEGIN

DBMS_OUTPUT.PUT_LINE('Item deleted');
END;

/
ALTER TRIGGER "OFFICESUPPLY"."AFTER_DELETE2" ENABLE;
--------------------------------------------------------
--  DDL for Trigger CATEGORY_TRIGGER
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "OFFICESUPPLY"."CATEGORY_TRIGGER" 
AFTER UPDATE ON CATEGORY
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('ROW UPDATED');
END;

/
ALTER TRIGGER "OFFICESUPPLY"."CATEGORY_TRIGGER" ENABLE;
--------------------------------------------------------
--  DDL for Trigger INS_TRIGGER
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "OFFICESUPPLY"."INS_TRIGGER" 
AFTER INSERT ON CATEGORY
FOR EACH ROW

BEGIN

DBMS_OUTPUT.PUT_LINE('HELLO');
END;

/
ALTER TRIGGER "OFFICESUPPLY"."INS_TRIGGER" ENABLE;
--------------------------------------------------------
--  DDL for Trigger RESTRICT_DELETE
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "OFFICESUPPLY"."RESTRICT_DELETE" 
BEFORE DELETE
ON PRODUCT
FOR EACH ROW

DECLARE
products_count number;

BEGIN
products_count := 0;
SELECT count(1) INTO products_count FROM PRODUCT WHERE UNITCOST < 500;
IF (products_count < 500) THEN
RAISE_APPLICATION_ERROR(-20000,products_count || ' products found. First ensure product unit price is above $500.');
END IF;
END;

/
ALTER TRIGGER "OFFICESUPPLY"."RESTRICT_DELETE" ENABLE;
--------------------------------------------------------
--  DDL for Procedure GET_COST
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "OFFICESUPPLY"."GET_COST" 
IS
S           SYS_REFCURSOR;
TEMP_NAME  PRODUCT.NAME%TYPE;
TEMP_COST PRODUCT.UNITCOST%TYPE;

BEGIN
OPEN S FOR
SELECT NAME, UNITCOST
FROM PRODUCT;
LOOP
FETCH S INTO TEMP_NAME, TEMP_COST;
EXIT WHEN S%NOTFOUND;
DBMS_OUTPUT.PUT_LINE(TEMP_NAME||' , '||TEMP_COST);
END LOOP;
CLOSE S;
END;

/
--------------------------------------------------------
--  DDL for Procedure GET_EMPLOYEE_INFO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "OFFICESUPPLY"."GET_EMPLOYEE_INFO" 
(EMP_ID EMPLOYEES.EMPLOYEEID%TYPE)
IS 
TEMP_UN     EMPLOYEES.USERNAME%TYPE;
TEMP_PSSWD  EMPLOYEES.PASSWORD%TYPE;
BEGIN
SELECT USERNAME INTO TEMP_UN
FROM EMPLOYEES
WHERE EMPLOYEEID = EMP_ID;
SELECT PASSWORD INTO TEMP_PSSWD
FROM EMPLOYEES
WHERE EMPLOYEEID = EMP_ID;
DBMS_OUTPUT.PUT_LINE('USERNAME: '||TEMP_UN||', PASSWORD: ' ||TEMP_PSSWD);
END;

/
--------------------------------------------------------
--  DDL for Procedure GET_NAMES
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "OFFICESUPPLY"."GET_NAMES" 
IS
S           SYS_REFCURSOR;
TEMP_UNAME  EMPLOYEES.USERNAME%TYPE;
TEMP_DEP  EMPLOYEES.DEPARTMENT%TYPE;
TEMP_MANA  EMPLOYEES.MANAGER%TYPE;
BEGIN
OPEN S FOR
SELECT USERNAME, DEPARTMENT, MANAGER
FROM EMPLOYEES;
LOOP
FETCH S INTO TEMP_UNAME, TEMP_DEP, TEMP_MANA;
EXIT WHEN S%NOTFOUND;
DBMS_OUTPUT.PUT_LINE(TEMP_UNAME||' , '||TEMP_DEP||' : '||TEMP_MANA);
END LOOP;
CLOSE S;
END;

/
--------------------------------------------------------
--  DDL for Procedure GET_PRODUCTS_TOTAL
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "OFFICESUPPLY"."GET_PRODUCTS_TOTAL" 
(S OUT SYS_REFCURSOR)
IS
TOTAL NUMBER(8);
TEMP_UP PRODUCT.UNITCOST%TYPE;
BEGIN
    OPEN S FOR
    SELECT UNITCOST
    FROM PRODUCT;
    TOTAL := 0;
    LOOP
        FETCH S INTO TEMP_UP;
        EXIT WHEN S%NOTFOUND;
        TOTAL := TOTAL + TEMP_UP;
    END LOOP;
    CLOSE S;
    DBMS_OUTPUT.PUT_LINE('UNITPRICE TOTAL: ' ||TOTAL);
END;

/
--------------------------------------------------------
--  DDL for Procedure INSERT_EMPLOYEE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "OFFICESUPPLY"."INSERT_EMPLOYEE" (EMP_UN OFFICESUPPLY.EMPLOYEES.USERNAME%TYPE, 
                                                    EMP_PASS OFFICESUPPLY.EMPLOYEES.PASSWORD%TYPE, 
                                                    EMP_NAM OFFICESUPPLY.EMPLOYEES.NAME%TYPE, 
                                                    EMP_DEP OFFICESUPPLY.EMPLOYEES.DEPARTMENT%TYPE, 
                                                    EMP_MAN OFFICESUPPLY.EMPLOYEES.MANAGER%TYPE)
IS
    LAST_ID     EMPLOYEES.EMPLOYEEID%TYPE;
BEGIN
    SELECT MAX(EMPLOYEEID)
    INTO LAST_ID
    FROM EMPLOYEES;
    INSERT INTO EMPLOYEES(EMPLOYEEID, USERNAME, PASSWORD, NAME, DEPARTMENT, MANAGER) VALUES (LAST_ID + 1, EMP_UN, EMP_PASS, EMP_NAM, EMP_DEP, EMP_MAN);    
    COMMIT;
END;

/
--------------------------------------------------------
--  DDL for Procedure INSERT_NEW_RECORD
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "OFFICESUPPLY"."INSERT_NEW_RECORD" 
IS
BEGIN
INSERT INTO EMPLOYEES VALUES(7, 'Jojo', 'j123', 'Joric', 'IT', 1);
COMMIT;
END;

/
--------------------------------------------------------
--  DDL for Procedure NEW_MANAGER
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "OFFICESUPPLY"."NEW_MANAGER" 
(EMP_ID EMPLOYEES.EMPLOYEEID%TYPE, 
USRNM EMPLOYEES.USERNAME%TYPE,
PSSWRD EMPLOYEES.PASSWORD%TYPE, 
EMP_NAME EMPLOYEES.NAME%TYPE,
EMP_DPT EMPLOYEES.DEPARTMENT%TYPE,
MANAG EMPLOYEES.MANAGER%TYPE)

IS 
BEGIN
    INSERT INTO EMPLOYEES VALUES(EMP_ID,USRNM,PSSWRD,EMP_NAME,EMP_DPT,MANAG);
END;

/
--------------------------------------------------------
--  DDL for Procedure PRODUCT_PRO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "OFFICESUPPLY"."PRODUCT_PRO" 
IS
S           SYS_REFCURSOR;
TEMP_NAME  PRODUCT.NAME%TYPE;
TEMP_DESC   PRODUCT.DESCRIPT%TYPE;
TEMP_ID     PRODUCT.PRODUCTID%TYPE;
BEGIN
OPEN S FOR
SELECT NAME, DESCRIPT
FROM PRODUCT;
LOOP
FETCH S INTO TEMP_NAME, TEMP_DESC;
EXIT WHEN S%NOTFOUND;
DBMS_OUTPUT.PUT_LINE(TEMP_NAME||','||TEMP_DESC);
END LOOP;
CLOSE S;
END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_CAT
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "OFFICESUPPLY"."UPDATE_CAT" (rc1id CATEGORY.PRODUCTID%TYPE, 
rc1n CATEGORY.NAME%TYPE, 
rc1d CATEGORY.DESCRIPT%TYPE,
rc2id CATEGORY.PRODUCTID%TYPE, 
rc2n CATEGORY.NAME%TYPE,
rc2d CATEGORY.DESCRIPT%TYPE) 
 IS
 BEGIN
    UPDATE CATEGORY
    SET NAME = rc1n, DESCRIPT = rc1d
    WHERE PRODUCTID = rc1id;
    UPDATE CATEGORY
    SET NAME = rc2n, DESCRIPT = rc2d
    WHERE PRODUCTID = rc2id;
    COMMIT;
 END;

/
--------------------------------------------------------
--  DDL for Procedure UPDATING_PRICE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "OFFICESUPPLY"."UPDATING_PRICE" (prod PRODUCT.NAME%TYPE,
pric PRODUCT.UNITCOST%TYPE)
IS
BEGIN
    UPDATE PRODUCT
    SET UNITCOST = pric
    WHERE NAME = prod;
    COMMIT;
END;

/
--------------------------------------------------------
--  DDL for Function LASER_POINTER
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE FUNCTION "OFFICESUPPLY"."LASER_POINTER" 
RETURN NUMBER
IS 
    L   NUMBER;
BEGIN
    SELECT LENGTH(DESCRIPT) INTO L
    FROM PRODUCT
    WHERE NAME = 'Laser Pointer';
    RETURN L;
END;

/
--------------------------------------------------------
--  DDL for Function MANAGER_PAIRING
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE FUNCTION "OFFICESUPPLY"."MANAGER_PAIRING" (x IN VARCHAR2, y IN NUMBER)
RETURN NUMBER AS BOOL NUMBER;
BEGIN
SELECT COUNT(EMPLOYEEID) INTO BOOL
FROM EMPLOYEES WHERE NAME = X AND MANAGER = Y;
RETURN BOOL;
END;

/
--------------------------------------------------------
--  DDL for Function NAMING
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE FUNCTION "OFFICESUPPLY"."NAMING" 
RETURN VARCHAR2
IS 
N VARCHAR2;
BEGIN
    SELECT UPPER(NAME) INTO N
    FROM EMPLOYEES
    WHERE NAME = 'dclark';
    RETURN N;

END;

/
--------------------------------------------------------
--  DDL for Function SUM_PRODUCTS
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE FUNCTION "OFFICESUPPLY"."SUM_PRODUCTS" (x NUMBER, y NUMBER)
RETURN NUMBER AS total NUMBER;
BEGIN
total := x + y;

RETURN total;
END;

/
--------------------------------------------------------
--  Constraints for Table EMPLOYEES
--------------------------------------------------------

  ALTER TABLE "OFFICESUPPLY"."EMPLOYEES" ADD CONSTRAINT "PK_EMPLOYEES" PRIMARY KEY ("EMPLOYEEID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "OFFICESUPPLY"."EMPLOYEES" MODIFY ("MANAGER" NOT NULL ENABLE);
  ALTER TABLE "OFFICESUPPLY"."EMPLOYEES" MODIFY ("DEPARTMENT" NOT NULL ENABLE);
  ALTER TABLE "OFFICESUPPLY"."EMPLOYEES" MODIFY ("NAME" NOT NULL ENABLE);
  ALTER TABLE "OFFICESUPPLY"."EMPLOYEES" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "OFFICESUPPLY"."EMPLOYEES" MODIFY ("USERNAME" NOT NULL ENABLE);
  ALTER TABLE "OFFICESUPPLY"."EMPLOYEES" MODIFY ("EMPLOYEEID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CATEGORY
--------------------------------------------------------

  ALTER TABLE "OFFICESUPPLY"."CATEGORY" ADD CONSTRAINT "PK_CATEGORY" PRIMARY KEY ("PRODUCTID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "OFFICESUPPLY"."CATEGORY" MODIFY ("PRODUCTID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table SUPPLIER
--------------------------------------------------------

  ALTER TABLE "OFFICESUPPLY"."SUPPLIER" ADD CONSTRAINT "PK_SUPPLIER" PRIMARY KEY ("SUPPID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "OFFICESUPPLY"."SUPPLIER" MODIFY ("SUPPID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ORDERITEM
--------------------------------------------------------

  ALTER TABLE "OFFICESUPPLY"."ORDERITEM" ADD CONSTRAINT "PK_ORDERITEM" PRIMARY KEY ("ORDERID", "PRODUCTID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "OFFICESUPPLY"."ORDERITEM" MODIFY ("QUANTITY" NOT NULL ENABLE);
  ALTER TABLE "OFFICESUPPLY"."ORDERITEM" MODIFY ("PRODUCTID" NOT NULL ENABLE);
  ALTER TABLE "OFFICESUPPLY"."ORDERITEM" MODIFY ("ORDERID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ORDERS
--------------------------------------------------------

  ALTER TABLE "OFFICESUPPLY"."ORDERS" ADD CONSTRAINT "PK_ORDERS" PRIMARY KEY ("ORDERID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "OFFICESUPPLY"."ORDERS" MODIFY ("STATUS" NOT NULL ENABLE);
  ALTER TABLE "OFFICESUPPLY"."ORDERS" MODIFY ("ORDERDATE" NOT NULL ENABLE);
  ALTER TABLE "OFFICESUPPLY"."ORDERS" MODIFY ("EMPLOYEEID" NOT NULL ENABLE);
  ALTER TABLE "OFFICESUPPLY"."ORDERS" MODIFY ("ORDERID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PRODUCT
--------------------------------------------------------

  ALTER TABLE "OFFICESUPPLY"."PRODUCT" ADD CONSTRAINT "PK_PRODUCT" PRIMARY KEY ("PRODUCTID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "OFFICESUPPLY"."PRODUCT" MODIFY ("SUPPID" NOT NULL ENABLE);
  ALTER TABLE "OFFICESUPPLY"."PRODUCT" MODIFY ("CATID" NOT NULL ENABLE);
  ALTER TABLE "OFFICESUPPLY"."PRODUCT" MODIFY ("PRODUCTID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table ORDERITEM
--------------------------------------------------------

  ALTER TABLE "OFFICESUPPLY"."ORDERITEM" ADD CONSTRAINT "FK_ORDER" FOREIGN KEY ("ORDERID")
	  REFERENCES "OFFICESUPPLY"."ORDERS" ("ORDERID") ON DELETE SET NULL ENABLE;
  ALTER TABLE "OFFICESUPPLY"."ORDERITEM" ADD CONSTRAINT "FK_PRODUCT" FOREIGN KEY ("PRODUCTID")
	  REFERENCES "OFFICESUPPLY"."PRODUCT" ("PRODUCTID") ON DELETE SET NULL ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ORDERS
--------------------------------------------------------

  ALTER TABLE "OFFICESUPPLY"."ORDERS" ADD CONSTRAINT "FK_EMPLOYEES" FOREIGN KEY ("EMPLOYEEID")
	  REFERENCES "OFFICESUPPLY"."EMPLOYEES" ("EMPLOYEEID") ON DELETE SET NULL ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PRODUCT
--------------------------------------------------------

  ALTER TABLE "OFFICESUPPLY"."PRODUCT" ADD CONSTRAINT "FK_CATEGORY" FOREIGN KEY ("CATID")
	  REFERENCES "OFFICESUPPLY"."CATEGORY" ("PRODUCTID") ON DELETE SET NULL ENABLE;
  ALTER TABLE "OFFICESUPPLY"."PRODUCT" ADD CONSTRAINT "FK_SUPPLIER" FOREIGN KEY ("SUPPID")
	  REFERENCES "OFFICESUPPLY"."SUPPLIER" ("SUPPID") ON DELETE SET NULL ENABLE;