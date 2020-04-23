
/*Faça um programa de entrevista de emprego que pega o sexo,
idade e formação escolar (1 para fundamental, 2 para médio e 3
para superior) e determina o cargo a que a pessoa pode se
candidatar, de acordo com a tabela:

Sexo Idade Escolaridade Cargo
F >25 médio Recepcionista
M >40 fundamental Servente
F ou M <30 Superior Auxiliar de RH

Com qualquer outra opção deve-se imprimir "não há posição
disponível". Ao final de cada entrevista deve-se perguntar se o 
usuário ainda deseja continuar, caso a resposta seja N o
programa deve finalizar.*/

#include<stdio.h>
#include<stdlib.h>

int main(){
    
    
    char genero, opcao;
    int idade, formacao;
    
    do {
        system("cls"); //limpar tela
        
        printf("Sexo : [M/F]");
        scanf("%s", &genero);
        

        printf("Idade : ");
        scanf("%i", &idade);
        

        printf("Formacao Escolar :  \n[1]Fundamental \n[2]Medio \n[3]Superior");
        scanf("%i", &formacao);
        
        

        if (genero == 'F' && idade >= 25 && formacao == 2){
            printf("\nVaga : Recepcionista");
        }

        else 
		if (genero == 'M' && idade >= 40 && formacao == 1){
            printf("\nVaga : Servente");
        }

        else 
		if (idade <= 30 && formacao == 3){
            printf("\nVaga : Auxiliar de RH");
        }

        else 
		{
            printf("Nao ha posicao disponivel\n");
        }
        printf(" \nQuer Continuar ? [S/N]");
        scanf("%s", &opcao);
        
        if (opcao == 'N'){
		}


    } while (opcao == 'S'|| opcao == 's');
}

