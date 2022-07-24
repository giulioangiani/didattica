"""
3) Acquisisci due numeri interi A e B e stampa tutti i pari compresi fra A e B 
es: A = 5 , B = 10 => stampa 6, 8
"""

# il ciclo while True intorno alle istruzione 
# costituisce un controllo dell'input
# finché l'utente non avrà inserito B > A non potrà continuare
while True:
	A = int(input("Inserisci il numero A iniziale : "))
	B = int(input("Inserisci il numero B  finale : "))
	if A < B:
		break
	print("A deve essere minore di B. Riprova")

for i in range(A+1, B): 
	if i % 2 == 0:
		print(f"Il numero {i} è pari")
