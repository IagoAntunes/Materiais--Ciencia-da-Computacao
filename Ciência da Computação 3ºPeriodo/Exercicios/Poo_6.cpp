/*
 Implemente um carro. O tanque de combustível do carro armazena no máximo 50 litros de gasolina. O carro consome 15 km/litro. Deve ser possível:
 Abastecer o carro com uma certa quantidade de gasolina;
 Mover o carro em uma determinada distância (medida em km);
 Retornar a quantidade de combustível e a distância total percorrida.
 No programa principal, crie 2 carros. Abasteça 20 litros no primeiro e 30 litros no segundo.
Desloque o primeiro em 200 km e o segundo em 400 km. Exiba na tela a distância percorrida
e o total de combustível restante para cada um.
*/
#include<iostream>
using namespace std;


class carro{
	private:
		int combustivel;
		int kilometros=0;

	
	public:
		int setCombustivel(int combustivel){//combustivel no carro;
			this->combustivel = combustivel;
		}
		int moverCarro(int kilometros){//Movendo carro B)
			this->kilometros = getKilometros() + kilometros;
			this->combustivel = getCombustivel() -  (getKilometros() / 15) ;
		}
		
		
		int abastecer(int c){//Abastecendo carro A)
			this->combustivel = getCombustivel() + c;
		}
		int getCombustivel(){
			return this->combustivel;
			
		}
		int getKilometros(){
			return this->kilometros;
		}
		
		void imprimir(){
			cout << "Combustivel Atual:  " <<getCarteira() <<endl;
			cout << "Combustivel Atual:  " <<this->combustivel <<endl;
			cout << "Kilometros Rodados: " <<this->kilometros <<endl;
			
			
		}
	
	
	
	
	
};



int main(){
	carro c[2];
	int combustivel;
	

	//cout << "Combustivel Atual:  " <<endl;
	//cin >> combustivel;
	
	c[1].setCombustivel(20);
	c[2].setCombustivel(30);
	c[1].moverCarro(200);
	c[2].moverCarro(400);
	
	c[1].imprimir();
	c[2].imprimir();
}
	
