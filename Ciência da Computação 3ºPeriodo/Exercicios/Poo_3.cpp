/*
Crie uma classe em C++ chamada Relogio para armazenar um horário, composto por hora,
minuto e segundo. A classe deve representar esses componentes de horário e deve apresentar os
métodos descritos a seguir:
 um método chamado setHora, que deve receber o horário desejado por parâmetro (hora,
minuto e segundo);
 um método chamado getHora para retornar o horário atual, através de 3 variáveis passadas
por referência;
 um método para avançar o horário para o próximo segundo (lembre-se de atualizar o minuto
e a hora, quando for o caso).
*/

#include<iostream>
using namespace std;


class Relogio{
	
	private:
		int horas;
		int minutos;
		int segundos;
		int nHoras;
		int nMinutos;
		int nSegundos;
	
	public:
		inicializa(){
			this->horas = 0;
			this->minutos = 0;
			this->segundos = 0;
		}
		void setHora(int horas,int minutos,int segundos){
			this->horas = horas;
			this->minutos = minutos;
			this->segundos = segundos;		
		}
		void atualizar(){
			if(getSegundos() == 60){
				if(getMinutos()==60){
					if(getHora()==23){
					}
					else{
						nHoras = 1 + this->horas;
						nMinutos = 0;
						nSegundos = 0;
						setHora(nHoras,nMinutos,nSegundos);
					}
				}
				else{
					nMinutos = 1 + this->minutos;
					nSegundos = 0;
					setHora(this->horas,nMinutos,nSegundos);
				}
			}
			
			else{
				nSegundos = 1 + this->segundos;
				setHora(this->horas,this->minutos,nSegundos);
			}
			
			
			
		}
		int getHora(){
			return this->horas;
		}
		int getMinutos(){
			return this->minutos;
		}
		int getSegundos(){
			return this->segundos;
		}
		
		void imprimir(){
			cout << "Horas:  " <<  this->horas <<   endl;
			cout << "Minutos:  " <<  this->minutos <<   endl;
			cout << "Segundos:  " <<  this->segundos <<   endl;
		}
		
		



	
	
	
};



int main(){
	Relogio r;
	
	int horas;
	int minutos;
	int segundos;
	
	cout << "Horas:  " <<endl;
	cin >> horas;
	cout<< "Minutos:  " <<endl;
	cin >> minutos;
	cout<< "Segundos:  " <<endl;
	cin >> segundos;

	r.setHora(horas,minutos,segundos);
	
	r.atualizar();
	r.imprimir();
	
	
}