public class oplogicos {
    public static void main(String[] args) {
        boolean condicao1 = false;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }else if(condicao1 || condicao2) {
            System.out.println("uma das condições é verdadeira");
        }else{
            System.out.println("nenhuma condição é verdadeira");
        }
        System.out.println("fim!");

        boolean condicao3 = true;
        if(condicao3 && (13>6)) {
            System.out.println("Expressão lógica(Condição3) e Expressão relacional são verdadeiras");
        }
    }
}
/* && Operador lógico "E"
 * || Operador lógico "OU"
 */