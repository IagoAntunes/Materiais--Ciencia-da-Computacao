
/* Dada a matriz A4x4:
O usuário deverá informar os números para preenchimento da matriz. Encontre a soma
dos elementos da diagonal principal e apresente o resultado. Utilize estrutura de
repetição.  */

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	
int i,j,matriz[4][4],soma;


for(i=0;i<4;i++){
	for(j=0;j<4;j++){
		printf("Linha%i: Coluna%i:",i+1,j+1);
		scanf("%i", &matriz[i][j]);	
	}
}
	
for(i=0;i<4;i++){
	for(j=0;j<4;j++){
		if(i == j){
			soma = soma + matriz[i][j];
		}
	}	
}		
printf("Soma: %i", soma);	
	
	
	
}
