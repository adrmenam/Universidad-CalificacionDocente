/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     07/07/2018 16:28:32                          */
/*==============================================================*/


drop table if exists EVA_CUESTIONARIO;

drop table if exists EVA_DETALLE_EVALUACON;

drop table if exists EVA_EVALUACION;

drop table if exists EVA_PREGUNTA;

drop table if exists EVA_RESPUESTA_CUESTIONARIO;

drop table if exists EVA_RESPUESTA_PREGUNTA;

drop table if exists EVA_RESULTADO_EVALUACION;

/*==============================================================*/
/* Table: EVA_CUESTIONARIO                                      */
/*==============================================================*/
create table EVA_CUESTIONARIO
(
   COD_CUESTIONARIO     varchar(30) not null comment 'Codigo identificador del Cuestionario',
   FECHA_CREACION       date not null comment 'Fecha de creacion del cuestionario',
   ESTADO               varchar(3) not null comment 'Estado del cuestionario. Los posibles valores son:\r\n            ACT	Activo\r\n            INA	Inactivo\r\n            SUS	Suspendido\r\n            BLO	Bloqueado\r\n            PEN	Pendiente\r\n            REV	En Revision',
   primary key (COD_CUESTIONARIO)
)
ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Entidad que almacena todos los cuestionarios';

/*==============================================================*/
/* Table: EVA_DETALLE_EVALUACON                                 */
/*==============================================================*/
create table EVA_DETALLE_EVALUACON
(
   COD_EVALUACION       varchar(20) not null comment 'Codigo identificador de la evaluacion',
   COD_CUESTIONARIO     varchar(30) not null comment 'Codigo identificador del Cuestionario',
   PONDERACION          decimal(4,2) default NULL comment 'ponderacion que se otorga',
   primary key (COD_EVALUACION, COD_CUESTIONARIO)
)
ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Entidad que almacena el detalle de cada evaluacion junto con';

/*==============================================================*/
/* Table: EVA_EVALUACION                                        */
/*==============================================================*/
create table EVA_EVALUACION
(
   COD_EVALUACION       varchar(20) not null comment 'Codigo identificador de la evaluacion',
   DESCRIPCION          text not null comment 'resultado global del cuestionario',
   primary key (COD_EVALUACION)
)
ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Codigo que almacena las evaluaciones con su respectivo resul';

/*==============================================================*/
/* Table: EVA_PREGUNTA                                          */
/*==============================================================*/
create table EVA_PREGUNTA
(
   COD_PREGUNTA         integer not null comment 'Codigo identifacador de la Pregunta',
   COD_CUESTIONARIO     varchar(30) default NULL comment 'Codigo identificador del Cuestionario',
   ENUNCIADO            varchar(200) not null comment 'Enunciado de la pregunta',
   primary key (COD_PREGUNTA)
)
ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='ENTIDAD QUE ALMACENA LA TOTALIDAD DE LAS PREGUNTAS';

/*==============================================================*/
/* Table: EVA_RESPUESTA_CUESTIONARIO                            */
/*==============================================================*/
create table EVA_RESPUESTA_CUESTIONARIO
(
   COD_PERSONA          varchar(20) not null comment 'Codigo identificador de la persona',
   COD_EVALUACION       varchar(20) not null comment 'Codigo identificador de la evaluacion',
   COD_CUESTIONARIO     varchar(30) not null comment 'Codigo identificador del Cuestionario',
   COD_NRC              varchar(5) not null,
   FECHA                date not null comment 'Fecha de Resultado Final',
   CALIFICACION_PROMEDIO decimal(4,2) not null comment 'Calificacion obtenida',
   primary key (COD_EVALUACION, COD_PERSONA, COD_CUESTIONARIO, COD_NRC)
)
ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Entidad que almancena el resultado final de cada encuesta de';

/*==============================================================*/
/* Table: EVA_RESPUESTA_PREGUNTA                                */
/*==============================================================*/
create table EVA_RESPUESTA_PREGUNTA
(
   COD_REGISTRO_RESPUESTAS integer not null auto_increment comment 'Codigo identificador del Registro de Respuestas',
   COD_PREGUNTA         integer not null comment 'Codigo identificador de la pregunta',
   COD_PERSONA          varchar(20) not null,
   RESPUESTA            integer not null comment 'Respuesta a la pregunta especifica',
   primary key (COD_REGISTRO_RESPUESTAS)
)
ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Entidad que almacena la respuesta por cada pregunta de un re';

/*==============================================================*/
/* Table: EVA_RESULTADO_EVALUACION                              */
/*==============================================================*/
create table EVA_RESULTADO_EVALUACION
(
   COD_EVALUACION       varchar(20) not null comment 'Codigo identificador de la evaluacion',
   COD_NRC              varchar(5) not null,
   PROMEDIO_TOTAL       decimal(4,2) not null,
   primary key (COD_EVALUACION, COD_NRC)
)
ENGINE=InnoDB DEFAULT CHARSET=latin1;