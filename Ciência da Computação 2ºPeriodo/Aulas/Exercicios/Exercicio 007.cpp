/*
Faça um programa para receber uma quantidade de números inteiros definida pelo usuário no momento
da execução do programa. Ao final apresente
a) A soma dos números informados;
b) A média;
c) O maior valor:
d) O menor valor;
Obs. Implemente uma função para cada item.
*/

#include <stdio.h>
#include <stdlib.h>

int soma(int numeros[],int quantidade){
	int soma,i;
	
	for(i=0;i<quantidade;i++){
		soma = soma + numeros[i];
	}
	
	return(soma);
	}
int media(int numeros[],int quantidade){
	int media,total,i;
	
	for(i=0;i<quantidade;i++){
		total = total + numeros[i];
	}
	media = total / quantidade;
	
	return(media);
}
int maior(int numeros[],int quantidade){
	int maior,i;
	
	maior = numeros[0];
	for(i=0;i<quantidade;i++){
		if(numeros[i] > maior){
			maior = numeros[i];
		}
	}
	
	return(maior);
}
int menor(int numeros[],int quantidade){
	int menor,i;
	
	menor = numeros[0];
	for(i=0;i<quantidade;i++){
		if(numeros[i] < menor){
			menor = numeros[i];
		}
	}
	
	return(menor);
}
int main(){
	
	int quantidade;
	
	printf("Quantidade de Numeros:");
	scanf("%i",&quantidade);
	
	int numeros[quantidade],i;
	
	for(i=0;i<quantidade;i++){
		printf("Numero%i: ",i+1);
		scanf("%i",&numeros[i]);
	}
	
	printf("Soma = %i  ",soma(numeros,quantidade));
	printf("Media = %i  ",media(numeros,quantidade));
	printf("Maior = %i  ",maior(numeros,quantidade));
	printf("Menor = %i  ",menor(numeros,quantidade));	
}
