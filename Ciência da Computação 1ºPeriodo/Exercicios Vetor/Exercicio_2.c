#include <stdio.h>
#include <stdlib.h>

int main(void)
{
int nume,deno;
float soma;

nume=1;
soma=0;

for(deno=1; deno<=50; deno++){
soma=soma+ (float)nume/deno;
nume=nume+2;
}
printf("%f",soma);

}

