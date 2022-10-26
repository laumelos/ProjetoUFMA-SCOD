import java.util.Scanner;

public class ItemConstrucao extends Item{

    private String unidadeMedida;

    public ItemConstrucao() {
        this.CriarItem();
        Scanner scan = new Scanner(System.in);
        System.out.println("Unidade de medida: ");
        while (scan.hasNextInt()) scan.next();
        this.unidadeMedida = scan.nextLine();
    }

    @Override
    public String toString() {
        return "Tipo: Construção, " + "Itens: " + quantidade + ' ' + unidadeMedida + " de " + nome + "|";
    }
}