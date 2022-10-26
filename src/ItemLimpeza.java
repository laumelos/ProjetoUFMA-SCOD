import java.util.Objects;
import java.util.Scanner;

public class ItemLimpeza extends Item{

    private String toxico;
    private String unidadeMedida;

    public ItemLimpeza() {
        this.CriarItem();
        Scanner scan = new Scanner(System.in);
        System.out.println("Unidade de medida: ");
        this.unidadeMedida = scan.nextLine();

        System.out.println("Esse produto é tóxico? (sim/nao): ");
        this.toxico = scan.nextLine();

        boolean testeToxico = false;
        while (testeToxico == false){
            if (Objects.equals(toxico, "sim") || Objects.equals(toxico, "nao")){
                testeToxico = true;
            }
            else{
                System.out.println("Código inválido, Esse produto é tóxico? (digite 'sim' ou 'nao'): ");
                this.toxico = scan.nextLine();
            }
        }
    }

    @Override
    public String toString() {
        return "Tipo: Limpeza, " + "Tóxico: " + toxico + ", " + "Itens: " + quantidade + ' ' + unidadeMedida + " de " + nome;
    }
}