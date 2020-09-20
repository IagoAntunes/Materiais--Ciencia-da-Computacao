/*
Um problema típico em ciência da computação consiste em converter um número da sua forma decimal
para a forma binária. Por exemplo, o número 12 tem a sua representação binária igual a 1100. A forma mais
simples de fazer isso é dividir o número sucessivamente por 2, onde o resto da i-ésima divisão vai ser o dígito
i do número binário (da direita para a esquerda). Por exemplo: 12 / 2 = 6, resto 0 (1º dígito da direita para
esquerda), 6 / 2 = 3, resto 0 (2º dígito da direita para esquerda), 3 / 2 = 1 resto 1 (3º dígito da direita para
esquerda), 1 / 2 = 0 resto 1 (4º dígito da direita para esquerda). Resultado: 12 = 1100
*/
#include <stdio.h>
#include <stdlib.h>

int recurs(int num){
	int n;
	if(num/2 != 0){
		n = num/2;
		recurs(n);
		printf("%i",num%2);
	}
	else{
		printf("%i",num%2);
	}
}

int main(){
	int num;
	
	printf("Digite um Numero:");
	scanf("%i",&num);
	
	recurs(num);
}
