import java.util.ArrayList;

public class Campanha {

    protected String nome;
    protected String entidade;
    protected ArrayList<Itens> meta;
    protected String tempo;

    public Campanha(String nome,String entidade, ArrayList<Itens> meta, String tempo) {
        this.nome = nome;
        this.entidade = entidade;
        this.meta = meta;
        this.tempo = tempo;
    }

    public Campanha() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEntidade() {
        return entidade;
    }

    public void setEntidade(String nome) {
        this.nome = entidade;
    }

    public ArrayList<Itens> getMeta() {
        return meta;
    }

    public void setMeta(ArrayList<Itens> meta) {
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
                "nome='" + nome + '\'' +
                ", meta=" + meta +
                ", tempo='" + tempo + '\'' +
                '}';
    }
}
