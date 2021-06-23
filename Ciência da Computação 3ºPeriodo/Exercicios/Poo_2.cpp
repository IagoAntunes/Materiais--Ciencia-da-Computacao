#include<iostream>

using namespace std;

class Carro{
    private:
        float tanque;
        int consumo;
        int distancia;
    public:
        Carro(){ }
        Carro(float tanque, int consumo){
            this->tanque = tanque;
            this->consumo = consumo;
            this->distancia = 0;
        }
        void abastecer(float litros){
            this->tanque += litros;
        }
        void mover(int km){
            this->distancia += km;
            float litros = km/consumo;
            this->tanque = this->tanque - litros;
        }
        void printStatus(){
            cout<<"Tanque: "<<tanque<<"\t Distancia: "<<distancia<<" km"<<endl;
        }
};

class Fusca:public Carro{
    public:
        Fusca(){}
        Fusca(float tanque):Carro(tanque, 12){}
};

class Ferrari:public Carro{
    private:
        bool bluetooth;
    public:
        Ferrari(){}
        Ferrari(float tanque):Carro(tanque, 6){
        }
        void ligarBluetooth(){
            this->bluetooth = true;
        }
};

int main(){
    Fusca f1(20);
    Ferrari f2(30);

    f1.mover(200);
    f2.mover(400);

    f1.printStatus();
    f2.printStatus();
    
    f2.ligarBluetooth();

    return 0;
}