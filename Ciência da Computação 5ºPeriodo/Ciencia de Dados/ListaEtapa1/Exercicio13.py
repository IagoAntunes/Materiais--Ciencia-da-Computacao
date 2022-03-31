#13-Faça um programa que leia um número n e em seguida leia n inteiros. Crie uma lista 
#ordenada sem elementos repetidos a partir da lista original e mostre a lista original e a lista 
#ordenada sem elementos repetidos na tel

n = int(input("Digite: "))
lista = []
listaFinal = []

for x in range(n):
    num = int(input("Num: "))
    lista.append(num)

listaFinal = set(lista)
print(lista)
print(listaFinal)
