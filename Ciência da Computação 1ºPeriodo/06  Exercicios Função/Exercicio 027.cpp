
/* Faça uma função que verifique se um número inteiro é perfeito ou não.
Um valor é dito perfeito quando ele é igual a soma dos seus divisores excetuando ele próprio. (Ex: 6
é perfeito, 6 = 1 + 2 + 3, que são seus divisores). A função deve
retornar um valor booleano.  */

#include <stdio.h>
#include <stdlib.h>
#include <iostream>
//Função Auxiliar
bool auxiliar(int num,int b);
    int main(){
    int num,b;
    //Entrada Numero
    printf("Numero:");
    scanf("%i", &num);
    //Chamando Função
    b = auxiliar(num,b);

    //Condição PERFEITO/NAO PERFEITO
    if(b==true){
        printf("E um numero perfeito");
    }
    else{
        printf("Nao e numero perfeito ");
    }

}
    //Função Auxiliar
bool auxiliar(int num,int b){
    int i,aux=0;
    //Calculo
    for(i=1; i<num; i++)
    {
        if (num % i==0)
    {
            aux = aux + i;
    }
    }
    //Resultado
    if (aux == num)
    {
        b = true;
        return(b);
    }
}

