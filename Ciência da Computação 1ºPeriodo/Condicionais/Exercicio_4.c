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


