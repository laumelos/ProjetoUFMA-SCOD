import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Item {

    protected String nome;
    protected String quantidade;
    //private int meta;
    protected int total = 0;

    public Item(String nome, String quantidade) {
        this.nome = nome;
        this.quantidade= quantidade;
    }
    public Item() {
    }


    public void CriarItem(){
        Scanner scan = new Scanner(System.in);

        //try {
            System.out.println("Nome do item: ");
            this.nome = scan.nextLine();
            //}catch();
        try {
        System.out.println("Quantidade: ");
        this.quantidade = scan.nextLine();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


}

