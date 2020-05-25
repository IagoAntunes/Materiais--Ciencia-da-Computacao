
/* Faça uma função que receba, por parâmetro, uma matriz A(6,6) e retorne a soma dos
elementos da sua diagonal principal e outra função para imprimir a diagonal
secundária. */

#include <stdio.h>
#include <stdlib.h>


int auxiliar(int principal[6][6]);

int diagonal(int outro[6][6]);



int main(){
	
	int i,j,matriz[6][6],resultado,resultado2;

	for(i=0;i<6;i++){
		for(j=0;j<6;j++){
			printf("Linha%i Coluna%i ",i,j);
			scanf("%i", &matriz[i][j]);				
		}
	}
	diagonal(matriz);
	resultado = auxiliar(matriz);
	printf("\n\tDiagonal Principal%i ",resultado);
	
	
}

int auxiliar(int principal[6][6]){
	
	int i,j,soma=0;
	
	
	for(i=0;i<6;i++){
		for(j=0;j<6;j++){
			if( i == j){
				soma = soma + principal[i][j];
			}
}
}	

	return(soma);
}

int diagonal(int secundaria[6][6]){
	
	int i,j,sec=0;
	for(i=0;i<6;i++){
		for(j=0;j<6;j++){
			if(i + j == 5){
				sec = sec + secundaria[i][j];
			}
		
}
}
	printf("\n\tDiagonal Secundaria %i",sec);
}




