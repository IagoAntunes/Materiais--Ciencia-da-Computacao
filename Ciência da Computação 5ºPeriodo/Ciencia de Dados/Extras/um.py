import heapq as hpq
#Escreva um programa em Python que print os três tens com valor mais alto do dicionário
dicionario = {'item1': 45.50, 'item2':35, 'item3': 41.30, 'item4':55, 'item5': 24}
listaMaiores = []
tam = 3

listaMaiores = list(hpq.nlargest(tam,dicionario.items()))

sorted(listaMaiores)

print(listaMaiores)
