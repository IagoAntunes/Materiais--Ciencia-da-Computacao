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

void duplicado(int qtd,int repetido[],int i){

    for(int j =0;j<qtd;j++){
        //printf("\n %s = %s",pessoa[i].nome,pessoa[j].nome);
        //printf("\n REPETIDO[%i] = %i",i,repetido[j]);
        if(strcmp(pessoa[i].nome,pessoa[j].nome)==0 && j != i && j!= repetido[j]){
            printf("\n %s[%i] = %s[%i^]",pessoa[i].nome,i,pessoa[j].nome,j);
            repetido[i] =  i;
            pessoa[j].matou --;
            pessoa[i].matou ++;
            pessoa[j].vivo = -1;
        }
    }


}


int main(){

    int contador;
    char *aux,*aux2;
    char frase[1000];
    char *vetor[250];
    char vetor2[200][200];
    int repetido[30];


    FILE *arquivo;
	arquivo = fopen("nomes.txt","r");
	contador = 0;
	do{
        fgets(frase,100,arquivo);
        strlwr(frase);

        aux = strtok(frase," ");

        strcpy(pessoa[contador].nome,aux);
        aux2 = strtok(NULL," ");
        strcpy(pessoa[contador].assasinado,aux2);
        vetor[contador] = aux;
        //strcpy(vetor2[contador],vetor[contador]);

        pessoa[contador].vivo = 0;
        pessoa[contador].matou ++;


        contador ++;

	}while(contador < 6);
    //contador --;
    preencher(contador,repetido);

    for(int i =0;i<contador;i++){
        duplicado(contador,repetido,i);
        for(int j =0;j<contador;j++){
            if(strcmp(pessoa[i].nome,pessoa[j].assasinado)==0){
                //printf("\n %s MORREU",pessoa[i].nome);
                pessoa[i].vivo = -1;
            }
        }

	}
	for(int i =0;i<contador;i++){
        if(pessoa[i].vivo == 0){
            printf("\n%s : %i",pessoa[i].nome,pessoa[i].matou);
        }
	}



}








