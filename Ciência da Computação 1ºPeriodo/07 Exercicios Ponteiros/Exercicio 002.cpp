
/*  Faça um programa que leia dois valores inteiros e chame uma função
que receba estes2 valores de entrada e retorne o maior valor na
primeira variável e o menor valor na segunda variável. Escreva o
conteúdo das 2 variáveis na tela  */

#include <conio.h>
#include <stdio.h>

int trocar(int *num1,int *num2){
	
	int maior = *num1;
	if(maior < *num2){
		*num1 = *num2;
		*num2 = maior;
	}
	
}

int main(){

 int num1,num2;
 
 printf("Numero 1 : ");
 scanf("%i", &num1);
 
 printf("Numero 2 : ");
 scanf("%i", &num2);
 
 printf("\n NUM1 = %i \tNUM2 = %i ",num1,num2);
 trocar(&num1,&num2); 
 printf("\n NUM1 = %i \tNUM2 = %i ",num1,num2);
 

}
