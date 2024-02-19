
**Atividade Cap. 08 Para 11/12/2023**

**Nome Completo:**

- Izabel Yale Neves Nascimento
- Jonas Ferreira Leal Junior
1. **Por que mdc(n, n + 1) = 1 é para dois inteiros consecutivos n e n + 1?**

Se existe um número d > 1 que é divisor de n e n + 1 então d também divide (n + 1) - n, o que não é possível de acontecer, portanto o máximo divisor comum de n e n+1 é 1.

2. **Usando o teorema de Fermat, encontre 3201 mod 11.**

a^(p−1) ≡ 1 (mod p)

Neste caso, p = 11 (primo); a = 3 (inteiro não múltiplo de p), então: 3^(11−1) ≡ 3^10 ≡ 1 (mod 11)

Isso significa que 3^10 é congruente a 1 módulo 11.

Agora, podemos usar essa propriedade para simplificar 3^201: 3^201 = 3^(10×20) = (3^10)^20

Como 3^10 ≡ 1 (mod 11), então 3^201 ≡ 120 ≡ 1 (mod 11) Portanto, 3^201 mod  11 = 1.

3. **Use o teorema de Fermat para encontrar um número a entre O e 72, com a congruente a 9794 módulo 73.**

a^72 ≡ 1 (mod 73)

Devo encontrar um número a tal que a ≡ 9794 (mod 73) a ≡ 9794 ≡ 9794 (mod 73)

a = 73k + 9794, k é um inteiro então: 73k + 9794 ≡ 1 (mod 73)

Como 73k será divisível por 73, podemos ignorá-lo ao considerar a congruência módulo 73. Simplificando para: 9794 ≡ 1 (mod 73)

a será o resto de 9794 / 79; a = 14

Por isso, a = 14 é o número entre 0 e 72 congruente a 9794 mod 73.

4. **Use o teorema de Euler para encontrar um número a entre 0 e 9, tal que a seja congruente a 71000 módulo 10. (Observe que isso é o mesmo que o último dígito da**

   **expansão decimal de 71000.)**

7^4 ≡ 1 (mod 10)

Vamos observar os expoentes de 7 módulo 10: 7^1 ≡ 7 (mod 10)

7^2 ≡ 9 (mod 10)

7^3 ≡ 3 (mod 10)

7^4 ≡ 1 (mod 10)

7^5 ≡ 7 (mod 10)

7^6 ≡ 9 (mod 10)

…

7^1000 ≡ 1 (mod 10)

Logo a = 1

5. **Use o teorema de Euler para encontrar um número *x* entre 0 e 28, com *x*85 congruente a 6 módulo 35 (Você não precisará usar qualquer pesquisa por força bruta).**

ϕ(35) = (5−1) × (7−1) = 4×6 = 24. Encontrar x tal que x^85 ≡ 6 (mod 35)

Como ϕ(35) = 24, podemos aplicar o teorema de Euler para obter: x^24 ≡ 1 (mod 35)

x^85 ≡ (x^24)^3 × x^13 ≡ 1^3 × x^13 ≡ x^13 (mod 35)

Encontrar x tal que x^13 ≡ 6 (mod 35) 0^13 ≡ 0 (mod 35)

1^13 ≡ 1 (mod 35)

2^13 ≡ 8 (mod 35)

3^13 ≡ 27 (mod 35)

4^13 ≡ 16 (mod 35)

5^13 ≡ 5 (mod 35) 6^13 ≡ 6 (mod 35)

Logo x = 6.

6. **Observe, na Tabela 8.2, que *ϕ*(*n*) é par para *n >* 2. Isso é verdadeiro para todo *n >* 2. Dê um argumento conciso para explicar por que isso acontece.**
6. **Se n é composto e passa no teste de Miller-Rabin para a base a, então n é chamado de pseudo primo forte à base a. Mostre que 2047 é um pseudoprimo à base 2.**

2047 = 2^k \* m, onde m é ímpar, então: 2047 = 2^1 \* 1023

- 2^1 \* 2^1 \* 511
- 2^2 \* 511
- 2^2 \* 2^1 \* 255
- 2^3 \* 255
- 2^3 \* 2^1 \* 127
- 2^4 \* 127

=> 2047 = 2^k \* 127, k=4

Calcular 2^(2047-1) mod 2047 usando Miller-Rabin:

2^(2047-1) mod 2047 = 2^(2046) mod 2047

- (2^1)^1023 mod 2047
- (2^2)^511 mod 2047
- (2^4)^255 mod 2047
- (2^8)^127 mod 2047 = (256)^127 mod 2047

256^2 mod 2047 = 32 214^2 mod 2047 = 1024 1047^2 mod 2047 = 1

Então, 2047 passa no teste para base 2 e é um pseudoprimo forte à base 2.

8. **O exemplo usado por Sun-Tsu para ilustrar o CRT foi**

***x* = 2 (mod 3); *x* = 3 (mod 5); *x* = 2 (mod 7)**

**Solucione para *x*.**

O produto de todos os módulos: M = 3\*5\*7 = 105 M1 = M/3 = 105/3 = 35

M2 = M/5 = 105/5 = 21 M3 = M/7 = 105/7 = 15

Para M1 = 35 (módulo 3):

35 \* y1 ≡ 1 (mod 3)

Nota-se que 35 ≡ 2 (mod 3), então y1 = 2

Para M2 = 21 (módulo 5):

21 \* y2 ≡ 1 (mod 5)

Nota-se que 21 ≡ 1 (mod 5), então y2 = 1

ParaM3 = 15 (módulo 7):

15 \* y3 ≡ 1 (mod 7)

Nota-se que 15 ≡ 1 (mod 7), então y3 = 1

Usando a fórmula CRT:

x = (a1 \* M1 \* y1 + a2 \* M2 \* y2 + a3 \* M3 \* y3) (mod M) x = (2 \* 35 \* 2 + 3 \* 21 \* 1 + 2 \* 15 \* 1) (mod 105)

x = (140 + 63 + 30) (mod 105)

x = 233 (mod 105)

**x = 23**
