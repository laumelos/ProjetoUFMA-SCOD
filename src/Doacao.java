import java.util.Scanner;
import java.lang.*;

public class Doacao {

    protected String pessoa;

    protected String entidade;
    protected Itens nome;
    protected Itens quantidade;
    protected Itens unidadeMedida;

    public Doacao(String pessoa, String entidade, Itens nome, Itens quantidade, Itens unidadeMedida) {
        this.pessoa = pessoa;
        this.entidade = entidade;
        this.nome = nome;
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getEntidade() {
        return pessoa;
    }

    public void setEntidade(String entidade) {
        this.pessoa = pessoa;
    }

    public Itens getNome() {
        return nome;
    }

    public void setNome(Itens nome) {
        this.nome = nome;
    }

    public Itens getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Itens quantidade) {
        this.quantidade = quantidade;
    }

    public Itens getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(Itens unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }


    public static void doar(String pessoa, Itens nome, Itens quantidade, Itens unidadeMedida) {
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
