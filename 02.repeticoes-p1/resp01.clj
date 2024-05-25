(defn mensagem_recursiva [mensagem] (println mensagem) (mensagem_recursiva mensagem))

(def input-mensagem (read)) (mensagem_recursiva input-mensagem)

;;ao executar o programa, pela falta de caso base na função recursiva isso vai fazer com que essa seja chamada infinitamente, criando camadas e camadas de pilhas até
;;um momento em que a memoria se esgota e dá um erro, a forma de evitar isso é adicionar um caso base como por exemplo um contador que so printe a mensagem n vezes"
