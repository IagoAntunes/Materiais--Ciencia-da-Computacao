
/* 8-Faça um programa que receba um número inteiro do usuário e calcule seu fatorial. */

#include <stdio.h>
 
int main()
{
int fat, n;
printf("Numero: ");
scanf("%d", &n);
 
for(fat = 1; n > 1; n = n - 1)
fat = fat * n;
 
printf("\nFatorial calculado: %d", fat);
return 0;
}
