
/* 11-A algum tempo vocês fizeram um exercício que verificava o IMC de uma pessoa e dizia se ela
estava acima do peso ou não. Refaça este exercício, porém no final você deve perguntar ao usuário:
Deseja consultar o IMC de outra pessoa (s/n) ?
Caso o usuário digite ‘s’ ou ‘S’ o programa deverá limpar a tela com system(“cls”), e voltar ao
início, imprimindo novamente o texto inicial do programa. Caso contrário o programa deverá ser
fechado. Dica: utilize um laço do while. */

#include<stdlib.h>
#include<stdio.h>


int main () {
    float altura,peso,imc;
    char opcao;
    
    do{
    	
    	//Limpando Tela
        system("cls");
	
		//Entrada de Dados
        printf("Peso: ");
        scanf("%f", &peso);

        printf("Altura: ");
        scanf("%f", &altura);
        
        //Formula IMC
        imc = peso/(altura*altura);
		
		//Imprimindo IMC
        if(imc <= 18.5){
            printf("\nMagresa \nIMC %.2f",imc);
        }

        else if (imc <= 25){
            printf("\nPeso ideal \nIMC: %.2f",imc);
        }

        else if(imc <= 30){
            printf("\nSobrepeso \nIMC: %.2f",imc);
        }

        else if(imc <= 40){
            printf("\nObesidade \nIMC: %.2f",imc);
        }
        else if(imc >=40){
        	printf("\nObesidade Grave \nIMC: %.2f",imc);
		}
		
		
        printf("\nQuer Continuar : [ S / N ]");
        scanf("%s", &opcao);
	
	//Voltar ao Inicio
    }while (opcao == 's' || opcao == 'S');
}
