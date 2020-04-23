
/* 16- Crie um programa que receba o tempo de 5 corredores em 3
etapas, depois some as 3 etapas em
um quarto vetor e diga quem foi o campeão geral das 3 etapas.
Exemplo
Etapa1 3.22 4.14 2.10 2.18 4.08
Etapa2 2.02 2.06 4.35 1.22 2.02
Etapa3 2.10 3.15 3.20 6.15 2.00
Total 7.34 9.35 9.65 9.55 8.10
O vencedor da competição nas 3 etapas foi o corredor número 1. */

#include<stdlib.h>
#include<stdio.h>
#include <conio.h>

int main (){
	
	float vetor1[5],vetor2[5],vetor3[5],vetor4[5],vetor5[5],soma[5],corredor1,corredor2,corredor3,corredor4,corredor5,menor_tempo;
	int i,i2,i3,j,i4,i1;
	
	//ETAPA 1
	for (i1=1;i1<=5;i1++){
		printf("Corredor %i :",i1);
		scanf("%f",&vetor1[i1]);
		}
	
	//ETAPA 2
	printf("\nETAPA 2\n");
	for (i2=1;i2<=5;i2++){
		printf("Corredor %i :",i2);
		scanf("%f",&vetor2[i2]);
		}
	
	//ETAPA 3
	printf("\nETAPA 3\n");
	for (i3=1;i3<=5;i3++){
		printf("Corredor %i :",i3);
		scanf("%f",&vetor3[i3]);
		}
		
	corredor1 = vetor1[1] + vetor2[1] + vetor3[1];
	corredor2 = vetor1[2] + vetor2[2] + vetor3[2];
	corredor3 = vetor1[3] + vetor2[3] + vetor3[3];
	corredor4 = vetor1[4] + vetor2[4] + vetor3[4];
	corredor5 = vetor1[5] + vetor2[5] + vetor3[5];
	
	soma[i] = corredor1;
	soma[i+1] = corredor2;
	soma[i+2] = corredor3;
	soma[i+3] = corredor4;
	soma[i+4] = corredor5;

	if(soma[0] < soma[1] && soma[0] < soma[2] && soma[0] < soma[3] && soma[0] < soma[4]){
		printf("\n CAMPEAO :     CORREDOR 1 \n");
	}
	else{
		if (soma[1] < soma[0] && soma[1] < soma[2] && soma[1] < soma[3] && soma[1] < soma[4]){
			printf("\n CAMPEAO : CORREDOR 2 \n");
	}
	else{
		if(soma[2] < soma[0] && soma[2] < soma[1] && soma[2] < soma[3] && soma[2] < soma[4]){
			printf("\n CAMPEAO : CORREDOR 3 \n");
		}
	else{
		if(soma[3] < soma[0] && soma[3] < soma[1] && soma[3] < soma[2] && soma[3] < soma[4]){
			printf("\n CAMPEAO:  CORREDOR 4 \n");
	}
	else{

		if(soma[4] < soma[0] && soma[4] < soma[1] && soma[4] < soma[2] && soma[4] < soma[3]){
			printf(" \n  CAMPEAO:  CORREDOR 5  \n");
	}
	}	
	}
	}
	}
}
