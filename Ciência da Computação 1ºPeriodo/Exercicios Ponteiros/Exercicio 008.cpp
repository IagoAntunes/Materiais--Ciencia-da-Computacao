
/* Elaborar um programa em C para receber uma matriz M(6,6), o
usuário deverá informar também um valor “M” para multiplicar a matriz.
Implemente uma função utilizando ponteiro para efetuar os cálculos e
outra para apresentar o resultado. */

#include <stdio.h>
#include <stdlib.h>

void printar(int *m){
	
	for(int i=0;i<9;i++){
		printf("%i ",*(m + i));
	}
	
}

void calculo(int *valor,int *m){

	int i;
	
	for(i=0;i<9;i++){
		*(m + i) = *(m + i) * *valor;
	}
		
}

int main(){
	
	int i,i2,valor,M[3][3];

	printf("Valor a ser Multiplicado: ");
	scanf("%i", &valor);
	
	for(i=0;i<3;i++){
		for(i2=0;i2<3;i2++){
			printf("Linha%i Coluna%i ",i,i2);
			scanf("%i", &M[i][i2]);
		}
	}
	
	calculo(&valor,M[0]);
	printar(M[0]);
	
}
