
/* Escrever um programa em C para receber duas matrizes N1(4,6) e
N2(4,6), apresente:
a) Uma matriz M1 que seja a soma de N1 e N2
b) Uma matriz M2 que seja a diferença de N1 com N2
* Implemente função */

#include <stdio.h>
#include <stdlib.h>

void soma(int *n1,int *n2,int *m1,int *m2){
	int i;
	
	for(i=0;i<24;i++){
		*(m1 + i) = *(n1 + i) + *(n2 + i);
	}
	
	for(i=0;i<26;i++){
		*(m2 + i) = *(n1 + i) - *(n2 + i);
	}
}

int main(){
	
	int i,i2,n1[4][6],n2[4][6],m1[4][6],m2[4][6];

	printf("--- MATRIZ N1 ---\n");
	for(i=0;i<4;i++){
		for(i2=0;i2<6;i2++){
			printf("Linha%i Coluna%i : ",i,i2);
			scanf("%i", &n1[i][i2]);
		}
	}
	printf("\n\n--- MATRIZ N2 ---\n");
	for(i=0;i<4;i++){
		for(i2=0;i2<6;i2++){
			printf("Linha%i Coluna%i : ",i,i2);
			scanf("%i", &n2[i][i2]);
		}
	}
	soma(n1[0],n2[0],m1[0],m2[0]);
	
	printf("\n\nSOMA DE N1 + N2\n");
	for(i=0;i<4;i++){
		printf("\n");
		for(i2=0;i2<6;i2++){
			printf(" %i  ",m1[i][i2]);
		}
	}
	
	printf("\n\nDiferença de N1 E N2\n");
	for(i=0;i<4;i++){
		printf("\n");
		for(i2=0;i2<6;i2++){
			printf(" %i  ",m2[i][i2]);
		}
	}	
}



