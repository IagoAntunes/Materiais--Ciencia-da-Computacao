/*Faça um programa para o usuário digitar uma matriz A(5,5). Logo após, apresente o menor valor
localizado acima da diagonal principal. */


#include<stdio.h>
#include<stdlib.h>

int main () {
    int vetor[5][5],i,i2,menor;
	menor=999;
    for(i=0;i<5;i++){
        for(i2=0;i2<5;i2++){
            printf("Valor%i:",i);
            scanf("%i", &vetor[i][i2]);
        }
        if(vetor[i][i]<menor){
            menor = vetor[i][i];
        }
    }
    printf("\nMenor Valor: %i", menor);
}
