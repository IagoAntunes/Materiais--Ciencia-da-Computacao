
/*Crie um algoritmo que receba a quantidade de turmas do
professor e a quantidade de alunos por turmas. Depois o sistema
irá receber a nota de cada alunos em cada turma e imprimir na
tela.*/

#include<stdlib.h>
#include<stdio.h>

int main (){
    int turma,alunos1,i,j;
    
	
	turma = 0;
    alunos1 = 0;
    

    printf("Quantidade de Turmas:");
    scanf("%i",&turma);
    
    int alunos[turma], notasTotal[50][50];

    for (i=0;i<turma;i=i+1)
	{
        printf("Alunos da Turma %i ",i+1);
        scanf("%i",&alunos[i]);

    }

    for (int t=0;t<turma;t=t+1)
	{
        alunos1=alunos[t];

        for (int a=0;a<alunos1;a++)
		
		{
            printf("Nota :  %i aluno / turma %i: ",a+1,t+1);
            scanf("%i",&notasTotal[t][a]);
        }
    }
    
    for(i=0;i<turma;i=i+1)
	{
        
		alunos1=alunos[i];
        printf("\n\n\n---------------------------------------------------");
		
		printf("\n----=TURMA %d=----",i+1);
        
		for(j=0;j<alunos1;j=j+1)
		{
            printf("\n%i Aluno: %i pontos", j+1,notasTotal[i][j]);
            
            printf("\n\n\n---------------------------------------------------");
        }
        printf("\n");
        
    }
}