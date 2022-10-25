import java.util.Scanner;

public class ItemAlimento extends Item{

    private String perecivel;
    private String unidadeMedida = "KG";

    public ItemAlimento() {
        Scanner scan = new Scanner(System.in);
        this.CriarItem();

        System.out.println("É perecível (s/n): ");
        this.perecivel = scan.nextLine();
    }

    public String getPerecivel() {
        return perecivel;
    }

    public void setPerecivel(String perecivel) {
        this.perecivel = perecivel;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
}
