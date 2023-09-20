package pilaresPoo.exemploInterface;

public class fabrica {
    public static void main(String[] args) {
        multifuncional deskjet = new multifuncional();
        
        impressora impressora = deskjet;
        copiadora copiadora = deskjet;
        digitalizadora digitalizadora = deskjet;

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
    }
}
