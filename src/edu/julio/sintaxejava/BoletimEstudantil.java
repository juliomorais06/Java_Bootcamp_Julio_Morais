public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if(mediaFinal<6)
            System.out.println("REPROVADO");
        else if(mediaFinal==6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
    
}

/*uma das maiores dificuldades na programação é escrever algorítmos
legíveis a níveis que sejam compreendidos por todo o seu time ou por
você mesmo no futuro. Para isso a linguagem Java sugere, através de conveções,
formas de escrita universal para nossa classes , atributos,
métodos e pacotes.

Variáveis exemplos conversões:

    double salarioMedio = 1500.23;
    String email = "julio.fariasmorais@hotmail.com";
    String [] emails = {"julio.fmorais@hotmail.com","angelejuh@hotmail.com"};
    String meuNome = "Julio";

Métodos exemplos convensões:

    somar(int n1, int n2){} 
    abrirConexao(){}
    concluirProcessamento(){}
    findById(int id){} apesar de ser em português os outros métodos,
                    este é um método pronto chamado de uma biblioteca.

    
