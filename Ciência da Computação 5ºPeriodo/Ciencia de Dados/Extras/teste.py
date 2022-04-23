import heapq as hpq
#Escreva um programa em Python que print os três tens com valor mais alto do dicionário
dicionario = {'item1': 45.50, 'item2':35, 'item3': 41.30, 'item4':55, 'item5': 24}

valor = hpq.nlargest(3,dicionario.items())

valor = list(valor)
print(valor)
