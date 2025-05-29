
public class Paciente {
    private String nome;
    private String email;
    private String som ;
    private String tempo;
    
    public Paciente(String nome, String email ) {
        this.nome = nome;
        this.email = email;
      
    }
    public void setNome(String nome){
        this.nome = nome;

    }
    public String getNome() {
        return nome;
    
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSom() {
        return som;
    }
    public void setSom(String som) {
        this.som = som;
    }
    public String getTempo() {
        return tempo;
    }
    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    
}
