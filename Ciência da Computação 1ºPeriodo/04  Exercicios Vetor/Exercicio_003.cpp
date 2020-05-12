
/* Faça um programa em C para implementar o que se pede. Uma empresa A produz 1000 carros
mensais e aumenta sua produção 2% ao mês, enquanto a empresa B 700 carros mensais e cresce
7% ao mês, em quantos meses a empresa B terá produção superior à empresa A..   */


#include <stdio.h>

int main()
{
    int empresa_A,aumento_a,empresa_B,aumento_b,formulaA,formulaB,meses;
    meses = 0;
    empresa_A = 1000;
    aumento_a = 2;
    
    empresa_B = 700;
    aumento_b = 7;
    
    formulaA = (1000 * 2) / 100;
    formulaB = (700 * 7) / 100;
    


    while (empresa_B<=empresa_A){
    	empresa_A = empresa_A + formulaA;
    	empresa_B = empresa_B + formulaB;
    	meses = meses + 1;
    	printf("\n-=-=-");
		printf("%i MES\n",meses);
		printf("-=-=-\n");
		
		printf("EMPRESA 1 :%i\n",empresa_A);
    	printf("EMPRESA 2 :%i\n",empresa_B);
	}
printf("\n\n %i meses!",meses);
	  
}
