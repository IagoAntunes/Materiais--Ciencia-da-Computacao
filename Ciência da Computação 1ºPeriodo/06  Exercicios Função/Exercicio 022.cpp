
/* Escreva um procedimento (procedimento é uma função do tipo void) que recebe as
3 notas de um aluno e imprima se ele está aprovado, reprovado ou em exame
especial (menor que 40 é reprovado, entre 40 e 59 é exame especial e maior que
60 aprovado).  */

#include <stdlib.h>
#include <stdio.h>
#include <math.h>

void auxiliar(int nota1);

int main(){
	
	int i,nota,notaT=0;
	
	for(i=0;i<3;i++){
		printf("Nota%i:  ",i+1);
		scanf("%i", &nota);
		notaT += nota;
	}
	
	auxiliar(notaT);
		
}

void auxiliar(int nota1){
	
	char resultado;
	printf("\nNOTA: %i\n",nota1);
	if(nota1 < 40){
		printf("REPROVADO");
	}
	else if(nota1 <= 59){
		printf("Exame Especial");
	}
	else if(nota1 >= 60){
		printf("Aprovado");
	}

}