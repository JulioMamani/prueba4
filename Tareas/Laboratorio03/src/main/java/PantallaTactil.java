
public class PantallaTactil extends Periferico implements DispositivoEntrada,DispositivoSalida {
    private static int id = 0;

    public PantallaTactil(String marca, String modelo, float precio) {
        super(marca, modelo, precio);
        id++;
    }
  
}
