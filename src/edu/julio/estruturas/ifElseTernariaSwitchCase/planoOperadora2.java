package ifElseTernariaSwitchCase;
public class planoOperadora2 {
    public static void main(String[] args) {
        String plano = "B";

        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
            }
            case "M": {
                System.out.println("Whatts e Instagram Grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
