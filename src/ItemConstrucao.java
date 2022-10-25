import java.util.Scanner;

public class ItemConstrucao extends Item{

    private String unidadeMedida;

    public ItemConstrucao() {
        this.CriarItem();
        Scanner scan = new Scanner(System.in);
        System.out.println("Unidade de medida: ");
        this.unidadeMedida = scan.nextLine();
    }
}