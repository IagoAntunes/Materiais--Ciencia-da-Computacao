
CREATE TABLE ambulatorio(
  nroa INT PRIMARY KEY,
  andar NUMERIC(3) NOT NULL,
  capacidade SMALLINT
);

CREATE TABLE Medicos(
  codm INT PRIMARY KEY,
  nome VARCHAR(40) NOT NULL,
  idade SMALLINT NOT NULL,
  especialidade CHAR(20),
  CPF NUMERIC(11) UNIQUE,
  cidade VARCHAR(30) ,
  nroa INT
);

CREATE TABLE Pacientes(
  codp INT PRIMARY KEY,
  nome VARCHAR(40) NOT NULL,
  idade SMALLINT NOT NULL,
  cidade CHAR(30),
  CPF NUMERIC(11) UNIQUE,
  doenca VARCHAR(40) NOT NULL
);

CREATE TABLE Funcionarios(
codf INT PRIMARY KEY,
nome VARCHAR(40) NOT NULL,
idade SMALLINT,
CPF NUMERIC(11) UNIQUE,
cidade VARCHAR(30),
salario NUMERIC(10),
cargo VARCHAR(20)
);

CREATE TABLE `uit`.`consultas` (
  `data` DATE NOT NULL,
  `codf` INT NULL,
  `codm` INT NULL,
  `Hora` TIME NOT NULL,
  PRIMARY KEY (`data`),
  INDEX `codm_idx` (`codm` ASC),
  INDEX `codp_idx` (`codf` ASC),
  CONSTRAINT `codm`
    FOREIGN KEY (`codm`)
    REFERENCES `uit`.`medicos` (`codm`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `codp`
    FOREIGN KEY (`codf`)
    REFERENCES `uit`.`pacientes` (`codp`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


2-
ALTER TABLE funcionarios
ADD nroa INT;

3-
CREATE UNIQUE INDEX CPF ON medicos(CPF);
CREATE UNIQUE INDEX doenca ON pacientes(doenca);

4-
DROP INDEX doenca ON Pacientes;

5-
ALTER TABLE funcionarios
DROP COLUMN cargo;
ALTER TABLE funcionarios
DROP COLUMN nroa;

6-
INSERT INTO ambulatorio(nroa,andar,capacidade) VALUES
(1,1,30),
(2,1.50),
(3,2,40),
(4,2,25),
(5,2,55);

INSERT INTO medicos VALUES
(1,'Joao',40,'Ortopedia',10000100000,'Florianopolis',1),
(2,'Maria',42,'traumatologia',10000110000,'Blumenau',2),
(3,'Pedro',51,'Pediatria',11000100000,'São José ',2),
(4,'Carlos',28,'Ortopedia ',11000110000,'Joinville',0),
(5,'Marcia',33,'Neurologia',11000111000,'Biguacu',3);

INSERT INTO Pacientes VALUES
(1,'Ana',20,'Florianopolis',20000200000,'Gripe'),
(2,'Paulo',24,'Palhoça',20000220000,'Fratura'),
(3,'Lucia',30,'Biguacu ',22000200000,'Tendinite'),
(4,'Carlos',28,'Joinville',11000110000,'sarampo')

INSERT INTO Consultas VALUES
('2018/06/12',1,1,'14:00'),
('2018/07/13',1,4,'10:00'),
('2018/08/13',2,1,'9:00'),
('2018/09/13',2,2,'11:00'),
('2018/06/14',2,3,'14:00'),
('2018/07/14',2,4,'17:00'),
('2018/06/19',3,1,'18:00'),
('2018/07/12',3,3,'10:00'),
('2018/07/19',3,4,'13:00'),
('2018/06/20',4,4,'13:00'),
('2018/06/22',4,4,'19:30');

INSERT INTO Funcionarios VALUES
(1,'Rita',32,20000100000,'Sao Jose',1200),
(2,'Maria',55,30000110000,'Palhoça',1220),
(3,'Caio',45,41000100000,'Florianopolis',1100),
(4,'Carlos',44,51000110000,'Florianopolis',1200),
(5,'Paula',33,61000111000,'Florianopolis',2500);

/*EXERCICIO 2*/
1-
UPDATE pacientes
SET cidade = 'Ilhota'
WHERE nome LIKE 'Paulo'

2-
UPDATE consultas
SET hora = '12:00'
WHERE codm = 1 and codp = 4

UPDATE consultas
SET data = '2018/07/04'
WHERE codm = 1 and codp = 4

3-
UPDATE pacientes
SET idade = 21 , doenca = 'cancer'
WHERE nome LIKE 'ana'

4-
UPDATE consultas
SET hora = '14:30'
WHERE codm = 3 and codp = 4

5-
DELETE FROM funcionarios WHERE nome LIKE 'Carlos';
6-
DELETE FROM consultas WHERE hora > '19:00';
7-
DELETE FROM pacientes WHERE idade < 10 or doenca LIKE 'cancer';
8-
DELETE FROM medicos WHERE cidade LIKE 'Biguacu' or cidade LIKE 'Palhoca';
/*EXERCICIO 3*/
1-
select nome,CPF FROM medicos WHERE idade < 40 or especialidade != 'traumatologia'
2-
select * from consultas where hora > '12:00' and data> '2018/06/19'
3-
select nome,idade from pacientes where cidade != 'Floripa'
4-
select hora from consultas where data < '2018/06/04' and data > '2018/06/20'
5-
select nome,idade*12 from pacientes;
6-
select cidade from funcionarios;
7-
select max(salario),min(salario) FROM funcionarios;
8-
select max(hora) from consultas where data > '2018/06/13'
9-
select avg(idade),sum(nroa) FROM medicos;
10-
select codf,nome,salario,salario - ((20*salario)/100) from funcionarios
11-
select nome from funcionarios where nome LIKE '%a'
12-
select nome,CPF from funcionarios where CPF NOT LIKE '%00000%'
13-
select nome,especialidade from medicos where nome LIKE 'o%'
14-
select codp,nome from pacientes where idade > 25 and  doenca IN ('tendinite', 'fratura', 'gripe','sarampo')

