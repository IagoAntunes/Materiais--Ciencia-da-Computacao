/*
Faça um programa para receber o nome, quantidade, cor, valor, peso, tamanho, de 10 produtos. Ao final liste os dados do produto de maior.
Utilize struct
*/

#include <stdio.h>
#include <stdlib.h>

int main(void) {

  struct pessoa {
    char nome[51],cor[51];
    int quantidade;
    float valor,peso,tamanho;

  }dados[2];

int maior,i;
maior = dados[0].valor;
for(i=0;i<2;i++){

printf("Nome:");
scanf("%s",&dados[i].nome);

printf("Quantidade:");
scanf("%i",&dados[i].quantidade);

printf("Cor:");
scanf("%s",&dados[i].cor);

printf("Valor:");
scanf("%f",&dados[i].valor);

printf("Peso:");
scanf("%f",&dados[i].peso);

printf("Tamanho:");
scanf("%f",&dados[i].tamanho);

if(dados[i].valor > maior){
  maior = i;
}
}

for(i=0;i<2;i++){
printf("%s",dados[maior].nome);
printf("%i",dados[maior].quantidade);
printf("%s",dados[maior].cor);
printf("%f",dados[maior].valor);
printf("%f",dados[maior].peso);
printf("%f",dados[maior].tamanho);

}




  return 0;
}