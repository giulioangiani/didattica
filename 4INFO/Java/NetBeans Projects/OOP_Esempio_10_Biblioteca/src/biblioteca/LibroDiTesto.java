package biblioteca;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
class LibroDiTesto extends Libro {
    private String materia;
    private boolean adozione;

    public LibroDiTesto(String a, String t) {
        //super(a, t);
        //this.adozione = false;
        
        // miglioramento
        // posso usare sempre il costruttore a tre parametri
        // mettendo un default sul parametro mancante
        this(a, t, false);
    }
    
    public LibroDiTesto(String a, String t,boolean inadozione) {
        super(a, t);
        this.adozione = inadozione;
    }

    public String getMateria() {
        return materia;
    }

    public void stampaAutore() {
        System.out.println(this.getAutore());
    }


    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public void cambiaadozione() {
        this.adozione = !this.adozione;
    }

    public boolean adottato() {
        return this.adozione;
    }
    
    
}
