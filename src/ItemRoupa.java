import java.util.Objects;
import java.util.Scanner;

public class ItemRoupa extends Item{

    private String tamanho;
    private String unidadeMedida = "unidades";

    public ItemRoupa() {
        this.CriarItem();
        Scanner scan = new Scanner(System.in);
        System.out.println("Tamanho da Roupa (P/M/G): ");
        this.tamanho = scan.nextLine();

        boolean testeTamanho = false;
        while (testeTamanho == false){
            if (Objects.equals(tamanho, "P") || Objects.equals(tamanho, "M") || Objects.equals(tamanho, "G")){
                testeTamanho = true;
            }
            else{
                System.out.println("Código inválido, tamanho da roupa (P/M/G): ");
                this.tamanho = scan.nextLine();
            }
        }
    }

    @Override
    public String toString() {
        return "Tipo: Roupa, " + "Tamanho: " + tamanho + ", " + "Itens: " + quantidade + ' ' + unidadeMedida + " de " + nome;
    }
}
