
/* Faça um programa na qual o usuario possa digitar os valores da compra,o programa so encerra quando o usuario digitar 0,Ao final pergunte ao usuario o Numero de parcelas ,e se é para Entrega, Caso seja A vista(1 parcrela) o desconto sera de 50 %,Parcelado o desonto sera de 30%,O valor de entrega é de R$ 30,00,ao final informe o valor de cada parcela junto com o frete. */

#include <stdio.h>
#include <stdlib.h>

int main () {
 
 
 float soma,compra,valor,parcelas,entrega,desconto,total,desconto2,total2,parcelado;
 compra = 1;
 while(compra != 0){
 	compra = compra - 1;
 	printf("Valor:");
 	scanf("%f", &compra);
 	soma = soma + compra;
	 
}
printf("\nSoma: %f",soma);

printf("Quantas Parcelas:");
scanf("%f", &parcelas);


if(parcelas == 1){
	desconto = soma / 2;
	total = soma - desconto;
	printf("e para Entrega :[1]Sim[2]Nao");
	scanf("%f", &entrega);
	if(entrega == 1){
		total = total + 30;
		printf("Valor Da parcela : %f",total);
}
	else{
		printf("Valor da Parcela : %f",total);
	}
}
else{
		desconto2 = (soma * 30)/100;
		printf("e para Entrega :[1]Sim[2]Nao");
		scanf("%f", &entrega);
		if(entrega == 1){
			total2 = total2 + 30;
			total2 = soma - desconto2;
			parcelado = total2 / parcelas;
			printf("Valor de Cada Parcela : %f",parcelado);
	}
		else{
			total2 = soma - desconto2;
			parcelado = total2 / parcelas;
			printf("Valor de Cada Parcela : %f",parcelado);
		}
	}
}

