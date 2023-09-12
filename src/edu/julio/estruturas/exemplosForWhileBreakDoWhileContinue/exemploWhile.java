package exemplosForWhileBreakDoWhileContinue;
import java.util.concurrent.ThreadLocalRandom;

public class exemploWhile {
    public static void main(String[] args) {
        double mesada= 50;

        while(mesada>0){
            double valorDoce= valorAleatorio();

            System.out.println(mesada);
            System.out.println("Doce do valor: "+valorDoce+" Adicionado no carrinho");
            mesada= mesada - valorDoce;
        }
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
