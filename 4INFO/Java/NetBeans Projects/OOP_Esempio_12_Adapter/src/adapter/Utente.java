package adapter;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
class Utente {

    private String nome;
    private String cognome;
    private String password;
    
    Utente(String nome, String cognome, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    
}
