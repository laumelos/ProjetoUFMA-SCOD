import java.util.Scanner;

public class Item {

    private String nome;
    private String unidadeMedida;
    private int meta;
    private int total = 0;

    public Item() {

    }

    public void CriarItem(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome do item: ");
        this.nome = scan.nextLine();

        System.out.println("Unidade de medida: ");
        this.unidadeMedida = scan.nextLine();

        System.out.println("Meta do item: ");
        this.meta = scan.nextInt();
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + " " + unidadeMedida + '\'' +
                ", meta=" + meta +
                ", Quantidade arrecadada=" + total +
                '}';
    }
}
