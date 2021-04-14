import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConsultorDeVentas {
    private static ConsultorDeVentas ourInstance = new ConsultorDeVentas();

    public static ConsultorDeVentas getInstance() {
        return ourInstance;
    }

    private static List<Venta> ventas = new ArrayList<>();

    private ConsultorDeVentas() {
    }

    public void agregarVenta(Venta venta) {
        this.ventas.add(venta);
    }

    public BigDecimal getGananciasDe(LocalDate fecha) {
        BigDecimal ganancia = BigDecimal.ZERO;
        this.filtrarVentasPorFecha(fecha).stream().forEach(ventaFiltrada -> ganancia.add(ventaFiltrada.precioFinal()));
        return ganancia;
    }

    private List<Venta> filtrarVentasPorFecha(LocalDate fecha) {
        return ventas.stream().filter(venta -> venta.getFecha().isEqual(fecha)).collect(Collectors.toList());
    }
}
