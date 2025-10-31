package ar.edu.unahur.obj2.observer;

public class Subastador {
    private final String nombre;
    private Oferta ultimaOfertaRecibida;

    public Subastador(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar(Oferta oferta) {
        this.ultimaOfertaRecibida = oferta;
    }

    public Oferta getUltimaOfertaRecibida() {
        return this.ultimaOfertaRecibida;
    }

    public void ofertar(ProductoSubastado subasta){
        subasta.agregarOferta(new Oferta((ultimaOfertaRecibida.getValor() + 10), this));
    }
}
