package ifElseTernariaSwitchCase;
public class sistemaMedida {
    public static void main(String[] args) {
        String sigla = "g";
        switch ( sigla ) {
            case "P":{
            System.out.println("PEQUENO");
            break;
            }
            case "p":{
            System.out.println("PEQUENO");
            break;
            }
            case "M":{
            System.out.println("MÉDIO");
            break;
            }
            case "m":{
            System.out.println("MÉDIO");
            break;
            }
            case "G":{
            System.out.println("GRANDE");
            break;
            }
            case "g":{
            System.out.println("GRANDE");
            break;
            }
            default:
            System.out.println("INDEFINIDO");
        }
    }
}
