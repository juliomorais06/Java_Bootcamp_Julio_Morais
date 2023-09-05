public class incremento {
    public static void main(String[] args) {
        int numero = 6;
        numero = numero +2;
        System.out.println(numero);

        int numero2 = 5;
        System.out.println(++ numero2);

        int numero3 = 13;
        System.out.println(-- numero3);

        boolean variavel = true;
        System.out.println(!variavel);//muda o valor dessa variável somente no momento da impressão
        System.out.println(variavel);

        variavel = !variavel;//aqui sim estamos negando o valor
        System.out.println(variavel);
    }
}
