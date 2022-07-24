/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfriendship;

/**
 *
 * @author Algerit
 */
public class StatusMessage implements Friendship,Comparable{
    public String username;
    public String city;
    public String text;
    public int anno;
public StatusMessage(String username,String city,String text,int anno){
    this.username=username;
    this.city=city;
    this.text=text;
    this.anno=anno;
}
public String toString(){
    return("username:"+username+"\ncity:"+city+"\ntext:"+text+"\nanno:"+anno);
}
public boolean isNearTo(Friendship x){
    StatusMessage s=(StatusMessage)x;
    if (city==s.city) return true;
    else return false;
}
public int compareTo(Object o){
    StatusMessage s=(StatusMessage)o;
    return username.compareTo(s.username);
}
}
