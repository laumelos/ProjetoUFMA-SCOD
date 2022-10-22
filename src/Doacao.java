import java.util.Scanner;

public class Doacao {

    protected String pessoa;
    protected Itens nome;
    protected Itens quantidade;
    protected Itens unidadeMedida;

    public Doacao(String pessoa, Itens nome, Itens quantidade, Itens unidadeMedida) {
        this.pessoa = pessoa;
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

    public static String doar(String pessoa, Itens nome, Itens quantidade, Itens unidadeMedida) {
        Scanner doacao = new Scanner (System.in);
        System.out.println("Doação:");
        String txtdoacao = doacao.next();
        System.out.println(txtdoacao);
    }
}
