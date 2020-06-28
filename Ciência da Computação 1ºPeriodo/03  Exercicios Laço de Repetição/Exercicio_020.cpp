
/* Escreva um programa que receba um número inteiro não-negativo n e
imprima os n primeiros
números primos.  */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
int main()
{
    //Declaração Variaveis
    int aux,i,quantidade,cont=0,aux3,aux2=1;

    //Entrada da Quantidade
    printf("Quantidade de Numeros:\n");scanf("%i", &quantidade);
    int numero[quantidade];

    //Entrada dos Numeros
    for(i=0; i<quantidade ;i++)
    {
        printf("Digite um numero:"); scanf("%i",&numero[i]);
        if (numero[i] > 1) {
        aux = 2;
        aux2 = 1;
        aux3 = sqrt(numero[i]);
    while(aux2 && aux <= aux3)
    {
    if (numero[i] % aux == 0){
        aux2 = 0;
    }
        aux=aux +1;
    }
    }
    }
    printf("\n--NUMEROS PRIMOS---\n");
    //Calculo dos Numeros Primos Digitados
    for(i=0; i<quantidade ;i++)
    {
        if (numero[i] > 1) {
        aux = 2; aux2 = 1; aux3 = sqrt(numero[i]);
    while(aux2 && aux <= aux3)
    {
    //Contagens Primos
    if (numero[i] % aux == 0){
        aux2 = 0;
    }
        aux= aux + 1;
    }
    //Primo
    if (aux2==1)
        printf("%i e primo.\n", numero[i]);
    }
    }
}
