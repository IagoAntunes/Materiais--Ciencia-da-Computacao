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


