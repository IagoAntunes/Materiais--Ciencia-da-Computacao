
/* 9-O programa abaixo imprime uma letra I bem grande na tela:
#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[])
{
int i = 0;
printf("\n\nIIIIIII\n");
while (i < 17) {
printf(" III\n");
i++;
} 
printf("IIIIIII\n\n");
system("PAUSE");
return 0;
}
Modifique este programa para usar um laço for ao invés do laço while. */

#include <stdio.h>
#include <stdlib.h>
int main(){
int i = 0;
printf("\n\nIIIIIII\n");

for ( i = 0;i<17;i++){
printf(" III\n");
} 

printf("IIIIIII\n\n");
return 0;
} 
