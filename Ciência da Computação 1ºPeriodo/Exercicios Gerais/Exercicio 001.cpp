

/*Faça um programa que informe se a pessoa esta con Coronavirus ou não,pergunte ao usuario 
-Se ele esta com Febre - Se ele esta tossindo - Se esta com um corpo cansado,com resposta de 
0 Para Baixo,1 para Moderado , 2 Para Grave.
Pergunte tambem se o usuario teve contato com alguem com sintomas,caso a resposta seja 'Sim' e  A media das e perguntas anteriores for maior que 1,Diga:''Voce pode estar Infectado,procure um medico'',Caso a resposta seja 'Nao' ,informe ''Voce provavelmente nao esta infectado''. */

#include <stdio.h>
#include <stdlib.h>

int main () {
 
 
 int febre,tosse,corpo,contato,media1,media;
 
 printf("Voce Esta com Febre :[0][1][2]");
 scanf("%i", &febre);
 printf("Voce esta Tossindo : [0][1][2]");
 scanf("%i", &tosse);
 printf("Voce esta com corpo cansado[0][1][2]");
 scanf("%i", &corpo);
 
 printf("Teve contato com alguem com sintomas :[1]Sim [2]Nao");
 scanf("%i", &contato);
 
 media1 = febre + tosse + corpo;
 media = media1 / 3;
 
 if(contato = 1 && media >= 1){
 	printf("\nVoce pode estar Infectado,procure um medico");
 }
 else{
 	printf("\nVoce provavelmente nao esta infectado");
 }
 

}

