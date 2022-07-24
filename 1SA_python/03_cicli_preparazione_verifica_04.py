"""
4) La prof Benassi è troppo buona e cerca sempre di aiutare i suoi studenti.
Quest'anno ha deciso di non considerare nella m	ia il voto più basso preso dai suoi alunni durante il pentamestre.
Aiuta la prof.ssa Benassi ad aiutare i suoi studenti scrivendo un programma che legge una serie
di voti e stampa la media senza considerare il voto più basso.
Il ciclo di acquisizione termina quando la prof risponde 'N' alla domanda “vuoi continuare?”.
"""

minimo = 10
somma = 0
conta = 0
while True:
	
	V = int(input("Inserisci il voto di mate : "))
	if V < minimo:
		minimo = V
	somma += V
	conta += 1	
	
	
	continua = input("Vuoi continuare ? (S/N)")
	if continua == 'N':
		break
		
# tolgo il voto più basso dalla somma per non calcolarlo nella media
somma_depurata_di_voto_piu_basso = somma - minimo 
# non tengo in considerazione il voto più basso
conta = conta - 1 
		
media = somma_depurata_di_voto_piu_basso/conta

print(f"La media della buona prof.ssa Benassi è {media} calcolando {conta} voti ")
