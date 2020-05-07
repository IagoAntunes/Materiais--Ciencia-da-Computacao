
/* Faça um programa que monte uma Matriz ,e informe a soma das linhas */


#include <stdlib.h>
#include <stdio.h>
#include <math.h >


int main(){


int vetor[4][4],i,j,soma=0;

for(i=0;i<4;i++){
	for(j=0;j<4;j++){
		printf("Linha %i Coluna %i ",i,j);
		scanf("%i", &vetor[i][j]);
	}
	
	
}
for(i=0;i<4;i++){
	soma = 0;
	printf("\n");
	for(j=0;j<4;j++){
		printf("%i ",vetor[i][j]);
		soma = soma + vetor[i][j];
		
	}
	printf("Soma: %i   ",soma);
	
	
	
}
	
}
