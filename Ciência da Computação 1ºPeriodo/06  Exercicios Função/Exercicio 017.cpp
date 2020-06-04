
/*Faça uma função que receba um vetor A(25) “inteiros” e substitua todos os valores
negativos de ‘A’ por zero. Imprima o vetor na função principal*/

#include <stdlib.h>
#include <stdio.h>

void neg(int num[25]){
	
	for(int i=0;i<25;i++){
		if(num[i] < 0){
			num[i] = 0;
		}
	}	
}

int main(){
	
	int num[25];
	
	for(int i=0;i<25;i++){
		printf("Numero:");
		scanf("%i", &num[i]);
	}
	neg(num);
	
	for(int i=0;i<25;i++){
		printf("\t%i",num[i]);
	}
	
}
