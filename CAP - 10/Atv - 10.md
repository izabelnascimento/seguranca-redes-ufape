

**Atividade Cap. 10 Para 5/2/2024**

**Nome Completo:**

- Izabel Yale Neves Nascimento
- Jonas Ferreira Leal Junior
1. **Os usuários A e B utilizam a técnica de troca de chaves Diffie-Hellman com um primo comum *q* = 71 e uma raiz primitiva *α* = 7.**
1. **Se o usuário A tem chave privada *XA* = 5, qual é a chave pública de *A, YA*?**

   A chave pública de A será obtida por YA = aXA mod q

   YA = 75 mod 71

   YA = 16.807 mod 71

   YA = 51

2. **Se o usuário B tem chave privada *XB* = 12, qual é a chave pública de *B, YB*?**

   A chave pública de A será obtida por YB = aXB mod q

   YB = 712 mod 71

   YB = 13.841.287.201 mod 71

   YB = 4

3. **Qual é a chave secreta compartilhada?**

   A chave secreta compartilhada será obtida por meio do cálculo com a chave pública do outro e a chave privada própria.

- A calcula KA =YB XA mod q
- B calcula KB =YA XB mod q

KA = 45 mod 71 KA = 1024 mod 71

KA = 30

KB = 5112 mod 71

KB = 309.629.344.375.621.415.601 mod 71 KB = 30

2. **Considere um esquema Elgamal com um primo comum *q* = 71 e uma raiz primitiva *α* = 7.**
1) **Se B tem chave pública *YB* = 3 e A escolheu um inteiro aleatório *k* = 2, qual é o**

**texto cifrado de *M* = 30?**

Para calcular a cifragem de ElGamal a fórmula é: C1 = ak mod q

C2 = (YBk \* M) mod q

C1 = 7² mod 71 C1 = 49 mod 71 C1 = 49

C2 = (32 \* 30) mod 71 C2 = (9 \* 30) mod 71 C2 = 270 mod 71

C2 = 57

2) **Se A, então, selecionar um valor diferente de *k*, de modo que a codificação de *M* = 30 seja *C* = (59*, C*2), qual é o inteiro *C*2?**

k = 3

C2 = (3[^1] \* 30) mod 71 C2 = (27 \* 30) mod 71 C2 = 810 mod 71

C2 = 29

**condições para um grupo sobre os números reais.**

**4. (4*,* 7) é um ponto na curva elíptica *y*2 = *x*3 *−* 5*x* + 5 sobre números reais?**

Para saber se um ponto pertence a curva elíptica, basta substituir os pontos dados na fórmula e verifica se a igualdade é mantida.

7² = 4³ - 5 \* 4 . 5

49 = 64 - 20 + 5

49 = 49

Portanto os pontos dados pertencem a curva.

[^1]: **. Demonstre que as duas curvas elípticas da Figura 10.4 satisfazem, cada uma, às**