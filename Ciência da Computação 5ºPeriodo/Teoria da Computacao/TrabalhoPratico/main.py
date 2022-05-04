

file = open('Teoria da Computacao\\TrabalhoPratico\\texto.txt', 'r')
linhas = file.readlines()

nEstados = len(linhas[0].replace("\n","").split(","))
alfabeto = linhas[1].replace("\n","").split(",")
Iestado = linhas[2].replace("\n","")
Festado = linhas[3].replace("\n","")

opc = 0
print("---TRANSIÇÕES---")
while opc == 0:
    for x in range(0,nEstados):
        print("Estado",x)
    selec = int(input("Estado1:"))
    selec2 = int(input("Estado2:"))
    valorPassa = input("ValorPassa")

    opc = int(input("DesejaContinuar:"))




