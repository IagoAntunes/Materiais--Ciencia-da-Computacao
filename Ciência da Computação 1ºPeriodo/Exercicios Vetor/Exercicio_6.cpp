/*Elaborar um programa em C para receber e armazenar 50 números reais em um vetor. Identificar e imprimir o maior
e o menor número e as respectivas posições no vetor.*/


#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main ()
{
float vetor1[50],menor,maior;
int i,posicao,posicao2;
maior = -100;
menor = 999;

for(i=0;i<50;i++){
	printf("Numero %i :",i+1);
	scanf("%f",&vetor1[i]);
}
for(i=0;i<50;i++){
	printf("%.0f ",vetor1[i]);
	if(vetor1[i] > maior){
		maior = vetor1[i];
		posicao = i + 1;
	
		
	}
	if(vetor1[i] < menor){
		menor = vetor1[i];
		posicao2= i+1;
	}
		
}
printf("\nMenor: %f \nPosicao: %i",menor,posicao2);
printf("\nMaior: %f \nPosicao %i",maior,posicao);

} 

