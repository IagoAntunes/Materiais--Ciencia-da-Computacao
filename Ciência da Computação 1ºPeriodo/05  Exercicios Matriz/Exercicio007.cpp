
/*  Utilizando matrizes faça um programa que receba 3 notas e o percentual de faltas de uma
turma de 10 alunos. Ao final dizer quais estão reprovados.  */

#include<stdio.h>
#include<stdlib.h>


int main(){
    int i,i2,matriz[10][3],faltas[10],nota[10];

	for(i=0;i<10;i++){
		for(i2=0;i2<3;i2++){
			printf("Aluno%i Nota%i :",i,i2);
			scanf("%i", &matriz[i][i2]);
			nota[i] = nota[i] + matriz[i][i2];
		}
	}
	for(i=0;i<10;i++){
		printf("Aluno%i Percentual de Falta:",i);
		scanf("%i", &faltas[i]);
	}
	
	
   for(i=0;i<10;i++){
   		if(nota[i] < 40 || faltas[i] > 60){
   			printf("\nAluno%i Reprovado!!",i);
		   }
		}
	}