
/*1- Faça um programa que solicite ao usuário seu peso e sua altura e ao
   final informe qual é seu índice de massa corporal. */


#include <stdio.h>


int main(){
	
	float peso,altura;
	
	printf("Altura:");
	scanf("%f", &altura);
	
	printf("Peso:");
	scanf("%f", &peso);
	
	printf("Seu IMC  e de %.2f",(peso)/(altura*altura));
	
	}
	