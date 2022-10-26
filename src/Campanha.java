import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Campanha {

    private String nomeCampanha;
    private String entidade;
    private ArrayList<Item> meta = new ArrayList<Item>();
    private String tempo;

    public void CriarCampanha(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome da campanha: ");
        this.nomeCampanha = scan.nextLine();

        System.out.println("Nome da entidade: ");
        this.entidade = scan.nextLine();

        String resposta;
        do{
            System.out.println("O que você pretende arrecadar?: ");
            System.out.println("1 - alimento");
            System.out.println("2 - roupa");
            System.out.println("3 - limpeza");
            System.out.println("4 - construção");
            String tipo = scan.nextLine();

            if (!(Objects.equals(tipo, "1") || Objects.equals(tipo, "2") || Objects.equals(tipo, "3") || Objects.equals(tipo, "4"))){
                do{
                    System.out.println("Comando inválido, digite '1' '2' '3' ou '4' para o que você pretende arrecadar: ");
                    System.out.println("1 - alimento");
                    System.out.println("2 - roupa");
                    System.out.println("3 - limpeza");
                    System.out.println("4 - construção");
                    tipo = scan.nextLine();
                }while(!(Objects.equals(tipo, "1") || Objects.equals(tipo, "2") || Objects.equals(tipo, "3") || Objects.equals(tipo, "4")));
            }

            Item item;
            if (tipo.equals("1")){
                item = new ItemAlimento();
            }else if(tipo.equals("2")){
                item = new ItemRoupa();
            }else if(tipo.equals("3")){
                item = new ItemLimpeza();
            }else{
                item = new ItemConstrucao();
            }

            meta.add(item);
            System.out.println("Sua campanha tem " + meta.size() + " meta");

            System.out.println("Se quiser adicionar outra meta digite 1, senão digite qualquer outra coisa");
            resposta = scan.nextLine();
        }while(Objects.equals(resposta, "1"));

        System.out.println("Prazo: ");
        this.tempo = scan.nextLine();
    }

    public void AlterarPrazo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Novo prazo: ");
        this.tempo = scan.nextLine();
    }

    public void Andamento(){
        for (Item item:meta){
            System.out.println(item.nome+ " : "+ (item.getTotal() - item.quantidade) + "/" + item.quantidade);
            if (item.total == item.quantidade){
                System.out.println(item.nome + "Teve meta batida");
            }
    }}

    public String getNomeCampanha() {
        return nomeCampanha;
    }

    public void setNomeCampanha(String nomeCampanha) {
        this.nomeCampanha = nomeCampanha;
    }

    public String getEntidade() {
        return entidade;
    }

    public void setEntidade(String entidade) {
        this.entidade = entidade;
    }

    public ArrayList<Item> getMeta() {
        return meta;
    }

    public void setMeta(ArrayList<Item> meta) {
        this.meta = meta;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Campanha: " + nomeCampanha + ", " + "Entidade: " + entidade + ", " + "Meta:" + meta.toString() + ", Data final da campanha :" + tempo;
    }
}