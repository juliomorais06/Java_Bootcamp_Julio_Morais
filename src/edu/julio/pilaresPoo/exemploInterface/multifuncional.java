package pilaresPoo.exemploInterface;

public class multifuncional implements copiadora, digitalizadora, impressora {
    public void copiar() {
        System.out.println("Copiando via equipamento multifncional");
    }
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifncional");
    }
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifncional");
    }
}