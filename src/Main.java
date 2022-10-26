import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean scod = true;
        ArrayList<Campanha>campanhas = new ArrayList<Campanha>();
        ArrayList<Doacao>docaoes = new ArrayList<Doacao>();
        ArrayList<User>users = new ArrayList<User>();

        while (scod)
            try{
                Scanner scanP = new Scanner (System.in);
                System.out.println("Bem vindo ao Sistema para Coleta e Organização de Doações");
                System.out.println("Digite a operação que você deseja realizar");
                System.out.println("1 - campanha");
                System.out.println("2 - doacao");
                System.out.println("3 - usuario");
                System.out.println("qualquer outra coisa - sair do programa");


                String resposta = scanP.nextLine();
                if (Objects.equals(resposta, "1")){
                    System.out.println("1 - criar campanha");
                    System.out.println("2 - alterar prazo da campanha");
                    System.out.println("3 - andamento campanha");
                    System.out.println("4 - encerrar campanha");
                    System.out.println("5 - listar campanhas");
                    resposta = scanP.nextLine();

                    if (!(Objects.equals(resposta, "1") || Objects.equals(resposta, "2") || Objects.equals(resposta, "3") || Objects.equals(resposta, "4") || Objects.equals(resposta, "5"))){
                        do{
                            System.out.println("Comando inválido, igite '1' '2' '3' '4' ou '5' para escolher a opção: ");
                            System.out.println("1 - criar campanha");
                            System.out.println("2 - alterar prazo da campanha");
                            System.out.println("3 - andamento campanha");
                            System.out.println("4 - encerrar campanha");
                            System.out.println("5 - listar campanhas");
                            resposta = scanP.nextLine();
                        }while(!(Objects.equals(resposta, "1") || Objects.equals(resposta, "2") || Objects.equals(resposta, "3") || Objects.equals(resposta, "4") || Objects.equals(resposta, "5")));
                    }

                    if (Objects.equals(resposta, "1")){
                        Campanha campanha = new Campanha();
                        campanha.CriarCampanha();
                        campanhas.add(campanha);
                        System.out.println(campanha);
                    }else if (Objects.equals(resposta, "2")){
                        Scanner scan = new Scanner(System.in);
                        //nome da campanha para alterar
                        System.out.println("Nome da campanha para alteração: ");
                        String nomeCampanhaAlterarPrazo = scan.nextLine();
                        //procurar no array de campanhas *pelo nome da campanha*

                        //alterar a campanha
                        for (Campanha campanha:campanhas){
                            if (Objects.equals(campanha.getNomeCampanha(), nomeCampanhaAlterarPrazo)){
                                campanha.AlterarPrazo();
                            }
                        }
                    }else if (Objects.equals(resposta, "3")){
                        Scanner scan = new Scanner(System.in);
                        //nome da campanha para alterar
                        System.out.println("Nome da campanha para buscar o andamento: ");
                        String nomeCampanhaAcompanharAndamento = scan.nextLine();
                        for (Campanha campanha:campanhas){
                            if (Objects.equals(campanha.getNomeCampanha(), nomeCampanhaAcompanharAndamento)){
                                campanha.Andamento();
                            }
                        }
                    }else if (Objects.equals(resposta, "4")){
                        Scanner scan = new Scanner(System.in);
                        //nome da campanha para alterar
                        System.out.println("Nome da campanha para encerramento: ");
                        String nomeCampanhaAcompanharAndamento = scan.nextLine();
                        for (Campanha campanha:campanhas){
                            if (Objects.equals(campanha.getNomeCampanha(), nomeCampanhaAcompanharAndamento)){
                                campanha.EncerrarCampanha();
                            }
                        }
                    } else if (Objects.equals(resposta, "5")) {
                        for (Campanha campanha : campanhas){
                            System.out.println(campanha.toString());
                        }
                    }

                }else if(Objects.equals(resposta, "2")) {
                    Doacao doacao = new Doacao();
                    doacao.Doacao();
                    docaoes.add(doacao);
                    System.out.println(doacao);

                }else if (Objects.equals(resposta, "3")){
                    User user = new User();
                    user.CriarUser();
                    users.add(user);
                }
                else{
                    scod = false;
                }

            }catch (Exception ignored){
            }
    }
}