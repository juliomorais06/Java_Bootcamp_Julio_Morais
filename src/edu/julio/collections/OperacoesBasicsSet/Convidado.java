package collections.OperacoesBasicasSet;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }
    public String getNome(){
        return nome;
    }
    public int getCodigoConvite() {
        return codigoConvite;
    }
    //Método equals and hashCode
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }
    
    public String toString() {
        return "Nome: " + nome + " / Código do convite: " + codigoConvite; 
    }
}
