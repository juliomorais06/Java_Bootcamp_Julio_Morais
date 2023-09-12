package ifElseTernariaSwitchCase;
public class condicaoTernaria {
    public static void main(String[] args) {
        int nota = 0;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : nota < 0 ? "Nota inválida" : "Reprovado";
        System.out.println(resultado);
    }
}
