import java.util.Scanner;

public class Teste5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String entrada = sc.nextLine();

        String saida = "";

        for (int i = entrada.length() - 1; i >= 0; i--) {
            saida += entrada.charAt(i);
        }

        System.out.println("Frase invertida: " + saida);

        sc.close();
    }
}