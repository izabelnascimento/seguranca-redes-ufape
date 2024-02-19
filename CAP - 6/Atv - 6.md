
**Atividade Cap. 06 - Operação de Cifra de Bloco Para 11/12/2023**

**Nome Completo:**

- Izabel Yale Neves Nascimento
- Jonas Ferreira Leal Junior
1. **O que é encriptação tripla?**

É o processo de repetir a encriptação três vezes com múltiplas chaves a fim de aumentar a segurança da criptografia sem a criação de novos algoritmos.

2. **O que é ataque *meet-in-the-middle*?**

Consiste em um ataque de força bruta que armazena o resultado de processos de encriptar e decriptar o texto claro/encriptado com todas as chaves que são possíveis gerar e comparar seus resultados, haverá um número de falsos positivos, mas a partir disso é possível identificar a chave correta.

3. **Quantas chaves são usadas na encriptação tripla?**

São utilizadas 3 chaves na tentativa de inviabilizar o ataque meet-in-the-middle, ou a estratégia utilizada no 3DES, de utilizar 2 chaves com uma combinação de encriptar com a chave 1, decriptar com a chave 2 e encriptar com a chave 1 novamente.

4. **Por que a parte do meio do 3DES é decriptação, em vez de encriptação?**

Aproveitar a segurança da encriptação tripla ao mesmo tempo que permite a compatibilidade com o DES mais antigo.

5. **Por que alguns modos de operação de cifra de bloco só utilizam a encriptação, enquanto outros empregam encriptação e decriptação?**

   Isso está relacionado com o modo de operação dos algoritmos, a necessidade de utilizar a encriptação sempre irá existir, pois não há como decriptar algo sem antes encriptar. Então, a discussão cabe o que irá definir a utilização ou não da decriptação será o funcionamento do algoritmo, sua finalidade e complexidade.

6. **Você deseja construir um dispositivo de hardware para realizar encriptação de bloco no modo cipher block chaining (CBC) usando um algoritmo mais forte do que DES. 3DES é um bom candidato. A Figura 1 mostra duas possibilidades, ambas acompanhando a definição do CBC. Qual das duas você escolheria: ,**
1) **Por segurança?** Por segurança eu escolheria o CBC com 3 loopings, pois além do processo de encriptação ser executado 3x, é utilizado 3 chaves diferentes em cada etapa, assim tornando o algoritmo mais seguro.
1) **Por desempenho?** Por desempenho minha escolha seria o CBC com um loop, pois será um algoritmo de execução mais rápida, menor e consequentemente mais performático.
7. **Crie um software que possa encriptar e decriptar no modo cipher block chaining usando uma das seguintes cifras: módulo affine 256, módulo Hill 256, S-DES, DES.**

   **Teste os dados para S-DES usando um vetor de inicialização binário de 1010 1010. Um texto claro binário de 0000 0001 0010 0011 encriptado com uma chave binária de 01111 11101 deverá dar um texto claro binário de 1111 0100 0000 1011. A decriptação deverá funcionar de modo correspondente.**

   **Figura 1: Uso de triple DES no modo CBC.**

![](Aspose.Words.6321e6ed-8bf0-4b8d-b22b-417eba3f78cf.003.png)
