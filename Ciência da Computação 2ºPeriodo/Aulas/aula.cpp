/*
Faça um programa para receber uma relação de 10 pessoas em uma struct pessoa.
crie outra struct para receber outros dados de cada indivíduo.
Após receber todos os dados liste as pessoas do gênero definido pelo usuário
*/

#include <stdio.h>
#include <stdlib.h>

int main(void) {

struct pessoa{
  char nome[51];
  int idade;
  int genero;
}pessoa1[2];
struct individuo {
  char endereco[51];
  char cidade[51];
  char estado[51];
  int telefone;
}individuo1[2];

int i,generoT,vetor[10],vetor2[10],veses=0,veses2=0;
for(i=0;i<2;i++){
	scanf("%s \n",&pessoa1[i].nome);
	scanf("%i \n",&pessoa1[i].idade);
	scanf("%i \n",&pessoa1[i].genero);
	scanf("%s \n",&individuo1[i].endereco);
	scanf("%s \n",&individuo1[i].cidade);
	scanf("%s \n",&individuo1[i].estado);
	scanf("%i \n",&individuo1[i].telefone);


  if(pessoa1[i].genero == 1){
    vetor[i] = i;
    veses+= 1;
  }
  if(pessoa1[i].genero == 2){
    vetor2[i] = i;
    veses2 += 1;
  }
}

printf("Genero:");
scanf("%i \n\n\n",&generoT);
if(generoT == 1){
  for(i=0;i<veses;i++){
    printf("Nome: %s \n",pessoa1[vetor[i]].nome);
    printf("Idade: %i \n",pessoa1[vetor[i]].idade);
    printf("Genero: %i \n",pessoa1[vetor[i]].genero);
    printf("Endereco: %s \n",individuo1[vetor[i]].endereco);
    printf("Cidade: %s \n",individuo1[vetor[i]].cidade);
    printf("Estado: %s \n",individuo1[vetor[i]].estado);
    printf("Telefone: %i \n",individuo1[vetor[i]].telefone);
  }
}
else{
	if(generoT == 2){
	  for(i=0;i<veses2;i++){
	    printf("Nome: %s \n",pessoa1[vetor2[i]].nome);
	    printf("Idade: %i \n",pessoa1[vetor2[i]].idade);
	    printf("Genero: %i \n",pessoa1[vetor2[i]].genero);
	    printf("Endereco: %s \n",individuo1[vetor2[i]].endereco);
	    printf("Cidade: %s \n",individuo1[vetor2[i]].cidade);
	    printf("Estado: %s \n",individuo1[vetor2[i]].estado);
	    printf("Telefone: %i \n",individuo1[vetor2[i]].telefone);
	    }
	}
}


}
