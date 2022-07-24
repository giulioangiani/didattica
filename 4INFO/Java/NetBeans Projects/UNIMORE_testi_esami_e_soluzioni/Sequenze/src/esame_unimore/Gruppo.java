package esame;

import java.util.ArrayList;

public class Gruppo {
	String nome;
	ArrayList<Sequenza> sequenze;
	
	public Gruppo(String nome){
		this.nome = nome;
		sequenze = new ArrayList<>();
	}
	
	
	public boolean equals(Object g) { 
		return this.nome.equals(((Gruppo)g).nome);
	}

	public boolean haStessiVettori(Gruppo g) {
		for(Sequenza s : g.sequenze)
			if(!this.contiene(s)) return false;
		for(Sequenza s : this.sequenze)
			if(!g.contiene(s)) return false;
		return true;
	}
	public boolean contiene(Sequenza s) {
		for(Sequenza io : this.sequenze) {
			if(io.equals(s))
				return true;
		}
		return false;
	}
	
	public int ContNumDispari(){
		int cont = 0;
		for(Sequenza seq: sequenze)
			for(Integer n: seq.sequenza)		
				if(n%2!=0)
					cont++;
		return cont;
	}
	
	public int ContNumPari(){
		int cont = 0;
		for(Sequenza seq: sequenze)
			for(Integer n: seq.sequenza)
				if(n%2 == 0)
					cont++;
		return cont;
	}
	
	public boolean MatQuadrata(){
		boolean q = true;
		int lrow = sequenze.get(0).sequenza.size();
		for(Sequenza seq: sequenze)
			if(seq.sequenza.size()!=lrow){
				q = false;
				return q;
			}
		if(sequenze.size()!=lrow){
			q = false;
			return q;
		}
		return q;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(nome+":\n");
		for(Sequenza seq: sequenze)
			sb.append(seq+"\n");
		return sb.toString();
	}

}


