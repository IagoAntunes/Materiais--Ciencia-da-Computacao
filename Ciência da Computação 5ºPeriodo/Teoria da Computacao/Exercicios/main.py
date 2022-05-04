def IsvalidIda(letra,estado,ida,situacao):
    if estado == 0:
        if(letra == "1"):
            estado +=1
        else:
            situacao == 1
            return estado,ida,situacao
    elif estado == 1:
        if(letra == "0"):
            estado +=1
            ida = 1
    return estado,ida,situacao
def IsValidVolta(letra,estado,ida,situacao):
    if estado == 1:
        if letra == "1":
            estado -=1
            ida = 0
        else:
            situacao == 1
            return estado,ida,situacao
    elif estado == 2:
        if(letra == "0"):
            estado -=1
        else:
            situacao == 1
            return estado,ida,situacao
    return estado,ida,situacao

file = open('Teoria da Computacao\\TrabalhoPratico\\texto.txt', 'r')
lista = []
estado = 0
ida = 0
situacao = 0
for palavra in file:
    for letra in palavra:
        if(situacao == 0):
            if ida == 0:
                estado,ida,situacao = IsvalidIda(letra,estado,ida,situacao)
            elif ida == 1:
                estado,ida,situacao = IsValidVolta(letra,estado,ida,situacao)
        elif(situacao == 1):
            print("ERRO")
