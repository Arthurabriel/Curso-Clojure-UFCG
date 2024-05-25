(defn conta-rec [n] (println n) (conta-rec (inc n)))

(defn conta [] (conta-rec 0))

(conta)

;;a necessidade de duas funções conta é por que o problema exige que a função conta não tenha parametros ou seja seria necessario uma função auxiliar (que no caso é conta -rec) para fazer a parte recursiva da função e incrementar de um em um os valores. Em geral a função principal chama a função recursiva e é nela onde se é abstraido a ideia de recursividade.

