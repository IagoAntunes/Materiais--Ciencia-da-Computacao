
/*Continuação do exercício iniciado em sala. Fazer um programa que receba do usuário o
tamanho do vetor de números reais. Receber os valores do usuário. O programa deverá inverter o
vetor através de um função void (procedimento). Não é permitido utilizar um vetor auxiliar na
função. */

#include <stdio.h>
#include <stdlib.h>
#include <iostream>

void auxiliar(int vet[], int tam);

int main()
{
	int tam, num[tam];
	std::cout<<"Tamanho do Vetor:";
	std::cin>>tam;
	
	for(int i=0;i<tam;i++){
	std::cout<<"Numero: "<<i;
	std::cin>>num[i];
	}
	std::cout<<"Vetor Invertido\n";
	auxiliar(num,tam);
}

void auxiliar(int vet[], int tam)
{
	for(int i=tam;i>0;i--){
		std::cout<<vet[i-1];
	}
}
