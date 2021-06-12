#include <stdio.h>
#include <stdlib.h>

int main(){

    int tam;
    int qtd;

    do{
    printf("\nTamanho do Vetor: ");
    scanf("%i",&tam);
    int vetor[tam];
    for(int i =0;i<tam;i++){
        scanf("%llu",&vetor[i]);
    }
    for(int i =0;i<tam;i++){
        for(int j =0;j<tam;j++){
            if(vetor[i] == vetor[j] && i != j){
                //printf("\n %i[%i] == %i[%i]",vetor[i],i,vetor[j],j);
                vetor[i] = NULL;
                vetor[j] = NULL;
            }
        }
    }
    for(int i =0;i<tam;i++){
        if(vetor[i] != NULL){
            printf("O numero %i ficou sem par",vetor[i]);
        }
    }
    }while(tam != 0);
}










