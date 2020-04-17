
/*Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os       	 valores   podem
ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes; */



#include <stdio.h>


int main(){
	
	int l1,l2,l3;
	
	printf("Lado 1 :");
	scanf("%i",&l1);
	
	printf("Lado 2 :");
	scanf("%i",&l2);
	
	printf("Lado 3 :");
	scanf("%i",&l3);

	if (l1 + l2 == l3){
		if (l1 != l2 && l1 != l3 && l2 != l3){
			printf("TRIANGULO ESCALENO");
		}
		else{
		if (l1 == l2 && l2 == l3){
			printf("TRIANGULO EQUILATERO");	
		}
		else{
		if (l1 == l2 || l1 == l3 || l2 == l3){
			printf("TRIANGULO ISOSCELES");
		}
		}
		}
	}
	else{
		printf("Não pode ser um Triangulo");
	}
		
		
	}


