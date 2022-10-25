import java.util.Scanner;

public class ItemRoupa extends Item{

    private String tamanho;

    public ItemRoupa() {
        this.CriarItem();
        Scanner scan = new Scanner(System.in);
        System.out.println("Tamanho da Roupa: ");
        this.tamanho = scan.nextLine();
    }
}
