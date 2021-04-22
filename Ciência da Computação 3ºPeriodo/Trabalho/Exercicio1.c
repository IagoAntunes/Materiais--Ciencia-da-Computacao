#include <stdio.h>
#include <stdlib.h>


void comparacao(int vetor[],int capa){
	
	for(int i=0;i<capa;i++){
		for(int j=0;j<capa;j++){
			if(vetor[i] == vetor[j] && i != j){
				vetor[i] = NULL;
				vetor[j] = NULL;
			}
		}
	}
}

int main(){
	
	int capa;
	
	printf("Capacidade:");
	scanf("%i",&capa);
	
	int vetor[capa];
	
	for(int i=0;i<capa;i++){
		printf("Num %i:  ",i);
		scanf("%i",&vetor[i]);
		while(vetor[i] < 0){
			printf("Num %i: ",i);
			scanf("%i",&vetor[i]);
		}
	}	
	comparacao(vetor,capa);
	for(int i =0;i<capa;i++){
		if(vetor[i] > 0)
			printf("  %i ",vetor[i]);
	}
}