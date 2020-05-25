
/* Faça uma função que receba, por parâmetro, 2 vetores de 10 elementos reais e que
calcule e retorne a soma de todos dois vetores. */

#include <stdlib.h>
#include <stdio.h>



float soma(float a[10],float b[10]){

	int i,j;
	float somaT = 0;
	for(i=0;i<10;i++){
		somaT += + a[i] + b[i];
	}
	return(somaT);


}


int main(){

	int i,j;

	float numA[10],numB[10],resultado[10];

	for(i=0;i<10;i++){
		printf("Numero%i :",i);
		scanf("%f", &numA[i]);
	}

	for(i=0;i<10;i++){
		printf("Numero%i :",i);
		scanf("%f", &numB[i]);
	}
	
	
	printf("Soma total: %f",soma(numA,numB));

}

