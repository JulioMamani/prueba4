
import java.util.List;


public class Ordenador {
    private static int id = 0;
    private UnidadCentral unidadCentral;
    private List<Periferico> perifericos;
    private float precio;
    private ICalcularPrecioService calcularPriceService = new CalcularPrecioService();
    public Ordenador(UnidadCentral unidadCentral, List<Periferico> periferic) {
        this.unidadCentral = unidadCentral;
        this.perifericos = periferic;
        this.precio = calcularPriceService.CalcularPrecio(periferic, unidadCentral);
    }

    public float getPrecio() {
        return precio;
    }
    private void reCalcularPrecio(){
        precio = calcularPriceService.CalcularPrecio(perifericos, unidadCentral);
    }
    public void agregarPeriferico(Periferico per){
        perifericos.add(per);
        reCalcularPrecio();
    }
    public void quitarPeriferico(Periferico per){
        perifericos.remove(per);
        reCalcularPrecio();
    }
    public void modificarPeriferico(Periferico per, Periferico peri){
        perifericos.remove(per);
        perifericos.add(peri);
        reCalcularPrecio();
    }
    
}
