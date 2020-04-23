
/* 18-Faça um algoritmo que preencha um vetor como nove
números inteiros e mostre quais são primos e suas respectivas
posições. */

 #include <stdio.h>
 #include<stdlib.h>

 
int main(){
    
	int numero[10],i,aux,cont;

    for(i=0; i<10 ;i++)
    {
    	aux=2;
    	cont=1;
        printf("\nNumero %i :",i+1);
        scanf("%i",&numero[i]);

        if (numero[i] <= 1)
        cont = 0;

            while(cont == 1 && aux <= numero[i] / 2) {
                
				if (numero[i] % aux  == 0)
                cont = 0;
                aux = aux + 1;
             }

        if (cont == 1)
        printf("%d E Primo \nPosicao : %i.\n", numero[i],i+1);

    }

}
