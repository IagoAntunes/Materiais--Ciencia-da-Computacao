/* 6- Faça um programa que receba infinitos números do usuário. O
sistema só deve parar de receber números caso o usuário digite
um número primo ou um número negativo. Ao final, imprimir
quantos números o usuário digitou. */

 #include <stdio.h>
 #include<stdlib.h>

 
int main(){
    
	int numero,i,aux,cont;

    for(i=0; numero>0 ;i++)
    {
    	aux=2;
    	cont=1;
        printf("\nNumero %i :",i+1);
        scanf("%i",&numero);

        if (numero <= 1)
        cont = 0;

            while(cont == 1 && aux <= numero / 2) {
                
				if (numero % aux  == 0)
                cont = 0;
                aux = aux + 1;
             }

        if (cont == 1)
        numero = -1;

    }
    printf("Quantidade de Numeros Digitados: %i",i);

}


