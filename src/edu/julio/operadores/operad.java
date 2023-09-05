public class operad {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem "+"Java.";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        concatenacao = 1+1+1+"1"; //concatena somente a String
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1; //quando reconhece a String passa a concatenar todos
        System.out.println(concatenacao);
    }
}
/* Operador   |    Comparação
 *   ==       |       igual
 *   !=       |       diferente
 *   <        |       menor
 *   >        |       maior
 *   <=       |       menor igual
 *   >=       |       maior igual
 * ______________________________
 * 
 * Operador de atribuição  =  (serve para colocar valor à variável ou altera-lo)
 * Date dataNascimento = new Date(); para criação de objetos
 * Operadores aritméticos +, -, /, * e %(resto da divisão);
 * 
 * O operador + com Strings faz a concatenação
 */