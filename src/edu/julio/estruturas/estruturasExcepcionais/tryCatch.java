package estruturasExcepcionais;
import java.util.Locale;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " +nome +" " + sobrenome);
            System.out.println("Tenho "+idade+" anos");
            System.out.println(" Minha altura é "+altura+"cm ");
        }
        catch (java.util.InputMismatchException e){
            System.err.println("Digite um nome de cada vez");
            System.err.println("Os campos idade e altura devem ser numéricos");
            System.err.println("Cm em altura deve ser separado por (.) como no exemplo (1.78)");
        }
    }
}