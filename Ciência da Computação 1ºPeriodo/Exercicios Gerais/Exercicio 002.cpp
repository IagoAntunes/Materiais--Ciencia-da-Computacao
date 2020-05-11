
/* Faça um programa na qual o Usuario digite 50 numeros e imprima no final,mas,os numeros digitados que forem divisiveis por 4 e 7 devem ser sbuistituidos pela palavra 'PIM',caso o numer o digitado seja 13,nao informe nada. */

#include <stdio.h>
#include <stdlib.h>

int main () {
 
 
 int numero[50]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50},i;
 
 
 for(i=0;i<50;i++){
 	
 }
 for(i=0;i<50;i++){
 	if(numero[i] % 4 == 0 || numero[i] % 7 == 0){
 		printf("\npim");
	 }
	else{
		if(numero[i] != 13){
		printf("\n%i",numero[i]);
	}
	}
	if(numero[i] == 13){
		printf("");
	}		
 }

}
