/*
- Crie um programa que permita armazenar o nome, a altura e da data de nascimento de 10 pessoas.
Cada pessoa deve ser representada por uma struct.
Ao final solicite ao usuário que informe uma altura para pesquisa. Liste os dados de todas as pessoas com
altura igual o superior ao valor informado.
*/

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	struct pessoa {
		char nome[50];
		float altura;
		int data;
		
	}pessoa1[5];
	
	float pesquisa;
	
	for(int i=0;i<5;i++){
		printf("----Pessoa %i----\n",i+1);
		scanf("%s",&pessoa1[i].nome);
		scanf("%f",&pessoa1[i].altura);
		scanf("%i",&pessoa1[i].data);
	}
	
	printf("Altura para pesquisa;");
	scanf("%f",&pesquisa);
	
	for(int i=0;i<5;i++){
		if(pessoa1[i].altura >= pesquisa){
			printf("\n\nNome:%s",pessoa1[i].nome);
			printf("\nAltura:%.2f",pessoa1[i].altura);
			printf("\nData:%i",pessoa1[i].data);
		}
	}
}
