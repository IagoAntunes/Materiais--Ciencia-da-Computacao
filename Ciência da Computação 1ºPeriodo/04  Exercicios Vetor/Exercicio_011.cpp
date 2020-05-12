/* Faça um programa para receber a produção e o nome de 50 produtos. Logo após liste o nome dos produtos que tiveram produção inferior a media. */


#include <stdio.h>
#include <stdlib.h>
int main () {
    int preco[5],i,soma,media,producao[5],local;
    char item[10][10];
   
    
    for (i=0; i<50; i++) {
        printf("Item%i:",i+1);
        scanf("%s", &item[i]);
        
		printf("Producao:");
        scanf("%i", &producao[i]);
        
        soma = soma + producao[i];
    }
    media = soma / 50;
    for(i=0;i<50;i++){
    	if(producao[i] < media){
    		printf("Item: %s",item[i]);
		}
	}
}


