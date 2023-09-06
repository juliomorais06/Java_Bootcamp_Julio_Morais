public class escopodecodigo {
    static int idade = 33;
    static String nome = "Julio";

    public static void main(String[] args) {
        System.out.println(nome+" "+idade+" anos");

        idade = 26;
        System.out.println(idade);
    }
   /*   public static void escopodecodigo() {
        int idade = 13;
        System.out.println(idade); //variável só existe neste escopo
    }*/
}
/*Escopo pode ser entendido como sendo o ambiente onde uma variável 
 *pode ser acessada;
 *
 *Identificar a localização mais conveniente para a escrita de 
 * algorítmos necessários para o programa
 * 
 * Escopo de Classe, Escopo de Método e Escopo de fluxo;
 */