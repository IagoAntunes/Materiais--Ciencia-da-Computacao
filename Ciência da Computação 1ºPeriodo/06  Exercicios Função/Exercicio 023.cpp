
/* Fazer uma função que receba um número inteiro e retorne o fatorial.  */

#include <stdlib.h>
#include <stdio.h>

int auxiliar(int num);

int main(){
	
	int num,fatorial;
	
	printf("Numero:");
	scanf("%i", &num);
	
	fatorial = auxiliar(num);
	printf("Fatorial: %i",fatorial);
		
}

int auxiliar(int num){
	
	int fat;
	
	for(fat = 1; num > 1; num = num - 1)
  {      
      fat = fat * num ;
  }
	return(fat);

}