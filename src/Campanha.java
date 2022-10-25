import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Campanha {

    private String nomeCampanha;
    private String entidade;
    private int itensMeta;
    private ArrayList<Item> meta = new ArrayList<Item>();
    private String tempo;

    //public void Campanha(){

    //}


    public void CriarCampanha(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome da campanha: ");
        this.nomeCampanha = scan.nextLine();

        System.out.println("Nome da entidade: ");
        this.entidade = scan.nextLine();

        System.out.println("Meta: ");
        String resposta;
        do{
            Item item = new Item();
            item.CriarItem();
            meta.add(item);

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

    }
    public void EncerrarCampanha(){

    }

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

    public int getItensMeta() {
        return itensMeta;
    }

    public void setItensMeta(int itensMeta) {
        this.itensMeta = itensMeta;
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
        return "Campanha{" +
                "nomeCampanha='" + nomeCampanha + '\'' +
                ", entidade='" + entidade + '\'' +
                ", itensMeta=" + itensMeta +
                ", meta=" + meta +
                ", tempo='" + tempo + '\'' +
                '}';
    }
}