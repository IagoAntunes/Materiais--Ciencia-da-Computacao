
/* Faça um programa para receber uma matriz “A” (3x3) números
inteiros. Os valores deverão ser informados na função principal,
juntamente com um fator multiplicador (constante X). Implemente uma
função auxiliar para multiplicar todos os valores pela constante “X”
informada na função principal. Grave estes valores em uma matriz “B”.
Apresente o resultado na função principal.  */

#include <conio.h>
#include <stdio.h>

int auxiliar(int *x,int *matriz,int *matrizB){
	
	//Inserindo resultado da multiplicação na matrizB
	for(int i=0;i<9;i++){
		matrizB[i] = *(matriz + i) * *x;
	}
	
}

int main(){

 int i,i2,x,matriz[3][3],matrizB[3][3];
 
 //Entrada do Numero a ser Multiplicado
 printf("Numero a Ser Multiplicado:");
 scanf("%i", &x);
 
 //Prenchendo Matriz
 for(i=0;i<3;i++){
 	for(i2=0;i2<3;i2++){
 		printf("Linha%i Coluna%i ",i,i2);
 		scanf("%i", &matriz[i][i2]);
	 }
 }
 
 auxiliar(&x,matriz[0],matrizB[0]);
 
 //Imprimindo MatrizB
 for(i=0;i<3;i++){
 	printf("\n");
 	for(i2=0;i2<3;i2++){
 		printf("%i  ",matrizB[i][i2]);
	 }
 }
 
}
