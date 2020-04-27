
/*Faça um programa para receber 10 números inteiros em um vetor A e 10 números em um vetor B. Grave os dados digitados em um vetor C de 20 posições. 
Sendo as 10 primeiras posições valores do vetor a e os 10 últimos valores do vetor B. 
Ao final liste os dados do vetor C. */


#include <stdio.h>
#include <stdlib.h>

int main()
{

    int vet1[10],vet2[10],vet3[20],i;

    for ( i = 0; i < 10; i++ ){
    	printf("Numero %d:",i+1);
        scanf( "%d", &vet1[i] );
}
	printf("VETOR B! \n ");
    for ( i = 0; i < 10; i++ ){
    	printf("Numero %d:",i+1);
        scanf( "%d", &vet2[i] );
    }

    for ( i = 0; i < 10; i++ ){
        vet3[i] = vet1[i];
}
    for ( i = 10; i < 20; i++ ){
        vet3[i] = vet2[i-10];
}
    printf("VETOR C: \n");
    for ( i = 0; i < 20; i++ ){
        printf( "%d  ", vet3[i] );
}
}
