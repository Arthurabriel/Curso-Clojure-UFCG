(ns jogodavelha.core
    (:require [clojure.string :as str]))



(defn inicializa []
  (vec (repeat 3 (vec (repeat 3 \space)))))


(defn printBoard [board]
  (doseq [linha board]
    (do
    (println (str "| " (nth linha 0) " | " (nth linha 1) " | " (nth linha 2) " |"))
    (println "|---|---|---|"))))


(defn mostraPontuacao [score1 score2]
  (println (str "Pontuação do jogador 1 é de : " score1))
  (println (str "Pontuação do jogador 2 é de : " score2))) 


(defn marcaPonto [board vez-player]
  (println "Escolha a linha (1-3)")
  (let [linha (- (read) 1)]
    (println "Escolha a coluna (1-3)")
    (let [coluna (- (read) 1)]
      (if (and (<= 0 linha) (<= linha 2)  (<= 0 coluna) (<= coluna 2) (= (get-in board [linha coluna]) \space))
        (assoc-in board [linha coluna] vez-player)
        (do
          (println "Jogada inválida, favor repetir.")
          (marcaPonto board vez-player))))))



(defn verificaVitoria [board]
  (if (or (and (= (get-in board [0 0]) (get-in board [1 1]) (get-in board [2 2])) (not= (get-in board [0 0]) \space))
          (and (= (get-in board [0 2]) (get-in board [1 1]) (get-in board [2 0])) (not= (get-in board [0 2]) \space)))
    true
   (loop [i 0]
     (if (< i 3)
      (let [linha (get board i)]
        (if (or (and (= (get linha 0) (get linha 1) (get linha 2)) (not= (get linha 0) \space))
                (and (= (get-in board [0 i]) (get-in board [1 i]) (get-in board [2 i])) (not= (get-in board [0 i]) \space)))
          true
          (recur (inc i))))
      false))))


(defn not-space? [caracter]
    (not= \space caracter))


(defn verificaEmpate [board]
    (every? (fn [linha] (every? not-space? linha)) board))


(defn joga [board vezPlayer]
  (println (str "Vez de " vezPlayer " faça sua jogada"))
  (let [novoBoard (marcaPonto board vezPlayer)]
    (printBoard novoBoard)
    (cond
      (verificaVitoria novoBoard) (do (println (str "O player " vezPlayer " ganhou!!")) vezPlayer)
      (verificaEmpate novoBoard) (do (println "Deu empate :p") \_)
      :else (joga novoBoard (if (= vezPlayer \X) \O \X)))))

(defn limpaBuffer []
    (let [apenasLimpaBuffer (read-line)]))


(defn comecaJogo [score1 score2]
  (println "Faça sua escolha: \n(1) jogar\n(2) Ver pontuação dos jogadores\n(3) Sair do jogo")
  (let [escolha (read-line)]
    (flush)
    (case escolha
      "1" (do
            (let [board (inicializa)]
              (printBoard board)
              (let [ganhador (joga board \X)]
                (cond
                  (= ganhador \X) (do (limpaBuffer) (comecaJogo (inc score1) score2))
                  (= ganhador \O) (do (limpaBuffer) (comecaJogo score1 (inc score2)))
                  :else           (comecaJogo score1 score2)))))
      "2" (do
            (mostraPontuacao score1 score2)
            (recur score1 score2))
      "3" (println "Espero você de volta")
      (do
        (println "Escolha inválida, tente novamente.")
        (comecaJogo score1 score2)))))


(defn main[]
  (comecaJogo 0 0))



(main)
