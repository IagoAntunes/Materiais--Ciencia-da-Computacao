
/* Fazer uma função que receba um número inteiro e retorne 1 caso seja par e 0 caso
seja impar  */

#include <stdlib.h>
#include <stdio.h>


int auxiliar(int num1);

int main(){
	
	int num;
	
	printf("Numero:");
	scanf("%i", &num);
	
	
	printf("%i",auxiliar(num));
		
}



int auxiliar(int num1){
	
	if(num1 % 2 == 0){
		return(1);
	}
	else{	
		return(0);
	}

}
	