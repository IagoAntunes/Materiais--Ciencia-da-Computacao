/*– Elaborar um programa para ler a nota de 18 alunos de uma disciplina e armazenar em um vetor. Calcular e imprimir a
média e o número de alunos que tiveram nota superior à média. Em todas as etapas do problema utilizar uma estrutura
em laço para facilitar as tarefas. */


#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main ()
{
float vetor1[18],soma,alunos,media;
int i;

for(i=0;i<18;i++){
	printf("Numero %i :",i+1);
	scanf("%f",&vetor1[i]);
	soma = soma + vetor1[i];
}
media = soma / 18;
for(i=0;i<18;i++){
	printf("%.0f ",vetor1[i]);
	if(vetor1[i] > media){
		alunos = alunos + 1;
	}
		
}
printf("MEDIA: %f",media);
printf("\nAlunos acima da Media: %f",alunos);





} 
