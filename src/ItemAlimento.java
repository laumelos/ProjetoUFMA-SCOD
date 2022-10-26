import java.util.Objects;
import java.util.Scanner;

public class ItemAlimento extends Item{

    private String perecivel;
    private String unidadeMedida = "kg";

    public ItemAlimento() {
        Scanner scan = new Scanner(System.in);
        this.CriarItem();

        System.out.println("É perecível? (sim/nao): ");
        this.perecivel = scan.nextLine();
        boolean testePerecivel = false;
        while (testePerecivel == false){
            if (Objects.equals(perecivel, "sim") || Objects.equals(perecivel, "nao")){
                testePerecivel = true;
                }
            else{
                System.out.println("Código inválido, é perecível? (digite 'sim' ou 'nao'): ");
                this.perecivel = scan.nextLine();
            }
        }
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

    @Override
    public String toString() {
        return "Tipo: Alimento, " + "Perecível: " + perecivel + ", " + "Itens: " + quantidade + ' ' + unidadeMedida + " de " + nome;
    }

}
