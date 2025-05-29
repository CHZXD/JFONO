public class Exercicio {
   private int id;
   private String nome;
   private String descricao;
   private String som;
   private int emMin;
   private String exemplo;
   
   public Exercicio(String nome, String descricao, String som, int emMin, String exemplo) {
       this.nome = nome;
       this.descricao = descricao;
       this.som = som;
       this.emMin = emMin;
       this.exemplo = exemplo;
   }

   public Exercicio(String nome, String descricao, String som, int emMin) {
       this.nome = nome;
       this.descricao = descricao;
       this.som = som;
       this.emMin = emMin;
   }

   public Exercicio(String nome, String descricao, String exemplo) {
       this.nome = nome;
       this.descricao = descricao;
       this.exemplo = exemplo;
   }

   public int getId() {
      return id;
   }

   public String getNome() {
      return nome;
   }

   public String getDescricao() {
      return descricao;
   }

   public String getSom() {
      return som;
   }

   public int getTempoMin() {
      return emMin;
   }

   public String getExemplo() {
      return exemplo;
   }

   
}   