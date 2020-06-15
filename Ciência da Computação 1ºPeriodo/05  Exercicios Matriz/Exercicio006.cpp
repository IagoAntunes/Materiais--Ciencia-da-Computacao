
/* Criar um algoritmo que carregue uma matriz 12 x 4 com os valores das vendas de uma loja,
em que cada linha represente um mês do ano, e cada coluna, uma semana do mês. Para fins
de simplificação considere que cada mês possui somente 4 semanas. Calcule e imprima: -
Total vendido em cada mês do ano;
Total vendido no ano.
Qual a melhor semana para vender carros? 1ª, 2ª, 3ª ou 4ª?   */

#include <stdlib.h>
#include <stdio.h>

void auxiliar(int venda[12],int total,int melhor);

int main(){
	
	int matriz[12][4],venda[13]={0,0,0,0,0,0,0,0,0,0,0,0},total,semana[4],melhor=semana[0];
	
	for(int i=1;i<=12;i++){
		
		for(int i2=1;i2<=4;i2++){
			printf("Mes%i Semana%i ",i,i2);
			scanf("%i", &matriz[i][i2]);
			venda[i] = venda[i] + matriz[i][i2];
			total = total + matriz[i][i2];
			semana[i2] = semana[i2] + matriz[i][i2];
		}
	}
	
	for(int i2=1;i2<=4;i2++){
		if(semana[i2] > melhor){
			melhor = i2;
		}
	}
	
	auxiliar(venda,total,melhor);
	
		
}

void auxiliar(int venda[12],int total,int melhor){
	
		for(int i3=1;i3<=12;i3++){
		printf("\nMes%i : %i",i3,venda[i3]);
	}
		printf("\n\nTotal de Vendas: %i",total);
		printf("\nMelhor Semana: %i",melhor);
	
}