public class MinhaClasse {
    // variáveis, exceto "final", sempre minúsculas, porém se for composta (mais de uma palavra), primeira
    //letra da segunda palavra começa maiúscula, se for mais de duas palavras, a partir da segunda palavra,
    //todas inicia-se com maiúscula (camelCase); 

public static void main (String [] args){
    
    //CONTEÚDO STRINGS
    System.out.print ("Olá Mundo");
    final String BR = "Brasil"; //variáveis que não podem ser alteradas. inicia com final e o nome da var é toda maiúscula
    int ano = 1989; //esta variável pode ser alterada
    
    String meuNome = "Julio";
    int anoFabricacao = 2023;
    boolean verdadeira = false; //variável lógica, retorna true ou false
    anoFabricacao = 1989; //alterando o valor de uma variável

    //CONTEÚDOS MÉTODOS

    //int somar (int numeroUm, int numero2); //um método pode receber parâmetros de tipos diferentes
    //String formatarCep (long cep);
}

}
/* String BR = "Brasil;
 * double PI = 3.14;
 * int ESTADOS_BRASILEIRO = 27;
 * INT ANO_2000 = 2000;
 * 
 * Devem conter apenas letras, _ (underline), $ ou os números de 0 a 9
 * Deve obrigatóriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número
 * Deve iniciar com uma letra minúscula (boa prática)
 * Não pode conter espaços
 * Não podemos usar palavras-chave da linguagem
 * O nome deve ser único dentro de um escopo
 * estrutura das variáveis = Tipo + NomeBemDefinido = Atribuição (opcional em alguns casos)
*/