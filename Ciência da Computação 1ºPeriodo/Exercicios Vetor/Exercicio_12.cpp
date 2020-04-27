/* Faça um programa para receber uma relação de 10 números inteiros. Ao final multiplique cada um dos valores pelo maior número do vetor e apresente o resultado. */


#include <stdio.h>
#include <stdlib.h>
int main () {
	
	int vetor[10],i,maior;
	
	maior = -100;
    for(i=0;i<10;i++){
    	printf("Numero%i :",i+1);
    	scanf("%i", &vetor[i]);
    	if(vetor[i] > maior){
    		maior = vetor[i];
		}
		}
	for(i=0;i<10;i++){
		printf("\n %i * %i = %i ",vetor[i],maior,vetor[i] * maior);
	}
    	
	
	}
