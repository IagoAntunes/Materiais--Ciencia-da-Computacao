#include <stdio.h>


int main(){
	
	float peso,altura;
	
	printf("Altura:");
	scanf("%f", &altura);
	
	printf("Peso:");
	scanf("%f", &peso);
	
	printf("Seu IMC  e de %.2f",(peso)/(altura*altura));
	
	}


