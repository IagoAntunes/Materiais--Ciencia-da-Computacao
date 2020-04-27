/*Faça um programa para receber um vetor A(25) “inteiros”, os números devem ser digitados por um
usuário. A seguir, substitua todos os valores negativos de ‘A’ por zero. Ao final apresente todos os valores informados */


#include<stdlib.h>
#include<stdio.h>

int main () {
    int vetor[25], i;
    
    for(i=0;i<25;i++){
        printf("Numero%i:", i+1);
        scanf("%i", &vetor[i]);
        
        if(vetor[i]<0){
            vetor[i]=0;
        }
    }
    
    for(i=0;i<25;i++){
        printf("%i\n",vetor[i]);
    }
}
