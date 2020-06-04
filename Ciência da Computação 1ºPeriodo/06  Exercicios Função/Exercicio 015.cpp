
/*Faça uma função que receba uma matriz A(4x4) e retorne o menor elemento da
diagonal principal. A posição do menor valor deve ser impressa na função principal.*/

#include <stdio.h>
#include <stdlib.h>
int posicao = 0;
int auxiliar(int num[4][4]);

int main(){

	int num[4][4],menor;
	
	for(int i=0;i<4;i++){
		for(int i2=0;i2<4;i2++){
			printf("Linha%i: Coluna%i: ",i+1,i2+1);
			scanf("%i", &num[i][i2]);	
		}
	}
	
	menor = auxiliar(num);
	printf("\n\nMenor = %i \n",menor);
	printf("Posicao = Linha%i Coluna %i ",posicao,posicao);
			
}

int auxiliar(int num[4][4]){

	
	int menor = num[0][0];
	for(int i=0;i<4;i++){
		if(num[i][i] < menor){
			menor = num[i][i];
			posicao = i+1;
		}
	}
	return(menor);

}