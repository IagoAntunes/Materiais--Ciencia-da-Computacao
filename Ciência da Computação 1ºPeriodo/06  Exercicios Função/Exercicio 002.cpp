
/*Faça um programa que calcule Adição,Subtração,Multiplicação,Divisão com os numeros informados pelo usuario, Usando função */

#include <stdio.h>
#include <stdlib.h>
void adicao (void) /* Funcao simples: imprime Ola! */

{
	int num1,num2,s;
	printf("ADICAO\n");
	printf ("Numero:");
	scanf("%i", &num1);
	printf("Numero:");
	scanf("%i", &num2);
	s = num1 + num2;
	printf("%i + %i = %i \n",num1,num2,s);
}
void subtracao (void)
{	
	printf("\nSUBTRACAO\n");
	int num1,num2,s;
	printf("Numero1 :");
	scanf("%i", &num1);
	printf("Numero2 :");
	scanf("%i", &num2);
	s = num1 - num2;
	printf(" %i - %i = %i \n",num1,num2,s);
}

void multiplicacao (void)
{
	int num1,num2,s;
	printf("\nMULTIPLICACAO\n");
	printf("Numero1 :");
	scanf("%i", &num1);
	printf("Numero2 :");
	scanf("%i", &num2);
	s = num1 * num2;
	printf(" %i * %i = %i \n",num1,num2,s);	
}
void divisao (void)

{
	printf("\nDIVISAO\n");
	int num1,num2,d;
	printf("Numero1 :");
	scanf("%i", &num1);
	printf("Numero2 :");
	scanf("%i", &num2);
	d = num1 / num2;
	printf(" %i / %i = %i \n",num1,num2,d);	
}
void fatorial (void)
{
	printf("\nFATORIAL\n");
    int numero, fat;
    printf("Numero:");
    scanf("%d", &numero);
    for (fat=1; numero > 1; numero= numero -1)
    {
        fat= fat * numero;
        printf("\nFatorial: %d", fat);
    }
}
int main (void)
{
adicao();
subtracao();
multiplicacao();
divisao();
fatorial();
}




/*OUTRA FORMA

#include <stdio.h>
#include <stdlib.h>
void adicao (void);
void subtracao (void);
void multiplicacao (void);
void divisao (void);
void fatorial (void);


int main (void)
{
adicao();
subtracao();
multiplicacao();
divisao();
fatorial();
}

void adicao (void)
{
	int num1,num2,s;
	printf("ADICAO\n");
	printf ("Numero:");
	scanf("%i", &num1);
	printf("Numero:");
	scanf("%i", &num2);
	s = num1 + num2;
	printf("%i + %i = %i \n",num1,num2,s);
}
void subtracao (void)
{	
	printf("\nSUBTRACAO\n");
	int num1,num2,s;
	printf("Numero1 :");
	scanf("%i", &num1);
	printf("Numero2 :");
	scanf("%i", &num2);
	s = num1 - num2;
	printf(" %i - %i = %i \n",num1,num2,s);
}

void multiplicacao (void)
{
	int num1,num2,s;
	printf("\nMULTIPLICACAO\n");
	printf("Numero1 :");
	scanf("%i", &num1);
	printf("Numero2 :");
	scanf("%i", &num2);
	s = num1 * num2;
	printf(" %i * %i = %i \n",num1,num2,s);	
}
void divisao (void)

{
	printf("\nDIVISAO\n");
	int num1,num2,d;
	printf("Numero1 :");
	scanf("%i", &num1);
	printf("Numero2 :");
	scanf("%i", &num2);
	d = num1 / num2;
	printf(" %i / %i = %i \n",num1,num2,d);	
}
void fatorial (void)
{
	printf("\nFATORIAL\n");
    int numero, fat;
    printf("Numero:");
    scanf("%d", &numero);
    for (fat=1; numero > 1; numero= numero -1)
    {
        fat= fat * numero;
        printf("\nFatorial: %d", fat);
    }
}
*/
