global prime
global generator
global x
global aPrivateKey
global bPrivateKey

def e_primo(n):
    if n < 2:
        return False
    for i in range(2, int(n/2)):
        if n % i == 0:
            return False
    return True

def e_raiz_primitiva(r, p):
    lista = []
    if (r < p ):
        for i in range(1, p):
            resultado = (pow(r, i) % p)
            # print( f"Primo: {p}, Raiz: {r}, Resultado {resultado}")
            if resultado in lista:
                return False
            lista.append(resultado)
        return True
    return False
    
def caculatePublicKey(privateKey) -> int:
    if (privateKey < 1 or privateKey > prime):
        print("ERROR - cacularPrivateKey")
        return -1
    e = (pow(generator, privateKey)) % prime
    return e

def sendMessage(sender, receiver, message) -> int:
    cipherMessage = (message * pow(receiver, sender)) % prime
    return cipherMessage

def calculateNewGenerator(key, g) -> int:
    y = (pow(key, generator-g)) % prime
    return y

def receiveMessage(cipherMessage, g) -> int:
    decipherMessage = (cipherMessage*pow(g, prime-g)) % prime
    return decipherMessage

def checkReturn(text, value):
    if (value == -1):
        print("-- ERROR --")
    else:
        print(text, value)
        
# -------------------------------------

def main():
    if(e_primo(prime) == False):
        print("ERROR - não é primo")
    elif(e_raiz_primitiva(generator, prime) == False):
        print("ERROR - gerador inválido")
    else:
        print("Iniciando comunicação entre A e B\n")
        # A calcula chave publica
        aPublicKey = caculatePublicKey(aPrivateKey)
        checkReturn("public key A: ", aPublicKey)
        
        # B calcula chave publica
        bPublicKey = caculatePublicKey(bPrivateKey)
        checkReturn("public key B: ", bPublicKey)
        
        # B cifra mensagem (13) para transmitir para A
        cipherMessage = sendMessage(bPrivateKey, aPublicKey, 13)
        checkReturn("cipherMessage: ", cipherMessage)
        
        # A calcula novo gerador para decifragem -> (15^5)mod(17) = x = 2
        y = calculateNewGenerator(bPublicKey, x)
        checkReturn("x: ", y)
        
        # A decifra a mensagem
        decipherMessage = receiveMessage(cipherMessage, y)
        checkReturn("decipherMessage: ", decipherMessage)

prime = 17
generator = 6
x=1
aPrivateKey = 5
bPrivateKey = 10  

print("Cifra Elgamar\n")
main()
    
    
    