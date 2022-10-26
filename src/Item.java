import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Item {

    protected String nome;
    protected int quantidade;
    //private int meta;
    protected int total = 0;

    public Item(String nome, int quantidade) {
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
        this.quantidade = scan.nextInt();
        }catch(NumberFormatException e){
            System.out.println("Opção inválida, digite a quantidade: ");
        }

    }
    public void Adicionar(int quantidade){
        this.total = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


}

