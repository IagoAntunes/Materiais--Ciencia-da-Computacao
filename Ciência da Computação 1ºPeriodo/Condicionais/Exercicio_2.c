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


		