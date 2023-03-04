import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int fibAnt = 0;
        int fibAtual = 1;
        boolean pertence = false;

        while (fibAtual <= num) {
            if (fibAtual == num) {
                pertence = true;
                break;
            }
            int fibProx = fibAnt + fibAtual;
            fibAnt = fibAtual;
            fibAtual = fibProx;
        }

        if (pertence) {
            System.out.printf("O número %d pertence à sequência de Fibonacci.", num);
        } else {
            System.out.printf("O número %d não pertence à sequência de Fibonacci.", num);
        }

        sc.close();
    }
}
