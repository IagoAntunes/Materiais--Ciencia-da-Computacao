#include <stdio.h>
#include <math.h>


int main(){
	//ax2 + bx + c. 
	float va,vb,vc,delta,raiz,raiz1,raiz2;

	printf("Valor de A :");
	scanf("%f",&va);
	if ( va == 0){
		return 0;
	}
	
	printf("Valor de B:");
	scanf("%f",&vb);
	
	printf("Valor de C:");
	scanf("%f",&vc);
	
	delta = pow(vb,2) - (4 * va *vc);
	if (delta < 0){
		printf("Nao tem raizes reais!");
		return 0;
	}
	else{
		if (delta == 0){
			raiz = -vb / (2 * va);
			printf("\nRaiz: %f",raiz);
		}

	else{
		if (delta > 0){
			raiz1 = (-vb + sqrt(delta))/ (2 * va);
			raiz2 = (-vb - sqrt(delta))/ (2 * va);
			printf("\nRaiz 1 : %.2f \n",raiz1);
			printf("Raiz 2 : %.2f",raiz2);
		}
	}
}
	

}
