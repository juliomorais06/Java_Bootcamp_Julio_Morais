public class opternario {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        String resultado = "";
        if(a==b)
            resultado = "Verdadeiro";
        else 
            resultado = "Falso";

        System.out.println(resultado);

        //if pode ser substituído nesse caso pelo operador ternario

        int c = 6;
        int d = 6;

        String resultado2 = c==d ?"verdadeiro" : "falso";
        System.out.println(resultado2);
    }
}
/*é representado por ?:
<Expressao Condicional> ? <Caso condicao seja true> : <Caso condicao seja false>
A condição imposta sempre será booleana(retorna true ou false);
*/ 