#Leia um texto de um arquivo e crie um dicionário que conte o número de vezes que cada 
#letra apareceu no texto. Crie seu próprio arquivo de teste


dic = {}
junta = ""
file = open('Ciencia de Dados\\ListaEtapa1\\arq', 'r')

for palavra in file:
    junta += palavra

palavra2 = junta.replace("\n","").replace(" ","").upper()

for letra in palavra2:
    if(letra.isdigit):
        if(letra in dic):
            dic[letra] = dic.get(letra,0)+1
        else:
            dic[letra] = dic.get(letra,0)+1

print(dic)