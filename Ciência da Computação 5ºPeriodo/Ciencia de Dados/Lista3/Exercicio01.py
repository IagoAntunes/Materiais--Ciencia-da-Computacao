
def primo(num):
    count = 0
    for x in range(1,num+1):
        if((num % x) ==0):
            count = count + 1

    if(count == 2):
            print("É primo")

def mmc(num1,num2):
    if num1 > num2:
        maior = num1
    else:
        maior = num2
    while True:
        if maior % num1 == 0 and maior % num2 == 0:
            print(maior)
            break
        else:
            maior += 1

def digitos(x):
    soma = 0
    while (x != 0):
        resto = x % 10
        x = (x - resto)//10
        soma = soma + resto
    print(soma)

##Iago Antunes Ferreira
print("Opcao:")
opc = int(input())

if opc == 1:
    print("Numero:")
    num = int(input())
    primo(num)
elif opc == 2:
    print("Numero")
    num1 = int(input())
    print("Numero2:")
    num2 = int(input())
    mmc(num1,num2)
elif opc == 3:
    print("Numero:")
    num = int(input())
    digitos(num)

