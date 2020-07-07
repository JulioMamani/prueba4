
import java.util.List;

public class CalcularPrecioService implements ICalcularPrecioService{

    @Override
    public float CalcularPrecio(List<Periferico> perifericos, UnidadCentral unidadC) {
        float precio = 0;
        precio += unidadC.getPrecio();
        for(Periferico i: perifericos){
            precio += i.getPrice();
        }
        return precio;
    }
    
}
