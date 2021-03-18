#include<stdlib.h>
#include<stdio.h>
#include<stdbool.h>
#define TAM 10


bool pesquisa(int vetor[],int chave){
	
	bool resp = false;
	for(int i=0;i<TAM;i++){
		if(vetor[i] == chave){
			i = TAM;
			resp = true;
		}
	}
	return resp;
	
}
int print(int vetor[],int chave){
	
	printf("[");
	for(int i=0;i<TAM;i++){
		printf("%i",vetor[i]);
	}
	printf("]");
	
	
}
int main(){
	int vetor[TAM],opc;
	
	for(int i=0; i<TAM; i++){
        vetor[i] = rand()%TAM;
    }
    
    print(vetor,opc);
    
    printf("Digite um Numero: ");
    scanf("%i",&opc);
    
    if(pesquisa(vetor,opc) == true){
    	printf("Achei");
	}else{
		printf("Não Achei");
	}
}