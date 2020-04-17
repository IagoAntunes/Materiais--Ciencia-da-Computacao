
/*Faça um programa para receber 10 números inteiros. Ao final, multiplique todos os valores pelo 3 valor informado no vetor e apresente o resultado. */


#include <stdio.h>


int main(){
	
	int num[10],i;
	
	for(i=0;i<10;i++) {
	printf("Numero:");
	scanf("%i",&num[i]);
	
}
	for(i=0;i<10;i++) {
	printf("\n%i * %i = %i ", num[i],num[2],num[i]*num[2]);

	}
	
}


