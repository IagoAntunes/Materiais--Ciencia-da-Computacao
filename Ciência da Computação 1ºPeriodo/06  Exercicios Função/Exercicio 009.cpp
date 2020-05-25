
/*Faça um procedimento que receba, por parâmetro, um vetor A(25) “inteiros” e
substitua todos os valores negativos de ‘A’ por zero. Imprima o vetor na função
principal. */

#include <stdio.h>
#include <stdlib.h>

void auxiliar(int vetor[]){
	int i, soma1,*p;
	
	for(i=0;i<25;i++){
		if(vetor[i] < 0){
			vetor[i] = 0;
		}
	}	
}

int main(){
	
	
int i,vetor[25];


for(i=0;i<25;i++){
	printf("Numero%i:",i);
	scanf("%i", &vetor[i]);
	}
for(i=0;i<25;i++){
	auxiliar(vetor);
	printf("%i",vetor[i]);
	}		
}
