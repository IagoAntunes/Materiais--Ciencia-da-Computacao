/*
Elabore um programa que contenha uma função que permita passar por parâmetro dois números inteiros
A e B. A função deve calcular a soma entre estes dois números e armazenar o resultado na variável. A e a
multiplicação de entre eles na variável B.
O resultado deve ser impresso na função principal. Vale ressaltar que essa função não deve retornar nenhum
valor.
*/

#include <stdio.h>
#include <stdlib.h>

int auxiliar(int *pa,int *pb);
int main(){
	
	
	int a , b , *pa,*pb;
	
	printf("Numero1: ");
	scanf("%i",&a);

	printf("Numero2: ");
	scanf("%i",&b);
	
	pa = &a;
	pb = &b;
	
	auxiliar(pa,pb);
	
	printf("A = %i",a);
	printf("\nB = %i",b);
	
}

int auxiliar(int *pa,int *pb){
	
	int soma,mult;
	
	soma = *pa + *pb;
	mult = *pa * *pb;
	
	*pa = soma;
	*pb = mult;
	
}
