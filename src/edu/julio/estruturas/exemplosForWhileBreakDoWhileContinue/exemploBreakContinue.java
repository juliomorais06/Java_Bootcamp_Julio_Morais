package exemplosForWhileBreakDoWhileContinue;

public class exemploBreakContinue {
    public static void main(String[] args) {
        for(int numero=1;numero<=10;numero ++){
            if(numero == 3){
                continue;
            }else if(numero == 8)
                break;

            System.out.println(numero);
        }
    }
}
