package ar.edu.unahur.obj2.observer;

import org.junit.jupiter.api.Test;

public class Etapa1Test {

    @Test
    public void subastadorRecibeLaOferta() {
        ProductoSubastado producto = new ProductoSubastado("Cuadro de Picasso");
        Subastador gonzager = new Subastador("Gonzager");
    }
}
