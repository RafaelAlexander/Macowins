package Prenda;

import java.math.BigDecimal;

public class Liquidacion implements EstadoDePrenda{
    public BigDecimal calcularPrecioModificado(BigDecimal precio) {
        return precio.divide(BigDecimal.valueOf(2));
    }
}
