public class tipos {  
    byte idade = 33;
    short ano = 1989;
    int cep = 89089502;
    float pi = 3.14F;
    double salario = 1580.33;

    public static void main(String[] args) {
        int numeroCurto = 1;
        System.out.println(numeroCurto);
    }
}

/* tiposPrimitivos int, byte, short, long, float, double, boolean e char
 * são armazenados diretamente na pilha de memória (memory stack)
 * 
 * Tipos primitivos e seus valores:
 * byte - 1 byte - 128
 * short - 2 byte - 32.768
 * int - 4 bytes - 2.147.483.648
 * long - 8 bytes - 9.223.372.036.854.775.808
 * 
 * Tipos que podem conter partes fracionárias
 * float - 4 bytes - 3,4025E + 38
 * double - 8 bytes - 1,7976E + 308
 * 
 * Declaração de variáveis:
 * <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
  */