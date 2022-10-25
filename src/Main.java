import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    ArrayList<Campanha>campanhas = new ArrayList<Campanha>();
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
                        Scanner scan = new Scanner(System.in);
                        //nome da campanha para alterar
                        System.out.println("Nome da campanha para alteração: ");
                        String nomeCampanhaAlterarPrazo = scan.nextLine();
                        //procurar no array de campanhas *pelo nome da campanha*

                        //alterar a campanha
                        for (Campanha campanha:campanhas){
                            if (campanha.getNomeCampanha() == nomeCampanhaAlterarPrazo){
                                campanha.AlterarPrazo();
                            }
                        }
                    }
                    if (resposta=="3"){
                        Scanner scan = new Scanner(System.in);
                        //nome da campanha para alterar
                        System.out.println("Nome da campanha para buscar o andamento: ");
                        String nomeCampanhaAcompanharAndamento = scan.nextLine();
                        for (Campanha campanha:campanhas){
                            if (campanha.getNomeCampanha() == nomeCampanhaAcompanharAndamento){
                                campanha.Andamento();
                            }
                        }
                    }
                    if (resposta=="4"){
                        Scanner scan = new Scanner(System.in);
                        //nome da campanha para alterar
                        System.out.println("Nome da campanha para encerramento: ");
                        String nomeCampanhaAcompanharAndamento = scan.nextLine();
                        for (Campanha campanha:campanhas){
                            if (campanha.getNomeCampanha() == nomeCampanhaAcompanharAndamento){
                                campanha.EncerrarCampanha();
                            }
                        }
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