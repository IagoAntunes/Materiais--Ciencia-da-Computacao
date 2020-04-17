
/* Utilizando a estrutura de repetição, elaborar um programa para calcular o valor de S.
a) S = 1/1 + 3/2 + 5/3 + 7/4......+99/50    */

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
int nume,deno;
float soma;

nume=1;
soma=0;

for(deno=1; deno<=50; deno++){
soma=soma+ (float)nume/deno;
nume=nume+2;
}
printf("%f",soma);

}


