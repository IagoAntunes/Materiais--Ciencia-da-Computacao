
/* Faça uma função que receba um vetor X(20) de reais, por parâmetro, e retorna a soma
dos elementos de X. */

#include <stdio.h>
#include <stdlib.h>

int auxiliar(float vetor[20]){
	int i;
	float soma1;
	for(i=0;i<20;i++){
		soma1 = soma1 + vetor[i];
	
	}
	return(soma1);
	
	
}

int main(){
	
	
int i,j;
float vetor[20],soma,resultado;


for(i=0;i<20;i++){
	printf("Numero%i:",i);
	scanf("%f", &vetor[i]);
	}
	
resultado = auxiliar(vetor);
printf("Resultado = %f",resultado);
	
	
}