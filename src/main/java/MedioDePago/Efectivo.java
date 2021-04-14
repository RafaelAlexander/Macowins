package MedioDePago;

import java.math.BigDecimal;

public class Efectivo implements MedioDePago{
    public BigDecimal calculoDePrecioFinal(BigDecimal precio) {
        return precio;
    }
}
