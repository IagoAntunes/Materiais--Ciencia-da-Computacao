/*– Faça um programa para receber uma relação de 12 números. A seguir apresente os números em ordem decrescente. */


#include <stdio.h>
#include <stdlib.h>

int main () {
    int i,vetor[12],aux; 
	aux = 0;
    
    for (i=0; i<12;i++) {
        printf("Numero%i:",i);
        scanf("%d", &vetor[i]);
        }

        
    for (int i=0; i<12; i++){
        if(vetor[i]<vetor[i+1]){
          	 aux=vetor[i+1];
             vetor[i+1]=vetor[i];
             vetor[i]=aux;
             i = -1;
            }
        }
    
        for(int i=0; i<12; i++){ 
            printf("%i\n", vetor[i]);
        }
}
