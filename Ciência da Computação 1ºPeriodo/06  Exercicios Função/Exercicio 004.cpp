/* Apresente 3 exemplos do uso aplicado de função. */

#include <stdio.h>
#include <stdlib.h>
#include <iostream>

//-----------------------------------------------------------
	int multiplicar(int X, int Y){
	    return X*Y;
	}
	
	
	
	
	int main(int) {
		
		int resultado;
	    resultado = multiplicar(5,3);
	    printf("%i",resultado);
	    std::cin;
	    return 0;
	}

//-----------------------------------------------------------

		
		
void MostrarMensagem()
{
    printf("Ola Mundo");
}

int main ()
{
    MostrarMensagem();
}

//-----------------------------------------------------------

void CalcularSoma(int a, int b)
{
    printf("Soma = %i",a+b);
}

int main ()
{
    int a, b;

    printf("Digite 2 Numeros");
    scanf("%i", &a);
    scanf("%i", &b);

    CalcularSoma(a, b);
}

//-----------------------------------------------------------
