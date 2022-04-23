import heapq as hpq
#Escreva um programa em Python que print os três itens com valor mais alto do dicionário
dicionario = {'item1': 45.50, 'item2':35, 'item3': 41.30, 'item4':55, 'item5': 24}
lista = list(dicionario.values())

for num in range(3):
    itemIndex = (lista.index(max(lista))) + 1
    print("item",itemIndex,max(lista))
    lista.remove(max(lista))

