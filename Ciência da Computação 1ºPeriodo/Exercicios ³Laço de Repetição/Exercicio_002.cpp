
/*Crie um sistema que crie que receba um número e imprima a
imagem a seguir.
Caso o usuário digite 5:
xoxox
oxoxo
xoxox
oxoxo
xoxox*/

#include <stdio.h>


int main(){
	
	int numero,i,linhas;

	//Entrada de Dados
	printf("Digite um Numero:");
	scanf("%i",&linhas);
	
	
	for (i = 0;i<linhas/2;i++){
		printf("xoxox\n");
		printf("oxoxo\n");
		
		}
    //Numeros Pares terminam com xoxox
	if (linhas % 2 != 0){
		printf("xoxox");		
	}
	