import java.util.ArrayList;

public class Campanha {

    protected String nome;
    protected ArrayList<Itens> meta;
    protected String tempo;

    public Campanha(String nome, ArrayList<Itens> meta, String tempo) {
        this.nome = nome;
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
