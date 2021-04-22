#include <stdlib.h>
#include <stdio.h>
#include <string.h>

typedef struct{

	char purchases[30];

}Lpurchases;

void organizar(Lpurchases *product, int tam)
{
	int i = 1, i2 = 0;
	Lpurchases aux;
	while (i < tam){
		i2 = i - 1;
		aux = product[i];
		
		while (i2 >= 0 && strcmp(product[i2].purchases, aux.purchases) > 0){
			product[i2 + 1] = product[i2];
			i2--;
		}
		product[i2 + 1] = aux;
		i++;
	}
}

int main ()
{
	int i, i2;
	int nList;
	
	Lpurchases product[3000];
	char itens[3000], *aux;
	
	scanf("%i", &nList);//tamanho

	while (nList--){
		scanf(" %[^\n]", itens);//ler

		i = 0;
		
		aux = strtok(itens, " ");
		strcpy(product[i++].purchases, aux);//juntar

		do{
			aux = strtok('\0', " ");
			if (aux == NULL){
				break;
			}
			strcpy(product[i].purchases, aux);//juntar
			i++;
		}while (aux);
		organizar(product, i);
		for (i2 = 0; i2 < i; i2++){
			if (strcmp(product[i2].purchases, product[i2 - 1].purchases) != 0){//comparar
				if (i2 != 0){
					printf(" ");
				}
				printf("%s", product[i2].purchases);
			}
		}
		printf("\n");
	}
}