#19

def InverteValor(num):
    numInv = 0 
        
    while(num != 0):    
        aux = num % 10
        numInv = numInv * 10 + aux    
        num = num // 10    
    #Iago Antunes Ferreira
    return numInv

def comparacao(num,numNew):
    if((num % 2 == 0 and numNew % 2 ==0) or (num % 2 != 0 and numNew % 2 != 0)):
        return True
    return False

num = int(input("Numero:"))
newNum = InverteValor(num)
print("Valor é ",newNum)
print("Comparacao = ",comparacao(num,newNum))

