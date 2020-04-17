  
/*Agora faça um programa que irá simular sua aprovação na UIT, o usuário deverá entrar com 3    notas, sendoque as duas primeiras devem ser menor que 30 e a última menor que 40. O usuário deverá entrar também como percentual de faltas. Como vocês sabem o aluno só é aprovado se tiver frequencia maior que 75 e nota maiorque 60. Nota entre 40 e 60 é recuperação. Frequencia abaixo de 75 e nota abaixo de 40 já é reprovação direto. */


#include <stdio.h>


int main(){
	
	int faltas;
	float nota1,nota2,nota3,total,frequencia;
	
	nota1 = 100;
	nota2 = 100;
	nota3 = 100;
	
	while(nota1 > 30 || nota2 > 30){
	printf("Nota 1:");
	scanf("%f",&nota1);
	
	printf("Nota 2:");
	scanf("%f",&nota2);
}
	while(nota3 > 40){
		printf("Nota 3:");
		scanf("%f",&nota3);
	}
	
	printf("Percentual de Faltas :");
	scanf("%i",&faltas);
	frequencia = 100 - faltas;
	
	total = (nota1 + nota2 + nota3);
	
	if (total < 40 || frequencia < 75){
		printf("REPROVADO");
	}
	else{
	if (total > 60 && frequencia > 75 ){
		printf("APROVADO");
	}
	
	if (total > 40 && total < 60){
		printf("RECUPERACAO");
	}
	}	
}

		