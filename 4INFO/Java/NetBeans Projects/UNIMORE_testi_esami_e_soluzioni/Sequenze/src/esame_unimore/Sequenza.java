package esame;

import java.util.ArrayList;

public class Sequenza {

	ArrayList<Integer> sequenza;
	
	public Sequenza(){
		sequenza = new ArrayList<>();
	}
	
	public boolean TuttiPrimi(){
		boolean primo=true;
		for(Integer n: sequenza)
			for (int i=2; i<n; i++)
				if(n%i==0) {
				primo=false;
				return primo;
			}
		return primo;
	}
	public boolean equals(Sequenza s) {
		if(this.sequenza.size() != s.sequenza.size())
			return false;
		
		for(int i = 0; i < this.sequenza.size(); i++) {
			if(this.sequenza.get(i) != s.sequenza.get(i))
				return false;
		}
		return true;
	}
	public boolean isCrescente() {
		int index = 0;
		for(; index < this.sequenza.size()-1; index++) {
			if(this.sequenza.get(index) >= this.sequenza.get(index+1))
				return false;
		}
		return true;
	}
	
	
	
	
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		for(Integer num: sequenza)
			sb.append(num+",");
		if(sb.length() > 0) {
			sb.deleteCharAt(sb.length()-1);
		}
		return sb.toString();
	}
	public static int sommaElementi(Sequenza s) {
		int somma = 0;
		for(int el : s.sequenza) {
			somma+=el;
		}
		return somma;
	}
	public static boolean hannoStessiElementi(Sequenza s, Sequenza s2) {
		for(int el : s.sequenza) {
			if(!s2.sequenza.contains(el))
				return false;
		}
		for(int el : s2.sequenza) {
			if(!s.sequenza.contains(el))
				return false;
		}
		return true;
	}
}


