

**Atividade Cap. 09 Para 18/12/2023**

**Nome Completo:**

- Izabel Yale Neves Nascimento
- Jonas Ferreira Leal Junior
1. **Quais são os principais elementos de um criptossistema de chave pública?**
- Chaves públicas e privadas;
- Algoritmo de criptografia assimétrica;
- Funções de criptografia (Hash);
- Infraestrutura de chave pública;
- Certificados digitais;
- Assinaturas digitais.
2. **Quais são os papéis da chave pública e da privada? Descreva-os com detalhes e com exemplos.**
- **Chave pública**: utilizada para criptografar o texto antes de enviá-lo ao destinatário e divulgada para futuras propagações,
- **Chave privada**: é utilizada para descriptografar uma mensagem recebida que fez uso da chave pública na criptografia, essa chave não pode ser divulgada publicamente.

  Exemplo de uso das chaves: A deseja enviar uma mensagem a B, então usa a chave pública de Bob para criptografar

3. **Quais requisitos os criptossistemas de chave pública precisam cumprir para serem considerados como um algoritmo seguro?**
- Tamanho do número primo, quanto maior mais seguro;
- Dificuldade de fatoração, em alguns tipos de algoritmos essa dificuldade ajuda a aumentar o grau de complexidade;
- Aleatoriedade, quanto melhor a forma de garantir a aleatoriedade das chaves mais difícil será de prever ou adivinhar seu uso.
- Resistência a Ataques de Assinatura Falsa: Em sistemas que suportam assinaturas

  digitais, como o RSA e o DSA, é importante que o algoritmo seja resistente a ataques de assinatura falsa, onde um adversário pode criar uma assinatura válida sem a chave privada.

4. **Descreva, em termos gerais, um procedimento eficiente para se escolher um número primo.**

Determinar o **intervalo** em que você deseja encontrar um número primo, gerar **aleatoriamente** um número dentro do intervalo definido, aplique um **teste de primalidade** ao número candidato para verificar se ele é primo, realizar uma **verificação adicional** usando métodos de **fatoração** ou testes mais rigorosos de primalidade, dependendo da aplicação específica.

5. **Antes da descoberta de quaisquer esquemas de chave pública específicas, como RSA, uma prova de existência foi desenvolvida, cuja finalidade era demonstrar que a**

   **encriptação de chave pública é possível em teoria. Considere as funções *f*1(*x*1) = *z*1; *f*2(*x*2*, y*2) = *z*2; *f*3(*x*3*, y*3) = *z*3, onde todos os valores são inteiros com 1 *≤ xi, yi, zi ≤ N*. A função *f*1, pode ser representada por um vetor M1 de tamanho *N*, em que a *k*-ésima**

   **entrada é o valor de *f*1(*k*). De modo semelhante, *f*2 e *f*3 podem ser representados pelas matrizes M2 e M3 de tamanho *N × N*. A intenção é indicar o processo de encriptação/decriptação por pesquisas de tabela para aquelas com valores muito grandes de *N*. Essas tabelas seriam impraticavelmente grandes, mas, a princípio, poderiam ser construídas. O esquema funciona da seguinte forma: construa M1 com uma permutação aleatória de todos os inteiros entre 1 e *N*; ou seja, cada inteiro aparece exatamente uma vez em M1. Construa M2, de modo que cada linha contenha uma permutação aleatória dos primeiros *N* inteiros. Finalmente, preencha M3 para satisfazer a seguinte condição:**

***f*3(*f*2(*f*1(*k*)*, p*)*, k*) = *p* para todo *k, p* com 1 *≤ k, p ≤ N***

**Resumindo,**

1. **M1 toma uma entrada *k* e produz uma saída *x*.**
1. **M2 toma as entradas *x* e *p*, dando a saída *z*.**
1. **M3 toma as entradas *z* e *k* e produz *p*.**

**As três tabelas, uma vez construídas, se tornam públicas.**

**a) Deverá ficar claro que é possível construir M3 para satisfazer a condição anterior. Como um exemplo, preencha M3 para o caso simples a seguir:**

**5 4 3 2 21 44 52 35 *a*1 *a*2 *a*3**

**1 5 2 3 4 2 5 3 4 *a*4 *a*5**

**M1 = 1 4 2 5**

`  `**M2 = 1 3 1 3 1  M3 =**

***b*1 *b*2 *b*3 *c*2 *c*3 *c*4 *d*3 *d*4 *d*5 *e*4 *e*5 *b*4 *b*5 *c*1 *c*5 *d*1 *d*2 *e*1 *e*2 *e*3**

**Convenção: o *i*-ésimo elemento de M1 corresponde a *k* = *i*. A *i*-ésima linha de M2 diz respeito *ax* = *i*; a *j*-ésima coluna de M2 equivale a *p* = *j*. A *i*-ésima linha de M3 indica *z* = *i*; a *j*-ésima coluna de MB relaciona-se a *k* = *j*.**

1) **Descreva o uso desse conjunto de tabelas para realizar a encriptação e decriptação entre dois usuários.**
1) **Demonstre que esse é um esquema seguro**
6. **Realize a encriptação e decriptação usando o algoritmo RSA, como na Figura 9.5, para**

**o seguinte:**

1) ***p* = 3; *q* = 11, *e* = 7; *M* = 5;**

n = p \* q = 33

𝛟(n) (p-1)(q-1) = 20

d = 3

d \* e ≡ 1 mod 𝛟(n) ⟹ ( 3 \* 7) mod 20 = 1 PU = [7, 33]

PR = [3, 33]

C = Me mod n

C = 78125 mod 33 = 14

M = Cd mod n

M = 2744 mod 33 = 5

2) ***p* = 5; *q* = 11, *e* = 3; *M* = 9;**

n = p \* q = 55

𝛟(n) (p-1)(q-1) = 40

d = 27

d \* e ≡ 1 mod 𝛟(n) ⟹ ( 3 \* 27) mod 40 = 1

PU = [3, 55]

PR = [27, 55]

C = Me mod n

C = 729 mod 55 = 14

M = Cd mod n

M = 8819763977946281130444984418304 mod 55 = 9

3) ***p* = 7; *q* = 11, *e* = 17; *M* = 8;**

n = p \* q = 77

𝛟(n) (p-1)(q-1) = 60

d = 53

d \* e ≡ 1 mod 𝛟(n) ⟹ ( 17 \* 53) mod 60 = 1

PU = [17, 77]

PR = [53, 77]

C = Me mod n

C = 2251799813685248 mod 77= 57

M = Cd mod n

M = 115177421228658126130210485887147379772940964186962485859847264130684 4001437957553978477996057 mod 77 = 8

4) ***p* = 11; *q* = 13, *e* = 11; *M* = 7;**

n = p \* q = 143

𝛟(n) (p-1)(q-1) = 120

d = 11

d \* e ≡ 1 mod 𝛟(n) ⟹ ( 11 \* 11) mod 120= 1 PU = [11, 143]

PR = [11, 143]

C = Me mod n

C = 1977326743 mod 143= 106

M = Cd mod n

M = 18982985583354248390656 mod 143= 7

5) ***p* = 17; *q* = 31, *e* = 7; *M* = 2.**

n = p \* q = 527

𝛟(n) (p-1)(q-1) = 480

d = 343

d \* e ≡ 1 mod 𝛟(n) ⟹ ( 7 \* 343) mod 480 = 1 PU = [7, 527]

PR = [343, 527]

C = Me mod n

C = 128 mod 527 = 128

M = Cd mod n

M = 592952069579956268241627388211778393274286198955266649632164629073782 122661157921434915260404230922614742806069190341871448978586050151754 701009355157292993870093717188959431476690934729713036287125126386412 204941468015111225828192414210538356977781895486602586595301676884305 455520093034893660591804006396064517212227168207059806440679346161213 589782284394480610368284491342731806181791379687474475023624171396667 403413123559648601250655209452920260855166920070548411619151715266691

805980753434129540911678517546343021014198264220056155456320533593118 890816844467960019290976068938266808477498292715851950800619520163251 574678048355327472326371611502330832967138274750888516926440263399930 535974552194685858589838778826752 mod 527 = 2

**Dica: a decriptação não é tão difícil quanto você pensa; use alguma sutileza.**

7. **Em um sistema de chave pública usando RSA, você intercepta o texto cifrado *C* = 10 enviado a um usuário cuja chave pública é *e* = 5, *n* = 35. Qual é o texto claro *M*?**

p e q são primo entre se, então escolhemos p = 5 e q = 7 𝛟(n) (p-1)(q-1) = 24

d \* e ≡ 1 mod 𝛟(n) ⟹ ( d \* 5) mod 24 = 1

d = 25

M = Cd mod n

M = 1025 mod 35 = 10

M= 10
