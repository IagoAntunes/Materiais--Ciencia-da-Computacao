
/*Faça um programa que faça 5 perguntas[V ou F] iguais para o Marido E mulher,e informe no final,o numero de resposta Iguais.*/

#include <stdio.h>
#include <stdlib.h>


int main () {
	
char marido[5],esposa[5];
int i,count;
count = 0;
for(i=0;i<5;i++){
	
printf("Pergunta: %i:",i+1);
scanf("%s", &marido[i]); 
}

printf("\n");

for(i=0;i<5;i++){
	
printf("Pergunta: %i:",i+1);
scanf("%s", &esposa[i]);
}

printf("\n\n");

for(i=0;i<5;i++){
	
if(marido[i] == esposa[i]){
count = count + 1;
}
}
printf("Respostas Iguais: %i",count);

}
