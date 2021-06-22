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
            cout << "nome: " << this->nome;
            cout << "idade: " << this->idade;
            cout << "altura: " << this->altura << endl;
        }
};

int main(){
    Pessoa p[5];
    string nome;
    int idade;
    float altura;

    for(int i = 0; i < 5; i++){
        system("cls || clear");
        cout<<"Entre com o seu nome: " <<endl;
        getline(cin,nome);
        cout<<"Entre com a sua idade: " <<endl;
        cin>>idade; 
        cout<<"Entre com a sua altura: "<<endl;
        cin>>altura; cin.ignore();
        p[i].setNome(nome);
        p[i].setIdade(idade);
        p[i].setAltura(altura);
    }

    system("cls || clear");
    for(int i = 0; i < 5; i++)
        p[i].imprimir();

    return 0;
}