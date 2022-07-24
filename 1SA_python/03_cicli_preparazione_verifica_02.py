"""
2) Acquisisci un numero intero positivo N e stampa a video se è o no un numero primo
es: N = 25  => stampa NO
      N = 113 => stampa SI
"""
import time	# libreria per gestione di tempo e date

inizio = time.time() # timestamp inizio programma: sono i secondi trascorsi dalle 00:00:00 del 01/01/1970


# il ciclo while True intorno all'istruzione 
# costituiisce un controllo dell'input
# finché l'utente non avrà inserito un numero positivo non potrà continuare
while True:
	N = int(input("Inserisci un numero N positivo : "))
	if N > 0:
		break
	print("Numero non valido. Riprova")

# ciclo da 2 a radice quadrata di N perché 1 divide sicuramente N
# e se esiste almeno un divisore di N è al massimo pari alla sua radice quadrata

import math
# calcolo la radice quadrata del numero N
radquad = math.sqrt(N)
# fisso il limite del for al primo intero superiore alla radice quadrata
limite_superiore = int(radquad) + 1

contadivisori = 0
for i in range(2, limite_superiore): 
	if N % i == 0:
		contadivisori += 1
		print(f"Il numero {i} è un divisore di {N}")
		
if contadivisori == 0:
	# non ho trovato divisore fra 1 e radquad
	print(f"Il numero {N} è un numero primo")
else:
	print(f"Il numero {N} NON è un numero primo")
	

fine = time.time() # timestamp fine programma:
print(f"elaborazione terminata in {fine-inizio} secondi")
