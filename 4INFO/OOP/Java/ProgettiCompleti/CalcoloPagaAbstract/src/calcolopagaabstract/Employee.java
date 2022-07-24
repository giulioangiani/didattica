/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolopagaabstract;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author giulio
 */
public abstract class Employee {

    private final String nome;
    private final String cognome;
    private String mansione;
    private GregorianCalendar dataassunzione;
    private float stipendiobase = 1000;

    public Employee(String n, String c) {
        this.nome = n;
        this.cognome = c;
        this.mansione = "Base";
        this.dataassunzione = new GregorianCalendar();
    }

    public Employee(String n, String c, String m) {
        this(n, c);
        this.mansione = m;
    }

    public void setStipendiobase(float stipendiobase) {
        this.stipendiobase = stipendiobase;
    }

    public float getStipendiobase() {
        return stipendiobase;
    }

    public Employee(String n, String c, String m, GregorianCalendar d) {
        this(n, c, m);
        this.dataassunzione = d;
    }

    public abstract float calcolaStipendio();

    @Override
    public abstract String toString();
    
    public final int giorniPermanenza() {
        GregorianCalendar today = new GregorianCalendar();
        return (int)((today.getTimeInMillis()-this.dataassunzione.getTimeInMillis())/1000/3600/24);
    }

    public void setMansione(String mansione) {
        this.mansione = mansione;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMansione() {
        return mansione;
    }

    public GregorianCalendar getDataassunzione() {
        return this.dataassunzione;
    }

}
