#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <Windows.h>

struct Estudante{
	int id;
	char nome[30];
	int nota;
};

int Inserir(FILE *p,Estudante e,int i){
	
    p = fopen("arquivoT.bin","ab");
    int opc=1;
	while(opc != 0){	
		printf("\nAluno[%i]\n",i);
		e.id = i;
	
		printf("Nome: ");
		scanf("%s",&e.nome);
	
		printf("Nota: ");
		scanf("%i",&e.nota);
		
		fwrite(&e,sizeof(struct Estudante),1,p);
		i++;
		
		printf("Deseja Continuar...[1]SIM / [0]NaO \nR:");
		scanf("%i",&opc);
	}
	fclose(p);
	system("cls");
	return i;
}

void Ler(FILE *p,Estudante e,int EOF_ctrl){
	p=fopen("arquivoT.bin", "r");

	while (!feof(p)){
		EOF_ctrl=fread (&e, sizeof(struct Estudante), 1, p);
		if (EOF_ctrl != 0){
			printf("Estudante[%i]: %s = %i \n",e.id,e.nome,e.nota);
		}
	}
	fclose(p);
	
}

FILE Deletar(FILE *p,Estudante e,int EOF_ctrl,int busca){

	p=fopen("arquivoT.bin", "r");
	FILE *p2;
	p2 =fopen("tmp.bin", "wb");

	while (!feof(p)){
		EOF_ctrl=fread (&e, sizeof(struct Estudante), 1, p);
		if (EOF_ctrl != 0){
			if(e.id != busca){
				if(e.id > busca){
					e.id --;
				}
				fwrite(&e, sizeof(struct Estudante), 1, p2);
			}
		}
	}
	fclose(p);
	fclose(p2);
	
	remove("arquivoT.bin");
	rename("tmp.bin", "ArquivoT.bin");


}


void Buscar(FILE *p,Estudante e,int EOF_ctrl,int busca){
	
	p=fopen("arquivoT.bin", "a+b");
	
	fseek(p,sizeof(struct Estudante) * (busca-1),SEEK_SET);
	EOF_ctrl = fread(&e,sizeof(struct Estudante),1,p);
	printf("Estudante[%i]: %s = %i \n",e.id,e.nome,e.nota);
	
	fclose(p);
}

int main(void)
{
   remove("ArquivoT.bin");
   FILE *p;
   int EOF_ctrl;
   struct Estudante e;
   int opc;
   int i =1;
   while(opc != 5){
   		printf("\nOpcao:\n\tINSERIR[1]\n\tLER[2]\n\tBuscar[3]\n\tSair[5]\nR:");
   		scanf("%i",&opc);
   		switch(opc){
   			//Inserir
   			case 1:
			   Inserir(p,e,i);
			   break;	
			case 2:
				Ler(p,e,EOF_ctrl);
				break;	
			case 3:
				int busca;
				printf("Id para buscar:");
				scanf("%i",&busca);
				Buscar(p,e,EOF_ctrl,busca);
				break;
			case 4:
				int buscaDelete;
				printf("Id para Deletar:");
				scanf("%i",&buscaDelete);
				Deletar(p,e,EOF_ctrl,buscaDelete);
				break;
				
	   }
   }
}




