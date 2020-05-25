
/* Escreva uma função que receba por parâmetro um valor inteiro e positivo “n” e
retorna o valor de S. 
S = 1/2  -  2/4  + 3/9  -  4/16  +  5/25  -  6/36  -  (n/n*n) */

#include<stdio.h>
#include<stdlib.h>
#include<math.h>


float soma(int a){
    
	float total;
    
    for(int i = 1; i<=a; i++){
        if(i % 2 == 0){
        	total = total - (i/pow(i, 2));
		}
        else{
        	total = total + (i/pow(i, 2));	
		}
    }

    return total;
}

int main(){
    int n1;
    
    printf("Numero:");
    scanf("%i", &n1);
    
    printf("S = %.4f", soma(n1));
}
