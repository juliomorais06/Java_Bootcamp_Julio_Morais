package fundamentosPoo.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno julio = new Aluno();

        julio.nome = "Julio";
        julio.idade = 34;
        julio.setsobreNome("Morais");
        julio.setdataNascimento("06/09/1989");

        System.out.println("O aluno " + julio.nome + " " + julio.getsobreNome() + " tem " + julio.idade + " anos e sua data de nascimento é " + julio.getdataNascimento() + ".");
    }
}
