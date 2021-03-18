#include<stdlib.h>
#include<stdio.h>
#include<stdbool.h>
#define TAM 10

void print(int vetor[]){
    printf("[ ");
    for (int i = 0; i < TAM; i++)
        printf("%i, ", vetor[i]);
    printf(" ]\n\n");
}

void preencheVetorRandom(int vetor[]){
    for(int i=0; i<TAM; i++){
        vetor[i] = rand()%100;
    }
}

void preencheVetorCrescente(int vetor[]){
    for(int i=0; i<TAM; i++){
        vetor[i] = i;
    }
}

int pesquisaBinaria(int chave, int vetor[], int esq, int dir){
    int meio = (esq+dir)/2;
    printf("%d %d %d %d %d\n", chave, vetor[meio], meio, esq, dir);

    if(vetor[meio] == chave){ 
        printf("Numero Encontrado! \n");
        return meio;
    }

    if(esq >= dir){
        printf("Numero Encontrado! \n");
        return -1;
        
    } else {
        if(vetor[meio] < chave){
            return pesquisaBinaria(chave, vetor, meio+1, dir);
        } else {
            return pesquisaBinaria(chave, vetor, esq, meio-1);
        }
    }
}

void ordenando(int vetor[], int esq, int dir){
    int i = esq, j = dir;
    int pivo = vetor[(esq + dir) / 2];
    while (i <= j) {
        while (vetor[i] < pivo)
            i++;
        while (vetor[j] > pivo)
            j--;
        if (i <= j){
            int temp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = temp;
            i++; j--;
        }
    }
    if (esq < j)
        ordenando(vetor, esq, j);
    if (i < dir)
        ordenando(vetor, i, dir);
}

int main(){
    int vetor[TAM];
    int chave;
    preencheVetorRandom(vetor);
    print(vetor);
    ordenando(vetor, 0, TAM-1);
    print(vetor);
    printf("Digite um Numero: \n");
    scanf("%i", &chave);
    if (pesquisaBinaria(chave, vetor, 0, TAM - 1) != -1){
        printf("Numero Encontrado \n");
    }
    else{
        printf("Numero não encontrado :( \n");
    }
}