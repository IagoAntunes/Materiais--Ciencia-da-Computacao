#include<stdlib.h>
#include<stdio.h>
#include<stdbool.h>
#define TAM 10

bool pesquisa(int vetor[], int chave){
    int resp = false;
    int count = 0;
    for(int i=0; i<TAM; i++){
        count++;
        if(vetor[i] == chave){
            resp = true;
            i = TAM;
        }
    }
    printf("Esta na posição %i do Vetor\n", count);
    return resp;
}

void print(int vetor[]){
    printf("[ ");
    for (int i = 0; i < TAM; i++)
        printf("%i, ", vetor[i]);
    printf(" ]\n\n");
}

int main(){
    int vetor[TAM];
    for(int i=0; i<TAM; i++){
        vetor[i] = rand()%TAM;
    }
    int chave;
    print(vetor);
    printf("Digite um Numero: \n");
    scanf("%i", &chave);
    if(pesquisa(vetor, chave)){
        printf("Numero não encotnrado \n");
    } else {
        printf("Numero Encontrado!! \n");
    }
}