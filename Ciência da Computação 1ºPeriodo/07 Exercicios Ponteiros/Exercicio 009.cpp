
/*  Faça um programa para receber uma matriz A (2,3) e outra matriz
B(3,2) esses valores deverão ser digitados na função principal.
Implemente uma função auxiliar para calcular a multiplicação das
matrizes e apresentar o resultado. */

#include <stdio.h>
#include <stdlib.h>

void calculo(int *A,int *B,int *C){
	
	for(int i=0;i<6;i++){
		*(C + i) = *(A + i) * (*(B + i));
		printf("%i  ", *(C + i));
	}
}

int main(){
	
	int i,i2,
	A[3][3],B[3][3],C[3][3];

	printf("\n\nMATRIZ A \n");
	for(i=0;i<2;i++){
		for(i2=0;i2<3;i2++){
			printf("Linha%i Coluna%i : ",i,i2);
			scanf("%i", &A[i][i2]);
		}
	}
	
	printf("\n\nMATRIZ B \n");
	for(i=0;i<2;i++){
		for(i2=0;i2<3;i2++){
			printf("Linha%i Coluna%i : ",i,i2);
			scanf("%i", &B[i][i2]);
		}
	}
	
	calculo(A[0],B[0],C[0]);
	
	printf("\n\nMATRIZ A * B");
	for(i=0;i<2;i++){
		printf("\n");
		for(i2=0;i2<3;i2++){
			printf(" %i  ", C[i][i2]);
		}
	}
}