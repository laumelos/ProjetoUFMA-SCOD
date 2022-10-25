import java.util.Scanner;

public class ItemLimpeza extends Item{

    private String unidadeMedida;

    public ItemLimpeza() {
        this.CriarItem();
        Scanner scan = new Scanner(System.in);
        System.out.println("Unidade de medida: ");
        this.unidadeMedida = scan.nextLine();
    }
}