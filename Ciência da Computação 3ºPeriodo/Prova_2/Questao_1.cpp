/*
Implemente uma pequena aplicação para cadastro de motoristas, com funções de incluir motorista
, e uma opção para fazer busca pelo número da carteira de motorista.
 Para essa aplicação você pode definir quais atributos o registro terá,
  qual tipo de busca e qual será o campo chave definido.
  */
 
#include<iostream>
using namespace std;


class motorista{
	private:
		string nome;
		int carteira;
		int Pcarteira;

	public:
		//Armazena o Nome
		int setNome(string nome){
			this->nome = nome;
		}
		//Armazena a Carteira
		int setCarteira(int carteira){
			this->carteira = carteira;
		}
		//Retorna a carteira
		int getCarteira(){
			return this->carteira;
		}	
};



int main(){
	motorista m[100];
	string nome;
	int carteira;
	int Pcarteira;
	int i =0;
	int opc = 0;

	
	while(opc != -1){
		
		//Escolha do usuario
		cout<<"[1]-Adicionar   [2]Procurar " <<endl;
		cin>>opc;
		
		//Opcao para adicionar motorista e carteira
		if(opc == 1){
			cout<<"Nome Motorista: " <<endl;
		    cin>>nome;
		    cout<<"Carteira Motorista: "<<endl;
		    cin >> carteira;
		    m[i].setCarteira(carteira);
		    m[i].setNome(nome);
		    i++;
			
		}
		//Opcao para procurar carteira
	    if(opc == 2){
	    	
	    	cout<<"Procurar Carteira: "<<endl;
    		cin >> Pcarteira;
    		for(int j=0;j<i;j++){
    			if(m[j].getCarteira()==Pcarteira){
    				cout<<"Carteira Encontrada"<<endl;
				}
			}		
		}
	}
}
	
