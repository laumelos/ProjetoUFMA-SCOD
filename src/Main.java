
import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class Main {

   public void main(String[] args) {
       while (true)
        try{
            Scanner scanP = new Scanner (System.in);
            System.out.println("bem vindo blablabla");

            System.out.println("1 - campanha");
            System.out.println("2 - doacao");
            System.out.println("3 - usuario");

            String resposta = scanP.nextLine();
            if (resposta == "1"){
                System.out.println("1 - criar campanha");
                System.out.println("2 - alterar prazo da campanha");
                System.out.println("3 - andamento campanha");
                System.out.println("4 - encerrar campanha");
                resposta = scanP.nextLine();

                if (resposta=="1"){
                    Campanha campanha = new Campanha();
                    campanha.CriarCampanha();
                    this.campanhas.add(campanha);
                }
                if (resposta=="2"){
                    //nome da campanha para alterar
                    Campanha campanha = new Campanha();
                    campanha.AlterarPrazo();

                    //procurar no array de campanhas **pelo nome da campanha**

                    //alterar a campanha

                    System.out.println("Nome da campanha para alteração: ");
                    Scanner scan = new Scanner(System.in);
                    String nomeCampanhaAlterarPrazo = scan.nextLine();
                    int i;
                    for (i=0; i<=campanhas.size(); i++){
                        if (campanha.nomeCampanha == nomeCampanhaAlterarPrazo){
                            String novoTempo = campanha.AlterarPrazo();
                            campanha.setTempo(novoTempo);
                        }

                    }
                }
                if (resposta=="3"){
                    Campanha campanha = new Campanha();
                }
                if (resposta=="4"){
                    Campanha campanha = new Campanha();
                }
            }else if(resposta =="2") {
                Doacao doacao = new Doacao();
            }else if (resposta =="3"){
                User user = new User();
            }

        }catch (Exception e){
        }
    }
}