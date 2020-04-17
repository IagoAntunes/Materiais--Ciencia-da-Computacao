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

