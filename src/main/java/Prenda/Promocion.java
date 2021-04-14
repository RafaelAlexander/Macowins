package Prenda;

import java.math.BigDecimal;

public class Promocion implements EstadoDePrenda {
    BigDecimal descuento;

    public Promocion(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal calcularPrecioModificado(BigDecimal precio) {
        return precio.subtract(descuento);
    }
}
