/* 7-Você foi contratado para criar um código que escreva o grande
sucesso da música popular brasileira, “creu”. Para isso você deve
receber do usuário a velocidade que ele deseja e escrever a
música da velocidade 1 até a informada, no seguinte formato,
caso o usuário digite 3, deverá aparecer o código a seguir:
Velocidade 1 do creu:
creu
Velocidade 2 do creu:
creu creu
Velocidade 3 do creu:
creu creu creu */

#include<stdlib.h>
#include<stdio.h>
#include <conio.h>

int main (){
	
    int creu,cont,soma;
	printf("Velocidade do Creu: ");
	scanf("%i",&creu);
	printf("A velocidade %i do creu  \n",creu);
	for(cont=1; cont<=creu; cont++){
	
	printf(" creu ");
	}
}

