package fundamentosPoo.sistemaDeCadastro;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos","060-060");
        marcos.setEndereco("Rua Vergílio Perin 467");
        System.out.println(marcos.getNome() + " CPF " + marcos.getCpf());
        System.out.println(marcos.getEndereco());

        Pessoa angelica = new Pessoa();
        angelica.setNome("Angélica Ichikawa");
        System.out.println(angelica.getNome());
    }
}
