/*
Crie uma struct para controlar ações de uma bolsa de valores com as seguintes informações:
• Nome da companhia
• Área de atuação da companhia
• Valor atual da ação (em reais)
Implemente uma função para
a) Entrada de dados para 10 empresas;
b) Listar todas a empresas;
c) Listar a ação mais valorizada;
*/

#include <stdio.h>
#include <stdlib.h>


	struct empresas{
		
		char nome[50];
		char area[50];
		int acao;
		
	}empresa[3];

int auxiliar(struct empresas *p){

	for(int i=0;i<3;i++){
		scanf("%s",(*p).nome);
		scanf("%s",(*p).area);
	}
	
	for(int i=0;i<3;i++){
		printf("%s",(*p).nome);
	}
	
}
int main(void)
{
	struct empresas p1;
	auxiliar(&p1);
}