import Prenda.Prenda;

import java.math.BigDecimal;

public class PrendaVendida {
    Prenda prenda;
    int cantVendida;

    public PrendaVendida(Prenda prenda, int cantVendida) {
        this.prenda = prenda;
        this.cantVendida = cantVendida;
    }

    public BigDecimal getPrecioUnitario() {
        return this.prenda.getPrecioModificado();
    }

    public int getCantVendida() {
        return cantVendida;
    }
}
