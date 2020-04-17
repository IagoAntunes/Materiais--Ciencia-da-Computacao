
/* 4- Faça um programa que calcule lucros em um investimento. O usuário deverá informar o valor
   investido e o valor final que foi sacado. Ao final informar o lucro em reais e em percentual. */

#include <stdio.h>

int main(){
	
	float valoriv,valorrb,formula,lucro;
	
	printf("Valor Investido:");
	scanf("%f",&valoriv);
	
	printf("Valor Recebido:");
	scanf("%f",&valorrb);
	
	lucro = valorrb - valoriv;
	formula = (lucro * 100)/valoriv;
	
	
	
	printf("\nDados do Investimento:");
	printf("\nValor Investido: R$ %.3f",valoriv);
	printf("\nValor Recebido: R$ %.3f",valorrb);
	printf("\nLucro: R$ %.2f",lucro);
	printf("\nLucro Percentual: %.0f %%",formula);

	}


