import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.lang.*;

public class Doacao {

    private String pessoa;
    private String nomeItem;
    private String quantidade;

    ArrayList<Item> estoque = new ArrayList<Item>();

    public void Doacao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pessoa: ");
        this.pessoa = scan.nextLine();

        String resposta;
        do{

            System.out.println("Tipo do item: ");
            System.out.println("1 - alimento");
            System.out.println("2 - roupa");
            System.out.println("3 - limpeza");
            System.out.println("4 - construção");
            String tipo = scan.nextLine();

            if (tipo.equals("1")){
                Item item = new ItemAlimento();
                estoque.add(item);
            }else if(tipo.equals("2")){
                Item item = new ItemRoupa();
                estoque.add(item);
            }else if(tipo.equals("3")){
                Item item = new ItemLimpeza();
                estoque.add(item);
            }else if(tipo.equals("4")){
                Item item = new ItemConstrucao();
                estoque.add(item);
            }
            System.out.println(estoque.size());
            System.out.println("Se quiser doar outro item digite 1, senão digite qualquer outra coisa");
            resposta = scan.nextLine();
        }while(Objects.equals(resposta, "1"));
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<Item> getEstoque() {
        return estoque;
    }

    public void setEstoque(ArrayList<Item> estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Doacao{" +
                "pessoa='" + pessoa + '\'' +
                ", nomeItem='" + nomeItem + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", estoque=" + estoque +
                '}';
    }
}
