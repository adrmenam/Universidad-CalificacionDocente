INSERT INTO `eva_cuestionario` (`COD_CUESTIONARIO`, `FECHA_CREACION`, `ESTADO`) VALUES
('CUES001', '2010-01-15', 'BLO'),
('CUES002', '2018-04-02', 'ACT'),
('CUES003', '2002-07-06', 'SUS'),
('CUES004', '2008-08-14', 'INA'),
('CUES005', '2017-06-13', 'SUS'),
('CUES006', '2018-03-27', 'INA'),
('CUES007', '2018-02-13', 'PEN'),
('CUES008', '2010-12-11', 'REV'),
('CUES009', '2018-05-02', 'INA'),
('CUES010', '2011-08-16', 'BLO'),
('CUES011', '2018-05-01', 'INA'),
('CUES012', '2018-02-12', 'BLO'),
('CUES013', '2017-11-15', 'BLO'),
('CUES014', '2018-05-05', 'PEN'),
('CUES015', '2018-05-28', 'PEN'),
('CUES016', '2006-02-14', 'SUS'),
('CUES017', '2018-05-01', 'REV'),
('CUES018', '2007-10-10', 'SUS'),
('CUES019', '2003-05-13', 'SUS'),
('CUES020', '2003-07-09', 'SUS'),
('CUES021', '2018-01-01', 'PEN'),
('CUES022', '2017-11-14', 'ACT'),
('CUES023', '2008-12-11', 'REV'),
('CUES024', '2018-01-24', 'PEN'),
('CUES025', '2017-09-13', 'SUS');

INSERT INTO `eva_detalle_evaluacon` (`COD_EVALUACION`, `COD_CUESTIONARIO`, `COD_PERFIL`, `PONDERACION`) VALUES
('EVA0001', 'CUES001', 'EST', '0.99'),
('EVA0002', 'CUES002', 'EST', '0.99'),
('EVA0003', 'CUES003', 'DOC', '0.99'),
('EVA0004', 'CUES004', 'DIR', '0.99');

INSERT INTO `eva_evaluacion` (`COD_EVALUACION`, `DESCRIPCION`) VALUES
('EVA0001', 'Dominio de la disciplina'),
('EVA0002', 'Planificacion del curso'),
('EVA0003', 'Ambientes de aprendizaje'),
('EVA0004', 'Estrategias, Metodos y tecnicas');

INSERT INTO `eva_pregunta` (`COD_PREGUNTA`, `COD_CUESTIONARIO`, `ENUNCIADO`) VALUES
(1, 'CUES001', 'Domina los principios, fundamentos y conceptos de la disciplina que imparte en el curso.'),
(2, 'CUES001', 'Planifica con precisión y detalle el proceso de aprendizaje, con base en la naturaleza de los contenidos, las características de los estudiantes y el perfil del curso y de la carrera.'),
(3, 'CUES001', 'Crea ambientes, espacios y climas donde los estudiantes aprenden con eficacia y gusto.'),
(4, 'CUES001', 'Usa estrategias, métodos y técnicas efectivas de aprendizaje'),
(5, 'CUES001', 'Estimula el interÃ©s de los estudiantes por un aprendizaje efectivo.'),
(6, 'CUES002', 'Desarrolla sistemas, estrategias y criterios de evaluación que apoyan y favorecen el aprendizaje de los estudiantes.'),
(7, 'CUES002', 'Usa y favorece las diferentes formas y medios de expresiÃ³n para establecer una comunicación genuina entre los actores del proceso de aprendizaje.'),
(8, 'CUES002', 'Es responsable y equitativo en las actividades relacionadas con el curso.'),
(9, 'CUES002', 'Integra, con responsabilidad, el uso intensivo de las tecnologías de la información y de la comunicación en el proceso de aprendizaje.'),
(10, 'CUES003', 'Explica de manera clara los contenidos de la asignatura.'),
(11, 'CUES003', 'Relaciona los contenidos de la asignatura con los contenidos de otras.'),
(12, 'CUES003', 'Resuelve las dudas relacionadas con los contenidos de la asignatura.'),
(13, 'CUES003', 'Propone ejemplos o ejercicios que vinculan la asignatura con la práctica profesional.'),
(14, 'CUES003', 'Explica la utilidad de los contenidos teóricos y prácticos para la actividad profesional.'),
(15, 'CUES004', 'Incluye experiencias de aprendizaje en lugares diferentes al aula (talleres, laboratorios, empresa, comunidad, etc.).'),
(16, 'CUES004', 'Utiliza para el aprendizaje las herramientas de interacción de las tecnologías actuales de la información (correo electrÃ³nico, chats, plataformas, etc.).'),
(17, 'CUES004', 'Organiza actividades que me permiten ejercitar mi expresión oral y escrita.'),
(18, 'CUES004', 'Relaciona los contenidos de la asignatura con la industria y la sociedad a nivel local, regional, nacional e internacional.'),
(19, 'CUES004', 'Usa ejemplos y casos relacionados con la vida real.'),
(20, 'CUES005', 'Adapta las actividades para atender los diferentes estilos de aprendizaje de los estudiantes'),
(21, 'CUES005', 'Promueve el autodidactismo y la investigación'),
(22, 'CUES005', 'Promueve actividades participativas que me permiten colaborar con mis compañeros con una actitud positiva.'),
(23, 'CUES005', 'Estimula la reflexión sobre la manera en que aprendes.'),
(24, 'CUES005', 'Se involucra en las actividades propuestas al grupo.'),
(25, 'CUES005', 'Presenta y expone las clases de manera organizada y estructurada.'),
(26, 'CUES005', 'Utiliza diversas estrategias, métodos, medios y materiales. '),
(27, 'CUES006', 'Muestra compromiso y entusiasmo en sus actividades docentes'),
(28, 'CUES006', 'Toma en cuenta las necesidades, intereses y expectativas del grupo.'),
(29, 'CUES006', 'Propicia el desarrollo de un ambiente de respeto y confianza'),
(30, 'CUES006', 'Propicia la curiosidad y el deseo de aprender.'),
(31, 'CUES006', 'Reconoce los éxitos y logros en las actividades de aprendizaje.'),
(32, 'CUES006', ' Existe la impresión de que se toman represalias con algunos estudiantes.'),
(33, 'CUES006', 'Hace interesante la asignatura. '),
(34, 'CUES007', 'Identifica los conocimientos y habilidades de los estudiantes al inicio de la asignatura o de cada unidad.'),
(35, 'CUES007', 'Proporciona informaciÃ³n para realizar adecuadamente las actividades de evaluación.'),
(36, 'CUES007', 'Da a conocer las calificaciones en el plazo establecido.Da oportunidad de mejorar los resultados de la evaluación del aprendizaje.'),
(37, 'CUES007', 'Muestra apertura para la corrección de errores de apreciaciÃ³n y evaluación.'),
(38, 'CUES007', 'Otorga calificaciones imparciales. '),
(39, 'CUES007', ' Toma en cuenta las actividades realizadas y los productos como evidencias para la calificación y acreditación de la asignatura.'),
(40, 'CUES007', 'Considera los resultados de la evaluación (asesorías, trabajos complementarios, búsqueda de información, etc.) para realizar mejoras en el aprendizaje.');

INSERT INTO `eva_respuesta_cuestionario` (`COD_PERSONA`, `COD_EVALUACION`, `COD_CUESTIONARIO`, `COD_NRC`, `FECHA`, `CALIFICACION_PROMEDIO`) VALUES
('0100967652', 'EVA0001', 'CUES001', 'N-001', '2018-02-02', '0.99'),
('1715241434', 'EVA0001', 'CUES001', 'N-002', '2018-06-04', '1.60'),
('1714818299', 'EVA0002', 'CUES002', 'N-003', '2018-03-02', '0.99'),
('0913537742', 'EVA0003', 'CUES003', 'N-004', '2018-05-02', '0.99');

INSERT INTO `eva_respuesta_pregunta` (`COD_REGISTRO_RESPUESTAS`, `COD_PREGUNTA`, `COD_PERSONA`, `RESPUESTA`) VALUES
(1, 1, '1303753618', 4),
(2, 2, '1303753618', 5),
(3, 3, '1303753618', 5),
(4, 4, '1303753618', 5),
(5, 5, '1303753618', 4),
(6, 6, '1706172648', 4),
(7, 7, '1706172648', 3),
(8, 8, '1706172648', 2),
(9, 9, '1706172648', 2),
(10, 10, '0100967652', 4),
(11, 11, '0100967652', 4),
(12, 12, '0100967652', 4),
(13, 13, '0100967652', 5),
(14, 14, '0100967652', 2),
(15, 15, '1102815808', 5),
(16, 16, '1102815808', 5),
(17, 17, '1102815808', 5),
(18, 18, '1102815808', 5),
(19, 19, '1102815808', 5),
(20, 1, '1715241434', 1),
(21, 2, '1715241434', 1),
(22, 3, '1715241434', 2),
(23, 4, '1715241434', 2),
(24, 5, '1715241434', 2),
(25, 1, '0100967652', 10),
(26, 2, '0100967652', 10),
(27, 3, '0100967652', 10),
(28, 4, '0100967652', 10),
(29, 5, '0100967652', 10);

INSERT INTO `eva_resultado_evaluacion` (`COD_EVALUACION`, `COD_NRC`, `PROMEDIO_TOTAL`) VALUES
('EVA0001', 'N-001',  '0.99'),
('EVA0001', 'N-005',  '0.99'),
('EVA0002', 'N-002',  '0.99'),
('EVA0003', 'N-003',  '0.99'),
('EVA0004', 'N-004',  '0.99');






