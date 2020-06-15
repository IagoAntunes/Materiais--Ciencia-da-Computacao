
/*Crie duas matrizes 3x3. A primeira será digitada pelo usuário e a segunda deverá ser a
primeira rotacionada 90º. */

#include <stdlib.h>
#include <stdio.h>


void auxiliar(int matriz[3][3]);

int main(){
	
	int matriz[3][3];
	
	for(int i=0;i<3;i++){
		
		for(int i2=0;i2<3;i2++){
			printf("Linha%i Coluna%i ",i,i2);
			scanf("%i", &matriz[i][i2]);
		}
		
	}
	
	auxiliar(matriz);
		
}



void auxiliar(int matriz[3][3]){
	
	
	for(int i=0;i<3;i++){
		
		for(int i2=0;i2<3;i2++){
			printf("%i",matriz[i2][i]);
		}
		printf("\n");
	}
	
	
	
}