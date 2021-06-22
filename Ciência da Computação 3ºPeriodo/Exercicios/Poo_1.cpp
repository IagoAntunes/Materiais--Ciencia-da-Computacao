#include<iostream>
using namespace std;

class Pessoa{
    private: 
        string nome;
        int idade;
        float altura;

    public:
        Pessoa(){
            cout<<"Entrou no construtor!!!"<<endl;
            this->nome = "";
            this->idade = 0;
            this->altura = 0.0;
        }
        Pessoa(string nome, int idade, float altura){
            this->nome = nome;
            this->idade = idade;
            this->altura = altura;
        }
        ~Pessoa(){
            cout<< "PESSOA MORREU!!!" << endl;
        }
        void setNome(string nome){
            this->nome = nome;
        }
        void setAltura(float altura){
            this->altura = altura;
        }
        void setIdade(int idade){
            this->idade = idade;
        }
        string getNome(){
            return this->nome;
        }
        int getIdade(){
            return this->idade;
        }
        int getAltura(){
            return this->altura;
        }
        void imprimir(){
            system("cls || clear");
            cout << "nome: " << this->nome << endl;
            cout << "idade: " << this->idade << endl;
            cout << "altura: " << this->altura << endl;
        }
};

int main(){
    Pessoa *p;
    string nome;
    int idade;
    float altura;
    cout<<"Entre com o seu nome: " <<endl;
    getline(cin,nome);
    cout<<"Entre com a sua idade: " <<endl;
    cin>>idade;
    cout<<"Entre com a sua altura: "<<endl;
    cin>>altura;

    p = new Pessoa(nome, idade, altura);

    p->imprimir();

    return 0;
}