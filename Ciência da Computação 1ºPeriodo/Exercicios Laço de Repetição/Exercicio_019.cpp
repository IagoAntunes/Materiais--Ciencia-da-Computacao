
/* 19-)Escreva um algoritmo que leia um vetor de 20 posições e
mostre-o. Em seguida, troque o primeiro elemento pelo o último,
o segundo com o penúltimo, o terceiro com o antepenúltimo e,
assim, sucessivamente. Mostre o novo vetor após todas as
trocas. */

 #include <stdio.h>
 #include<stdlib.h>

 
int main(){
    
	int numero[20],i,cont,aux[10],aux2[10],aux22[10];

    for(i=1;i<=20;i++){
    	printf("Numero %i : ",i);
    	scanf("%i",&numero[i]);
	}
	
	for(i=1;i<=10;i++){
		aux[i] = numero[11-i];
	}
	for(i=1;i<=10;i++){
		aux2[i] = numero[i+10];
	}
	for(i=1;i<=10;i++){
		aux22[i] = aux2[11-i];
	}
	
	
	printf("NOVA ORDEM!");
	for(i=1;i<=10;i++){
		printf(" %i",aux22[i]);	
	}
	for(i=1;i<=10;i++){
		printf(" %i",aux[i]);
}
}