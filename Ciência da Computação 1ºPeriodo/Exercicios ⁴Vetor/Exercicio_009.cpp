/*Faça um programa para que o usuário possa digitar o nome e o custo de 10 produtos diferentes. Determine o nome
do item mais caro, e o nome do item mais barato. */


#include <stdio.h>
#include <stdlib.h>
int main () {
    int preco[10],menor,maior,i;
    char item[10][10],item2,item3;
    
    maior = -100;
    menor =  999;
    
    for (i=0; i<4; i++) {
        printf("Produto%i:",i+1);
        scanf("%s", &item[i]);
        printf("Preco:");
        scanf("%i",&preco[i]);
        
        if(preco[i] > maior){
        	maior = preco[i];
        	item2 = i;
		}
        if(preco[i] < menor){
        	menor = preco[i];
        	item3 = i;
        }
        	
		}

printf("Menor %i Item: %s",menor,item[item3]);
printf("\nMaior %i Item; %s",maior,item[item2]);


}

