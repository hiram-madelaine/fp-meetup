(ns meetup)

;┌──────────────────────────────────┐
;│                                  │
;│      Les données littérales      │
;│                                  │
;└──────────────────────────────────┘


; Chaîne de caractères

"Hello world"

"Je suis une chaîne de caractères
sur plusieurs lignes"

;Expressions régulières

#"^Clojure$"


; Les nombres

1
1.23
1.23M
12322323280327983929N
1/5

;┌──────────────────────────────────┐
;│                                  │
;│         Les collections          │
;│                                  │
;└──────────────────────────────────┘

;List
'(1 2 3)

; Vector
[1 2 3]

; Map
{:valeur 1.23M
 :devise :EUR}

; Set
#{1 2 3}
;#{1 2 3 3}

{:valeurs [{:valeur 1.23M
            :devise :EUR}
           {:valeur 1.74M
            :devise :EUR}]}

;┌──────────────────────────────────┐
;│                                  │
;│         Les fonctions !          │
;│                                  │
;└──────────────────────────────────┘


(+ 1 2)

(* 10 6)

(* 3 (+ 1 3))

(/ 2 3)

(< 1 2)

(odd? 1)

(even? 1)



; La notation préfixées a un avantage


(+ 1 2 3 4 5 6 7 8 9)

(< 1 3 2)


;┌──────────────────────────────────┐
;│                                  │
;│    Les fonctions usuelles !      │
;│                                  │
;└──────────────────────────────────┘

; Elles sont le plus souvent d'ordre supérieur
; car elles prennent une fonction en paramètre

(map inc [1 2 3])

(filter odd? '(1 2 3))

(remove even? [1 2 3 4])


(reduce + [1 2 3 4 5 6 7 8 9])
;       ↑
;   fonction de reduction

(reductions + [1 2 3 4 5 6 7 8 9])

(+ (+ (+ (+ (+ (+ (+ (+ 1 2) 3) 4) 5) 6) 7) 8) 9)

;(+ 1 2 3 4 5 6 7 8 9)

(reduce + 100 [1 2 3 4 5 6 7 8 9])
;          ↑
;        Valeur initiale (seed)

(str "a" "b")

(reduce str [\H \e \l \l \o \space \C \l \o \j \u \r \e])


(range 10)

(reduce * (filter odd? (map inc (range 10))))

; Partial / Curry
(def plus-2 (partial + 2))

(plus-2 2)

;┌────────────────────────────┐
;│          Closure           │
;└────────────────────────────┘

(defn plus
  [x]
  (fn [y]
    (+ x y)))
;      ↑
;      La valeur de x est capturée lors de la création de la fonction

((plus 8) 2)

(def plus-8 (plus 8))



(def infini (range))


















