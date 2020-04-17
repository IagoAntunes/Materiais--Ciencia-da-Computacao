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


