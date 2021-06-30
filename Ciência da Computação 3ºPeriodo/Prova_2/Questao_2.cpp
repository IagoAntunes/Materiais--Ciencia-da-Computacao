#include<iostream>
using namespace std;


class restaurante{
	private:
		//Variaveis
		string nome;
		string endereco;
		float pMedio;
		string comida;

	public:
		//Inicializa
		void inicializa(){
            this->nome = "";
            this->endereco = "";
            this->pMedio = 0.0;
            this->comida = "";
        };
        //Armazena todas as variaveis
        void completa(string nome, string endereco,float pMedio,string comida){
            this->nome = nome;
            this->endereco = endereco;
            this->pMedio = pMedio;
            this->comida = comida;
        }
        //Solicita os Dados
        void entradas(){
        	cout << "Nome Restaurante:  " <<endl;
			getline(cin,nome);
			cout << "Endereco:  " <<endl;
			getline(cin,endereco);
			cout << "Preco Medio:  " << endl;
			cin >> pMedio;
			cout << "Tipo Comida: " << endl;
			cin >> comida;
        	
      		completa(nome,endereco,pMedio,comida);//Armazena os dados
		}
		//Imprimir os Dados
		void imprimir(){
			system("cls || clear");
			cout << "Nome:  " <<nome<<endl;
			cout << "Endereco:  " <<endereco<<endl;
			cout << "Preco Medio:  " <<pMedio<< endl;
			cout << "Tipo Comida:  " <<comida<< endl;
		}	
};



int main(){
	restaurante r;
	
	r.inicializa();//Inicializa
	r.entradas();//Entrada dos dados
	r.imprimir();//Imprimir

}
	
