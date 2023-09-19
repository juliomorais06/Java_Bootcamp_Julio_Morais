package fundamentosPoo.escola;

public class Aluno {
    int idade;
    String nome;
    private String dataNascimento;
    private String sobreNome;

    public String getsobreNome() {
        return sobreNome;
    }
    public void setsobreNome(String newsobreNome) {
        sobreNome = newsobreNome;
    }
    public String getdataNascimento() {
        return dataNascimento;
    }
    public void setdataNascimento(String newdataNascimento) {
        dataNascimento = newdataNascimento;
    }
}
