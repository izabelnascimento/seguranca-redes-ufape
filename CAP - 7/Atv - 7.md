
**Atividade Cap. 07 Para 11/12/2023**

**Nome Completo:**

- Izabel Yale Neves Nascimento
- Jonas Ferreira Leal Junior
1. **Qual é a diferença entre aleatoriedades estatísticas e imprevisibilidade?**
- **Aleatoriedades estatísticas:** se trata de uma aleatoriedade passível de cálculo estatístico, ou seja, a saída de um valor ‘a’ estará estatisticamente relacionada com saídas de outros valores na sequência.
- **Imprevisibilidade:** são resultados que não há uma forma de calcular sua probabilidade, o resultado do volar ‘a’ independe do valor ‘b’ ou de qualquer outro valor da sequência aleatória obtida, esses são os verdadeiros aleatórios.
2. **Liste considerações de projeto importantes para uma cifra de fluxo.**

A sequência de encriptação deve ser longa, pois quanto maior, mais difícil será fazer a criptoanálise, o fluxo da chave deve ser o mais próximo possível de um número verdadeiramente aleatório e a chave deve ser suficientemente longa para dificultar um ataque de força bruta.

3. **Por que não é desejável reutilizar uma chave de cifra de fluxo?**

Não é desejável reutilizar a chave em uma criptografia de fluxo pois a operação de XOR de dois textos criptografados com a mesma chave é igual a operação de XOR dos textos claros correspondentes, isso facilita a criptoanálise, principalmente quando o texto claro segue algum padrão.

4. **Que operações primitivas são usadas no RC4?**
- **Inicialização de S:**
  - As entradas do estado “S” são definidas de 0 a 255 (S[0] = 0, S[1] = 1, ..., S[255] = 255).
  - Se o tamanho da chave K é 256 bytes, então K é transferido para T.
  - Caso contrário, para uma chave com tamanho de keylen bytes, os primeiros keylen elementos de T são copiados de K, e depois K é repetido tantas vezes quantas forem necessárias a fim de preencher T.

![](Aspose.Words.f7064335-42a1-4789-aa0c-997ff2d58a5f.003.png)

- Então, T produz a permutação inicial de S. Isso envolve começar com S[0] e ir até S[255], e trocar S[i] por outro byte em S, de acordo com um esquema ditado por T[i]:

![](Aspose.Words.f7064335-42a1-4789-aa0c-997ff2d58a5f.004.png)

- Como a única operação sobre S é uma troca, o único efeito é uma permutação. S, ainda, contém todos os números de 0 a 255.
- **Geração de fluxo:**
  - Percorre todos os elementos de S[i] e, para cada S[i];
  - Troca S[i] por outro byte em S de acordo com a configuração atual de S;
  - Depois que S[255] é atingido, o processo continua, começando novamente em S[0]:

![](Aspose.Words.f7064335-42a1-4789-aa0c-997ff2d58a5f.005.png)

5. **Se apanharmos um algoritmo de congruência linear com um componente aditivo de 0: *Xn*+1 = (*aXn*) mod *m***

**Eentão, podemos mostrar que, se *m* é primo, e se determinado valor de *a* produz o período máximo de *m −* 1, então *ak* também produzirá o período máximo, desde que *k* seja**

**menor que *m* e que *m −* 1 não seja divisível por *k*. Demonstre isso usando *X*0 = 1 e *m* = 31, e produzindo as sequências para *ak* = 3, 32, 33e 34.**

Utilizando ***Xn*+1 = (*aXn*) mod *m*** : X0 = 1;

X1 = (3x1) mod 31 = 3;

X2 = (3x3) mod 31 = 9; **(3)** X3 = (3x9) mod 31 = 27; **(32)** X4 = (3x27) mod 31 =19; **(33)** X5 = (3x19) mod 31 = 26; **(34)** X6 = (3x26) mod 31 = 16;

X7 = (3x16) mod 31 = 17;

X8 = (3x17) mod 31 = 20;

X9 = (3x20) mod 31 = 29;

Período máximo de m−1 = 30 para qualquer ***ak***

6. **(a) Qual é o período máximo que pode ser obtido do seguinte gerador? *Xn*+1 = (*aXn*) mod 24**

O período máximo será de m-1, nesse caso:

m = 2^4 = 16

Por isso, o período máximo é m-1, portanto 15.

2) **Qual deverá ser o valor de *a*?**

‘a’ e ‘m’ devem ser primos entre si (têm máximo divisor comum igual a 1). Como m=16, então a=5.

3) **Que restrições são exigidas na semente?**

Ela deverá ser segura e ser um número aleatório ou pseudo aleatório.

7. **Que valor de chave RC4 deixará S inalterado durante a inicialização? Ou seja, após a permutação inicial de S, as entradas de S serão quais aos valores de 0 a 255 na ordem crescente.**

   A chave RC4 será uma sequência ordenada de bytes de 0 a 255: K=(0,1,2,3,…,255). Assim, a identidade permutacional será mantida.

8. **O algoritmo Blum Blum Shub é baseado na teoria dos resíduos quadráticos e utiliza três números inteiros para realizar os cálculos: p, q e s.**
1) **Escolha dois números primos grandes *p* e *q*, onde *p* e *q* sejam congruentes a 3 mod 4 e**

**não tenham fatores primos comuns. Por exemplo, você pode escolher *p* = 499 e *q* = 503.**

2) **Calcule *n* = *p*** ∗***q*. Neste caso, *n* seria igual a 499** ∗**503 = 250997.**
2) **Escolha um número inteiro s entre 1 e *n −* 1 que seja co-primo com *n*. Por exemplo, você pode escolher *s* = 17.**
2) **Calcule o valor inicial *x*0 = (*s*2) mod *n*. Neste caso, *x*0 seria igual a (172) mod 250997 = 289.**
2) **Agora, vamos gerar uma sequência de números aleatórios usando o algoritmo Blum Blum Shub. Para gerar cada número da sequência, use a seguinte fórmula: *xi* = (*x*2*i−*1) mod *n*.**
2) **Execute a fórmula várias vezes para gerar uma sequência de números aleatórios. Por exemplo, você pode executar a fórmula 10 vezes para obter 10 números aleatórios.**

**Aqui está a sequência de números aleatórios gerados usando o algoritmo Blum Blum Shub com os valores do exemplo:**

**289*,* 253306*,* 14107*,* 23546*,* 67740*,* 144593*,* 79829*,* 46219*,* 132936*,* 9863 Qual foi a sua sequência?**
