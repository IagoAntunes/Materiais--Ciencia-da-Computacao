/*
 Implemente uma função que calcule a área da superfície e o volume de uma esfera de raio R. Essa função
deve obedecer ao protótipo:
void calc_esfera (float R, float *area, float *volume)
O resultado deve ser apresentado na função principal
A área da superfície e o volume são dados, respectivamente, por:
A = 4 ∗ p ∗ R
2
V = 4/3 ∗ p ∗ R
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void calc_esfera (float R, float *area, float *volume);
int main(){
	
	float R,area,*parea,volume,*pvolume;
	
	printf("Valor do Raio:");
	scanf("%f",&R);
	
	parea = &area;
	pvolume = &volume;
	

	calc_esfera(R,parea,pvolume);
	
	printf("Area = %f",area);
	printf("\nVolume = %f",volume);
}

void calc_esfera (float R, float *area, float *volume){
	
	float pi = 3.14,total;
	
	*area = 4 * pi * pow(R,2) ; 
	*volume = (4 * pi * pow(R,3)/3);
}