package esempi;

import java.util.ArrayList;

public class MainErrori {
	
  private static class Prova {
	  int p;
	  public static int c = 0; 
	  public Prova() {
		  p = 10;
	  }
  }
	
  public static void main(String[] args) {

    int x = 0;
    int y = 2;
    //System.out.println(">>>" + y/x);
   
	int[] v = new int[] {1,2,3,4,5};
	System.out.println(">>>" + v[2]);
	
	//Object k = new Integer(0);
    //System.out.println((String)k);

	Object obj = new Prova();
	System.out.println(obj.toString());
	ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        System.out.println(a.size());
        
        
	Gatto g = new Gatto();
	Pet p = (Pet)g;
        System.out.println(">" + p.getPetName());
        System.out.println(">" + g.getPetName());
  }
}
