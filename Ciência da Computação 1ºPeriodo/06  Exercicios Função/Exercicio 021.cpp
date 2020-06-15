
/* Faça uma função que recebe por parâmetro o raio de uma esfera e calcula o seu
volume (v = (4 * 3,14 * R³)/3).  */

#include <stdlib.h>
#include <stdio.h>
#include <math.h>

int  auxiliar(float volume,int raio);

int main(){
	
	int raio,total;
	float volume;
	
	printf("Raio Da Esfera:");
	scanf("%i", &raio);
	
	volume = auxiliar(volume,raio);
	printf("%f",volume);
		
}

int auxiliar(float volume,int num){
	
	volume = ((4 * 3.14 * pow(num,3))/3);
	
	return(volume);

}