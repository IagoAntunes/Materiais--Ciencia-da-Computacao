#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct{
    char nome[30];
    char assasinado[30];
    int vivo;
    int matou;


}pessoa[20];

void preencher(int qtd,int repetido[]){
    for(int i =0;i<qtd;i++){
        repetido[i] = -1;
    }
}

void verificar(int qtd){

    for(int i =0;i<qtd;i++){
        for(int j =0;j<qtd;j++){
            if(strcmp(pessoa[i].nome,pessoa[j].assasinado)==0){
                //printf("\n%s == %s",pessoa[i].nome,pessoa[i].assasinado);
                pessoa[i].vivo --;
            }
        }
    }



}

void printar(int qtd,int repetido[]){
    for(int i =0;i<qtd;i++){
        if(pessoa[i].vivo == 0 && i != repetido[i]){
            printf("\n%s : %i",pessoa[i].nome,pessoa[i].matou);
        }
    }

}

void duplicado(int qtd,int repetido[],int i){

    for(int j =0;j<qtd;j++){
        if(strcmp(pessoa[i].nome,pessoa[j].nome)==0 && j != i){
            repetido[j] =  j;
            pessoa[j].matou --;
            pessoa[i].matou ++;
        }
    }


}

int main(){

    char participants[30][30];
    int qtd;
    int repetido[30];

    printf("Numero de Participantes");
    scanf("%i",&qtd);
    preencher(qtd,repetido);

    for(int i =0;i<qtd;i++){

        printf("Digite:");
        scanf("%s %s",&pessoa[i].nome,&pessoa[i].assasinado);
        duplicado(qtd,repetido,i);
        pessoa[i].vivo = 0;
        pessoa[i].matou ++;


    }
    verificar(qtd);
    printar(qtd,repetido);
}















