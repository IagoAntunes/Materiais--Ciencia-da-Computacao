
/* 3- Faça um programa que simule uma venda de pneus. Solicite ao usuário a quantidade de pneus, o
   valor de cada pneu, o desconto da compra e em quantas parcelas será feito o pagamento. Ao final
   imprimir as informações na tela com o valor de cada parcela. */


#include <stdio.h>


int main(){
	
	int qtd,parcelas,a;
	float valor,vt,desconto,desconto2;
	
	a = 0;
	
	printf("Quantidade De Pneus:");
	scanf("%i",&qtd);
	
	while (a < qtd ){
		printf("Valor do Pneu:");
		scanf("%f",&valor);
		a = a + 1;
		vt = vt + valor;	
	}
	printf("Desconto:");
	scanf("%f",&desconto);
	
	desconto2 = vt -(vt*(desconto/100));
	
	
	printf("Parcelas:");
	scanf("%i",&parcelas);
	
	printf("\nValor Total: R$ %.2f",desconto2);
	printf("\nParcelado em %i veses",parcelas);
	printf("\nValor das Parcelas: R$ %.2f",desconto2 / parcelas);
	
		
	}


    