#include <stdio.h>


int main(){
	
	char nome;
	float tipo,qntd,total,preco,cartao;

	
	printf("Tipo de Carne: \n[1]File Duplo \n[2]Alcatra\n[3]Picanha\n");
	scanf("%f",&tipo);
	
	printf("Quantidade:");
	scanf("%f",&qntd);
	
	printf("Tem Cartao Tabajara? [1]Sim [2]Nao");
	scanf("%f",&cartao);
	
	if (tipo == 1 ) {
		if (qntd <= 5){
			total = qntd * 4.90;
		}
		else{
			total = qntd * 5.80;
		}
	}
	if (tipo == 2){
		if(qntd < 5){
			total = qntd * 5.90;
		}
		else{
			total = qntd * 6.80;
		}
	}
	if (tipo == 3){
	}
		if(qntd < 5){
			total = qntd * 6.90;
		}
		else{
			total = qntd * 7.80;
		}
	
	printf("\n-----NOTA FISCAL-----\n");
	
	if (tipo == 1){
		printf("Tipo: File Duplo");
	}
	else{
	if (tipo == 2){
		printf("Tipo: Alcratra");
	}
	if (tipo == 3){
		printf("Tipo: Picanha");
	}
	}
	printf("\nQuantidade : %.2f",qntd);
	printf("\nPreco Total : %.2f",total);
	
	if (cartao == 1){
		printf("\nTipo de Pagamento: Cartao Tabajara");
		printf("\nDesconto: %.2f",(total*5)/100);
		printf("\nValor a Pagar: %.2f",total -((total*5/100)));
	}
	else{
		if(cartao == 2){
			printf("\nTipo de Pagamento: Outro");
			printf("\nDesconto: 0");
			printf("\nValor a Pagar: %.2f",total);
		}
	}
}

	  
