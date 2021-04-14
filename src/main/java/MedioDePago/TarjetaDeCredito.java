package MedioDePago;

import java.math.BigDecimal;

public class TarjetaDeCredito implements MedioDePago {
    BigDecimal coeficienteFijo;
    int cantCuotas;

    public TarjetaDeCredito(BigDecimal coeficienteFijo, int cantCuotas) {
        this.coeficienteFijo = coeficienteFijo;
        this.cantCuotas = cantCuotas;
    }

    public BigDecimal calculoDePrecioFinal(BigDecimal precio) {
        return precio.add(this.calcularRecargo(precio));
    }

    private BigDecimal calcularRecargo(BigDecimal precio) {
        return BigDecimal.valueOf(this.cantCuotas).multiply(this.coeficienteFijo).add(BigDecimal.valueOf(0.01).multiply(precio));
    }
}
