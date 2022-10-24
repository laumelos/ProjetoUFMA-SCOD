import java.util.Scanner;
import java.lang.*;

public class Doacao {

    protected String pessoa;
    protected Item nome;
    protected Item quantidade;
    protected Item unidadeMedida;

    public Doacao() {

    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }


    public Item getNome() {
        return nome;
    }

    public void setNome(Item nome) {
        this.nome = nome;
    }

    public Item getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Item quantidade) {
        this.quantidade = quantidade;
    }

    public Item getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(Item unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }


    public static void doar(String pessoa, Item nome, Item quantidade, Item unidadeMedida) {
        String[]nomeItem = {};
        System.out.println(nomeItem);

        nomeItem = addItens(nomeItem);
    }

    //add palavra ao array
    public static String[] addItens(String[] nomeItem){

        //novo array com novo tamanho
        String[]maisNomeitem = new String[nomeItem.length+1];

        //copiar elementos do array original
        for(int i = 0; i < nomeItem.length; i++){
            maisNomeitem[i] = nomeItem[i];
        }
        Scanner scanP = new Scanner (System.in);

        System.out.println("new Nome:");
        maisNomeitem[maisNomeitem.length - 1] = scanP.nextLine();

        return maisNomeitem;


    }
}
