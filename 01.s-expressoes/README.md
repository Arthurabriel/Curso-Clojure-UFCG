# Lista 1

1. Explique o que você entende por s-expressões?
	É a unidade base de uma expressão em Lisp, podendo ser um átomo, ou seja o menor tipo de elemento não podedno ser refatorado em nada,
e o outro tipo de s-expressão são listas um dado composto que é delimitada por parenteses e os elementos são separados por espaço, 
esses elementos da lista também são s-expressões.
2. Escreva cinco exemplos de s-expressões atômicas. Não use
   nenhum exemplo dos fornecidos nos slides. Também não use
   exemplos de colegas. Varie ao máximo os tipos de átomos
   usados. 
15    "são paulo" * (+ 2 3)   ("lista" "formada" ("por" "lista")) 


3. O que são formas? Qual sua relação com s-expressões?
qualquer unidade de codigo que pode ser executada em LISP sem da nenhum erro. A relação com s-expressões é que toda s-expressão válida é uma forma

4. Escreva três exemplos de s-expressões não atômicas que não
   sejam formas e três outras que sejam formas.

Não são formas: (1 3 4)  (+ 2 (10 30 40) "são")  (+ - /)
são formas: (+ 3 2)  (def quadrado (fn [x] (* x x))) (defn triplo [x] (* 3 x))

5. O que são símbolos em Clojure? Dê exemplos de símbolos.
   Explore a linguagem por experimentação no REPL e descubra
   outros simbolos operacionais semelhantes aos de outras
   linguagens que você tenha estudado que sejam válidos em
   Clojure. Escreva uma expressão usando cada um desses símbolos
   que você descobrir.


6. Escreva uma sequência de s-expressões que representem a
   avaliação da s-expressão `(* (+ 2 5 7) (- 8 (inc 3)) 5)`,
   passo a passo, até que seja reduzida à s-expressão atômica
/bin/bash: line 1: q: command not found
(* (+ 2 5 7) (- 8 (inc 3)) 5) ----> (* 14 (- 8 4) 5) --->(* 14 4 5) =
= 280
 
7. O que são _formas especiais_ e como diferem das demais formas?
   Por que `def` em uma s-expressão como `(def a 123)` é uma
   forma especial e não uma simples aplicação de função? E `fn`
   por que precisa ser definida como uma forma especial?

Formas especiais são formas que precisam de um tratamento especial
por parte da linguagem.
Def é uma forma especial pois ele é o mecanismo de abstração mais
básico e que permite associar um símbolo a memória.
fn é a forma é a forma de criar uma função lambda de maneira
anônima.

8. Analise o programa abaixo. Considerando as definições nas
   primeiras três linhas, avalia a sequência de s-expressões
   pelas quais a s-expressão na linha final pode ser
   interpretada, passo a passo.

```clojure
(defn dobro [n] (* 2 n))
(defn triplo [n] (* 3 n))
(defn vezes_12 [n] (dobro (dobro (triplo n))))

(vezes_12 10)
```

9. No REPL, com a forma especial `fn`, crie uma função anônima
   (ou lambda) que receba três argumentos (`a`, `b` e `c`) que
   representam os três coeficientes inteiros de uma equação de 2o
   grau e que retorne o valor do determinante (o _delta_) da
   equação. Com a forma especial `def`, defina o símbolo
   `eq2delta` e associe-o à função anônima. Em seguida, defina a
   mesma função usando apenas a forma especial `defn`.

(fn [a b c] (- (* b b) (* 4 a c)))

(def eq2delta (fn [a b c] (- (* b b) (* 4 a c)))

(defn eq2delta [a b c] (- (* b b) (* 4 a c)))

10. No REPL, experimente as formas especiais `if` e `cond`.  Com
    elas, escreva a função `raizes` que retorne um vetor contendo
    as duas raízes da equação.

11. As formas especiais `print` e `println` nos permitem imprimir
    dados na saída (às vezes, você precisará usar também a forma
    especial `flush` para esvaziar o buffer de saída e garantir
    que o dado seja impresso no momento apropriado. Estude essas
    formas especiais e escreva o famoso _Hello, World!_ em
    Clojure, no arquivo `hello.clj`.

12. As formas especiais `read` e `read-line` permitem ler dados
    da entrada. E a função `Integer/parseInt` permite converter
    uma string em um valor inteiro. Com base nas formas especiais
    de entrada e saída e nas definições que você mesmo criou
    anteriormente, crie um pequeno programa no arquivo `eq2.clj`
    que leia os coeficientes `a`, `b` e `c` de uma equação de
    segundo grau da entrada e que imprima suas raízes. Se a
    equação não tiver raízes, imprima a mensagem `sem raízes` na
    saída.
