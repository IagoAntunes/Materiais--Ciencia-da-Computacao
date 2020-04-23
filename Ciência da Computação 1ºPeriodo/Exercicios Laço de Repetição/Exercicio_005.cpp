
/* 5-Crie um sistema que receba a quantidade de linhas e imprima
a imagem a seguir.
Caso o usuário digite 4:
*
**
***
****        */

#include <stdio.h>


int main(){
	
	int linhas,i,i2;
	
	printf("Linhas:");
	scanf("%i",&linhas);

	for (i = 0;i < linhas; i++){
		printf("\n");
		for(i2=0;i2<i+1;i2++){
            printf("*");
        }
    }	
	}
	