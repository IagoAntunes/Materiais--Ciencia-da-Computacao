/*Dado um vetor de 15 números inteiros, escreva um programa que imprima todos os múltiplos de 3 que estão
contidos no vetor.  */


#include <stdio.h>
#include <stdlib.h>
int main () {
	
	int vetor[15],i;
	
    for(i=0;i<15;i++){
    	printf("Numero%i :",i);
    	scanf("%i", &vetor[i]);
		}
	for(i=0;i<15;i++){
		if(vetor[i] % 3 == 0){
    		printf("%i ",vetor[i]);
	}
    	
	
	}


}
