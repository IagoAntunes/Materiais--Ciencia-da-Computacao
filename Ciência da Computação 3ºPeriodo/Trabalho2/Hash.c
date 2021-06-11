#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

#define HTABLE_SIZE 1001
#define MAX_LINE_SIZ 1024

/*-------------------------------------------------------------
--->Codigo funciona perfeitamente aqui
Mas quando passo para a função principal da conflito

*/



//Struct
typedef struct node* hash_test;
struct node {
    char *words;
    int freq;
};

void adicionar(char *s);
void mostrar();
void print_test();

//Inicializa
hash_test htable[HTABLE_SIZE] = { NULL };
unsigned int chaves[HTABLE_SIZE];
int tamanhoChaves=-1;
int size = 0;

//Separa as Palavras e chama a função adicionar
void sep(FILE *fp){
    const char *seperators = " ?!'\";,.:+-*&%(){}[]<>\\\t\n";

    char line[MAX_LINE_SIZ];
    char *s;
    while((fgets(line,MAX_LINE_SIZ, fp)) != NULL)
    {
        for (s=strtok(line,seperators); s; s=strtok(NULL,seperators)){
            strlwr(s);
            adicionar(s);
        }
    }
}

unsigned int hash(char *tok){
    unsigned int hv = 0;
    while (*tok)
        hv = (hv << 4) | toupper(*tok++);

    return hv % HTABLE_SIZE;
}

//Adicioan os valores na tabela
void adicionar(char *words) {

    tamanhoChaves++;
    chaves[tamanhoChaves] = hash(words);
    unsigned int hashval = chaves[tamanhoChaves];

    if (htable[hashval]==NULL){
        htable[hashval] = malloc(sizeof(words));
        htable[hashval]->words = words ;
        htable[hashval]->freq = 1;
        size++;

    }else {

        htable[hashval]->freq++;
        size++;
    }

    printf("\n--------------\n");
    mostrar();

}

//Imprime a tabela e os valores
void mostrar() {
    int i=0;

    hash_test *auxTable = (hash_test*) malloc(sizeof(hash_test)*size);
    unsigned int hashval;

    for(i; i < size; i++){
        hashval = chaves[i];

        auxTable[i] = htable[hashval];
    }
    for (i=0; i < size; i++)
        printf("%s  \t        %d\n",auxTable[i]->words,auxTable[i]->freq-1);
    free(auxTable);
}

//Int main que abre o arquivo
int main(int argc, char *argv[]){
    int i;
    FILE *fp;

    fp = fopen("trabalho_2.txt","r");
    if (NULL == fp)
    {
        fprintf(stderr,"erro %s\n",fp);
    }
    sep(fp);

    fclose(fp);


}
