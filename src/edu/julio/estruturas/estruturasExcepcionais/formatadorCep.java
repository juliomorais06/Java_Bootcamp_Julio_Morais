package estruturasExcepcionais;
public class formatadorCep {
    public static void main(String[] args) {
        try {
        final String cepFormatado = formatarCep("445887");
        System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não correponde com as regras de negócio");   
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

            //simulando um cep formatado
            return "23.765-064";
    }
}
