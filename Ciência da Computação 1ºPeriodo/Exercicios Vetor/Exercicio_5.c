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

