# crud-spring-boot-postgresql
Service Rest Spring Boot Postgresql - Versão 9

02-03-2018
By Thiago Hernandes de Souza

Banco de dados: "pessoas"

Tabela: 
CREATE TABLE funcionario (
  id serial NOT NULL,
  nome varchar(150) NOT NULL,
  nascimento date,
  salario numeric(10,2),
  PRIMARY KEY (id)
)

Dados extra:

insert into funcionario(nome,nascimento,salario)
values('Fulano','1959-03-06',10000);

insert into funcionario(nome,nascimento,salario)
values('Ciclano','1974-08-01',20000);

insert into funcionario(nome,nascimento,salario)
values('Delano','1989-07-17',8000);

commit;


