
/* Faça um Programa que leia três números e mostre em ordem crescente. */




#include <stdio.h>

int main() 
{
  float n1, n2, n3;
  
  printf("Numero 1: ");
  scanf("%f", &n1);
  
  printf("Numero 2 :");
  scanf("%f", &n2);
  
  printf("Numero 3 :");
  scanf("%f", &n3);
  
  if (n3 > n1)
    if (n1 > n2)
      printf("Ordem = %.2f %.2f %.2f\n", n2, n1, n3);
    else if (n2 < n3)
      printf("Ordem = %.2f %.2f %.2f\n", n1, n2, n3);
  if (n1 > n2)
    if (n2 > n3)
      printf("Ordem = %.2f %.2f %.2f\n", n3, n2, n1);
    else if (n3 < n1)
      printf("Ordem = %.2f %.2f %.2f\n", n2, n3, n1);
  if (n1 < n2)
    if (n3 < n1)
      printf("Ordem =  %.2f %.2f %.2f\n", n3, n1, n2);
    else if (n3 < n2)
      printf("Ordem = %.2f %.2f %.2f \n", n1, n3, n2);
  
}

