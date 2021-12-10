
/*01*/
select nome, c.Placa from cliente
JOIN orcamento as o ON month(o.DataOrcamento) = '04' && year(o.DataOrcamento) = '2012'
JOIN carro as c on c.Cliente_CPF = CPF && o.Carro_Cod_Orcamento = Cod_Carro
Order by nome asc;
/*02*/


/*03*/
select o.COD_ORCAMENTO from servico
Join SERVICO_Has_ORCAMENTO as SercOrc on COD_SERVICO = SercOrc.SERVICO_COD_SERICO
Join ORCAMENTO as o on o.COD_ORCAMENTO = SercOrc.ORCAMENTO_COD_ORCAMENTO
where Val_Servico > 3000;
/*04*/
select AnoFabricacao,count(Cod_Carro) from carro
Group By AnoFabricacao;
/*05*/
Select * from cliente
join carro as c on c.Cliente_CPF = CPF
join orcamento as o on o.Carro_Cod_Orcamento != c.Cod_Carro;
/*06*/
 select placa,IF(o.Carro_Cod_Orcamento = Cod_Carro, o.Cod_Orcamento, "NTEM") as numeroOrcamento from carro
 join orcamento as o;