/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfriendship;

import java.util.ArrayList;

/**
 *
 * @author Algerit
 */
public class EsFriendship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList sm =new ArrayList();
        StatusMessage status1,status2,status3;
        status1=new StatusMessage("Mario Bianchi","Bologna","Mario è felice",1970);
        status2=new StatusMessage("Michele Rossi","Bologna","Pensa che oggi non può andare peggio di ieri",1975);
        status3=new StatusMessage("Aldo Verdi","Milano","Si diverte un sacco",1980);
        sm.add(status1);
        sm.add(status2);
        sm.add(status3);
        if(status1.isNearTo(status2))
        {
            System.out.println(status1.toString());
            System.out.println(status2.toString());
        }
        if(status1.isNearTo(status3))
        {
            System.out.println(status1.toString());
            System.out.println(status3.toString());
        }
        if(status2.isNearTo(status3))
        {
            System.out.println(status2.toString());
            System.out.println(status3.toString());
        }
        for (int i=0;i<sm.size()-1;i++){
            for(int j=i+1;j<sm.size();j++){
                StatusMessage c1,c2;
                c1=(StatusMessage)sm.get(i);
                c2=(StatusMessage)sm.get(j);
                StatusMessage temp;
                if (c1.compareTo(c2)>0) {
                    temp=c1;
                    sm.set(i,c2);
                    sm.set(j,temp);
                }
                

            }
        }
        for (int i=0;i<sm.size();i++){
            StatusMessage s;
            s=(StatusMessage)sm.get(i);
            System.out.println(s.toString());
        }
    }
    
}
