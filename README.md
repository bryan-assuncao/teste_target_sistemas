# Teste Técnico - Target Sistemas

Este repositório contém as soluções para um teste técnico focado em lógica de programação e manipulação de dados, desenvolvido em Java (JDK 17).

## Os Desafios

O teste consiste em 5 questões de lógica e programação:

**1. Valor da Variável SOMA**
Observe o trecho de código abaixo:
```pseudocode
int INDICE = 13, SOMA = 0, K = 0;

Enquanto K < INDICE faça { 
    K = K + 1; 
    SOMA = SOMA + K; 
}

Imprimir(SOMA);
```
Ao final do processamento, qual será o valor da variável SOMA?

**2. Sequência de Fibonacci**
Dado a sequência de Fibonacci (0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
> **IMPORTANTE:** Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código.

**3. Faturamento Diário (Análise de XML)**
Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa que calcule e retorne:
* O menor valor de faturamento ocorrido em um dia do mês;
* O maior valor de faturamento ocorrido em um dia do mês;
* Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

> **IMPORTANTE:**
> a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal.
> b) Podem existir dias sem faturamento (finais de semana e feriados). Estes dias devem ser ignorados no cálculo da média.

**4. Percentual de Faturamento por Estado**
Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
* SP – R$67.836,43
* RJ – R$36.678,66
* MG – R$29.229,88
* ES – R$27.165,48
* Outros – R$19.849,53

Escreva um programa que calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

**5. Inversão de String**
Escreva um programa que inverta os caracteres de um string.
> **IMPORTANTE:**
> a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código.
> b) Evite usar funções prontas, como, por exemplo, `reverse`.

---

## 📂 Soluções no Projeto

Cada desafio é resolvido em sua própria classe Java, localizada no diretório `src/`:

* **Solução 1:** `src/Solucao_01.java`
    * *Resolve o loop de `INDICE` e `SOMA`. O resultado (91) é impresso no console.*
* **Solução 2:** `src/Solucao_02.java`
    * *Verifica se um número informado pelo usuário pertence à sequência de Fibonacci.*
* **Solução 3:** `src/Solucao_03.java`
    * *Analisa o faturamento diário a partir do arquivo `dados (2).xml`. Calcula e exibe o menor valor, o maior valor e o número de dias com faturamento acima da média (ignorando dias com faturamento zero).*
* **Solução 4:** `src/Solucao_04.java`
    * *Calcula o percentual de representação de faturamento de cada estado (SP, RJ, MG, ES, Outros) e exibe no console.*
* **Solução 5:** `src/Solucao_05.java`
    * *Inverte uma string ("Target Sistemas") sem usar métodos prontos e imprime o resultado.*

---

## 🚀 Como Executar

### Pré-requisitos
* Java Development Kit (JDK) 17 ou superior.

### Execução via IDE (Recomendado)
1.  Clone este repositório.
2.  Abra o projeto em sua IDE Java preferida (Ex: IntelliJ IDEA, Eclipse).
3.  Para executar uma solução, navegue até o arquivo (ex: `src/Solucao_01.java`) e execute.

**Nota para a Solução 3:** Para que a `Solucao_03.java` funcione corretamente, o arquivo `dados (2).xml` deve estar localizado no diretório raiz do projeto (no mesmo nível que a pasta `src/` e o arquivo `.gitignore`).

### Execução via Terminal
1.  Clone o repositório.
2.  Abra seu terminal e navegue até o diretório raiz do projeto.
3.  Execute a solução desejada (Exemplo para a Solução 2):
    ```bash
    java -cp out Solucao_02
    ```
    (Substitua `Solucao_02` pelo nome da classe que deseja executar).

---
