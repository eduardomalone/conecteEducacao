INSERT INTO tb_disciplina (name) VALUES ('Matematica');
INSERT INTO tb_disciplina (name) VALUES ('Fisica');
INSERT INTO tb_disciplina (name) VALUES ('Fisica II');
INSERT INTO tb_disciplina (name) VALUES ('Calculo');
INSERT INTO tb_disciplina (name) VALUES ('Portugues');
INSERT INTO tb_disciplina (name) VALUES ('Biologia');

INSERT INTO tb_conteudo (assunto, image_Uri, nivel, texto, titulo) VALUES ('Leis de Newton', 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_penne.jpg',
                                                                             1, 'xxxxxxxxxxxxxxxx', 'Primeira Lei');

INSERT INTO tb_conteudo (assunto, image_Uri, nivel, texto, titulo) VALUES ('Algebra', 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_penne.jpg',
                                                                             2, 'xxxxxxxxxxxxxxxx', 'Teoremas');

INSERT INTO tb_conteudo (assunto, image_Uri, nivel, texto, titulo) VALUES ('Matematica', 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_penne.jpg',
                                                                             1, 'xxxxxxxxxxxxxxxx', 'trigonometria');

 INSERT INTO tb_conteudo (assunto, image_Uri, nivel, texto, titulo) VALUES ('Eletreca', 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_penne.jpg',
                                                                             3, 'xxxxxxxxxxxxxxxx', 'eletrecidade');  



INSERT INTO tb_conteudo_disciplina (conteudo_id, disciplina_id) VALUES (1 , 1);
INSERT INTO tb_conteudo_disciplina (conteudo_id, disciplina_id) VALUES (2 , 1);
INSERT INTO tb_conteudo_disciplina (conteudo_id, disciplina_id) VALUES (1 , 2);
INSERT INTO tb_conteudo_disciplina (conteudo_id, disciplina_id) VALUES (2 , 2);