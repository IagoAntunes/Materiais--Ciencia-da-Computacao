
/* Faça um programa em C para receber na função Principal uma relação de 10 números. Elabore uma função
Auxiliar para trocar, todos os elementos de ordem ímpar do vetor com os elementos de ordem par imediatamente posteriores.
Implemente vetor.  */ 

#include <conio.h>
#include <stdio.h>

int auxiliar(int *x,int *matriz,int *matrizB){
	
	for(int i=0;i<9;i++){
		matrizB[i] = *(matriz + i) * *x;
	}
	for(int i =0;i<9;i++){
		printf("%i  ",matrizB[i]);
	}
		
}

int main(){

 int i,i2,x,matriz[4][4],matrizB[4][4];
 
 printf("Numero a Ser Multiplicado:");
 scanf("%i", &x);
 
 for(i=0;i<4;i++){
 	for(i2=0;i2<4;i2++){
 		printf("Linha%i Coluna%i ",i,i2);
 		scanf("%i", &matriz[i][i2]);
	 }
 }
 
 auxiliar(&x,matriz[0],matrizB[0]);

}
