public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Exercicio ex = new Exercicio();
        ex.nome = "KIKO";
       ex.descricao= "Exercício de aquecimento,imitar o jonas oscilando";
       ex.tempoMin = 3;
       ex.som = "sons/kiko.mp3";
       
       
       Exercicio ex1 = new Exercicio();
       ex1.nome = "Boca de Peixe";
       ex1.descricao = "Encoste os lábios firmemente e faça movimentos de abrir e fechar como um peixe.";
       ex1.tempoMin = 3;
       ex1.som = "sons/peixe.mp3";

       Exercicio ex2 = new Exercicio();
       ex2.nome = "Sons do Sibilante";
       ex2.descricao = "Pronuncie repetidamente os sons “s” e “z” de forma clara e pausada.";
       ex2.tempoMin = 2;
       ex2.som = "sons/sibilante.mp3";

       Exercicio ex3 = new Exercicio();
       ex3.nome = "Empurra Língua";
       ex3.descricao = "Empurre a língua contra o céu da boca e mantenha por alguns segundos antes de relaxar.";
       ex3.tempoMin = 3;
       ex3.som = "sons/lingua.mp3";

       Paciente p1 = new Paciente();
       p1.email = "emailaleatorio123@gmail.com";
       p1.nome = "José";

       Paciente p2 = new Paciente();
       p2.email = "caiol@gmail.com";
       p2.nome = "Caio";

       Paciente p3 = new Paciente();
       p3.email = "jesus@gmail.com";
       p3.nome = "jesus";
   
       Clinica cl1 = new Clinica();
       cl1.nome = "Fonovidamaluca";
       cl1.cnpj = "12.345.678/0001-90";

       Clinica cl2 = new Clinica();
       cl2.nome = "Clínica Doida ";
       cl2.cnpj = "98.765.432/0001-12";
   }
}



    

//construtor é default