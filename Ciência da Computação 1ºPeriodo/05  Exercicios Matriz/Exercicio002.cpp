
/*Faça um programa que monte uma Matriz começando pela vertical,e informe a soma das colunas*/

#include <stdlib.h>
#include <stdio.h>
#include <math.h >


int main(){


int vetor[4][4],i,j,soma[4] = {0,0,0,0};

for(i=0;i<4;i++){
	for(j=0;j<4;j++){
		printf("Linha %i Coluna %i ",i,j);
		scanf("%i", &vetor[i][j]);
		soma[i] = soma[i] + vetor[i][j];
	}
	
	
}
for(i=0;i<4;i++){
	printf("\n");
	for(j=0;j<4;j++){
		printf("%i ",vetor[j][i]);
		
	}
}
printf("\n");
for(i=0;i<4;i++){
	printf("%i ",soma[i]);
}
	
}
