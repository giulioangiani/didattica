"""
1) Acquisisci un numero intero N positivo e stampa tutti i suoi divisori
es: N = 25  => stampa 1, 2, 5
      N = 16 => stampa 1, 2, 4, 8
"""

# il ciclo while True intorno all'istruzione 
# costituiisce un controllo dell'input
# finché l'utente non avrà inserito un numero positivo non potrà continuare
while True:
	N = int(input("Inserisci un numero N positivo : "))
	if N > 0:
		break
	print("Numero non valido. Riprova")

# ciclo da 2 a N-1 perché 1 ed N dividono sicuramente N
for i in range(2, N): 
	if N % i == 0:
		print(f"{i} è divisore di {N}")
