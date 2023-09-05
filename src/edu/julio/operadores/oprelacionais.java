public class oprelacionais {
    public static void main(String[] args) {
        String nome1 = "Julio";
        String nome2 = "Julio";
        boolean comparacao = nome1 == nome2;
        System.out.println("nomeUm é igual a nomeDois? "+comparacao);

        String nome3 = "Morais";
        String nome4 = new String("Morais");
        boolean comparacao2 = nome3 == nome4;//retorna-rá false
        System.out.println("nomeTrês é igual a nomeQuatro? "+comparacao2);
        //para comparação de objetos ou textos se utiliza o método chamado equals
        
        //Método equals p/ comparar String ou Objetos
        String nome5 = "Ichikawa";
        String nome6 = new String("Ichikawa");
        boolean comparacao3 = nome5.equals(nome6);
        System.out.println("nomeCinco é igual a nomeSeis? "+comparacao3);
        //equals pode ser colocado na hora da impressão
        System.out.println("equals direto na impressão: "+nome5.equals(nome6));


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2) {
            System.out.println("A nossa condição é verdadeira");
        }
        System.out.println("numeroUm é igual a numeroDois? "+simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente a numeroDois? "+simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior a numeroDois? "+simNao);
    }
}
