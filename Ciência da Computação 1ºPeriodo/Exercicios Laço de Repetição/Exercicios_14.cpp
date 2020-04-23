
/* 14- Receba números digitados pelo usuários e armazene em um
vetor de tamanho 10. Caso ele digite um número negativo, peça
para digitar novamente. Ao final diga a quantidade de números
pares e a quantidade de números ímpares. */

#include<stdlib.h>
#include<stdio.h>
#include <conio.h>

int main (){
	
	int vetor[10],i,par,impar;
	
	//Entrada de Valores
	for (i=0;i<10;i++){
		
		printf("Digite um Numero:");
		scanf("%i",&vetor[i]);
		
		//Testando Numero Positivo
		if (vetor[i]< 0){
			while (vetor[i] < 0 ){
			printf("Digite um Numero POSITIVO:");
			scanf("%i",&vetor[i]);
	
		}
		
	}
	
}
	//Imprimindo Numeros e Testando se e IMPAR / PAR
	for (i=0;i<10;i++){
		if(vetor[i] % 2 == 0){
			par = par + 1;
		}
		else{
			impar = impar + 1;
		}

}	//Imprimindo Quantidade de Numeros Impares / Pares
	printf("\nQntd Nuemros Impares: %i",impar);
	printf("\nQntd Numeros Pares : %i",par-1);

}
