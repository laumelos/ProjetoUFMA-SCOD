import java.util.Scanner;

public class User {
    private String nome;
    public User() {}

    public void CriarUser(){
        Scanner scanP = new Scanner (System.in);
        System.out.println("Nome do user: ");
        while (scanP.hasNextInt()) scanP.next();
        this.nome = scanP.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
