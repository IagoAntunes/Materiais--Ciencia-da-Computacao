
/* Faça uma função que receba, por parâmetro, uma matriz B(3,3) de reais e retorne a
soma dos elementos das linhas pares de B. */

#include <stdlib.h>
#include <stdio.h>


int soma(float secundaria[3][3]){
	
	int i,j;
	float somaT;
	
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			if(i % 2 == 0){
				somaT = somaT + secundaria[i][j];
			}
		}	
}
return(somaT);
	
}

int main(int){
	
	int i,j;
	
	float num[3][3],resultado;
	

	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			printf("Linha%i Coluna%i ",i,j);
			scanf("%f", &num[i][j]);
		}	
}
resultado = soma(num);
printf("Soma = %f", resultado);
}
