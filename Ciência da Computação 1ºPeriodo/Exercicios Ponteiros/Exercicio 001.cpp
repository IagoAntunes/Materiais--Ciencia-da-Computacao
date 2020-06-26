
/* Escreva um programa que declare um inteiro, um real e um char, e
ponteiros para inteiro, real e char. Associe as variáveis aos
ponteiros (use &). Modifique os valores de cada variável usando os
ponteiros. Imprima os valores das variáveis antes e após a
modificação. */

#include <conio.h>
#include <stdio.h>

int main(){

 //Declarando Variaveis,ponteiros
 int a=1,*pa;
 float b=2.2,*pb;
 char c='o',*pc;
 
 //Ligando Ponteiros ao endereço das varuaveus
 pa = &a;
 pb = &b;
 pc = &c;
 
 //Antes da Modificação
 printf("\n A=%i \tB=%f \tC=%c ",a,b,c);
 
 //Modificiando o valor das variaveis com ponteiro
 *pa = 4;
 *pb = 8.8;
 *pc = 'd';
 
 //Depois da Modificação
 printf("\n A=%i \tB=%f \tC=%c ",a,b,c);
 
}