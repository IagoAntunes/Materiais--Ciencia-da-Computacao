/*
Implemente uma struct para receber os dados dos funcionários:
Nome;
Idade;
CPF;
Endereço.
E outra struct para receber as informações abaixo de cada funcionário
Salario hora;
Horas trabalhadas por dia;
Número de dias trabalhados no mês.
Implemente um programa para que o usuário possa informar o número de funcionários que deseja cadastrar.
Ao final apresente os seguintes resultados.
a) O nome, CPF, e salário mensal de cada funcionário.
b) O valor total que a empresa irá precisar para efetuar o pagamento de todos os funcionários
*/

#include <stdio.h>
#include <stdlib.h>

int main(){
	int quantidade;
			
	printf("Quantidade:");
	scanf("%i",&quantidade);
	
	struct pessoa{
		char nome[51];
		char endereco;
		int idade;
		int cpf;
	}pessoa1[quantidade];

struct individuo{
	float salario;
	int horas;
	int dias;
}individuo1[quantidade];
	
	int i;
	float total;
	
	for(i=0;i<quantidade;i++){
		scanf("%s",&pessoa1[i].nome);
		scanf("%s",&pessoa1[i].endereco);
		scanf("%i",&pessoa1[i].idade);
		scanf("%i",&pessoa1[i].cpf);
		scanf("%f",&individuo1[i].salario);
		scanf("%i",&individuo1[i].horas);
		scanf("%i",&individuo1[i].dias);
		
		total = individuo1[i].salario * individuo1[i].horas;
	}
	for(i=0;i<quantidade;i++){
		printf("\n\n----PESSOA%i----",i+1);
		printf("\nNome: %s",pessoa1[i].nome);
		printf("\nCPF: %i",pessoa1[i].cpf);
		printf("\nSalario Mensal: %f",pessoa1[i].nome);	
	}
	printf("\n\nTotal a Pagar: %f",total);	
}

