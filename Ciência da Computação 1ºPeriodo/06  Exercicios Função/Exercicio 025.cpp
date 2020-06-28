
/* Escreva uma função que receba como parâmetro uma lista de tamanho
fixo 10 contendo apenas valores 0 e 1 e que imprima as posições inicial e final da maior seqüência
S de elementos 0 dentro da lista. Ex: Lista={0,1,1,0,0,0,1,0,1,0} pini = 4 e pfim = 6 S={0,0,0} Obs:
No caso de empate em tamanho, a primeira ocorrência de S é a que deve ser retornada.  */

#include <stdio.h>
#include <stdlib.h>
int main()
{
 int vetor[10],inicio=0,fim=0,aux=0,a=0,i=0;

 for(int i=0; i<10; i++){
    do{
        printf("Numero%i : ", i+1);
        scanf("%i", &vetor[i]);
 }while(vetor[i] != 1 && vetor[i] != 0);
 }
 for(i=0; i<10 ; i++){
    if(vetor[i] == 0){
        aux = aux + 1;
 }
    else{
        if(a<aux){
            a=aux;
            inicio = i-a+1;
            fim = i;
        }
    aux = 0;
    }
 }

 if(a<aux){
    a=aux;
    inicio = i-a;
    fim = i-1;
 }
 printf("\nINICIO = %i",inicio);
 printf("\nFIM = %i",fim);
 return 0;
}