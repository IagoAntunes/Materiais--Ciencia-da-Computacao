
/* 10-Faça um programa parecido com o anterior, mas agora para imprimir a letra E. Obs.: todos as
chamadas da função printf deverão estar dentro do laço for, com exceção dos “\n” finais. Para fazer
impressões diferentes em cada iteração, utilize comandos condicionais (if) dentro do laço for.
Exemplo de saída:
EEEEEEEEEE
EEE
EEE
EEE
EEE
EEE
EEEEEEEEEE
EEE
EEE
EEE
EEE
EEE
EEE
EEE
EEE
EEE
EEEEEEEEEE     */

#include <stdio.h>
#include <stdlib.h>


int main(){
	
int i;

for ( i = 0;i<18;i++){
if (i == 0 || i == 8 || i ==17){
	printf("EEEEEEEEEE\n ");
}
if ( i < 5 || i >= 8 && i <= 16){
	printf("EEE\n ");
}
} 


}