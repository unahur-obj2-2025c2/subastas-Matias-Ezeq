package ar.edu.unahur.obj2.observer;

import java.util.ArrayList;
import java.util.List;

public class ProductoSubastado {
    private final String producto;
    private List<Oferta> ofertas;
    private List<Subastador> subscriptores;

    public ProductoSubastado(String producto) {
        this.producto = producto;
        this.ofertas = new ArrayList<>();
        this.subscriptores = new ArrayList<>();
    }

    public void agregarSubastador(Subastador subastador) {
        this.subscriptores.add(subastador);
    }

    public void agregarOferta(Oferta oferta) {
        this.ofertas.add(oferta);
        this.subscriptores.forEach(s -> s.actualizar(ofertas.getLast()));
    }

    public void resetearSubasta() {
        this.ofertas.clear();
        this.subscriptores.clear();
    }


    
}
