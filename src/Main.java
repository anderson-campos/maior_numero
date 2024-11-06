import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char resposta;

        do{
            System.out.print("Digite o primeiro numero: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo numero: ");
            int num2 = scanner.nextInt();

            System.out.print("Digite o terceiro numero: ");
            int num3 = scanner.nextInt();

            int comparador = maiorNumero.numeral(num1, num2, num3);

            System.out.println("O maior numero é: " + comparador);
            System.out.println("---------------------------------------------------------------------");

            System.out.print("Deseja continuar? (s/n) ");
            resposta = scanner.next().charAt(0);

        } while (resposta == 's' || resposta == 'S');

        System.out.println("Programa finalizado!");
        System.out.println("---------------------------------------------------------------------");
        scanner.close();
    }
}
