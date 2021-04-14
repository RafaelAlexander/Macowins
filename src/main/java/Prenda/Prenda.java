package Prenda;

import java.math.BigDecimal;

public class Prenda {
    EstadoDePrenda estadoDePrenda;
    TiposDePrendas tipoDePrenda;
    BigDecimal precioBase;

    public Prenda(EstadoDePrenda estadoDePrenda, TiposDePrendas tipoDePrenda, BigDecimal precioBase) {
        this.estadoDePrenda = estadoDePrenda;
        this.tipoDePrenda = tipoDePrenda;
        this.precioBase = precioBase;
    }

    public BigDecimal getPrecioModificado(){
        return this.estadoDePrenda.calcularPrecioModificado(this.precioBase);
    };
}
