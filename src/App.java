public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono!");
        
        Exercicio ex = new Exercicio("kiko", "Exercicio de aquecimento, imitando o kiko", "sons/kiko.mp3", 3);
        System.out.println("Nome: "+ex.getNome());
        System.out.println("Descrição: "+ex.getDescricao());
        System.out.println("Som: "+ex.getSom());
        System.out.println("emMin: "+ex.getTempoMin());
        
        Exercicio ex1 = new Exercicio("Boca de peixe", "Encoste os lábios firmemente e faça movimentos de abrir e fechar como um peixe.", "sons/peixe.mp3", 3);
        System.out.println("Nome: "+ex1.getNome());
        System.out.println("Descrição: "+ex1.getDescricao());
        System.out.println("Som: "+ex1.getSom());
        System.out.println("emMin: "+ex1.getTempoMin());
        
        Exercicio ex2 = new Exercicio("Sons do Sibilante", "Pronuncie repetidamente os sons “s” e “z” de forma clara e pausada.", "sons/sibilante.mp3", 2);
        System.out.println("Nome: "+ex2.getNome());
        System.out.println("Descrição: "+ex2.getDescricao());
        System.out.println("Som: "+ex2.getSom());
        System.out.println("emMin: "+ex2.getTempoMin());
        
        Exercicio ex3 = new Exercicio("Empurra Língua", "Empurre a língua contra o céu da boca e mantenha por alguns segundos antes de relaxar.", "sons/lingua.mp3", 3);
        System.out.println("Nome: "+ex3.getNome());
        System.out.println("Descrição: "+ex3.getDescricao());
        System.out.println("Som: "+ex3.getSom());
        System.out.println("emMin: "+ex3.getTempoMin());


        Paciente p1 = new Paciente("Caio Leal ","caiolealvargas06@gmail.com");
       System.out.println("Nome do Paciente: "+p1.getNome());
       System.out.println("email: "+p1.getEmail());

       Paciente p2 = new Paciente("Romulo atacante ","romuloatacante123@gmail.com");
       System.out.println("Nome do Paciente: "+p2.getNome());
       System.out.println("email: "+p2.getEmail());

        Clinica cl1 = new Clinica("00987","FonoVida", "12.345.678/0001-90");
        System.out.println("Nome da Clínica: "+cl1.getNome());
        System.out.println("CNPJ: "+cl1.getCnpj());
        
       
   }
}



    

//construtor é default