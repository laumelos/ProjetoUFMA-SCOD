import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.lang.*;

public class Doacao {

    private String pessoa;
    private String nomeItem;
    private int quantidade;
    protected int itensDoados;

    ArrayList<Item> estoque = new ArrayList<Item>();

    public void Doacao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Doador: ");
        this.pessoa = scan.nextLine();

        String resposta;
        int itensDoados = 0;
        do{

            System.out.println("Tipo do item a ser doado: ");
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
            estoque.add(item);
            itensDoados ++;
            System.out.println(itensDoados);
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
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
        return "Doador: " + pessoa + ", " + "Itens doados: " + estoque.toString();
    }
}
