package pilaresPoo.polimorfismo;

import pilaresPoo.polimorfismo.Apps.Facepolimorfismo;
import pilaresPoo.polimorfismo.Apps.Msnpolimorfismo;
import pilaresPoo.polimorfismo.Apps.ServicoMensagemInstantanea;
import pilaresPoo.polimorfismo.Apps.Telegrampolimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        String appEscolhido = "msn";

        if(appEscolhido.equals("face")) {
            smi = new Facepolimorfismo();
        }else if(appEscolhido.equals("msn")){
            smi = new Msnpolimorfismo();
        }else if(appEscolhido.equals("tlg")){
            smi = new Telegrampolimorfismo();
        }
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
