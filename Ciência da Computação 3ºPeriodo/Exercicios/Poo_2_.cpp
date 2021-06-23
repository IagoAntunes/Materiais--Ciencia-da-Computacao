#include<iostream>
using namespace std;


class Elevador{
	
	private:
		int capacidade;
		int max;
		int Npessoas;
		int andarAtual;
		int andar;// NO
		int pessoas;//NO
	

	public:
		inicializa(int capacidade,int max,int pessoas){
		this->capacidade = 0;
		this->max = 0;
			
			
	
		}
		void setCapacidade(int capacidade){
			this->capacidade = capacidade;
		}
		void setMax(int max){
			this->max = max;
		}
		void setNpessoas(int Npessoas){
			this->Npessoas = Npessoas;
		}
		void setandarAtual(int andar){
			this->andarAtual = andar;
		}
		void getNpessoas(){
			return this->Npessoas;
		}
		void getandarAtual(){
			return this->andarAtual;
		}
		void entra(){
			if(getNpessoas() != capacidade){
				pessoas ++;
				setNpessoas(pessoas);
			}	
		}
		void sai(){
			if(getNpessoas() > 0){
				pessoas --;
				setNpessoas(pessoas);
			}
		}
		void sobe(){
			cout << "Pessoas: " << this->andarAtual << " -> "<< max << endl;
			if(getandarAtual() < max){
				andar ++;
				setandarAtual(andar);
			}
		}
		void desce(){
			if(getandarAtual() > 0){
				andar --;
				setandarAtual(andar);
			}
		}
		void imprimir(){
			system("cls || clear");
			cout << "Pessoas: " << this->Npessoas << endl;
			cout << "Andar: " << this->andarAtual << endl;
		}
		
		
		
	
	
	
};



int main(){
	Elevador e;
	
	int capacidade;
	int max;
	int num;
	
	cout << "Capacidade" <<endl;
	cin >> capacidade;
	cout<< "Total de Andares" <<endl;
	cin >> max;
	e.setCapacidade(capacidade);
	e.setMax(max);
	
	
	e.entra();
	e.entra();
	e.sobe();
	e.sai();
	e.sobe();
	e.entra();
	e.entra();
	e.entra();
	
	e.imprimir();
	
	
}