
/*Faça um programa que calcule o fatorial do numero informado pelo Usuario,usando Função.*/

#include <stdio.h>
#include <stdlib.h>

void mensagem (void)
{

    int numero, fat;
    printf("informe o valor que queira fazer o fatorial: ");
    scanf("%d", &numero);
    for (fat=1; numero > 1; numero= numero -1)
    {
        fat= fat * numero;
        printf("\nfatorial: %d", fat);
    }
}

int main(void) 
{

    mensagem();

    return 0;
}
