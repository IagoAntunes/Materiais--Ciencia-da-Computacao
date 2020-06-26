
/*  Faça um programa para receber um vetor de 5 números inteiros. Os
valores deverão ser informados na função principal. Implemente uma
função auxiliar para multiplicar dos os números pelo maior valor
informado no vetor. A função deverá receber os valores como utilizando
ponteiro.  */

#include <conio.h>
#include <stdio.h>

int maior(int *vetor){
	
	int i,maior = *vetor;
	for(i=0;i<5;i++){
		if(*(vetor + i) > maior){
			maior = *(vetor + i);
		}
	}
	for(i=0;i<5;i++){
		*(vetor + i) = *(vetor + i) * maior;
	}
		
}

int main(){

 int i,vet[5];
 
 for(i=0;i<5;i++){
 	printf("Num%i: ", i);
 	scanf("%i", &vet[i]);
 }
 maior(vet);
 printf("\n");
  for(i=0;i<5;i++){
 	printf("%i  ",vet[i]);
 }

}
