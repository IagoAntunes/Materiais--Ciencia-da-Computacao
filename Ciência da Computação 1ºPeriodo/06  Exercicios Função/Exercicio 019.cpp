
/* Você deverá criar uma função que retorna a data juliana. A data juliana é um valor de 0 a
6 que é obtido atráves do dia, mês e ano de uma data e calculado da seguinte forma:
((1461*(ano+4800+(mes-14)/12))/4+(367*(mes-2-12*((mes-14)/12)))/12- (3*((ano+4900+(mes14)/12)/100))/4+ dia-32075) O valor retornado(0 a 6) corresponde aos seguintes dias da semana: 0 –
segunda-feira, 1 – terça-feira, 2 – quarta-feira, 3 – quinta-feira, 4 – sexta-feira, 5 – sábado, 6 –
domingo. Desta forma você deverá receber o nome do usuário e o dia que ele nasceu e retornar, por
exemplo, a seguinte frase: “Fulano, você nasceu em uma segunda-feira!” */

#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int auxiliar(int dia,int mes,int ano);


int main(){

	int result,dia,mes,ano;
	char nome;
	
	
	printf("Nome:");
	scanf("%s", &nome);
	
	printf("Dia:");
	scanf("%i", &dia);
	
	printf("Mes:");
	scanf("%i", &mes);
	
	printf("Ano:");
	scanf("%i", &ano);
	
	result = auxiliar(dia,mes,ano);
	printf("Resultado = %i",result);
		
	if(result == 0){
		printf("%s, você nasceu em uma Segunda-Feira!",nome);
	}
	if(result == 1){
		printf("%s, você nasceu em uma  Terça-Feira!",nome);
	}
	if(result == 2){
		printf("%s, você nasceu em uma Quarta-Feira!",nome);
	}
	if(result == 3){
		printf("%s, você nasceu em uma Quinta-Feira!",nome);
	}
	if(result == 4){
		printf("%s, você nasceu em uma Sexta-Feira!",nome);
	}
	if(result == 5){
		printf("%s, você nasceu em uma Sabado-Feira!",nome);
	}
	if(result == 6){
		printf("%s, você nasceu em uma Domingo-Feira!",nome);
	}
	}

int auxiliar(int dia,int mes,int ano){
	
	int resultado;
	
	resultado =(((1461*(ano+4800+(mes-14)/12))/4+(367*(mes-2-12*((mes-14)/12)))/12- (3*((ano+4900+(mes-14)/12)/100))/4+ dia-32075))%7;
	printf("%i",resultado);
	return(resultado);
		
	

}
