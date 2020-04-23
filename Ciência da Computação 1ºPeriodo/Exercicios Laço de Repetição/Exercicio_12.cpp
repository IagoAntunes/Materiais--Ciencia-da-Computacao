
/* 12- Faça um programa em C que imprima quais os números de 1 a 100 são divisíveis por 3 ou por
7. Abaixo a saída do programa (apenas como exemplo) até o número 15:
1 nao e divisivel por 3 nem por 7
2 nao e divisivel por 3 nem por 7
3 e divisivel por 3
4 nao e divisivel por 3 nem por 7
5 nao e divisivel por 3 nem por 7
6 e divisivel por 3
7 e divisivel por 7
8 nao e divisivel por 3 nem por 7
9 e divisivel por 3
10 nao e divisivel por 3 nem por 7
11 nao e divisivel por 3 nem por 7
12 e divisivel por 3           */

#include<stdlib.h>
#include<stdio.h>
#include <conio.h>

int main (){
    int i;
    
    
    for(i=1;i<=100;i++){
    	if (i % 3 == 0 && i % 7 == 0){
    		printf("%i e divisivel por 3 e por 7\n",i);
		}
		else{
			if(i % 3 == 0 && i % 7 != 0){
				printf("%i e divisivel por 3 e nao e divisivel por 7\n",i);
			}
		else{
			if(i % 3 != 0 && i % 7 == 0){
				printf("%i nao e divisivel por 3 e e divisivel por 7\n",i);
			}
		else{
			printf("%i nao e divisivel por 3 e nem por 7\n",i);
		}
    }
}
	}
	
}