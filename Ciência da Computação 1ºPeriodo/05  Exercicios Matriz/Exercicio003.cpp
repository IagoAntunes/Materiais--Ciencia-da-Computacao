
/*Nestes dias frios você foi solicitado para catalogar as temperaturas da última semana na
cidade de Itaúna. Crie uma matriz de float 24x7 que represente hora do dia e o dia da semana. Peça
ao usuário para preencher esta matriz, solicitando a temperatura naquele dia e horário. Ao final
exiba os dias e horários em que a temperatura foi mais quente e mais fria na semana. */

#include <stdlib.h>
#include <stdio.h>


int main(){
	
	int i,i2;
	float matriz[7][24],maior,menor,dia,tempo,dia2,tempo2;
	
	
	for(i=0;i<7;i++){
		for(i2=0;i2<24;i2++){
			printf("Dia%i Horas%i ",i,i2);
			scanf("%f", &matriz[i][i2]);	
		}
	}
	maior = matriz[0][0];
	menor = matriz[0][0];
	for(i=0;i<7;i++){
		for(i2=0;i2<24;i2++){
			if(matriz[i][i2] > maior){
				maior = matriz[i][i2];
				dia = i;
				tempo = i2;
			}
			if(matriz[i][i2] < menor){
				menor = matriz[i][i2];
				dia2 = i;
				tempo2=i2;
			}
		}
	}
	
	printf("Menor Temperatura: %f Dia %i  Horas %i",menor,dia,tempo);
	printf("Maior Temperatura: %f Dia %i  Horas %i",maior,dia2,tempo2);
}