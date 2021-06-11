#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct{
    char nome[30];
    char assasinado[30];
    int vivo;
    int matou;


}pessoa[20];


int main(){

    int contador;
    char *aux;
    char frase[1000];
    char *vetor[250];
    char vetor2[200][200];

    FILE *arquivo;
	arquivo = fopen("nomes.txt","r");
	contador = 0;
	do{
        fgets(frase,100,arquivo);
        strlwr(frase);

        aux = strtok(frase," ");
        vetor[contador] = aux;
        strcpy(vetor2[contador],vetor[contador]);

        printf("-->%s\n",vetor[contador]);
        contador ++;

	}while(strcmp(frase,"fim")!=0);
    contador --;
    for(int i =0;i<contador;i++){
		printf(" %s \n",vetor2[i]);
	}
}
