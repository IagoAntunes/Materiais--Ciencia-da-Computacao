#Faça um programa que leia um número n e em seguida leia n inteiros. Em seguida crie 
#uma lista com o quadrado dos elementos da lista original utilizando compreensão de lista.





list = []

n = int(input("Tamanho: "))

for x in range(n):
    list.append(int(input("Num: ")))

list2 = [num ** 2 for num in list]

print(list2)