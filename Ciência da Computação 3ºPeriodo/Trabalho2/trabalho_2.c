#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <time.h>
#include <string.h>
#include <windows.h>
#define TAM 500000

/*

-----------------------------------------HERE-----------------------------------------

FRASE USADA PARA TESTE :    DOIS MAIS DOIS IGUAL A QUATRO
NOME DO ARQUIVO:            trabalho_2.txt


[X] Pesquisa Sequencial
[X] Pesquisa Binaria
[+-] Arvore Binaria
[+-] Tabela Hash

-> A ordenação esta dando conflito dentro do codigo e acaba fazendo imprimir as palavras,valores errados
-> A arvore Binaria esta com problemas em adicionar as frequencias
-> A tabela Hash funcionou em outro codigo  mas quanto tentei passar para este principal  deu conflito com outras partes
do codigo

*/




//STRUCTS
typedef struct Registro{
    char palavra[20];
    int freq;
} Registro;

struct Palavra{
char palavra[30];
int ocorrencias;
};
struct Node{
struct Palavra palavra;
struct Node *proximo;
};

//INICIALIZA
struct Node *primeiro_node = NULL;

//FUNCAO PESQUISA SEQUENCIAL
int pesquisaSequencial(char chave[], Registro vetor[], int n){
    int resp = -1;
    for(int i = 0; i < n; i++){
        if(strcasecmp(vetor[i].palavra, chave) == 0){
            resp = i; //guarda posição do vetor
            i = n;
        }
    }
    return resp;
}

//PREENCHE VETOR DE REPETIDOSD COM 0
void preencher(int repetidos[],int contador){
	for(int i=0;i<contador;i++){
    	repetidos[i] = 0;
	}
}

//-------DOIS TIPOS DE ORDENAÇÃO-----------
void quicksort(char *vetor[], int esq, int dir){


    int i = esq, j = dir;
    char *pivo = vetor[(esq + dir) / 2];
    while (i <= j){
        while (strcasecmp(vetor[i],pivo) < 0)
            i++;
        while (strcasecmp(vetor[j], pivo) > 0)
            j--;
        if (i <= j){
            char temp [20];
            strcpy(temp, vetor[i]);
            strcpy(vetor[i], vetor[j]);
            strcpy(vetor[j], temp);
            i++;
            j--;
        }
    }
    if (esq < j)
        quicksort(vetor, esq, j);
    if (i < dir)
        quicksort(vetor, i, dir);
}
void ordenando(char *turma[],int valores){
    for (int i=0;i<valores;i++)
	{
		for (int j=0;j<(valores-1);j++)
		{
			if (strcmp(turma[j],turma[j+1])>0)
			{
			    char temp[20];
			    strcpy(temp,turma[j]);
			    strcpy(turma[j],turma[j+1]);
                strcpy(turma[j+1],temp);

			}
		}
	}
}

//CALCULO TEMPO
double current_time(){
    LARGE_INTEGER t, f;
    QueryPerformanceCounter(&t);
    QueryPerformanceFrequency(&f);
    return (double) t.QuadPart / (double) f.QuadPart;
}

//---------FUNÇÕES PARA MODO TRES-----------------------
int adicionar_palavra(const char *word){
struct Node *novo_node;
struct Node *guia;
int indice = 0;


novo_node = (struct Node *)malloc(1 * sizeof(*novo_node));
if(novo_node == NULL)
{
printf("erro alocando memoria\n");
exit(1);
}

novo_node->proximo = NULL;
strcpy(novo_node->palavra.palavra, word);
novo_node->palavra.ocorrencias = 0;
novo_node->palavra.ocorrencias++;

if(primeiro_node == NULL)
primeiro_node = novo_node;

else
{
guia = primeiro_node;
while(guia->proximo != NULL)
guia = guia->proximo;

guia->proximo = novo_node;
}


return 0;
}

int palavra_existe(const char *word,int indice){
    struct Node *guia;

    guia = primeiro_node;
    int indice2 = 0;
    if(guia == NULL)
    return 0;

    else
    {
    while(guia->proximo != NULL)
    {
        //printf("\nINDICE = %i INDICE2 = %i\n",indice,indice2);
        //printf("\n WORD = %s   --> PALAVRA %s\n",word,guia->palavra.palavra);
        if(strcmp(word, guia->palavra.palavra) == 0)
        {
            //printf("\nPALAVRA %s ADICIONA MAIS 1\n",guia->palavra.palavra);
            guia->palavra.ocorrencias++;
            return 1;
        }

    guia = guia->proximo;
    indice2++;
    }
}

return 0;
}

void mostrar_lista(int contador){
struct Node *guia;
int indice;
guia = primeiro_node;
indice = 0;
while(guia->proximo != NULL)
{


    //printf("GUIA = %s OUTRO = %s\n",guia,guia->proximo);
    //printf("GUIA = %s\n",guia);
    palavra_existe(guia->palavra.palavra,indice);
    printf("%s\t\t%d\n", guia->palavra.palavra, guia->palavra.ocorrencias);
    guia = guia->proximo;


    if(guia->proximo == NULL){
        printf("%s\t\t%d\n", guia->palavra.palavra, guia->palavra.ocorrencias);
    }
    indice ++;
}
}
//-----------------------------------------------------


// MODO ARVORE BINARIA
void modo_tres(){
    double start, ende, diff;
    start = current_time();
    char linha[BUFSIZ];
    char *palavra = NULL;
    int contador;
    FILE *arquivo;

    arquivo = fopen("trabalho_2.txt", "r");
    if(arquivo == NULL)
    {
    printf("texto01.txt - arquivo desconhecido\n");
    exit(1);
    }

    while(fgets(linha, BUFSIZ, arquivo) != NULL)
    {
    if(strchr(linha, '\n') != NULL)
    linha[strlen(linha) - 1] = '\0';

    palavra = strtok(linha, " ");



    while(palavra != NULL)
    {
    strlwr(palavra);
    adicionar_palavra(palavra);
    palavra = strtok(NULL, " ");
    contador ++;
    }
    }

    fclose(arquivo);

    mostrar_lista(contador);

    ende = current_time();
    diff = ende - start;

    printf("Tempo Execucao Funcao_3 : %f\n",diff);
    //printf("\nTempo de Execucao: %f", current_time());

}

// MODO PESQUISA BINARIA
void modo_dois(){
    double start, ende, diff;
    start = current_time();
    int contador = 0,tam = 0;
	char frase[100];
    char *vetor[25];
    char *aux;
    int indices[10],repetidos[50];
    int i,n,esq,dir,mid;
    char a[50][50],key[20];

	FILE *arq;
	arq = fopen("trabalho_2.txt","r");
	fgets(frase,100,arq);
	strlwr(frase);
	//tam = strlen(frase);
	//printf("TAM = %i\n",tam);

    aux = strtok(frase, " ");
    if(aux == NULL) {
        printf("Caractere não encontrado!");
    }

    vetor[contador++] = aux;

    while (aux != NULL) {
        aux = strtok(NULL, " ");
        vetor[contador] = aux;
        contador++;
    }
    contador --;
    //quicksort(vetor,0,contador-1);

    preencher(repetidos,contador);
    int j = 0;
    char aux2[20];

    for(int i=0;i<contador;i++){
        strcpy(a[i],vetor[i]);
    }
    //printf("\nChegou Aqui\n");
    esq=0;
    dir=contador-1;
    for(int i=0;i<contador;i++){
        //strcpy(key,vetor[i]);
        //printf("\nKEY = %s\n",key);
        esq=0;
        dir=contador-1;
        //printf("\n--------------%s----------\n",vetor[i]);

        while(esq<=dir)
         {
            mid=(esq+dir)/2;
            //printf("\nMID = %i",mid);
            //printf("\n%s = %s -->",key,vetor[mid]);
            //printf("\n%s[%i] = %s[%i]",vetor[i],i,vetor[mid],mid);
            if (strcmp(vetor[i],vetor[mid])==0 && i!= mid)
            {
                //printf("-->E igual\n");
                repetidos[i] = repetidos[i] + 1;
                break;

            }
            else if(strcmp(vetor[i],vetor[mid])>0){
                dir=dir;
                esq=mid+1;
                //printf("MOVI PRA ESQUERDA ESQ = %i\n",esq);
            }
            else {
                esq=esq;
                dir=mid-1;
                //printf("MOVI PRA DIREITA DIR = %i\n",dir);

            }
         }

    }

    for(int k =0;k<contador;k++){
        printf("%s --> %i\n",vetor[k],repetidos[k]);
    }

    ende = current_time();
    diff = ende - start;

    printf("Tempo Execucao Funcao_2 : %f\n",diff);

}

// MODO PESQUISA SEQUENCIAL
void modo_um() {
    double start, ende, diff;
    start = current_time();
	int contador = 0,tam = 0;
	char frase[1000];
    char *vetor[250];
    char *aux;
    int indices[10];


	FILE *arquivo;
	arquivo = fopen("trabalho_2.txt","r");
	fgets(frase,100,arquivo);
	strlwr(frase);
	//tam = strlen(frase);
	//printf("TAM = %i\n",tam);

    aux = strtok(frase, " ");

    if(aux == NULL) {
        printf("Caractere não encontrado!");
    }

    vetor[contador++] = aux;

    while (aux != NULL) {
        aux = strtok(NULL, " ");
        vetor[contador] = aux;
        contador++;
    }
    contador --;

    //quicksort(vetor,0,contador);
    //ordenando(vetor,contador);

    int repetidos[contador];
    preencher(repetidos,contador);

    for(int i=0;i<contador;i++){
    	for(int j=0;j<contador;j++){
    		if(strcmp(vetor[i],vetor[j])==0 && i != j){
    			repetidos[i] = repetidos[i] + 1;
    			printf("\n [%i]%s = [%i]%s",i,vetor[i],j,vetor[j]);

			}
		}
	}//Porque brasil é um pais atrasado
	printf("\n\n\n");
	for(int k=0;k<contador;k++){
		printf(" %s \t\t%i \n",vetor[k],repetidos[k]);
	}


    // call your function
    ende = current_time();
    diff = ende - start;

    printf("Tempo Execucao Funcao_1 : %f\n",diff);




}


int main(){

	int opcao;
	printf("Escolha uma forma de pesquisa:\n[1]-Sequencial \n[2]-Binaria \n[3]-Arvore \n[4]-Hash\nR: ");
	scanf("%i",&opcao);

	switch(opcao){
		case 1:
			printf("-------SEQUENCIAL ESCOLHIDO--------");
			modo_um();
			break;

		case 2:
			printf("-------BINARIA ESCOLHIDO--------\n");
			modo_dois();
			break;
		case 3:
			printf("-------ARVORE ESCOLHIDO--------\n");
            modo_tres();
			break;
		case 4:
			printf("-------HASH ESCOLHIDO--------");
			//modo_quatro();
			break;

		default:
			printf("VALOR INVALIDO");

	}




}











