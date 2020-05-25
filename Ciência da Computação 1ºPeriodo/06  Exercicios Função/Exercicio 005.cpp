
/*Dados dos vetores A e B de 10 posições multiplique seus valores conforme exemplo
e apresente o resultado: */

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	
	int i,vetorA[10],vetorB[10],vetorC[10];
	
	
	for(i=0;i<10;i++){
		printf("Numero%i :",i+1);
		scanf("%i", &vetorA[i]);
	}
	
	for(i=0;i<10;i++){
		printf("Numero%i :",i+1);
		scanf("%i", &vetorB[i]);
	}
	
	for(i=0;i<10;i++){
		vetorC[i] = vetorA[i] * vetorB[i];
		printf("%i ", vetorC[i]);
	}	
}
