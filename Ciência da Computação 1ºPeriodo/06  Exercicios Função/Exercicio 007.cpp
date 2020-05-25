
/* Dada a matriz A4x4:
O usuário deverá informar os números para preenchimento da matriz.
- Apresente a quantidade de números impares e números pares.
- Apresente a quantidade de números primos. */

#include<stdlib.h>
#include<stdio.h>

void qntd(int a[4][4]);


void primo(int a[4][4]);

int main (){
    int matriz[4][4];

    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            printf("Numero linha %d coluna %d: ",i,j);
            scanf("%d", &matriz[i][j]);
        }
        printf("\n");
    }

    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            printf("\t%d", matriz[i][j]);
        }
        printf("\n");
    }
    qntd(matriz);
    primo(matriz);
}




void qntd(int a[4][4]){
    int impar=0,par=0;

    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            if(a[i][j]%2 == 0){
            	par++;
			}
            else {
			impar++;
			}
        }
    }

    printf("\n\tNumeros Pares:%d\n\tNumeros Impares:%d", par, impar);
}

void primo(int a[4][4]){
    int primo = 0, cont;

    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            cont = 0;
            for(int i2=a[i][j]; i2>0; i2--){
                if(a[i][j]%i2 == 0)
				 cont++;
            }
            if(cont == 2) {
            	primo++;	
			}
        }
    }
    
    printf("\n\tNumeros Primos:%d", primo);
}