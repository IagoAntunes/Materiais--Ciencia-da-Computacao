
/*Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
- A mensagem "Aprovado", se a média alcançada for maior ou igual a sete e menor que 10;
- A mensagem "Reprovado", se a média for menor do que sete;
- A mensagem "Aprovado com Distinção", se a média for igual a dez */


#include <stdio.h>


int main(){
	
	float nota1,nota2,media;
	
	
	printf("NOTA 1 :");
	scanf("%f",&nota1);
	
	printf("NOTA 2 :");
	scanf("%f",&nota2);
	
	media = (nota1 + nota2)/2;
	
	if ( media >= 7 && media < 10){
		printf("APROVADO");
	}
	if (media < 7){
		printf("REPROVADO");
	}
	if (media == 10){
		printf("APROVADO COM DISTINCAO");
}


}


