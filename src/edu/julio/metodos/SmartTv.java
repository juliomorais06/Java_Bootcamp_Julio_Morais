//PROJETO SISTEMA SMART TV
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);
    }
    public void mudarCanal(int escolhaCanal){
        canal = escolhaCanal;
        System.out.println("Você mudou o canal para: " + canal);
    }
    //Usuario SmartTv
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(33);

        System.out.println("Atualmente você está no canal: " + smartTv.canal);
    }
}
/* Não existe em Java o conceito de métodos globais.
 * 
 * Todos os métodos devem sempre ser definidos dentro de uma classe.
 * 
 * Caso o método não retorne nenhum valor, será representado pela 
 * palavra void.
 * 
 * 
 */