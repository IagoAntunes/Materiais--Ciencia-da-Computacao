#include <stdio.h>
#include <stdlib.h>

int preencher(int capa , int vetor[]){
	
	for(int i=0;i<capa;i++){
		printf("Numero%i  ",i);
		scanf("%i",&vetor[i]);
	}	
}
void printar(int capa, int vetor[]){
	printf("[");
	for(int i=0;i<capa;i++){
		printf("  %i  ",vetor[i]);
	}
	printf("]");
}
bool verificar(int capa, int vetor[], int num, int *local){
	int resp = false;
	for(int i=0;i<capa;i++){
		if(vetor[i] == num){
			*local = i;
			i = capa;
			resp = true;
		}
	}
	return resp;
	
}

int main(){
	int capa,num,local,*plocal;
	
	plocal = &local;
	
	printf("Capacidade do Vetor ->");
	scanf("%i",&capa);
	
	int vetor[capa];
	preencher(capa,vetor);
	
	system("cls");
	printf("Num:  ");
	scanf("%i",&num);
	verificar(capa,vetor,num,plocal);
	if(verificar(capa,vetor,num,plocal) == true){
		printf("NUM ENCONTRADO\n");
		printf("INDICE = %i \n",*plocal);
		
	}else{
		printf("Valor Invalido \n");
	}
	
	printar(capa,vetor);
	
}