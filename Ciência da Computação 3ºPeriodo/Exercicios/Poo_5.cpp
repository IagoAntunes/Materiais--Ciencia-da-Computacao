/*
Implemente uma classe televisão. A televisão tem um controle de volume do som e um controle
de seleção de canal. O controle de volume permite aumentar ou diminuir a potência do volume
de som em uma unidade de cada vez. O controle de canal também permite aumentar e diminuir
o número do canal em uma unidade, porém, também possibilita trocar para um canal indicado.
Também devem existir métodos para consultar o valor do volume de som e o canal selecionado.
No programa principal, crie uma televisão e troque de canal algumas vezes. Aumente um pouco
o volume, e exiba o valor de ambos os atributos
*/

#include<iostream>
using namespace std;


class Televisao{
	private:
		int canal;
		int volume;
		int aumento;
		int aumentoC;
		int diminui;
		int diminuiC;
	
	public:
		
		void setcanal(int canal){
			this->canal = canal;
		}
		void setvolume(int volume){
			this->volume = volume;
		}
		int getvolume(){
			return this->volume;
		}
		int getcanal(){
			return this->canal;
		}
		
		
		void aumentaVol(int aumento){
			this->volume = getvolume() + aumento;
		}
		void diminuiVol(int diminui){
			this->volume = getvolume() - diminui;
		}
		void aumentaCanal(int aumentoC){
			this->canal = getcanal() + aumentoC;
		}
		void diminuiCanal(int diminuiC){
			this->canal = getcanal() - diminuiC;
		}
		
		void imprimir(){
			cout << "Canal Atual:  " << this->canal<<endl;
			cout << "Volume Atual:  " <<this->volume<<endl;
		}
	
	
	
	
	
};



int main(){
	Televisao t;
	
	int canal;
	int volume;
	int opc = 0;
	int opc2 = 0;
	int num;

	
	cout << "Canal Atual:  " <<endl;
	cin >> canal;
	cout<< "Volume Atual:  " <<endl;
	cin >> volume;
	
	t.setcanal(canal);
	t.setvolume(volume);
	
	while(opc != -1){
		cout<<"Opcao:" << endl;
		cin >> opc;
			
			
		if(opc == 1){
			cout << "Aumentar para : " <<endl;
			cin >> num;
			t.aumentaCanal(num);
		}
			
		if(opc == 2){
			cout << "Diminur Canal: " <<endl;
			cin >> num;
			t.diminuiCanal(num);
		}
				
		if(opc == 3){
			cout<< "Aumenta Volume" << endl;
			cin >> num;
			t.aumentaVol(num);
		}
			
		if(opc == 4){
				cout<<"Diminui Volume" << endl;
				cin >> num;
				t.diminuiVol(num);
		}
			
		if(opc == 5){
			cout<<"Trocar Canal para: " << endl;
			cin >> num;
			t.setcanal(num);
		}
			
	}
	t.imprimir();
}
	
