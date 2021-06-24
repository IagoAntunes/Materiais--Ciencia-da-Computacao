/*
		setArea(){
			this->area = getPi() * (getRaio() * getRaio());
		}
		setDistancia(){
			this->distancia = getRaio() + getRaio2();
		}
		setCircunferencia(){
			this->circunferencia = 2 * pi * getRaio();
		}
*/
#include<iostream>
using namespace std;

class Circulo{
	
    private:
    	float area;
    	int distancia;
    	int circunferencia;	
    	int raio,raio2;
		float pi= 3.14;
		
		void setArea(){
			this->area = getPi() * (getRaio() * getRaio());
		}
		void setDistancia(){
			this->distancia = getRaio() + getRaio2();
		}
		void setCircunferencia(){
			this->circunferencia = 2 * pi * getRaio();
		}
    	
    public:
    	
    	
    	
    	void setRaio(int raio){
    		this->raio = raio;
		}
		void setRaio2(int raio2){
			this->raio2 = raio2;
		}

		int getPi(){
			return this->pi;
		}
		int getRaio(){
			return this->raio;
		}
		int getRaio2(){
			return this->raio2;
		}
		
		void imprimir(){
			system("cls || clear");
			cout<<"Area: " << this->area << endl;
			cout<<"Distancia:  " << this->distancia << endl;
			cout<<"Circunferencia:  "<< this->circunferencia << endl;
		}
    
    
    
    
    
    
    
};

int main(){
    Circulo c;
	int raio;
	int raio2;
	
    cout<<"Raio: ";
    cin >> raio;
    cout<<"Raio-2:  ";
    cin >> raio2;
    //cout<<"Entre com a sua idade: " <<endl;
    //cin>>idade;
    //cout<<"Entre com a sua altura: "<<endl;
    //cin>>altura;
    
    c.setRaio(raio);
    c.setRaio2(raio2);
    c.setDistancia();
    c.setCircunferencia();
    
    c.setArea();

    c.imprimir();

    return 0;
}