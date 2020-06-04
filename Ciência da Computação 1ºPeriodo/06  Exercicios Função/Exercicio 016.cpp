
/*Faça uma função que receba uma matriz A(5x5) e retorne o menor valor dos
elementos acima da diagonal principal.*/

#include <stdio.h>
#include <stdlib.h>

int auxiliar(int num[5][5]);

int main(){

	int num[5][5],menor;
	
	for(int i=0;i<5;i++){
		for(int i2=0;i2<5;i2++){
			printf("Linha%i: Coluna%i: ",i+1,i2+1);
			scanf("%i", &num[i][i2]);	
		}
	}
	
	menor = auxiliar(num);
	printf("Menor = %i",menor);
			
}

int auxiliar(int num[5][5]){

	
	int menor = num[1][2];
	for(int i=0;i<5;i++){
		for(int i2=0;i2<5;i2++){
			if(i2 > i){
				if(num[i][i2] < menor){
					menor = num[i][i2];
				}
			}		
		}
	}
	return(menor);
}
	