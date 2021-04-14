package MedioDePago;

import java.math.BigDecimal;

public class TarjetaDeDebito implements MedioDePago{
    public BigDecimal calculoDePrecioFinal(BigDecimal precio) {
        return precio;
    }
}
