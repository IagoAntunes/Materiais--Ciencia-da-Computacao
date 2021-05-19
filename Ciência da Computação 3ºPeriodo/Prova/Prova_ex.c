#include <stdio.h>
#include <stdlib.h>

//Declarando a função inserir
void inserir(int num);

//Função para simular num
int hash(int num){
    return 5 % 7;
}
//Simulando a inserção do numero 5
int main(){
  inserir(5);


}

//Função inserir os numeros e comparar com a tabela reserva
void inserir(int num){
    int i = hash(num);
    int valor;
    int tamanho;
    int tamanho_Tab;

    //Simulando uma tabela com os numeros 1,2,3,4,5
    int hash_tabela[5] = {1,2,3,4,5};

    //Verificando se enumiste algum valor na posição I
    if (hash_tabela[i] == NULL){
        hash_tabela[i] = num;
    //Enumiste um numero no mesmo lugar
    //Verifica a prioridade dos numeros reservas
    }else if (valor < tamanho) {
        hash_tabela[tamanho_Tab + valor] = num;
        valor++;
    }
}

