import MedioDePago.MedioDePago;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    List<PrendaVendida> prendasVendidas = new ArrayList<PrendaVendida>();
    MedioDePago medioDePago;
    LocalDate fecha;

    public Venta(List<PrendaVendida> prendasVendidas, MedioDePago medioDePago, LocalDate fecha) {
        this.prendasVendidas = prendasVendidas;
        this.medioDePago = medioDePago;
        this.fecha = fecha;
        ConsultorDeVentas.getInstance().agregarVenta(this);
    }

    public BigDecimal precioFinal(){
        return this.prendasVendidas.stream()
                .map(prendaVendida -> this.pasoFinalPrecio(prendaVendida))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal pasoFinalPrecio(PrendaVendida prendaVendida){
        return this.calculoPrecioFinalUnitario(prendaVendida).multiply(BigDecimal.valueOf(prendaVendida.getCantVendida()));
    }

    private BigDecimal calculoPrecioFinalUnitario(PrendaVendida prendaVendida){
        return this.medioDePago.calculoDePrecioFinal(prendaVendida.getPrecioUnitario());
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
