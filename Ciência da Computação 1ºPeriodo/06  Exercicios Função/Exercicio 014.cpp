
/* O usuário deverá digitar 10 números em um vetor. Faça uma função para verificar
quantos números são primos e retornar este valor. */

#include <stdlib.h>
#include <stdio.h>

int primo(int a[10]){
    
	int primo=0,cont;

    for(int i=0; i<10; i++){
            cont = 0;
            for(int i2=a[i]; i2>0; i2--){
                if(a[i]%i2 == 0){
                	cont++;
                }
            }
            if(cont == 2) {
				primo++;
			}
        }
    return(primo);
    }
    



int main(){

	int i,j,resultado,num[10];

	for(i=0;i<10;i++){
		printf("Numero%i :",i);
		scanf("%i", &num[i]);
	}
	
	resultado = primo(num);
	printf("Quantidade = %i",resultado);

}
