package sintaxe;

public class Metodos {
    
public static void main (String [] args) {

    String primeiroNome = "Julio";
    String segundoNome = "Morais";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}

//CONTEÚDOS MÉTODOS

    /*int somas (int numeroUm, int numero2) //um método pode receber parâmetros de tipos diferentes
    String formatarCep (long cep)
    estrutura dos métodos = TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
    */
