
/* 17-Elabore um algoritmo que leia dois vetores de dez posições e
faça a multiplicação dos elementos de mesmo índice, colocando
o resultado em um terceiro vetor, que deve ser mostrado como
saída. */

 #include <stdio.h>
 #include<stdlib.h>

int main(){
    
	int vetor1[10],vetor2[10],vetor3[10],i;
	
	for(i=0;i<10;i++){
		printf("Numero %i :",i+1);
		scanf("%i",&vetor1[i]);
		
	}
	
	for(i=0;i<10;i++){
		printf("Numero %i :",i+1);
		scanf("%i",&vetor2[i]);
		
	}
	
	for(i=0;i<10;i++){
		vetor3[i] = (vetor1[i] * vetor2[i]);
		printf("\nMultiplicacao: %i * %i = %i",vetor1[i],vetor2[i],vetor3[i]);
	
	
	}
}
