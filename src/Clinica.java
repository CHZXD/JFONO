public class Clinica {
    private String id;
    private String nome;
    private String cnpj;
    
    public Clinica(String id, String nome, String cnpj) {
        this.id= id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}