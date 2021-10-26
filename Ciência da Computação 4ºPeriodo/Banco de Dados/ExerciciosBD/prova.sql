
CREATE TABLE equipe(
  id_equipe INT PRIMARY KEY,
  nome_equipe VARCHAR(100) NOT NULL,
  data_fundacao DATE NOT NULL,
  pais VARCHAR(100),
  estado VARCHAR(100),
  cidade VARCHAR(100),
  quantidade_socios INT
  );
  
CREATE TABLE jogador(
  id_jogador INT PRIMARY KEY,
  nome_jogador VARCHAR(100) NOT NULL,
  data_nascimento DATE NOT NULL,
  cpf DECIMAL(13) NOT NULL,
  cidade VARCHAR(100)
);

CREATE TABLE contrato(
  id_equipe INT,
  id_jogador INT,
  data_entrada DATE PRIMARY KEY,
  data_saida DATE,
  salario FLOAT NOT NULL
);

ALTER TABLE contrato ADD CONSTRAINT id_jogador FOREIGN KEY (id_jogador) references jogador(id_jogador);
ALTER TABLE contrato ADD CONSTRAINT id_equipe FOREIGN KEY (id_equipe) references equipe(id_equipe);

INSERT INTO jogador(id_jogador,nome_jogador,data_nascimento,cpf,cidade) VALUES
(0,'Joao','2018/07/13','2222222.2','Itauna'),
(1,'Joao','2018/07/13','2222222.2','Itauna'),
(2,'Joao','2018/07/13','2222222.2','Itauna'),
(3,'Joao','2018/07/13','2222222.2','Itauna'),
(4,'Joao','1992/07/13','2222222.2','Itauna'),
(5,'Joao','1991/07/13','2222222.2','Itauna');

INSERT INTO contrato(data_entrada,data_saida,salario) VALUES
('2018/07/13','1991/07/13',1500),
('2018/07/13','1991/07/13',2000),
('2018/07/13','2018/07/13',3000),
('2018/07/13','2018/07/13',4000),
('2018/07/13','1992/07/13',5000 ),
('2018/07/13','1991/07/13',12000);

SELECT avg(quantidade_socios) from equipe;

SELECT nome_jogador,data_nascimento FROM jogador
WHERE data_nascimento BETWEEN '1990/01/01' and '1999/12/31';

SELECT nome_jogador FROM jogador WHERE YEAR(data_nascimento) BETWEEN 1990 AND 1999;

SELECT count(id_equipe) FROM equipe 
WHERE YEAR(data_fundacao) = '1980';

SELECT max(salario) FROM contrato
WHERE data_entrada >= '2015/01/01';

SELECT sum(salario) FROM contrato 
WHERE data_saida is null and id_equipe = 4;

UPDATE equipe
set pais = 'Brasil', estado = 'Minas Gerais'
WHERE cidade LIKE '%Horizonte';


DELETE FROM contrato
WHERE data_saida IS NOT NULL AND salario < 5000.00;



select * from contrato;





  