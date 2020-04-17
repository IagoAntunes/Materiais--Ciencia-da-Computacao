
/*O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
Até 5 Kg Acima de 5 Kg
File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
Picanha R$ 6,90 por Kg R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém
não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá
ainda um desconto de 5% sobre o total a compra. Escreva um programa que peça o tipo e a quant idade de
carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade
de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar. */

#include <stdio.h>


int main(){
	
	char nome;
	float tipo,qntd,total,preco,cartao;

	
	printf("Tipo de Carne: \n[1]File Duplo \n[2]Alcatra\n[3]Picanha\n");
	scanf("%f",&tipo);
	
	printf("Quantidade:");
	scanf("%f",&qntd);
	
	printf("Tem Cartao Tabajara? [1]Sim [2]Nao");
	scanf("%f",&cartao);
	
	if (tipo == 1 ) {
		if (qntd <= 5){
			total = qntd * 4.90;
		}
		else{
			total = qntd * 5.80;
		}
	}
	if (tipo == 2){
		if(qntd < 5){
			total = qntd * 5.90;
		}
		else{
			total = qntd * 6.80;
		}
	}
	if (tipo == 3){
	}
		if(qntd < 5){
			total = qntd * 6.90;
		}
		else{
			total = qntd * 7.80;
		}
	
	printf("\n-----NOTA FISCAL-----\n");
	
	if (tipo == 1){
		printf("Tipo: File Duplo");
	}
	else{
	if (tipo == 2){
		printf("Tipo: Alcratra");
	}
	if (tipo == 3){
		printf("Tipo: Picanha");
	}
	}
	printf("\nQuantidade : %.2f",qntd);
	printf("\nPreco Total : %.2f",total);
	
	if (cartao == 1){
		printf("\nTipo de Pagamento: Cartao Tabajara");
		printf("\nDesconto: %.2f",(total*5)/100);
		printf("\nValor a Pagar: %.2f",total -((total*5/100)));
	}
	else{
		if(cartao == 2){
			printf("\nTipo de Pagamento: Outro");
			printf("\nDesconto: 0");
			printf("\nValor a Pagar: %.2f",total);
		}
	}
}

