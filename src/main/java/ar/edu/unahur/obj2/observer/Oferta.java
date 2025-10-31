package ar.edu.unahur.obj2.observer;

public class Oferta {
    private final Integer valor;
    private final Subastador ofertante;

    public Oferta(Integer valor, Subastador ofertante) {
        this.valor = valor;
        this.ofertante = ofertante;
    }

    public Integer getValor() {
        return valor;
    }

    public Subastador getOfertante() {
        return ofertante;
    }

    
}
