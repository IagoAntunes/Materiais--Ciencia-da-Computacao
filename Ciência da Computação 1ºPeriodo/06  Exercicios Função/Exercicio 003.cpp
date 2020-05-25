/*Dada a matriz A4x4:
O usuário deverá informar os números para preenchimento da matriz. Encontre a soma
dos elementos de cada linha e coluna da matriz. Logo após apresente a matriz digitada e
os valores encontrados conforme exemplo.  */

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	
int i,j,matriz[4][4],soma,soma2[4] = {0,0,0,0},i2,soma22;


for(i=0;i<4;i++){
	for(j=0;j<4;j++){
		printf("Linha%i: Coluna%i:",i+1,j+1);
		scanf("%i", &matriz[i][j]);	
	}
}
	
for(i=0;i<4;i++){
	soma = 0;
	printf("\n");
	for(j=0;j<4;j++){
		printf("  %i ",matriz[i][j]);
		soma = soma + matriz[i][j];
		soma2[j] = soma2[j] + matriz[i][j];
		
		
		
		
	}
	printf("\t\t%i  ",soma);	
}

printf("\n\n");
for(i2=0;i2<4;i2++){
	printf("%i ",soma2[i2]);
	soma22 = soma22 + soma2[i2];
}	
printf("= %i\t%i",soma22,soma22);
}
