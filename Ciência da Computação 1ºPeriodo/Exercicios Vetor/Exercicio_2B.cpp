
/*Utilizando a estrutura de repetição, elaborar um programa para calcular o valor de S.
b) S = 1/1 - 2/4 + 3/9 - 4/16 + 5/25 - 6/36 + .... - 10/100    */


#include <stdio.h>
#include <stdlib.h>

int main()
{
int nume,deno;
float nume2,impar,formula,divisao,par;


for(nume=1; nume<=10; nume ++){
	deno = nume * nume;
	divisao = (float)nume / deno;
	if ( nume % 2 == 0){
		par = par + divisao;
	}
	else{
	impar = impar + divisao;
}
}
formula = impar - par;
printf("\nRESULTADO:%f",formula);

}



