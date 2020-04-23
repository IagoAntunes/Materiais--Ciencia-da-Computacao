
/* 15-Anteriormente fizemos a série de fibonacci. Faça o mesmo
exercício novamente, porém,
utilizando vetores. O tamanho da série será dada pelo usuário. */

#include <stdio.h>
#include<stdlib.h>
 
int main()
	{
	int serie, i, aux, par,soma;
	soma = 1;
	
	//Entrada de Valores
	printf("Tamanho Da Serie:");
	scanf("%i", &serie);
	int vet[serie];
 
 	vet[0] = 0;
 	vet[1] = 1;
	
	//Formula Serie Fibonacci
	for (aux=2; aux<serie; aux= aux + 1)
	{
		vet[aux] = vet[aux - 1] + vet[aux - 2];
 
		soma+=vet[aux];
		printf("VETOR: %i \n",vet[aux]);
	} 
 	
 	//Imprimindo Serie
	printf("Serie de Fibonacci: ");
	for (i=0; i<serie; i++)
	{
		printf(" %i ", vet[i]);
	}
 
 	
}
