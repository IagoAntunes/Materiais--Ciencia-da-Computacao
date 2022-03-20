


dic = {}
listnomes = []
listprecos = []

countList = int(input("Quantidade: "))

for produtos in range(countList):
    produto = input("Produto: ")
    listnomes.append(produto)
    preco = float(input("Preco: "))
    listprecos.append(preco)
    dic[produto] = preco

print(dic)#A
print(listnomes)#B

listnomes.sort()
print(listnomes)#C

for palavra in listnomes:
    print(palavra,":",dic[palavra])





