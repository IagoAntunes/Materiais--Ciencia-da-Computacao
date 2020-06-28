
/* Escreva uma função que receba como parâmetro uma matriz quadrada
de ordem n de inteiros e
devolve verdadeiro se ela é uma matriz triangular superior, ou falso, caso contrário. Matriz
triangular superior é uma matriz onde todos os elementos de posições acima da diagonal
principal são diferentes de 0 e todos os elementos demais elementos são iguais a 0. */

#include <stdio.h>
#include <stdlib.h>
#include <iostream>
//Função Auxiliar
bool auxiliar(int *matriz, int ordem);
int main(){
 int ordem,i,i2;
//Declaração Ordem Matriz
 printf("Ordem Matriz");scanf("%i",&ordem);

 int matriz[ordem][ordem];
//Entrada da Matriz
 for(i=0; i<ordem; i++){
    printf("\n");
    for(i2=0; i2<ordem; i2++){
        printf("Linha%i Coluna%i ", i+1, i2+1); scanf("%i", &matriz[i][i2]);
    }
 }

 printf("--------------------------------------");

 //Mostrando Matriz
 for(i=0; i<ordem; i++){
    printf("\n");
    for(i2=0; i2<ordem; i2++){
        printf(" %i ",matriz[i][i2]);
    }
 }
 //Condição Verdadeiro ou Falso
 printf(auxiliar(*matriz,ordem)?"\nTRIANGULO SUPERIOR":"\nNAO E TRIANGULO SUPERIOR");
 printf("\n-----------------------------");
}
//Função Auxiliar
bool auxiliar(int *matriz, int ordem){
 int i,i2,aux1 = 0, aux2 = 0;
//Laço Repetição
 for(i=0; i<ordem; i++){
    for(i2=0; i2<ordem; i2++){
//Contagens dos Zeros
        if(i<i2 && (*(matriz + (i * ordem) + i2) != 0))
            aux1 = aux1 + 1;
        else if
            (*(matriz + (i * ordem) + i2) == 0)
            aux2=aux2+1;
    }
}
//Condicao True ou Falso
 if(aux1 == ordem && ordem*ordem-aux1==aux2) return true;
    return false;
}